<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[1\. Evaluation Overview, all Databases, Test Series SMALL](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite JDBC Xerial](#SQLite-JDBC-Xerial) | [PostgreSQL](#PostgreSQL) | [ArangoDB](#ArangoDB) | [MongoDB](#MongoDB) | [Virtuoso](#Virtuoso) | [Apache Jena Fuseki](#Apache-Jena-Fuseki) |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 21.70 ms | 75.81 ms | 246.86 ms | 177.50 ms | 3.92 ms | 1.70 ms | **0.00 ms** |
| Load |  | 21382.58 ms | 23774.85 ms | 29561.50 ms | 38814.88 ms | 28661.05 ms | **7975.68 ms** | 33159.97 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 320.64 ms</font> |<font color="#C0C0C0"> 398.30 ms</font> |<font color="#C0C0C0"> **197.61 ms**</font> |<font color="#C0C0C0"> 1939.54 ms</font> |<font color="#C0C0C0"> 589.37 ms</font> |<font color="#C0C0C0"> 1960.34 ms</font> |<font color="#C0C0C0"> 2985.94 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.43 ms | **0.15 ms** | 1.11 ms | 154.66 ms | 43.74 ms | 256.77 ms | 31.02 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **144.38 ms**</font> |<font color="#C0C0C0"> 424.25 ms</font> |<font color="#C0C0C0"> 170.81 ms</font> |<font color="#C0C0C0"> 1997.48 ms</font> |<font color="#C0C0C0"> 540.28 ms</font> |<font color="#C0C0C0"> 150.40 ms</font> |<font color="#C0C0C0"> 2232.61 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.02 ms | **0.43 ms** | 1.37 ms | 1363.17 ms | 428.22 ms | 4336.16 ms | 38.82 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 173.50 ms</font> |<font color="#C0C0C0"> 477.63 ms</font> |<font color="#C0C0C0"> **173.02 ms**</font> |<font color="#C0C0C0"> 1767.00 ms</font> |<font color="#C0C0C0"> 539.85 ms</font> |<font color="#C0C0C0"> 173.62 ms</font> |<font color="#C0C0C0"> 2753.79 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.33 ms | **1.68 ms** | 4.20 ms | 14161.28 ms | 4261.10 ms | 36864.24 ms | 140.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 5.58 ms</font> |<font color="#C0C0C0"> 197.72 ms</font> |<font color="#C0C0C0"> 86.40 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.21 ms</font> |<font color="#C0C0C0"> 1.39 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 132.84 ms | 28.91 ms | 42.37 ms | 179.52 ms | 92.65 ms | **20.82 ms** | 144.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.58 ms</font> |<font color="#C0C0C0"> 198.71 ms</font> |<font color="#C0C0C0"> 109.61 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.04 ms</font> |<font color="#C0C0C0"> 1.30 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 136.93 ms | 32.21 ms | 38.89 ms | 160.84 ms | 89.25 ms | **23.08 ms** | 81.19 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.51 ms</font> |<font color="#C0C0C0"> 197.48 ms</font> |<font color="#C0C0C0"> 83.51 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.68 ms</font> |<font color="#C0C0C0"> 1.47 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 146.33 ms | **41.15 ms** | 48.97 ms | 327.44 ms | 118.40 ms | 104.99 ms | 402.22 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.72 ms</font> |<font color="#C0C0C0"> 399.68 ms</font> |<font color="#C0C0C0"> 219.59 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.45 ms</font> |<font color="#C0C0C0"> 1.30 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 162.60 ms | 251.76 ms | **53.87 ms** | 409.03 ms | 125.73 ms | 240.39 ms | 154.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.73 ms</font> |<font color="#C0C0C0"> 470.14 ms</font> |<font color="#C0C0C0"> 234.94 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.36 ms</font> |<font color="#C0C0C0"> 1.19 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 162.09 ms | 240.35 ms | **46.53 ms** | 413.82 ms | 123.67 ms | 242.08 ms | 142.99 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.62 ms</font> |<font color="#C0C0C0"> 422.20 ms</font> |<font color="#C0C0C0"> 215.99 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 3.16 ms</font> |<font color="#C0C0C0"> 1.20 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 164.41 ms | 238.57 ms | **48.23 ms** | 407.93 ms | 122.06 ms | 243.35 ms | 118.31 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.57 ms</font> |<font color="#C0C0C0"> 366.70 ms</font> |<font color="#C0C0C0"> 180.29 ms</font> |<font color="#C0C0C0"> 1630.43 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 8.45 ms</font> |<font color="#C0C0C0"> 1.20 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 216.61 ms | 319.81 ms | **138.21 ms** | 165.84 ms | 233.07 ms | 14545.11 ms | 6996.53 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.49 ms</font> |<font color="#C0C0C0"> 2.45 ms</font> |<font color="#C0C0C0"> 124.19 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 8.48 ms</font> |<font color="#C0C0C0"> Error</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1447.01 ms | 1462.69 ms | 1065.76 ms | 3449.29 ms | **610.97 ms** | 305588.89 ms | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.68 ms</font> |<font color="#C0C0C0"> 2.03 ms</font> |<font color="#C0C0C0"> 274.32 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 10.91 ms</font> |<font color="#C0C0C0"> 1.92 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 243.75 ms | 364.56 ms | **134.37 ms** | 764.23 ms | 277.23 ms | 13502.34 ms | 456853.40 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 16688.60 ms</font> |<font color="#C0C0C0"> 17713.52 ms</font> |<font color="#C0C0C0"> 164.16 ms</font> |<font color="#C0C0C0"> 6172707.04 ms</font> |<font color="#C0C0C0"> 84.20 ms</font> |<font color="#C0C0C0"> **80.26 ms**</font> |<font color="#C0C0C0"> 20630.04 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | **0.14 ms** | 0.20 ms | 8.74 ms | 82.78 ms | 313.94 ms | 6.14 ms | 2821.66 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 81.93 ms</font> |<font color="#C0C0C0"> 113.28 ms</font> |<font color="#C0C0C0"> 70.55 ms</font> |<font color="#C0C0C0"> 920.61 ms</font> |<font color="#C0C0C0"> 83.03 ms</font> |<font color="#C0C0C0"> **39.78 ms**</font> |<font color="#C0C0C0"> 14140.41 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.46 ms | **0.45 ms** | 5.78 ms | 688.50 ms | 3291.15 ms | 0.50 ms | 10.21 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 79.15 ms</font> |<font color="#C0C0C0"> 102.29 ms</font> |<font color="#C0C0C0"> 71.17 ms</font> |<font color="#C0C0C0"> 936.66 ms</font> |<font color="#C0C0C0"> 94.05 ms</font> |<font color="#C0C0C0"> **67.27 ms**</font> |<font color="#C0C0C0"> 13465.68 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 16.18 ms | 12.00 ms | 7.15 ms | 8669.14 ms | 43337.02 ms | **5.98 ms** | 1719.90 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 78.57 ms</font> |<font color="#C0C0C0"> 104.94 ms</font> |<font color="#C0C0C0"> **68.89 ms**</font> |<font color="#C0C0C0"> 990.82 ms</font> |<font color="#C0C0C0"> 91.47 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 12964.62 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2.12 ms | **1.84 ms** | 132.79 ms | 2165.55 ms | 9993.38 ms | Error | 15.41 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 79.01 ms</font> |<font color="#C0C0C0"> 98.03 ms</font> |<font color="#C0C0C0"> **70.78 ms**</font> |<font color="#C0C0C0"> 977.48 ms</font> |<font color="#C0C0C0"> 88.40 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 11951.35 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 6.64 ms | **4.59 ms** | 9.31 ms | 8542.68 ms | 40625.32 ms | Error | 5.19 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 81.11 ms</font> |<font color="#C0C0C0"> 89.39 ms</font> |<font color="#C0C0C0"> **72.37 ms**</font> |<font color="#C0C0C0"> 945.57 ms</font> |<font color="#C0C0C0"> 91.45 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 12699.98 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 7039.58 ms | 4964.42 ms | 131.08 ms | 908971.09 ms | 2573406.52 ms | Error | **10.36 ms** |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.72 ms</font> |<font color="#C0C0C0"> 1.81 ms</font> |<font color="#C0C0C0"> 9.40 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.06 ms</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.57 ms | **1.33 ms** | 737.69 ms | 6586.05 ms | 654.63 ms | 16499.27 ms | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> 195.92 ms</font> |<font color="#C0C0C0"> 156.34 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 193.40 ms</font> |<font color="#C0C0C0"> 2.94 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **0.74 ms** | 3.00 ms | 5155.81 ms | 7763.62 ms | 9988.88 ms | 458.55 ms | 9977.31 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.51 ms</font> |<font color="#C0C0C0"> 1.38 ms</font> |<font color="#C0C0C0"> 177.67 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.39 ms</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **0.72 ms** | 0.78 ms | 15660.68 ms | 31251.96 ms | 2061.26 ms | 109558.52 ms | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.63 ms</font> |<font color="#C0C0C0"> 1.06 ms</font> |<font color="#C0C0C0"> 11.58 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.01 ms</font> |<font color="#C0C0C0"> 1.83 ms</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0.02 ms** | **0.02 ms** | 3.53 ms | 6515.42 ms | 430.67 ms | 0.20 ms | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.26 ms</font> |<font color="#C0C0C0"> 168.89 ms</font> |<font color="#C0C0C0"> 182.05 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.74 ms</font> |<font color="#C0C0C0"> Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 835.96 ms | 1123.45 ms | 4988.73 ms | 7227.30 ms | **368.98 ms** | 3447.05 ms | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.46 ms</font> |<font color="#C0C0C0"> 206.65 ms</font> |<font color="#C0C0C0"> 207.34 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.62 ms</font> |<font color="#C0C0C0"> 19.91 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 115.21 ms | **36.07 ms** | 137.15 ms | 1138.32 ms | 47.46 ms | 309.74 ms | 192036.15 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 221.32 ms</font> |<font color="#C0C0C0"> 160.36 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 6.99 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 503.25 ms | 1944.02 ms | 583.41 ms | 881.44 ms | 412.68 ms | Error | **6.27 ms** |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 21.15 ms</font> |<font color="#C0C0C0"> 97.88 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 922.31 ms</font> |<font color="#C0C0C0"> 1.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 13.81 ms | 16.31 ms | **3.90 ms** | 18.45 ms | 5.98 ms | 11019.60 ms | 4.15 ms |

# <a name="toc"></a>[Table of contents](#toc)

1. [Evaluation Overview](#overview)
1. [Test Series Datasets](#testseriesinformation)
1. Evaluation Details
	1. [sqlite4java](#sqlite4java)
	1. [SQLite JDBC Xerial](#SQLite-JDBC-Xerial)
	1. [PostgreSQL](#PostgreSQL)
	1. [ArangoDB](#ArangoDB)
	1. [MongoDB](#MongoDB)
	1. [Virtuoso](#Virtuoso)
	1. [Apache Jena Fuseki](#Apache-Jena-Fuseki)
1. [Verify Results](#verifyresults)

## <a name="testseriesinformation"></a>[2\. Test Series Datasets](#testseriesinformation)

| Test Series SMALL | Dataset Size |
| :-- | --: |
| hebis_100000_records | 7.865 MB |

## <a name="sqlite4java"></a>[3\.1\. Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series SMALL](#sqlite4java)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 21.70 ms |
| Load || 21382.58 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">320.64 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.09 ms | 0.43 ms | 0.12 ms | 1.09 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">144.38 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.81 ms | 1.02 ms | 0.53 ms | 0.81 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">173.50 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.70 ms | 2.33 ms | 2.02 ms | 2.70 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.58 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 132.86 ms | 132.84 ms | 132.71 ms | 132.86 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.58 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 136.86 ms | 136.93 ms | 135.54 ms | 136.86 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.51 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 146.64 ms | 146.33 ms | 145.14 ms | 146.64 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.72 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 159.46 ms | 162.60 ms | 159.46 ms | 171.95 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.73 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 159.72 ms | 162.09 ms | 159.72 ms | 166.97 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.62 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 168.34 ms | 164.41 ms | 167.62 ms | 168.34 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.57 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 214.70 ms | 216.61 ms | 210.94 ms | 214.70 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.49 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1586.94 ms | 1447.01 ms | 1096.93 ms | 1586.94 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.68 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 245.42 ms | 243.75 ms | 242.57 ms | 245.42 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16688.60 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.24 ms | 0.14 ms | 0.09 ms | 0.24 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">81.93 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.62 ms | 0.46 ms | 0.39 ms | 0.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">79.15 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 17.92 ms | 16.18 ms | 14.39 ms | 17.92 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">78.57 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2.27 ms | 2.12 ms | 2.07 ms | 2.27 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">79.01 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 5.39 ms | 6.64 ms | 5.39 ms | 7.33 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">81.11 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 5257.44 ms | 7039.58 ms | 5257.44 ms | 7986.39 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.72 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.57 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.74 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.51 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.72 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.63 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.26 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 835.96 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.46 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 115.21 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 503.25 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 13.81 ms |

## <a name="SQLite-JDBC-Xerial"></a>[3\.2\. Evaluation Details for SQLite JDBC Xerial, Version 3.8.11, Test Series SMALL](#SQLite-JDBC-Xerial)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 75.81 ms |
| Load || 23774.85 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">398.30 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.31 ms | 0.15 ms | 0.07 ms | 0.31 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">424.25 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.49 ms | 0.43 ms | 0.49 ms | 0.49 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">477.63 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.91 ms | 1.68 ms | 1.60 ms | 1.91 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">197.72 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 30.37 ms | 28.91 ms | 28.20 ms | 30.37 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">198.71 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 34.48 ms | 32.21 ms | 31.19 ms | 34.48 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">197.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 41.77 ms | 41.15 ms | 40.98 ms | 41.77 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">399.68 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 257.89 ms | 251.76 ms | 257.89 ms | 266.39 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">470.14 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 251.29 ms | 240.35 ms | 243.91 ms | 251.29 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">422.20 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 247.04 ms | 238.57 ms | 213.64 ms | 247.04 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">366.70 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 325.54 ms | 319.81 ms | 306.04 ms | 325.54 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.45 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1411.59 ms | 1462.69 ms | 1411.59 ms | 1499.90 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.03 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 346.47 ms | 364.56 ms | 346.47 ms | 364.39 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17713.52 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.35 ms | 0.20 ms | 0.13 ms | 0.35 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">113.28 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.53 ms | 0.45 ms | 0.34 ms | 0.53 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">102.29 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 13.48 ms | 12.00 ms | 11.95 ms | 13.48 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">104.94 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2.05 ms | 1.84 ms | 1.76 ms | 2.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">98.03 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 4.87 ms | 4.59 ms | 4.73 ms | 4.87 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">89.39 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 5354.10 ms | 4964.42 ms | 5354.10 ms | 5918.47 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.81 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.33 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">195.92 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 3.00 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.38 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.78 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.06 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">168.89 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1123.45 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">206.65 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 36.07 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">221.32 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1944.02 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">21.15 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 16.31 ms |

## <a name="PostgreSQL"></a>[3\.3\. Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series SMALL](#PostgreSQL)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 246.86 ms |
| Load || 29561.50 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">197.61 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.26 ms | 1.11 ms | 0.48 ms | 2.26 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">170.81 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 2.26 ms | 1.37 ms | 1.09 ms | 2.26 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">173.02 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 6.08 ms | 4.20 ms | 3.46 ms | 6.08 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">86.40 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 51.80 ms | 42.37 ms | 31.59 ms | 51.80 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">109.61 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 49.67 ms | 38.89 ms | 34.94 ms | 49.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">83.51 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 62.57 ms | 48.97 ms | 43.13 ms | 62.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">219.59 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 63.94 ms | 53.87 ms | 48.05 ms | 63.94 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">234.94 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 59.07 ms | 46.53 ms | 38.77 ms | 59.07 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">215.99 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 58.52 ms | 48.23 ms | 43.37 ms | 58.52 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">180.29 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 152.05 ms | 138.21 ms | 136.82 ms | 152.05 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">124.19 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1027.96 ms | 1065.76 ms | 1003.59 ms | 1027.96 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">274.32 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 146.26 ms | 134.37 ms | 125.71 ms | 146.26 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">164.16 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 11.20 ms | 8.74 ms | 7.65 ms | 11.20 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">70.55 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 6.70 ms | 5.78 ms | 4.83 ms | 6.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">71.17 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 7.79 ms | 7.15 ms | 6.77 ms | 7.79 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">68.89 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 133.86 ms | 132.79 ms | 133.86 ms | 135.88 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">70.78 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 10.86 ms | 9.31 ms | 8.47 ms | 10.86 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">72.37 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 135.34 ms | 131.08 ms | 127.90 ms | 135.34 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.40 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 737.69 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">156.34 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 5155.81 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">177.67 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 15660.68 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.58 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.53 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">182.05 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4988.73 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">207.34 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 137.15 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">160.36 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 583.41 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">97.88 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.90 ms |

## <a name="ArangoDB"></a>[3\.4\. Evaluation Details for ArangoDB, Version 2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8, Test Series SMALL](#ArangoDB)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 177.50 ms |
| Load || 38814.88 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1939.54 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 157.65 ms | 154.66 ms | 148.84 ms | 157.65 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1997.48 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1362.48 ms | 1363.17 ms | 1362.48 ms | 1382.32 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1767.00 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 14751.96 ms | 14161.28 ms | 13944.24 ms | 14751.96 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 181.17 ms | 179.52 ms | 177.75 ms | 181.17 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 158.93 ms | 160.84 ms | 158.93 ms | 164.82 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 362.41 ms | 327.44 ms | 322.46 ms | 362.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 426.30 ms | 409.03 ms | 385.92 ms | 426.30 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 418.68 ms | 413.82 ms | 400.46 ms | 418.68 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 402.58 ms | 407.93 ms | 402.58 ms | 418.22 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1630.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 173.22 ms | 165.84 ms | 159.52 ms | 173.22 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 3525.46 ms | 3449.29 ms | 3415.68 ms | 3525.46 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 780.11 ms | 764.23 ms | 750.16 ms | 780.11 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6172707.04 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 96.03 ms | 82.78 ms | 79.42 ms | 96.03 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">920.61 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 699.00 ms | 688.50 ms | 690.13 ms | 699.00 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">936.66 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 8636.47 ms | 8669.14 ms | 8557.38 ms | 8636.47 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">990.82 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2168.64 ms | 2165.55 ms | 2168.64 ms | 2185.45 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">977.48 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 8518.48 ms | 8542.68 ms | 8518.48 ms | 8555.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">945.57 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 907910.10 ms | 908971.09 ms | 907910.10 ms | 914952.22 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 6586.05 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 7763.62 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 31251.96 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 6515.42 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7227.30 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1138.32 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 881.44 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 18.45 ms |

## <a name="MongoDB"></a>[3\.5\. Evaluation Details for MongoDB, Version 3.0.6, Test Series SMALL](#MongoDB)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 3.92 ms |
| Load || 28661.05 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">589.37 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 48.39 ms | 43.74 ms | 40.76 ms | 48.39 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">540.28 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 423.33 ms | 428.22 ms | 423.33 ms | 430.66 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">539.85 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4254.90 ms | 4261.10 ms | 4254.90 ms | 4265.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 102.03 ms | 92.65 ms | 90.22 ms | 102.03 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 88.44 ms | 89.25 ms | 88.44 ms | 89.38 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 125.38 ms | 118.40 ms | 115.79 ms | 125.38 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 126.09 ms | 125.73 ms | 124.95 ms | 126.09 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 127.95 ms | 123.67 ms | 121.83 ms | 127.95 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 123.75 ms | 122.06 ms | 122.09 ms | 123.75 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 235.28 ms | 233.07 ms | 234.61 ms | 235.28 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 543.46 ms | 610.97 ms | 543.46 ms | 740.80 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 274.85 ms | 277.23 ms | 274.85 ms | 275.47 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">84.20 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 312.29 ms | 313.94 ms | 312.29 ms | 315.96 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">83.03 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 3278.03 ms | 3291.15 ms | 3278.03 ms | 3294.75 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">94.05 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 42511.65 ms | 43337.02 ms | 42511.65 ms | 43961.64 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">91.47 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 10018.54 ms | 9993.38 ms | 10018.54 ms | 10125.02 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">88.40 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 40508.18 ms | 40625.32 ms | 40508.18 ms | 40687.61 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">91.45 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 2604215.87 ms | 2573406.52 ms | 2604215.87 ms | 2615779.39 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 654.63 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9988.88 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 2061.26 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.01 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 430.67 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 368.98 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 47.46 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 412.68 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 5.98 ms |

## <a name="Virtuoso"></a>[3\.6\. Evaluation Details for Virtuoso, Version 07.20.3214 / Virtuoso JDBC 4.1, Test Series SMALL](#Virtuoso)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 1.70 ms |
| Load || 7975.68 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1960.34 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 259.68 ms | 256.77 ms | 259.29 ms | 259.68 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">150.40 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 4324.08 ms | 4336.16 ms | 4308.86 ms | 4324.08 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">173.62 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 37032.50 ms | 36864.24 ms | 36887.44 ms | 37032.50 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.21 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 21.07 ms | 20.82 ms | 19.74 ms | 21.07 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.04 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 23.29 ms | 23.08 ms | 22.62 ms | 23.29 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.68 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 114.98 ms | 104.99 ms | 99.22 ms | 114.98 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.45 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 248.07 ms | 240.39 ms | 238.35 ms | 248.07 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.36 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 246.03 ms | 242.08 ms | 242.14 ms | 246.03 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.16 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 240.24 ms | 243.35 ms | 240.24 ms | 242.68 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.45 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 14498.74 ms | 14545.11 ms | 14498.74 ms | 14530.88 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.48 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 303392.13 ms | 305588.89 ms | 303392.13 ms | 307498.40 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.91 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 13572.11 ms | 13502.34 ms | 13394.75 ms | 13572.11 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">80.26 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 6.41 ms | 6.14 ms | 5.98 ms | 6.41 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">39.78 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.56 ms | 0.50 ms | 0.49 ms | 0.56 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">67.27 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6.15 ms | 5.98 ms | 6.07 ms | 6.15 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.06 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 16499.27 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">193.40 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 458.55 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.39 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 109558.52 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.83 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.20 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.74 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3447.05 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.62 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 309.74 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">922.31 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 11019.60 ms |

## <a name="Apache-Jena-Fuseki"></a>[3\.7\. Evaluation Details for Apache Jena Fuseki, Version 2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0, Test Series SMALL](#Apache-Jena-Fuseki)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 0.00 ms |
| Load || 33159.97 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2985.94 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 64.73 ms | 31.02 ms | 14.32 ms | 64.73 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2232.61 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 50.40 ms | 38.82 ms | 33.43 ms | 50.40 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2753.79 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 163.00 ms | 140.95 ms | 120.39 ms | 163.00 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.39 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 215.98 ms | 144.67 ms | 107.30 ms | 215.98 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.30 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 86.71 ms | 81.19 ms | 81.48 ms | 86.71 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.47 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 487.51 ms | 402.22 ms | 402.16 ms | 487.51 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.30 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 175.27 ms | 154.57 ms | 139.42 ms | 175.27 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.19 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 142.84 ms | 142.99 ms | 142.84 ms | 163.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.20 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 118.20 ms | 118.31 ms | 115.08 ms | 118.20 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.20 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 7458.33 ms | 6996.53 ms | 6837.65 ms | 7458.33 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.92 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 532946.80 ms | 456853.40 ms | 416572.05 ms | 532946.80 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">20630.04 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 4261.14 ms | 2821.66 ms | 146.94 ms | 4261.14 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14140.41 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 11.83 ms | 10.21 ms | 9.39 ms | 11.83 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13465.68 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 144.40 ms | 1719.90 ms | 144.40 ms | 2459.17 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12964.62 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 18.29 ms | 15.41 ms | 16.97 ms | 18.29 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11951.35 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 5.64 ms | 5.19 ms | 4.81 ms | 5.64 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12699.98 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 9.94 ms | 10.36 ms | 9.94 ms | 10.20 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.94 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9977.31 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19.91 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 192036.15 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.99 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.27 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 4.15 ms |

## <a name="verifyresults"></a>[4\. Verify Results](#verifyresults)

| QueryScenario | [sqlite4java](#sqlite4java) | [SQLite JDBC Xerial](#SQLite-JDBC-Xerial) | [PostgreSQL](#PostgreSQL) | [ArangoDB](#ArangoDB) | [MongoDB](#MongoDB) | [Virtuoso](#Virtuoso) | [Apache Jena Fuseki](#Apache-Jena-Fuseki) |
| :-- | --: | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 986810877 | 986810877 | 1577130375 | 1054325556 | 986810877 | -812461738 | -2018687351 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | 196073684 | 196073684 | -433111824 | 1767668704 | 196073684 | -339965281 | 331796290 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 2076487100 | 2076487100 | 2142581090 | 1315719492 | 2052472126 | 94699254 | -1271062091 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -1543836686 | -1543836686 | -194403603 | -195916989 | -1543836686 | 347589709 | 347589709 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 410298841 | 410298841 | 32351944 | 1344643452 | 410298841 | 1081764729 | 1081764729 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | -681741322 | -681741322 | 934959366 | -366046358 | 1541235763 | 1944800929 | -876578445 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | -801885849 | -801885849 | -801885849 | -801885849 | -801885849 | -801885849 | -801885849 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | 2008061858 | 2008061858 | 2008061858 | -1605449155 | -1217979069 | -1217979069 | -1217979069 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | 2008061858 | 2008061858 | 2008061858 | -1605449155 | -1217979069 | -1217979069 | -1217979069 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -1801573407 | -1801573407 | 753112323 | 340679591 | -1801573407 | 443522314 | 1114653560 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | 1299552736 | 1299552736 | -1702978190 | 1689435524 | 1299552736 | -1483474871 |  |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 677795065 | 677795065 | -902940781 | -820214193 | 677795065 | -529476604 | -296521212 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY_** | 251633544 | 251633544 | 1586334528 | -290633864 | 251633544 | -1247886704 | 608508475 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES_** | 545302523 | 545302523 | 318950106 | 105292305 | -1865095863 | -561049866 | 1108553005 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES_** | -1046371767 | -1046371767 | 1586334528 | -925346621 | 484768485 | -1247886704 | 608508475 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY_** | 81072793 | 81072793 | 1603718120 | -425304115 | -581150917 |  | 1207871171 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES_** | -1625978850 | -1625978850 | 607888469 | 818767134 | 790368074 |  | 1207871171 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES_** | -850864807 | -850864807 | 1603718120 | -236605731 | -1247357375 |  | 1207871171 |
| **_SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY_** | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |  |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |
| **_SCHEMA_CHANGE_MIGRATE_RDF_TYPE_** | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |  |
| **_SCHEMA_CHANGE_REMOVE_RDF_TYPE_** | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |  |
| **_UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |  |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |
| **_DELETE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |  | 195827612 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 | 195827612 |
