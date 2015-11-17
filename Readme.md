<style>
table,th,td{border:1px solid black;border-collapse:collapse;padding:4px;}
</style>

# <a name="documentation"></a>[System documentation](#documentation)

## <a name="toc"></a>[Table of contents](#toc)
1. [Benchmark overview](#benchmarkOverview)
	1. [Data description](#dataDescription)
	1. [Evaluated databases](#evaluatedDatabases)
	1. [Query scenarios](#queryScenarios)
	1. [Evaluation workflow](#evaluationWorkflow)
	1. [Reporting](#benchmarkReporting)
1. [Project overview](#projectOverview)
	1. [Basic project information](#basicProjectInformation)
	1. [How to run](#howToRun)
	1. [Reporting](#reportingOverview)
1. [Project detail](#projectDetail)
	1. [Java resources](#javaResources)
	1. [Important java classes](#importantJavaClasses)
	1. [Database implementations](#evaluationDetail)
		1. [Modify database implementations](#modifyDatabases)
		1. [Add or remove database implementations](#addRemoveDatabases)
	1. [Reporting](#reportingDetail)
		1. [Modify reporting layouts](#modifyReports)
		1. [Add new information to reports](#addInformationToReports)
		1. [Add or remove reports](#addRemoveReports)

## <a name="benchmarkOverview"></a>[1. Benchmark overview](#benchmarkOverview)
This benchmark tries to figure out how different types of database-systems (relational, object-relational, document-oriented, graph, ...) can handle data, that is serialized from an RDF-store (Resource Description Framework), and how the possibilities for queries on that data are.

### <a name="dataDescription"></a>[1.1 Data description](#dataDescription)
The data, that is benchmarked in that software, is delivered in packages with different sizes. A package is called *dataset*. For the benchmark datasets are combined to *testseries*. So a testseries consists of one or more datasets.

A dataset contains entities, that are serialized from a RDF-store into a XML-file. That's an example of one entitity:

	<rdf:Description rdf:about="http://lod.hebis.de/resource/26887673">
		<rdf:type rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/>
		<wdrs:describedby rdf:resource="http://lod.hebis.de/catalog/html/26887673"/>
		<dcterms:medium>paper</dcterms:medium>
		<dcterms:format>print</dcterms:format>
		<rdf:type rdf:resource="http://purl.org/dc/terms/BibliographicResource"/>
		<rdf:type rdf:resource="http://purl.org/ontology/bibo/Book"/>
		<dcterms:identifier>268876738</dcterms:identifier>
		<bibo:oclcnum>741569552</bibo:oclcnum>
		<isbd:P1018>1932</isbd:P1018>
		<dcterms:issued>1932</dcterms:issued>
		<dcterms:title>Untersuchungen ueber die Gueltigkeit des Pontschen Index</dcterms:title>
		<isbd:P1004>Untersuchungen ueber die Gueltigkeit des Pontschen Index</isbd:P1004>
	</rdf:Description>

The entities of datasets have to be loaded into the database-systems the best way possible, which means in a form that would normally be used on that database-system. It's important to know that not all entities contain all possible fields, that some fields are multiples (means arrays) and that not all entities or datasets are in valid XML.

The benchmark currently has the following testseries defined:

|Name|Short description|
|:--|:--|
|TINY|One test dataset, 1,000 entities, ~1 MB of data|
|SMALL|One test dataset, 100,000 entities, ~100 MB of data|
|MEDIUM|Dumped datasets, ~4 GB of data|
|LARGE|Dumped datasets, ~6 GB of data|
|ALL|Dumped datasets, ~13 GB of data|

### <a name="evaluatedDatabases"></a>[1.2 Evaluated databases](#evaluatedDatabases)
This benchmarking software currently supports the following database-systems:

|Name|Short information|
|:--|:--|
|SQLite 4 Java|A relational database|
|SQLite Xerial|A relational database|
|Fuseki|A HTTP-SPARQL interface to Jena|
|PostgreSQL|An object-relational database|
|Open Virtuoso|A database-engine-hybrid|
|MongoDB|A document-oriented NoSQL-database|
|ArangoDB|A multi-model NoSQL-database|

### <a name="queryScenarios"></a>[1.3 Query scenarios](#queryScenarios)
This benchmarking software currently benchmarks the database-systems with the in this chapter described query scenarios. The query scenarios are categorized and target on [the context of specific data](#dataDescription) benchmarked in this software.
Each query scenario may have been divided into a prepare and a query step. For a more detailed explanation of the query scenarios, see the java documentation of the query scenario definition in code or see the benchmark-results-publication of Timm Heuss, where the purposes of the query scenarios and their results are discussed.

**Entity-retrieval scenarios:**

|Name|Short description|
|:--|:--|
|ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY|Retrieve a specific entity by its database-id|
|ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES|Retrieve ten specific entities by their database-ids|
|ENTITY_RETRIEVAL_BY_ID_100_ENTITIES|Retrieve 100 specific entities by their database-ids|

**Aggregation scenarios:**

|Name|Short description|
|:--|:--|
|AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10|Aggregate all entities by field *publisher*, order by the *count* descending and retrieve the first ten results|
|AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100|Same, but retrieve the first 100 results|
|AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL|Same, but retrieve all results|
|AGGREGATE_ISSUES_PER_DECADE_TOP10|Aggregate all entities by field *issued*. This field contains a year. Count the decade-occurences of all years. Order by the *count* descending and retrieve the first ten results|
|AGGREGATE_ISSUES_PER_DECADE_TOP100|Same, but retrieve the first 100 results|
|AGGREGATE_ISSUES_PER_DECADE_ALL|Same, but retrieve all results|

**Table-scan scenarios:**

|Name|Short description|
|:--|:--|
|CONDITIONAL_TABLE_SCAN_ALL_STUDIES|Return all entities that are studies|
|CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES|Return all entities that are bibliographic resources|
|CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES|Return all entities that are both|

**Graph-like-scenarios:**

|Name|Short description|
|:--|:--|
|GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY|For one entity, find all entities that share a value in array-field *subject* with it|
|GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES|Same, but do it for ten entities|
|GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES|Same, but do it for 100 entities|
|GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY|For one entity, find all entities that share a value in array-field *subject* with it, for each of them find all entities that share a value in array-field *subject* with them|
|GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES|Same, but do it for ten entities|
|GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES|Same, but do it for 100 entities|

**Data-changing scenarios:**

|Name|Short description|
|:--|:--|
|SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY|Create a new field on each entity|
|SCHEMA_CHANGE_INTRODUCE_STRING_OP|Create a new field on each entity, whose value is build from the current entity|
|SCHEMA_CHANGE_MIGRATE_RDF_TYPE|Create new boolean-fields for each entity-type on all entities, indicating if the entity is of that type|
|SCHEMA_CHANGE_REMOVE_RDF_TYPE|Remove a field from each entity|
|UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM|Update a field on all entities that fit a specific condition. The condition forces the most entities to be updated.|
|UPDATE_HIGH_SELECTIVITY_NON_ISSUED|Update a field on all entities that fit a specific condition. The condition forces the least entities to be updated.|
|DELETE_LOW_SELECTIVITY_PAPER_MEDIUM|Delete entities that fit a specific condition. The condition forces the most entities to be deleted.|
|DELETE_HIGH_SELECTIVIY_NON_ISSUED|Delete entities that fit a specific condition. The condition forces the least entities to be deleted.|

### <a name="evaluationWorkflow"></a>[1.4 Evaluation workflow](#evaluationWorkflow)
The workflow of this software describes how the program executes the benchmarking process over the databases. Each database has to load data and to execute the query scenarios. While this is done, execution times have to be measured. After the execution finished, the results have to be prepared to fit into the generated reports.

The workflow is a step by step procedure:
The program iterates over the configured testseries, so the whole benchmark is done for each of them. For each of the testseries, all databases are benchmarked with all query scenarios. The results of each database, which contains the measured execution times and the data results for the read-only query scenarios, are serialized for the at the end following reporting step. After all databases finished the benchmarking for the current testserie, the report is build over the results and saved named after the testserie.

1. For each configured testserie
	1. For each database
		1. Do the [workflow for the database-benchmarking](#wftdb)
		1. Serialize the results
	1. Build the benchmark report over the results
	1. Save the report named after the current testserie

The <a name="wftdb"></a>workflow for the database-benchmarking is also a step by step procedure. When a database is benchmarked with a testserie, the following procedure runs:

1. Start the database-system
1. Clean the database-system (to remove the environment of earlier benchmarks)
1. Set up the database-system with the needed environment (for example create database-tables)
1. Load the data of the current testserie
1. For each query scenario
	1. Prepare the query scenario (for example create database-indices that help the current query scenario)
	1. Execute the query scenario
1. Stop the database-system

Step 5.2, the execution of the query scenario, is, for read-only query scenarios, executed three times.
The execution times are measured for each step except starting, cleaning and stopping the database-system. Starting and stopping are non-relevant in this benchmark, and cleaning is a necessary step to have the set up step be executed on a clean database-system. 

### <a name="benchmarkReporting"></a>[1.5 Reporting](#benchmarkReporting)
The benchmark generates reports from the execution times of query scenarios and their data-results. Currently a report for a testserie consists of 4 parts and is generated in Markdown, HTML and CSV, which allows further processing in table calculation programs.

**Evaluation overview**
The evaluation overview compares the average measured times for all query scenarios and the set up and the load step over all database-systems. The lowest execution time is highlighted in each row, for example:

| QueryScenario | Phase | sqlite4java | SQLite-Xerial | PostgreSQL | Virtuoso | Fuseki | MongoDB | ArangoDB |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 21.42 ms | 67.42 ms | 246.23 ms | 0.96 ms | **0.00 ms** | 3.68 ms | 179.59 ms |
| Load |  | 23510.82 ms | 18206.71 ms | 27151.81 ms | **8227.13 ms** | 30703.51 ms | 31006.20 ms | 37685.51 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 327.59 ms</font> |<font color="#C0C0C0"> 341.15 ms</font> |<font color="#C0C0C0"> **187.91 ms**</font> |<font color="#C0C0C0"> 2527.07 ms</font> |<font color="#C0C0C0"> 3077.42 ms</font> |<font color="#C0C0C0"> 666.65 ms</font> |<font color="#C0C0C0"> 1697.89 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.43 ms | **0.15 ms** | 1.16 ms | 302.60 ms | 36.11 ms | 61.52 ms | 127.41 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 154.34 ms</font> |<font color="#C0C0C0"> 369.34 ms</font> |<font color="#C0C0C0"> 193.49 ms</font> |<font color="#C0C0C0"> **145.26 ms**</font> |<font color="#C0C0C0"> 2130.68 ms</font> |<font color="#C0C0C0"> 587.62 ms</font> |<font color="#C0C0C0"> 1659.46 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.86 ms | **0.73 ms** | 1.85 ms | 5135.57 ms | 37.88 ms | 451.85 ms | 1283.15 ms |

**Testseries information**
This part lists the datasets of the testseries used for that benchmark. For each dataset, the file size is shown.

**Evaluation details for each database-system**
A table of that part exists for each database-system. It shows for each query scenario and the set up and the load step execution times. In cases of read-only query scenarios, that are executed three times, the results are differentiated in average, min and max. For example:

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up | | 67.42 ms | | | |
| Load | | 18206.71 ms | | | |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">341.15 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.31 ms | 0.15 ms | 0.08 ms | 0.31 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">369.34 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.47 ms | 0.73 ms | 0.47 ms | 1.47 ms |

**Verify results**
That part compares the data-results for each query scenario over all database-systems. For example, the aggregation query scenarios all have as data-result a list with two columns. That list is saved in the result and for the reporting that list is calculated into a hash. For all databases and each query scenario theses hashes are compared, because they have to be the same, if the results were the same over the databases.
This table is highlighting the query scenarios, where the data-results were not the same over all databases. 

## <a name="projectOverview"></a>[2. Project overview](#projectOverview)
This chapter gives an overview over the software and makes it possible to execute the benchmark on the own.

### <a name="basicProjectInformation"></a>[2.1 Basic project information](#basicProjectInformation)
The sources of the project are published on GitHub, see [https://github.com/heussd/loddwhbench](https://github.com/heussd/loddwhbench). It's a Java Maven project and needs Java 8 (JDK and JRE) to compile and run. For Maven, an internet connection is needed at compile-time. The IDE at developing was Eclipse.

Three datasets are included in the project, which allow the execution of testseries TINY and SMALL. For possibilities to get larger datasets, contact the repository owner Timm Heuss.

### <a name="howToRun"></a>[2.2 How to run](#howToRun)
To run the project first ensure that all database systems, that should be benchmarked, are installed with default settings on your local computer. Both SQLite database-systems are delivered as binaries with the project, so for SQLite, nothing has to be installed.

* For Open Virtuoso, please set the path to the installation directory on your local computer in *src/main/java/util/Config.java* before the compilation.
* For PostgreSQL, please set a valid database-system user and password in *src/main/java/util/Config.java* before the compilation.
* Please define the database-systems and the testseries you want to benchmark in top of *src/main/java/main/Benchmark.java* before the compilation. There you can just comment out the things you don't want to execute. It's not necessary to edit this, but it prevents databases you don't want to benchmark from showing up as failures in the reports.

If you are running the benchmark on a Mac with the operating system OS X, the database-systems will be automatically started and stopped over scripts. For all other operating systems, all databases have to be up and running before executing the benchmark.
You run the benchmark by starting the class *src/main/java/main/Benchmark.java*. It's printed into the console, if a database-system finished the benchmark, and if the reports are successfully generated. Failures are also shown in the console.

### <a name="reportingOverview"></a>[2.3 Reporting](#reportingOverview)
The generated reports are saved in the project sub-directory *results/* by default. The directory can be changed in *src/main/java/util/Config.java*.

The reporting is based on serialized results of testseries for all database-systems. Therefore, it is not necessary to execute the whole benchmark again, if for example the layout of the reports change. At any time, the class *src/main/java/main/Report.java* can be started and it will generate the reports of all serialized benchmark results found and overwrite the old ones.

## <a name="projectDetail"></a>[3. Project detail](#projectDetail)
This chapter describes specific project parts in detail and shows the way to extend it with new database-systems or reports.

### <a name="javaResources"></a>[3.1 Java resources](#javaResources)
The resources of this project are located in *src/main/resources/*.

**Queries**
In the sub-folder *queries/* are files for each query scenario for most database-system. They contain the respective, for example, SQL or SPARQL query of the query scenario. The content is loaded while a query scenario is prepared. The queries in their query languages are separated from the code to make it easier to modify them.

**Reports**
The sub-folder *reports/* contains the Markdown and CSV templates for all report parts, see [reporting](#reportingDetail).

**Shells**
The sub-folder *shell/* contains scrips for starting and stopping different database-systems on a mac with the operating system OS X. The respective scripts are executed at the beginning and the end of the benchmark on a database.

**Test datasets**
In resources are also three datasets included, which contains 1,000 or 10,000 or 100,000 entities. They make it possible to execute the testseries TINY and SMALL on the local machine.

### <a name="importantJavaClasses"></a>[3.2 Important java classes](#importantJavaClasses)
**src/main/java/main/Benchmark.java**
This class controls the whole benchmarking workflow and is the one to be executed if the benchmark should run.

**src/main/java/main/BenchmarkObject.java**
An object of this class exists for every database-system benchmarked in every testserie and contains the measured execution times and the query results. Objects of this class are serialized for the reporting.

**src/main/java/main/Report.java**
This class controls the whole reporting workflow and can be executed at any time to override old reports.

**src/main/java/database/Database.java**
This interface has to be implemented by all database-systems that should run in that benchmark.

**src/main/java/report/Reports.java**
This class is the main entrance to the reporting system based on a template engine used in the reporting workflow. This class builds the different data-models for the templates of the report parts, see [reporting detail](#reportingDetail).

**src/main/java/util/Codes.java**
This enum contains all possible fields the entities in the datasets can have.

**src/main/java/util/Config.java**
This class contains different config settings. There are settings for specific database-systems, but also global settings which can change the behaviour of the benchmark process. The settings explain their selfes over their name.

**src/main/java/util/Dataset.java**
This enum contains all existing datasets and their file pathes.

**src/main/java/util/QueryResult.java**
An object of this class contains the query results of a single query scenario. It can take [different types of query results](#queryScenarios) and calculate hashes over them to compare the results with others.

**src/main/java/util/QueryScenario.java**
This enum contains all query scenarios that are called on the database-implementation interface.

**src/main/java/util/TestSeries.java**
This enum contains the five testseries and which datasets are included in them.

**src/main/java/util.dumper/Helpers.java**
This class contains static methods for recurring tasks, for example converting big numbers into a scientific notation (for example 6,720,000,000 ms to 6.72*10^9 ms or 6.72E9 ms).

**src/main/java/main/ReadmeToHtml.java**
This class compiles this Readme.md into a HTML document in the same directory.

**pom.xml**
This file contains all Maven settings and dependencies.

### <a name="evaluationDetail"></a>[3.3 Database implementations](#evaluationDetail)
There is a java class for each database-system included in that benchmark, called database implementation. All of theses classes implement the interface found in *src/main/java/database/Database.java* and lie in the same package. The interface is used by the benchmarking process. These database implementations do the communication with the particular database-systems. The interface forces the following members to be implemented:

* String getName()
* String getVersion()
* void start()
* void stop()
* void clean()
* void setUp()
* void load(Dataset)
* void prepare(QueryScenario)
* QueryResult query(QueryScenario)

For the database-systems with a query language, like SQL or SPARQL, the QueryScenario-queries are placed in files in [the java resources of the project](#javaResources) to be easier modified. The implementation then has to load the specific query from file in the prepare step. For MongoDB, for example, the queries are implemented in code, because MongoDB provides a java driver that also maps query language functions to java methods and one objective of that benchmark is to use the database-systems like anybody would in practice.

#### <a name="modifyDatabases"></a>[3.3.1 Modify database implementations](#modifyDatabases)
Modifying database implementations in most cases means changing the implementation of the different query scenarios or the procedure to load data. So if, for example, for one database-system a better or faster way to load the datasets as the current one was found, the load method of the database-implementation has to be modified. And if, for example, a query scenario changes in any way, the query for it has to be updated in the database-implementation.
New query scenarios of course have to be newly implemented for all database-implementations.

#### <a name="addRemoveDatabases"></a>[3.3.2 Add or remove database implementations](#addRemoveDatabases)
For removing database-implementations, remove the respective class and remove the single calls to it from *src/main/java/main/Benchmark.java* and *src/main/java/main/Report.java*.

For adding a new database-implementation, add a new class in package *src/main/java/database/* that implements the interface *src/main/java/database/Database.java*. Then let the *src/main/java/main/Benchmark.java* and the *src/main/java/main/Report.java* know about the new implementation. The benchmark then can handle the new database-implementation. Reports will work out of the box.

### <a name="reportingDetail"></a>[3.4 Reporting](#reportingDetail)
The reports are generated over a template engine, called [FreeMarker](http://freemarker.incubator.apache.org/). [Every report part](#benchmarkReporting) has its own FreeMarker template which can be found in [the java resources of the project](#javaResources).
A template is a layout which is reusable for different data. While the reporting step is executed, so called models, basically java classes with variables for the data, are built, and these models are passed into the templates, where they are used by the template engine to write the data into the report. FreeMarker provides a template language, which can be used for conditional output, loops over lists of data, converting numbers and many more.

There are two types of reporting layouts: Markdown and CSV. The HTML reports are built from the Markdown ones.

#### <a name="modifyReports"></a>[3.4.1 Modify reporting layouts](#modifyReports)
For modifying the layout of the report parts, or, for example, adding non-variable text or making parts bold or italic, the templates have to be modified. The templates can be found by the report part name in [the java resources of the project](#javaResources).

For reordering the report parts in the report, the class *src/main/java/main/Report.java*, methods *makeReports()* and *makeCsvReports()*, have to be edited. The order of the report parts executed in that methods is the same as they show up in the report. After that, reorder the lines in the table of contents template too.

#### <a name="addInformationToReports"></a>[3.4.2 Add new information to reports](#addInformationToReports)
As already mentioned, so called data-models are passed into the templates. If it is necessary to add variable data to an existing report part, modify its data-model and the relevant classes in package *src/main/java/report* to hold the new data, just like the already existing data. After this is done, the new variables can be used in the templates like the other ones.

#### <a name="addRemoveReports"></a>[3.4.3 Add or remove reports](#addRemoveReports)
To remove a report part, remove the template and the code which generates its data-model. For a short-time removal, it is sufficient to comment out the report-generation-call in class *src/main/java/main/Reports.java*.

To add new report parts, add a new template and add the relevant code to build its data-model. It gets more complicated the more complex the part should be. Basically, a data-model for FreeMarker is a HashMap from key-strings to value-objects. In the template, the variables are referenced over the key-strings. If the value-objects are a primitive type, they can directly be used in the template. If the value-objects are a non-primitive type, like own java classes, these classes have to implement the FreeMarker interface *TemplateHashModel*, which let's you return the variables of the data-model to keys given into the interface. The best way to add new report parts is to look how it is done in the four other report parts, and to imitate it.
