-----

# Report for sqlite4java hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 58 ms |
| Load | 433 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 33 ms | 11 ms | 0 ms | 33 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2 ms | 0 ms | 0 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 5 ms | 1 ms | 0 ms | 5 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 22 ms | 18 ms | 17 ms | 22 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 4 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 32 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 8 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 28 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 45 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 1 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 26 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for SQLite JDBC Xerial hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 857 ms |
| Load | 266 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 34 ms | 32 ms | 31 ms | 34 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 32 ms | 35 ms | 32 ms | 36 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 31 ms | 32 ms | 31 ms | 35 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 30 ms | 30 ms | 30 ms | 33 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 33 ms | 35 ms | 33 ms | 40 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 31 ms | 30 ms | 30 ms | 31 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 34 ms | 33 ms | 33 ms | 34 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 34 ms | 34 ms | 34 ms | 38 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 34 ms | 34 ms | 34 ms | 38 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 31 ms | 33 ms | 31 ms | 32 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 2 ms | 1 ms | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 17 ms | 17 ms | 16 ms | 17 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 3 ms | 1 ms | 1 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 2 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 25 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 24 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 23 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 14 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 33 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 47 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 32 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 35 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 39 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for Virtuoso hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 46 ms |
| Load | 119 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 12 ms | 4 ms | 0 ms | 12 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.023 ms | 1.014 ms | 1.010 ms | 1.023 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.016 ms | 1.013 ms | 1.015 ms | 1.016 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.037 ms | 1.032 ms | 1.037 ms | 1.039 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 118 ms | 118 ms | 118 ms | 121 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1.025 ms | 1.025 ms | 1.024 ms | 1.025 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 112 ms | 112 ms | 110 ms | 112 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 4 ms | 1 ms | 0 ms | 4 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0 ms | 0 ms | 0 ms | 0 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 166 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 2 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | -1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 51 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 21 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 1 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Sum up Report for Benchmark

| QueryScenario | Phase | sqlite4java hebis_1000_rdf.gz | SQLite JDBC Xerial hebis_1000_rdf.gz | Virtuoso hebis_1000_rdf.gz |
| :-- | :-- | --: | --: | --: |
| Set up |  | 58 ms | 857 ms | **46 ms** |
| Load |  | 433 ms | 266 ms | **119 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 11 ms | 32 ms | **4 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | **0 ms** | **0 ms** | 1014 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | **0 ms** | 35 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | **0 ms** | 1013 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | **0 ms** | 32 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | **0 ms** | 1032 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | **0 ms** | 30 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | **0 ms** | 35 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1 ms | 30 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | **0 ms** | 33 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **1 ms** | 2 ms | **1 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | **0 ms** | 34 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **1 ms** | 2 ms | **1 ms** |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | **0 ms** | 34 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **1 ms** | 2 ms | **1 ms** |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | **0 ms** | 33 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2 ms** | 3 ms | 118 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | **0 ms** | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18 ms | **17 ms** | 1025 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | **0 ms** | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2 ms** | 3 ms | 112 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | **0 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | **0 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | **1 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | **0 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 4 ms | 2 ms | **1 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 32 ms | **25 ms** | 166 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | **1 ms** | 24 ms | 2 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 8 ms | 23 ms | **1 ms** |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | **1 ms** | 2 ms | -1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 28 ms | **14 ms** | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | **1 ms** | 2 ms | **1 ms** |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0 ms** | **0 ms** | 51 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **0 ms** | 33 ms | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 45 ms | 47 ms | **21 ms** |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | **1 ms** | 32 ms | **1 ms** |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 26 ms | **0 ms** | 2 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **1 ms** | 35 ms | **1 ms** |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **0 ms** | **0 ms** | 6 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | **0 ms** | 39 ms | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | **0 ms** | **0 ms** | **0 ms** |
-----

# Verify results

| QueryScenario | sqlite4java hebis_1000_rdf.gz | SQLite JDBC Xerial hebis_1000_rdf.gz | Virtuoso hebis_1000_rdf.gz |
| :-- | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | -1946556983 | 1240895671 | 1105860459 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | -221937830 | 1915436501 | 1691666647 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 156663058 | 338412759 | -1267551750 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | 756215488 | 756215488 | 756215488 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | 756215488 | 756215488 | 756215488 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | 756215488 | 756215488 | 756215488 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 756215488 | 756215488 | 756215488 |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | 756215488 | 756215488 | 756215488 |
| AGGREGATE_ISSUES_PER_DECADE_ALL | 756215488 | 756215488 | 756215488 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -428665291 | -428665291 | 326237886 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | -447061650 | -447061650 | -106708076 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 1322403212 | 1322403212 | 1731341935 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_** |  |  | 733702479 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_** |  |  | 733702479 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 297957752 | 297957752 | 297957752 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 297957752 | 297957752 | 297957752 |
| **_SCHEMA_CHANGE_MIGRATE_RDF_TYPE_** | 297957752 | 297957752 |  |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | 297957752 | 297957752 | 297957752 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 297957752 | 297957752 | 297957752 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 297957752 | 297957752 | 297957752 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 297957752 | 297957752 | 297957752 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 297957752 | 297957752 | 297957752 |
