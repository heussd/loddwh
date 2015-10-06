<style style="text/css">tr:hover{background: #FFFF00;}</style>

# Report for Testserie "TINY"

-----

## Report for sqlite4java

| Task | Time |
| :-- | --: |
| Set up | 176,79 ms |
| Load | 440,48 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 28,76 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2,35 ms | 1,25 ms | 0,70 ms | 2,35 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 1,30 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1,30 ms | 1,71 ms | 1,30 ms | 2,69 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 1,23 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1,23 ms | 1,14 ms | 1,10 ms | 1,23 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1,25 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2,07 ms | 1,13 ms | 0,68 ms | 2,07 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 1,17 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0,76 ms | 0,72 ms | 0,69 ms | 0,76 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1,05 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0,73 ms | 0,74 ms | 0,73 ms | 0,80 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 1,20 ms |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1,17 ms | 1,05 ms | 1,01 ms | 1,17 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 1,24 ms |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1,07 ms | 1,04 ms | 1,01 ms | 1,07 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 1,11 ms |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1,04 ms | 1,00 ms | 0,99 ms | 1,04 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 1,06 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2,33 ms | 2,30 ms | 2,31 ms | 2,33 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 1,15 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 21,66 ms | 18,17 ms | 17,05 ms | 21,66 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 5,45 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2,49 ms | 2,31 ms | 2,22 ms | 2,49 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 306,63 ms |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0,14 ms | 0,10 ms | 0,08 ms | 0,14 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 318,09 ms |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0,11 ms | 0,09 ms | 0,08 ms | 0,11 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 4,44 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 27,86 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1,01 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 21,58 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 1,24 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 22,15 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1,52 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0,07 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 0,79 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 52,24 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 1,09 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 25,17 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1,08 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0,38 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 0,87 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0,27 ms |
-----

## Report for SQLite JDBC Xerial

| Task | Time |
| :-- | --: |
| Set up | 793,15 ms |
| Load | 274,33 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 39,75 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0,74 ms | 0,57 ms | 0,49 ms | 0,74 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 32,23 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0,97 ms | 0,96 ms | 0,94 ms | 0,97 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 35,36 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 0,87 ms | 0,77 ms | 0,73 ms | 0,87 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 31,16 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0,31 ms | 0,26 ms | 0,25 ms | 0,31 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 29,21 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0,33 ms | 0,30 ms | 0,27 ms | 0,33 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 30,21 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0,29 ms | 0,27 ms | 0,25 ms | 0,29 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 37,84 ms |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2,25 ms | 1,30 ms | 0,83 ms | 2,25 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 55,79 ms |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2,24 ms | 1,32 ms | 0,87 ms | 2,24 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 33,92 ms |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2,19 ms | 1,29 ms | 0,86 ms | 2,19 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 27,41 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3,25 ms | 2,21 ms | 1,67 ms | 3,25 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 2,25 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16,70 ms | 15,53 ms | 13,72 ms | 16,70 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 2,53 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3,38 ms | 2,31 ms | 1,80 ms | 3,38 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 297,71 ms |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0,12 ms | 0,09 ms | 0,07 ms | 0,12 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 253,28 ms |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0,09 ms | 0,08 ms | 0,07 ms | 0,09 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1,41 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 33,15 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 27,40 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 19,87 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 2,10 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 22,35 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 2,07 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0,06 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 39,68 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 46,61 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 31,93 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0,09 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 37,85 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0,09 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 33,07 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0,09 ms |
-----

## Report for MongoDB

| Task | Time |
| :-- | --: |
| Set up | 287,84 ms |
| Load | 805,36 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 0,00 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 17,17 ms | 11,09 ms | 7,32 ms | 17,17 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 0,00 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 10,01 ms | 10,41 ms | 9,47 ms | 10,01 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 0,00 ms |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 13,19 ms | 12,32 ms | 11,59 ms | 13,19 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 0,00 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 11,15 ms | 4,89 ms | 1,93 ms | 11,15 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 0,00 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3,46 ms | 2,90 ms | 2,18 ms | 3,46 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 0,00 ms |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 3,31 ms | 2,82 ms | 2,82 ms | 3,31 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | Error |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | Error | Error | Error | Error |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | Error |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | Error | Error | Error | Error |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | Error |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | Error | Error | Error | Error |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 0,00 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4,33 ms | 3,92 ms | 3,61 ms | 4,33 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 0,00 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14,82 ms | 14,12 ms | 14,82 ms | 15,06 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 0,00 ms |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4,67 ms | 4,21 ms | 3,99 ms | 4,67 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | Error |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | Error | Error | Error | Error |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | Error |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | Error | Error | Error | Error |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | Error |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | Error |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | Error |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | Error |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | Error |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | Error |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | Error |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | Error |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | Error |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | Error |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | Error |
-----

## Sum up Report for Benchmark

| QueryScenario | Phase | sqlite4java | SQLite JDBC Xerial | MongoDB |
| :-- | :-- | --: | --: | --: |
| Set up |  | **176,79 ms** | 793,15 ms | 287,84 ms |
| Load |  | 440,48 ms | **274,33 ms** | 805,36 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 28,76 ms | 39,75 ms | **0,00 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1,25 ms | **0,57 ms** | 11,09 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 1,30 ms | 32,23 ms | **0,00 ms** |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1,71 ms | **0,96 ms** | 10,41 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 1,23 ms | 35,36 ms | **0,00 ms** |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1,14 ms | **0,77 ms** | 12,32 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1,25 ms | 31,16 ms | **0,00 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1,13 ms | **0,26 ms** | 4,89 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 1,17 ms | 29,21 ms | **0,00 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0,72 ms | **0,30 ms** | 2,90 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1,05 ms | 30,21 ms | **0,00 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0,74 ms | **0,27 ms** | 2,82 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | **1,20 ms** | 37,84 ms | Error |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **1,05 ms** | 1,30 ms | Error |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | **1,24 ms** | 55,79 ms | Error |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **1,04 ms** | 1,32 ms | Error |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | **1,11 ms** | 33,92 ms | Error |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **1,00 ms** | 1,29 ms | Error |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 1,06 ms | 27,41 ms | **0,00 ms** |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2,30 ms | **2,21 ms** | 3,92 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 1,15 ms | 2,25 ms | **0,00 ms** |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18,17 ms | 15,53 ms | **14,12 ms** |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 5,45 ms | 2,53 ms | **0,00 ms** |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2,31 ms** | **2,31 ms** | 4,21 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 306,63 ms | **297,71 ms** | Error |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0,10 ms | **0,09 ms** | Error |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 318,09 ms | **253,28 ms** | Error |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0,09 ms | **0,08 ms** | Error |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 4,44 ms | **1,41 ms** | Error |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **27,86 ms** | 33,15 ms | Error |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | **1,01 ms** | 27,40 ms | Error |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 21,58 ms | **19,87 ms** | Error |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | **1,24 ms** | 2,10 ms | Error |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **22,15 ms** | 22,35 ms | Error |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | **1,52 ms** | 2,07 ms | Error |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0,07 ms | **0,06 ms** | Error |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **0,79 ms** | 39,68 ms | Error |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 52,24 ms | **46,61 ms** | Error |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | **1,09 ms** | 31,93 ms | Error |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 25,17 ms | **0,09 ms** | Error |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **1,08 ms** | 37,85 ms | Error |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0,38 ms | **0,09 ms** | Error |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | **0,87 ms** | 33,07 ms | Error |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0,27 ms | **0,09 ms** | Error |
-----

## Verify results

| QueryScenario | sqlite4java | SQLite JDBC Xerial | MongoDB |
| :-- | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | -1469285598 | -1985780551 | 1006124694 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | -614672043 | 289694189 | 1006124694 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 726562033 | 2089675103 | 1006124694 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | 2030568694 | 2030568694 | 2030568694 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | 2030568694 | 2030568694 | 2030568694 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | 2030568694 | 2030568694 | 2030568694 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP10_** | 2030568694 | 2030568694 |  |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | 2030568694 | 2030568694 |  |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | 2030568694 | 2030568694 |  |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -1538488905 | -1538488905 | 1006124694 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | 49307440 | 49307440 | 1006124694 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | -441174004 | -441174004 | 1006124694 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_** | 1293710639 | 1293710639 |  |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_** | 1293710639 | 1293710639 |  |
| **_SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY_** | 1261183134 | 1261183134 |  |
| **_SCHEMA_CHANGE_INTRODUCE_STRING_OP_** | 1261183134 | 1261183134 |  |
| **_SCHEMA_CHANGE_MIGRATE_RDF_TYPE_** | 1261183134 | 1261183134 |  |
| **_SCHEMA_CHANGE_REMOVE_RDF_TYPE_** | 1261183134 | 1261183134 |  |
| **_UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 1261183134 | 1261183134 |  |
| **_UPDATE_HIGH_SELECTIVITY_NON_ISSUED_** | 1261183134 | 1261183134 |  |
| **_DELETE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 1261183134 | 1261183134 |  |
| **_DELETE_HIGH_SELECTIVIY_NON_ISSUED_** | 1261183134 | 1261183134 |  |