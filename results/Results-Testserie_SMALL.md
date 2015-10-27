<style style="text/css">tr:hover{background: #FFFF00;}</style>

# Report for Testserie "SMALL"


## Evaluation Overview, all Databases, Test Series $TestSeries 

| QueryScenario | Phase | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB | ArangoDB |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 19.82 ms | 79.28 ms | 249.63 ms | **0.00 ms** | 1.06 ms | 4.63 ms | 189.81 ms |
| Load |  | 20267.76 ms | 18828.48 ms | 26580.99 ms | 29980.77 ms | **8283.38 ms** | 32453.54 ms | 45811.31 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 320.15 ms</font> |<font color="#C0C0C0"> 367.10 ms</font> |<font color="#C0C0C0"> **193.98 ms**</font> |<font color="#C0C0C0"> 3949.95 ms</font> |<font color="#C0C0C0"> 2503.63 ms</font> |<font color="#C0C0C0"> 578.71 ms</font> |<font color="#C0C0C0"> 1637.75 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.45 ms | **0.17 ms** | 0.96 ms | 28.42 ms | 318.23 ms | 41.19 ms | 127.08 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 157.68 ms</font> |<font color="#C0C0C0"> 414.54 ms</font> |<font color="#C0C0C0"> 167.59 ms</font> |<font color="#C0C0C0"> 2660.86 ms</font> |<font color="#C0C0C0"> **145.39 ms**</font> |<font color="#C0C0C0"> 515.23 ms</font> |<font color="#C0C0C0"> 1733.48 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.28 ms | **0.41 ms** | 2.12 ms | 38.91 ms | 5163.45 ms | 414.92 ms | 1388.48 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 205.27 ms</font> |<font color="#C0C0C0"> 423.49 ms</font> |<font color="#C0C0C0"> **170.78 ms**</font> |<font color="#C0C0C0"> 2838.99 ms</font> |<font color="#C0C0C0"> 184.24 ms</font> |<font color="#C0C0C0"> 504.27 ms</font> |<font color="#C0C0C0"> 1659.92 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.09 ms | **1.88 ms** | 3.79 ms | 128.70 ms | 43864.44 ms | 4165.99 ms | 12976.03 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.45 ms</font> |<font color="#C0C0C0"> 190.10 ms</font> |<font color="#C0C0C0"> 82.06 ms</font> |<font color="#C0C0C0"> 1.05 ms</font> |<font color="#C0C0C0"> 2.28 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 137.66 ms | 29.09 ms | 36.84 ms | 141.96 ms | **24.23 ms** | 90.05 ms | 163.12 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.65 ms</font> |<font color="#C0C0C0"> 199.94 ms</font> |<font color="#C0C0C0"> 84.63 ms</font> |<font color="#C0C0C0"> 0.52 ms</font> |<font color="#C0C0C0"> 1.69 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 131.08 ms | 35.66 ms | 35.94 ms | 105.72 ms | **23.96 ms** | 89.38 ms | 154.78 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 217.18 ms</font> |<font color="#C0C0C0"> 80.27 ms</font> |<font color="#C0C0C0"> 0.55 ms</font> |<font color="#C0C0C0"> 1.50 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 144.32 ms | **39.52 ms** | 47.51 ms | 401.66 ms | 104.44 ms | 125.15 ms | 310.11 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.11 ms</font> |<font color="#C0C0C0"> 370.61 ms</font> |<font color="#C0C0C0"> 203.88 ms</font> |<font color="#C0C0C0"> 0.41 ms</font> |<font color="#C0C0C0"> 2.30 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 157.20 ms | 225.33 ms | **46.76 ms** | 170.54 ms | 121.72 ms | 177.53 ms | 550.60 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.60 ms</font> |<font color="#C0C0C0"> 390.76 ms</font> |<font color="#C0C0C0"> 214.33 ms</font> |<font color="#C0C0C0"> 0.38 ms</font> |<font color="#C0C0C0"> 2.24 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 158.04 ms | 225.51 ms | **41.98 ms** | 164.66 ms | 124.99 ms | 121.41 ms | 546.51 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.65 ms</font> |<font color="#C0C0C0"> 399.67 ms</font> |<font color="#C0C0C0"> 207.93 ms</font> |<font color="#C0C0C0"> 0.59 ms</font> |<font color="#C0C0C0"> 2.95 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 158.86 ms | 220.14 ms | **46.26 ms** | 132.32 ms | 122.93 ms | 121.12 ms | 546.47 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.51 ms</font> |<font color="#C0C0C0"> 337.62 ms</font> |<font color="#C0C0C0"> 179.11 ms</font> |<font color="#C0C0C0"> 0.38 ms</font> |<font color="#C0C0C0"> 8.07 ms</font> |<font color="#C0C0C0"> **0.01 ms**</font> |<font color="#C0C0C0"> 1422.26 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 220.61 ms | 281.35 ms | **127.56 ms** | 6954.86 ms | 16627.46 ms | 235.98 ms | 152.28 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.51 ms</font> |<font color="#C0C0C0"> 2.48 ms</font> |<font color="#C0C0C0"> 114.83 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 9.23 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1674.19 ms | 1424.34 ms | 1325.06 ms | Error | 303745.32 ms | **590.98 ms** | 3219.17 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 2.25 ms</font> |<font color="#C0C0C0"> 287.44 ms</font> |<font color="#C0C0C0"> 2.27 ms</font> |<font color="#C0C0C0"> 10.24 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 242.14 ms | 354.72 ms | **126.08 ms** | 492380.66 ms | 14917.16 ms | 259.86 ms | 938.02 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 17729.72 ms</font> |<font color="#C0C0C0"> 17019.31 ms</font> |<font color="#C0C0C0"> 99.48 ms</font> |<font color="#C0C0C0"> 21391.83 ms</font> |<font color="#C0C0C0"> 83.40 ms</font> |<font color="#C0C0C0"> **79.35 ms**</font> |<font color="#C0C0C0"> Error</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | **0.03 ms** | 0.04 ms | 0.46 ms | 2990.96 ms | 7.79 ms | 286.66 ms | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 17670.40 ms</font> |<font color="#C0C0C0"> 16626.89 ms</font> |<font color="#C0C0C0"> 94.66 ms</font> |<font color="#C0C0C0"> 14088.04 ms</font> |<font color="#C0C0C0"> **40.62 ms**</font> |<font color="#C0C0C0"> 86.68 ms</font> |<font color="#C0C0C0"> Error</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | **0.02 ms** | 0.05 ms | 0.42 ms | 18.94 ms | 0.52 ms | 3150.36 ms | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 18638.49 ms</font> |<font color="#C0C0C0"> 16658.44 ms</font> |<font color="#C0C0C0"> 87.69 ms</font> |<font color="#C0C0C0"> 13195.59 ms</font> |<font color="#C0C0C0"> **67.99 ms**</font> |<font color="#C0C0C0"> 80.53 ms</font> |<font color="#C0C0C0"> Error</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | **0.02 ms** | 0.03 ms | 0.41 ms | 2214.08 ms | 6.13 ms | 40297.16 ms | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 18299.56 ms</font> |<font color="#C0C0C0"> 16608.11 ms</font> |<font color="#C0C0C0"> **85.77 ms**</font> |<font color="#C0C0C0"> 12840.15 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 90.02 ms</font> |<font color="#C0C0C0"> Error</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | **0.02 ms** | 0.03 ms | 0.54 ms | 28.20 ms | Error | 9985.49 ms | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 17414.39 ms</font> |<font color="#C0C0C0"> 16611.78 ms</font> |<font color="#C0C0C0"> **84.66 ms**</font> |<font color="#C0C0C0"> 12061.90 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 85.56 ms</font> |<font color="#C0C0C0"> Error</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | **0.02 ms** | 0.03 ms | 0.55 ms | 890.40 ms | Error | 39653.00 ms | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 16760.10 ms</font> |<font color="#C0C0C0"> 16353.82 ms</font> |<font color="#C0C0C0"> 91.81 ms</font> |<font color="#C0C0C0"> 10397.93 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **85.80 ms**</font> |<font color="#C0C0C0"> Error</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | **0.02 ms** | 0.03 ms | 0.58 ms | 823.19 ms | Error | 2460600.68 ms | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.12 ms</font> |<font color="#C0C0C0"> 1.66 ms</font> |<font color="#C0C0C0"> 9.71 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 1.94 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **0.97 ms** | 1.11 ms | 792.86 ms | Error | 18094.20 ms | 622.02 ms | 7655.84 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.33 ms</font> |<font color="#C0C0C0"> 206.26 ms</font> |<font color="#C0C0C0"> 190.73 ms</font> |<font color="#C0C0C0"> 1.82 ms</font> |<font color="#C0C0C0"> 294.28 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 4.80 ms | **1.15 ms** | 5235.84 ms | 9650.19 ms | 534.21 ms | 9848.91 ms | 7670.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 1.57 ms</font> |<font color="#C0C0C0"> 204.40 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 6.37 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 4.69 ms | **0.89 ms** | 16083.67 ms | Error | 104032.42 ms | 2039.28 ms | 28378.17 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.76 ms</font> |<font color="#C0C0C0"> 1.27 ms</font> |<font color="#C0C0C0"> 14.62 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 2.21 ms</font> |<font color="#C0C0C0"> 0.01 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0.02 ms** | 0.03 ms | 3.55 ms | Error | 0.17 ms | 371.95 ms | 6077.65 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.30 ms</font> |<font color="#C0C0C0"> 170.88 ms</font> |<font color="#C0C0C0"> 175.48 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 1.45 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 793.05 ms | 1126.89 ms | 4905.87 ms | Error | 3805.18 ms | **578.22 ms** | 6840.49 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.46 ms</font> |<font color="#C0C0C0"> 208.25 ms</font> |<font color="#C0C0C0"> 659.66 ms</font> |<font color="#C0C0C0"> 17.41 ms</font> |<font color="#C0C0C0"> 2.08 ms</font> |<font color="#C0C0C0"> 0.01 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 101.16 ms | **36.26 ms** | 240.19 ms | 188999.88 ms | 309.02 ms | 61.42 ms | 1090.50 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 217.04 ms</font> |<font color="#C0C0C0"> 257.78 ms</font> |<font color="#C0C0C0"> 0.96 ms</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 471.58 ms | 1965.04 ms | 1028.07 ms | **6.37 ms** | Error | 416.54 ms | 855.73 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 24.23 ms</font> |<font color="#C0C0C0"> 103.94 ms</font> |<font color="#C0C0C0"> 0.88 ms</font> |<font color="#C0C0C0"> 939.21 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 13.79 ms | 33.19 ms | 4.09 ms | **3.90 ms** | 14165.55 ms | 6.17 ms | 18.09 ms |
-----

## Evaluation Details for sqlite4java, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 19.82 ms |
| Load | 20267.76 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">320.15 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.15 ms | 0.45 ms | 0.11 ms | 1.15 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">157.68 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.78 ms | 1.28 ms | 0.50 ms | 1.78 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">205.27 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4.08 ms | 3.09 ms | 1.96 ms | 4.08 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.45 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 135.31 ms | 137.66 ms | 133.39 ms | 135.31 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.65 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 137.71 ms | 131.08 ms | 126.50 ms | 137.71 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 152.82 ms | 144.32 ms | 140.04 ms | 152.82 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.11 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 164.02 ms | 157.20 ms | 158.32 ms | 164.02 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.60 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 156.17 ms | 158.04 ms | 154.82 ms | 156.17 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.65 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 158.37 ms | 158.86 ms | 158.37 ms | 160.80 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.51 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 227.09 ms | 220.61 ms | 217.61 ms | 227.09 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.51 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1382.58 ms | 1674.19 ms | 1382.58 ms | 1895.36 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 237.13 ms | 242.14 ms | 237.13 ms | 241.51 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17729.72 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.06 ms | 0.03 ms | 0.02 ms | 0.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17670.40 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.04 ms | 0.02 ms | 0.02 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18638.49 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.04 ms | 0.02 ms | 0.01 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18299.56 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.04 ms | 0.02 ms | 0.01 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17414.39 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.04 ms | 0.02 ms | 0.01 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16760.10 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.04 ms | 0.02 ms | 0.01 ms | 0.04 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.12 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.97 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.33 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 4.80 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 4.69 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.76 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.30 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 793.05 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.46 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 101.16 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 471.58 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 13.79 ms |
-----

## Evaluation Details for SQLite JDBC Xerial, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 79.28 ms |
| Load | 18828.48 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">367.10 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.33 ms | 0.17 ms | 0.10 ms | 0.33 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">414.54 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.46 ms | 0.41 ms | 0.44 ms | 0.46 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">423.49 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.35 ms | 1.88 ms | 1.74 ms | 2.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">190.10 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 30.67 ms | 29.09 ms | 28.57 ms | 30.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">199.94 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 39.11 ms | 35.66 ms | 33.05 ms | 39.11 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">217.18 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 42.91 ms | 39.52 ms | 37.51 ms | 42.91 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">370.61 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 221.85 ms | 225.33 ms | 221.85 ms | 227.50 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">390.76 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 226.85 ms | 225.51 ms | 226.85 ms | 228.54 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">399.67 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 222.78 ms | 220.14 ms | 222.78 ms | 227.97 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">337.62 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 278.75 ms | 281.35 ms | 278.75 ms | 279.48 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.48 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1158.73 ms | 1424.34 ms | 1158.73 ms | 1970.68 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.25 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 305.69 ms | 354.72 ms | 305.69 ms | 315.11 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17019.31 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.06 ms | 0.04 ms | 0.04 ms | 0.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16626.89 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.03 ms | 0.05 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16658.44 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.03 ms | 0.03 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16608.11 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.03 ms | 0.03 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16611.78 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.03 ms | 0.03 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16353.82 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.03 ms | 0.03 ms | 0.03 ms | 0.04 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.66 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.11 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">206.26 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.15 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.57 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.89 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.27 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">170.88 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1126.89 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">208.25 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 36.26 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">217.04 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1965.04 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">24.23 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 33.19 ms |
-----

## Evaluation Details for PostgreSQL (Postgres.app), Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 249.63 ms |
| Load | 26580.99 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">193.98 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.85 ms | 0.96 ms | 0.52 ms | 1.85 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">167.59 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 2.95 ms | 2.12 ms | 1.75 ms | 2.95 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">170.78 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4.88 ms | 3.79 ms | 3.44 ms | 4.88 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">82.06 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 48.68 ms | 36.84 ms | 31.02 ms | 48.68 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">84.63 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 47.43 ms | 35.94 ms | 29.99 ms | 47.43 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">80.27 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 56.25 ms | 47.51 ms | 39.56 ms | 56.25 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">203.88 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 58.23 ms | 46.76 ms | 38.96 ms | 58.23 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">214.33 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 53.60 ms | 41.98 ms | 37.63 ms | 53.60 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">207.93 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 61.60 ms | 46.26 ms | 39.99 ms | 61.60 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">179.11 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 143.05 ms | 127.56 ms | 118.65 ms | 143.05 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">114.83 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1761.78 ms | 1325.06 ms | 1040.04 ms | 1761.78 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">287.44 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 136.73 ms | 126.08 ms | 117.69 ms | 136.73 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">99.48 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.70 ms | 0.46 ms | 0.37 ms | 0.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">94.66 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.73 ms | 0.42 ms | 0.30 ms | 0.73 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">87.69 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.62 ms | 0.41 ms | 0.29 ms | 0.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">85.77 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.88 ms | 0.54 ms | 0.38 ms | 0.88 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">84.66 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.83 ms | 0.55 ms | 0.38 ms | 0.83 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">91.81 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.86 ms | 0.58 ms | 0.46 ms | 0.86 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.71 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 792.86 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">190.73 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 5235.84 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">204.40 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 16083.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.62 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.55 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">175.48 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4905.87 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">659.66 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 240.19 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">257.78 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1028.07 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">103.94 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 4.09 ms |
-----

## Evaluation Details for Apache Jena Fuseki, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 0.00 ms |
| Load | 29980.77 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3949.95 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 58.08 ms | 28.42 ms | 13.33 ms | 58.08 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2660.86 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 57.89 ms | 38.91 ms | 28.15 ms | 57.89 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2838.99 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 144.39 ms | 128.70 ms | 110.77 ms | 144.39 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.05 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 220.95 ms | 141.96 ms | 120.17 ms | 220.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.52 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 124.88 ms | 105.72 ms | 94.32 ms | 124.88 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.55 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 474.25 ms | 401.66 ms | 387.67 ms | 474.25 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.41 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 203.26 ms | 170.54 ms | 139.17 ms | 203.26 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.38 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 154.58 ms | 164.66 ms | 154.58 ms | 157.24 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.59 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 164.73 ms | 132.32 ms | 106.31 ms | 164.73 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.38 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 7391.70 ms | 6954.86 ms | 7041.68 ms | 7391.70 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.27 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 578814.15 ms | 492380.66 ms | 467977.23 ms | 578814.15 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">21391.83 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 4103.70 ms | 2990.96 ms | 136.47 ms | 4103.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14088.04 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 9.31 ms | 18.94 ms | 8.89 ms | 9.31 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13195.59 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 139.18 ms | 2214.08 ms | 139.18 ms | 2681.40 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12840.15 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 29.06 ms | 28.20 ms | 29.06 ms | 44.42 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12061.90 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 23.39 ms | 890.40 ms | 23.39 ms | 2636.73 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10397.93 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 2412.41 ms | 823.19 ms | 44.30 ms | 2412.41 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.82 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9650.19 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.41 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 188999.88 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.96 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.37 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.88 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.90 ms |
-----

## Evaluation Details for Virtuoso, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 1.06 ms |
| Load | 8283.38 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2503.63 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 304.58 ms | 318.23 ms | 304.58 ms | 326.91 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">145.39 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 5202.44 ms | 5163.45 ms | 5191.11 ms | 5202.44 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">184.24 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 43960.17 ms | 43864.44 ms | 43960.17 ms | 44163.72 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.28 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 24.09 ms | 24.23 ms | 23.72 ms | 24.09 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.69 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 24.18 ms | 23.96 ms | 23.61 ms | 24.18 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.50 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 107.11 ms | 104.44 ms | 105.09 ms | 107.11 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.30 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 125.55 ms | 121.72 ms | 118.68 ms | 125.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.24 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 121.75 ms | 124.99 ms | 121.75 ms | 124.86 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.95 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 123.50 ms | 122.93 ms | 122.88 ms | 123.50 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.07 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 16917.54 ms | 16627.46 ms | 16765.93 ms | 16917.54 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.23 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 325480.79 ms | 303745.32 ms | 294538.93 ms | 325480.79 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.24 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 14226.75 ms | 14917.16 ms | 14226.75 ms | 15331.18 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">83.40 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 10.18 ms | 7.79 ms | 6.87 ms | 10.18 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">40.62 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.63 ms | 0.52 ms | 0.50 ms | 0.63 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">67.99 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6.20 ms | 6.13 ms | 6.20 ms | 6.28 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | Error | Error | Error | Error |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.94 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 18094.20 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">294.28 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 534.21 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.37 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 104032.42 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.21 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.17 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.45 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3805.18 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.08 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 309.02 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">939.21 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 14165.55 ms |
-----

## Evaluation Details for MongoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 4.63 ms |
| Load | 32453.54 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">578.71 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 47.72 ms | 41.19 ms | 37.21 ms | 47.72 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">515.23 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 407.46 ms | 414.92 ms | 407.46 ms | 419.07 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">504.27 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4110.42 ms | 4165.99 ms | 4078.59 ms | 4110.42 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 94.89 ms | 90.05 ms | 83.56 ms | 94.89 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 87.15 ms | 89.38 ms | 87.15 ms | 93.73 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 123.34 ms | 125.15 ms | 123.34 ms | 127.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 254.04 ms | 177.53 ms | 141.56 ms | 254.04 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 123.36 ms | 121.41 ms | 123.36 ms | 126.46 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 126.13 ms | 121.12 ms | 120.72 ms | 126.13 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.01 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 230.89 ms | 235.98 ms | 213.77 ms | 230.89 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 602.87 ms | 590.98 ms | 582.44 ms | 602.87 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 258.42 ms | 259.86 ms | 252.76 ms | 258.42 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">79.35 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 293.59 ms | 286.66 ms | 284.13 ms | 293.59 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">86.68 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 3192.95 ms | 3150.36 ms | 3100.58 ms | 3192.95 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">80.53 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 40129.01 ms | 40297.16 ms | 38989.23 ms | 40129.01 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">90.02 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 9824.56 ms | 9985.49 ms | 9824.56 ms | 10204.46 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">85.56 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 40657.95 ms | 39653.00 ms | 39824.16 ms | 40657.95 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">85.80 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 2467347.50 ms | 2460600.68 ms | 2452864.47 ms | 2467347.50 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 622.02 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9848.91 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 2039.28 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.01 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 371.95 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 578.22 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.01 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 61.42 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 416.54 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 6.17 ms |
-----

## Evaluation Details for ArangoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 189.81 ms |
| Load | 45811.31 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1637.75 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 133.99 ms | 127.08 ms | 123.71 ms | 133.99 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1733.48 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1410.03 ms | 1388.48 ms | 1410.03 ms | 1418.90 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1659.92 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 13142.07 ms | 12976.03 ms | 12827.42 ms | 13142.07 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 169.25 ms | 163.12 ms | 164.44 ms | 169.25 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 158.78 ms | 154.78 ms | 148.56 ms | 158.78 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 333.57 ms | 310.11 ms | 306.71 ms | 333.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 567.74 ms | 550.60 ms | 554.22 ms | 567.74 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 564.34 ms | 546.51 ms | 529.29 ms | 564.34 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 563.91 ms | 546.47 ms | 544.25 ms | 563.91 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1422.26 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 157.18 ms | 152.28 ms | 146.92 ms | 157.18 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 3215.41 ms | 3219.17 ms | 3134.36 ms | 3215.41 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 971.46 ms | 938.02 ms | 943.08 ms | 971.46 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | Error | Error | Error | Error |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 7655.84 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 7670.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 28378.17 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 6077.65 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6840.49 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1090.50 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 855.73 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 18.09 ms |
-----

## Verify results

| QueryScenario | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB | ArangoDB |
| :-- | --: | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 835353204 | 835353204 | 1425672702 | 2124822272 | -963919411 | 835353204 | 902867883 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | 44616011 | 44616011 | -584569497 | 695559531 | 2091867158 | 44616011 | 1616211031 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 1925029427 | 1925029427 | 1991123417 | 1996839242 | -1917582529 | 1901014453 | 1164261819 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -1128116214 | -1128116214 | 221316869 | 763310181 | 763310181 | -1128116214 | 219803483 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 826019313 | 826019313 | 448072416 | 1497485201 | 1497485201 | 826019313 | 1760363924 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | -266020850 | -266020850 | 1350679838 | -460857973 | -974393603 | 1956956235 | 49674114 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | -386165377 | -386165377 | -386165377 | -386165377 | -386165377 | -386165377 | -386165377 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | -1871184966 | -1871184966 | -1871184966 | -802258597 | -802258597 | -802258597 | -1189728683 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | -1871184966 | -1871184966 | -1871184966 | -802258597 | -802258597 | -802258597 | -1189728683 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -1953031080 | -1953031080 | 601654650 | -1803091399 | -121636277 | -1953031080 | -216532096 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | 1148095063 | 1148095063 | -1854435863 |  | -961321260 | 1148095063 | 1568342169 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 526337392 | 526337392 | -1054398454 | 204827305 | 183777709 | 526337392 | 1003439764 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY_** | 1289739550 | 1289739550 | 1289739550 | 690376854 | -1480308529 | 333501923 |  |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES_** | 1289739550 | 1289739550 | 1289739550 | 1190421384 | -479181487 | -1783227484 |  |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES_** | 1289739550 | 1289739550 | 1289739550 | 690376854 | -1480308529 | 566636864 |  |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY_** | 1289739550 | 1289739550 | 1289739550 | 1289739550 |  | -499282538 |  |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES_** | 1289739550 | 1289739550 | 1289739550 | 1289739550 |  | 872236453 |  |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES_** | 1289739550 | 1289739550 | 1289739550 | 1289739550 |  | -1165488996 |  |
| **_SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY_** | 1207871171 | 1207871171 | 1207871171 |  | 1207871171 | 1207871171 | 1207871171 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 |
| **_SCHEMA_CHANGE_MIGRATE_RDF_TYPE_** | 1207871171 | 1207871171 | 1207871171 |  | 1207871171 | 1207871171 | 1207871171 |
| **_SCHEMA_CHANGE_REMOVE_RDF_TYPE_** | 1207871171 | 1207871171 | 1207871171 |  | 1207871171 | 1207871171 | 1207871171 |
| **_UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 1207871171 | 1207871171 | 1207871171 |  | 1207871171 | 1207871171 | 1207871171 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 |
| **_DELETE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 1207871171 | 1207871171 | 1207871171 | 1207871171 |  | 1207871171 | 1207871171 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 | 1207871171 |
