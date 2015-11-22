<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[Evaluation Overview, all Databases, Test Series LARGE](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) | [MongoDB](#MongoDB) | [ArangoDB](#ArangoDB) |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 26.01 ms | 146.01 ms | 545.21 ms | Error | Error | **5.30 ms** | 168.01 ms |
| Load |  | 1.27E6 ms | **1.19E6 ms** | 1.64E6 ms | Error | Error | 1.93E6 ms | 2.32E6 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 56115.56 ms</font> |<font color="#C0C0C0"> 57742.43 ms</font> |<font color="#C0C0C0"> **17664.76 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 36047.30 ms</font> |<font color="#C0C0C0"> 1.58E5 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 9.44 ms | **1.12 ms** | 2.93 ms | Error | Error | 2604.03 ms | 8014.28 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **9214.12 ms**</font> |<font color="#C0C0C0"> 22439.78 ms</font> |<font color="#C0C0C0"> 9965.09 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 32303.63 ms</font> |<font color="#C0C0C0"> 1.58E5 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 6.26 ms | **2.50 ms** | 2.80 ms | Error | Error | 24540.70 ms | 81197.58 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 10215.23 ms</font> |<font color="#C0C0C0"> 26944.78 ms</font> |<font color="#C0C0C0"> **10197.67 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 32706.44 ms</font> |<font color="#C0C0C0"> 1.61E5 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 6.75 ms | **4.33 ms** | 10.19 ms | Error | Error | 2.46E5 ms | 8.58E5 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.32 ms</font> |<font color="#C0C0C0"> 15639.44 ms</font> |<font color="#C0C0C0"> 8887.14 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 10823.61 ms | **2151.83 ms** | 2919.83 ms | Error | Error | 9599.36 ms | 14408.34 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.41 ms</font> |<font color="#C0C0C0"> 16973.25 ms</font> |<font color="#C0C0C0"> 8950.74 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 11486.73 ms | **2283.26 ms** | 3088.30 ms | Error | Error | 9597.52 ms | 14173.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.90 ms</font> |<font color="#C0C0C0"> 17295.63 ms</font> |<font color="#C0C0C0"> 8819.23 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 11590.62 ms | **3124.37 ms** | 3912.75 ms | Error | Error | Error | 22478.96 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 5.29 ms</font> |<font color="#C0C0C0"> 25100.92 ms</font> |<font color="#C0C0C0"> 13177.38 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 11872.51 ms | 14790.62 ms | **2714.04 ms** | Error | Error | 7096.29 ms | 20785.49 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.11 ms</font> |<font color="#C0C0C0"> 24692.90 ms</font> |<font color="#C0C0C0"> 13137.28 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 12492.21 ms | 14176.74 ms | **2675.42 ms** | Error | Error | 7056.18 ms | 20471.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.07 ms</font> |<font color="#C0C0C0"> 24580.52 ms</font> |<font color="#C0C0C0"> 13170.99 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 12842.47 ms | 14162.48 ms | **2685.78 ms** | Error | Error | 7208.70 ms | 20592.58 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 16.84 ms</font> |<font color="#C0C0C0"> 19839.92 ms</font> |<font color="#C0C0C0"> 13272.60 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 82644.62 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 14250.52 ms | 13250.13 ms | 7171.27 ms | Error | Error | 10205.19 ms | **3115.19 ms** |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.01 ms</font> |<font color="#C0C0C0"> 3.44 ms</font> |<font color="#C0C0C0"> 5485.72 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 64200.50 ms | 55987.28 ms | 70342.26 ms | Error | Error | **29403.51 ms** | 1.76E5 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 6.28 ms</font> |<font color="#C0C0C0"> 4.09 ms</font> |<font color="#C0C0C0"> 19235.51 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.15 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 12945.22 ms | 13167.53 ms | **6119.93 ms** | Error | Error | 10084.06 ms | 39115.80 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.23E6 ms</font> |<font color="#C0C0C0"> 1.01E6 ms</font> |<font color="#C0C0C0"> 12145.97 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **7303.20 ms**</font> |<font color="#C0C0C0"> 2.03E6 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 206.78 ms | 48.64 ms | **1.20 ms** | Error | Error | 17971.03 ms | 4869.37 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 10129.62 ms</font> |<font color="#C0C0C0"> 5552.17 ms</font> |<font color="#C0C0C0"> **3570.32 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 7379.75 ms</font> |<font color="#C0C0C0"> 60645.37 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 376.90 ms | **135.84 ms** | 1620.94 ms | Error | Error | 2.07E5 ms | 44759.81 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 10393.55 ms</font> |<font color="#C0C0C0"> 6487.42 ms</font> |<font color="#C0C0C0"> **3542.21 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 6839.11 ms</font> |<font color="#C0C0C0"> 1.70E5 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 4006.99 ms | **3084.81 ms** | 7341.36 ms | Error | Error | 1.81E6 ms | 4.38E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 20.36 ms</font> |<font color="#C0C0C0"> 6.70 ms</font> |<font color="#C0C0C0"> 11.72 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 3.51 ms | **1.02 ms** | 64333.54 ms | Error | Error | 45648.67 ms | 1.39E6 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.00 ms</font> |<font color="#C0C0C0"> 12871.51 ms</font> |<font color="#C0C0C0"> 8941.02 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 75640.81 ms | **66496.15 ms** | 5.24E5 ms | Error | Error | 6.18E5 ms | 1.45E6 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.10 ms</font> |<font color="#C0C0C0"> 11.67 ms</font> |<font color="#C0C0C0"> 17463.10 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.06 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 2.16E5 ms | 1.94E5 ms | 1.43E6 ms | Error | Error | **1.69E5 ms** | 1.86E7 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.46 ms</font> |<font color="#C0C0C0"> 3.46 ms</font> |<font color="#C0C0C0"> 81.16 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.08 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 1.12E5 ms | 39956.90 ms | **156.75 ms** | Error | Error | 43014.13 ms | 8.39E6 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 10.53 ms</font> |<font color="#C0C0C0"> 11626.21 ms</font> |<font color="#C0C0C0"> 12493.90 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.08 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 53093.87 ms | 55434.40 ms | 3.48E5 ms | Error | Error | **30071.94 ms** | 8.00E6 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 6.67 ms</font> |<font color="#C0C0C0"> 13914.45 ms</font> |<font color="#C0C0C0"> 18606.37 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.07 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 9160.28 ms | **5676.63 ms** | 46110.89 ms | Error | Error | 9358.86 ms | 5.41E5 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.78 ms</font> |<font color="#C0C0C0"> 13697.71 ms</font> |<font color="#C0C0C0"> 8688.58 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **17561.26 ms** | 34682.37 ms | 29052.12 ms | Error | Error | 35961.72 ms | 4.40E6 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 5.07 ms</font> |<font color="#C0C0C0"> 3486.75 ms</font> |<font color="#C0C0C0"> 6470.05 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.01 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1950.12 ms | 775.04 ms | **666.58 ms** | Error | Error | 2821.43 ms | 34492.86 ms |

# <a name="toc"></a>[Table of contents](#toc)

- [Evaluation Overview](#overview)
- [Test Series Datasets](#testseriesinformation)
- Evaluation Details
    - [sqlite4java](#sqlite4java)
    - [SQLite-Xerial](#SQLite-Xerial)
    - [PostgreSQL](#PostgreSQL)
    - [Virtuoso](#Virtuoso)
    - [Fuseki](#Fuseki)
    - [MongoDB](#MongoDB)
    - [ArangoDB](#ArangoDB)

## <a name="testseriesinformation"></a>[Test Series Datasets](#testseriesinformation)

| Test Series LARGE | Dataset Size |
| :-- | --: |
| hebis_10147116_13050073_rdf_gz | 206.285 MB |
| hebis_29873806_36057474_rdf_gz | 298.021 MB |

## <a name="sqlite4java"></a>[Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series LARGE](#sqlite4java)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 26.01 ms |
| Load || 1.27E6 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">56115.56 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 27.58 ms | 0.37 ms | 0.38 ms | 9.44 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9214.12 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 7.56 ms | 3.03 ms | 8.18 ms | 6.26 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10215.23 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 9.52 ms | 4.73 ms | 6.02 ms | 6.75 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.32 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 10815.27 ms | 10977.17 ms | 10678.40 ms | 10823.61 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.41 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 13046.37 ms | 10666.59 ms | 10747.23 ms | 11486.73 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.90 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 11526.99 ms | 11648.15 ms | 11596.71 ms | 11590.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.29 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 10750.54 ms | 11567.81 ms | 13299.18 ms | 11872.51 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.11 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 13081.84 ms | 10395.37 ms | 13999.41 ms | 12492.21 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.07 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 11196.83 ms | 14329.78 ms | 13000.81 ms | 12842.47 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.84 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 14092.84 ms | 12175.49 ms | 16483.22 ms | 14250.52 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.01 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 84387.37 ms | 56750.68 ms | 51463.44 ms | 64200.50 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.28 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 13033.33 ms | 12916.79 ms | 12885.55 ms | 12945.22 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.23E6 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 510.27 ms | 51.76 ms | 58.29 ms | 206.78 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10129.62 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 847.98 ms | 140.22 ms | 142.49 ms | 376.90 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10393.55 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 5315.40 ms | 3374.11 ms | 3331.46 ms | 4006.99 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">20.36 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 3.51 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 75640.81 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.10 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 2.16E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.46 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 1.12E5 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.53 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 53093.87 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.67 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 9160.28 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.78 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 17561.26 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.07 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1950.12 ms |

## <a name="SQLite-Xerial"></a>[Evaluation Details for SQLite-Xerial, Version 3.8.11, Test Series LARGE](#SQLite-Xerial)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 146.01 ms |
| Load || 1.19E6 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">57742.43 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.48 ms | 0.18 ms | 2.70 ms | 1.12 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">22439.78 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.54 ms | 3.49 ms | 3.45 ms | 2.50 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26944.78 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 5.43 ms | 2.53 ms | 5.03 ms | 4.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15639.44 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2173.07 ms | 2127.87 ms | 2154.55 ms | 2151.83 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16973.25 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2289.82 ms | 2277.15 ms | 2282.80 ms | 2283.26 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17295.63 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 3141.29 ms | 3152.03 ms | 3079.78 ms | 3124.37 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25100.92 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 14989.25 ms | 14891.03 ms | 14491.59 ms | 14790.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">24692.90 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 14196.63 ms | 14164.37 ms | 14169.21 ms | 14176.74 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">24580.52 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 14112.35 ms | 14280.15 ms | 14094.96 ms | 14162.48 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19839.92 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 13326.35 ms | 13169.14 ms | 13254.91 ms | 13250.13 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.44 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 55579.45 ms | 56727.61 ms | 55654.79 ms | 55987.28 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.09 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 13114.77 ms | 13109.29 ms | 13278.53 ms | 13167.53 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.01E6 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 50.68 ms | 45.48 ms | 49.76 ms | 48.64 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5552.17 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 142.17 ms | 135.91 ms | 129.43 ms | 135.84 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6487.42 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 3146.62 ms | 3030.41 ms | 3077.39 ms | 3084.81 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.70 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.02 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12871.51 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 66496.15 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.67 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.94E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.46 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 39956.90 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11626.21 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 55434.40 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13914.45 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 5676.63 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13697.71 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 34682.37 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3486.75 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 775.04 ms |

## <a name="PostgreSQL"></a>[Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series LARGE](#PostgreSQL)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 545.21 ms |
| Load || 1.64E6 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17664.76 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 5.58 ms | 0.71 ms | 2.52 ms | 2.93 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9965.09 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 4.75 ms | 1.34 ms | 2.33 ms | 2.80 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10197.67 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 14.22 ms | 8.10 ms | 8.25 ms | 10.19 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8887.14 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 3441.43 ms | 2650.93 ms | 2667.13 ms | 2919.83 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8950.74 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3729.64 ms | 2800.07 ms | 2735.18 ms | 3088.30 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8819.23 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 4471.19 ms | 3662.40 ms | 3604.65 ms | 3912.75 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13177.38 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3209.76 ms | 2447.67 ms | 2484.68 ms | 2714.04 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13137.28 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 3102.20 ms | 2432.18 ms | 2491.87 ms | 2675.42 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13170.99 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 3320.64 ms | 2430.87 ms | 2305.84 ms | 2685.78 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13272.60 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 11207.82 ms | 5190.82 ms | 5115.15 ms | 7171.27 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5485.72 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 81131.34 ms | 71789.50 ms | 58105.95 ms | 70342.26 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19235.51 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 7066.93 ms | 5792.11 ms | 5500.77 ms | 6119.93 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12145.97 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 2.35 ms | 0.65 ms | 0.59 ms | 1.20 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3570.32 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 1811.15 ms | 1528.35 ms | 1523.33 ms | 1620.94 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3542.21 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 7409.75 ms | 7152.22 ms | 7462.12 ms | 7341.36 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.72 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 64333.54 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8941.02 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 5.24E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17463.10 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.43E6 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">81.16 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 156.75 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12493.90 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.48E5 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18606.37 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 46110.89 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8688.58 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 29052.12 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6470.05 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 666.58 ms |

## <a name="Virtuoso"></a>[Evaluation Details for Virtuoso, Version 07.20.3214 / Virtuoso JDBC 4.1, Test Series LARGE](#Virtuoso)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || Error |
| Load || Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | Error |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | Error |

## <a name="Fuseki"></a>[Evaluation Details for Fuseki, Version 2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0, Test Series LARGE](#Fuseki)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || Error |
| Load || Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | Error |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | Error |

## <a name="MongoDB"></a>[Evaluation Details for MongoDB, Version 3.0.6, Test Series LARGE](#MongoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 5.30 ms |
| Load || 1.93E6 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">36047.30 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2808.91 ms | 2459.08 ms | 2544.10 ms | 2604.03 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">32303.63 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 24500.49 ms | 24500.06 ms | 24621.56 ms | 24540.70 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">32706.44 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.44E5 ms | 2.48E5 ms | 2.46E5 ms | 2.46E5 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 9732.69 ms | 9519.92 ms | 9545.45 ms | 9599.36 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 9763.15 ms | 9564.52 ms | 9464.89 ms | 9597.52 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 7066.40 ms | 7113.03 ms | 7109.45 ms | 7096.29 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 7100.20 ms | 7065.28 ms | 7003.07 ms | 7056.18 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 7210.33 ms | 7117.53 ms | 7298.23 ms | 7208.70 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 10352.71 ms | 10108.08 ms | 10154.78 ms | 10205.19 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 29900.74 ms | 29160.27 ms | 29149.54 ms | 29403.51 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 10160.21 ms | 10146.96 ms | 9945.00 ms | 10084.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7303.20 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 18153.86 ms | 17780.34 ms | 17978.89 ms | 17971.03 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7379.75 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 2.16E5 ms | 2.07E5 ms | 1.97E5 ms | 2.07E5 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6839.11 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1.95E6 ms | 1.78E6 ms | 1.72E6 ms | 1.81E6 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 45648.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 6.18E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.69E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 43014.13 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 30071.94 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 9358.86 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 35961.72 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 2821.43 ms |

## <a name="ArangoDB"></a>[Evaluation Details for ArangoDB, Version 2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8, Test Series LARGE](#ArangoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 168.01 ms |
| Load || 2.32E6 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.58E5 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 8024.96 ms | 7961.33 ms | 8056.56 ms | 8014.28 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.58E5 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 81408.45 ms | 81224.10 ms | 80960.20 ms | 81197.58 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.61E5 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 8.42E5 ms | 8.60E5 ms | 8.71E5 ms | 8.58E5 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 14513.76 ms | 14264.49 ms | 14446.78 ms | 14408.34 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 14115.78 ms | 14143.68 ms | 14260.52 ms | 14173.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 23568.51 ms | 22361.28 ms | 21507.10 ms | 22478.96 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 21161.78 ms | 20572.97 ms | 20621.72 ms | 20785.49 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 20404.66 ms | 20640.17 ms | 20369.41 ms | 20471.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 20767.96 ms | 19887.98 ms | 21121.81 ms | 20592.58 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">82644.62 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3099.61 ms | 3120.00 ms | 3125.97 ms | 3115.19 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1.92E5 ms | 1.75E5 ms | 1.60E5 ms | 1.76E5 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.15 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 39014.97 ms | 39515.09 ms | 38817.33 ms | 39115.80 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.03E6 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 4861.68 ms | 4927.80 ms | 4818.62 ms | 4869.37 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">60645.37 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 41907.43 ms | 46065.05 ms | 46306.94 ms | 44759.81 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.70E5 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 4.39E5 ms | 4.40E5 ms | 4.34E5 ms | 4.38E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.39E6 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.45E6 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.06 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.86E7 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.08 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 8.39E6 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.08 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 8.00E6 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.07 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 5.41E5 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4.40E6 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.01 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 34492.86 ms |
