-----

# Report for sqlite4java hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 73 ms |
| Load | 436 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 26 ms | 8 ms | 0 ms | 26 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2 ms | 0 ms | 0 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 3 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 5 ms | 1 ms | 0 ms | 5 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 20 ms | 17 ms | 16 ms | 20 ms |
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
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 13 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 18 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 13 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 40 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 1 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 28 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for SQLite JDBC Xerial hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 291 ms |
| Load | 280 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 29 ms | 32 ms | 29 ms | 32 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 26 ms | 30 ms | 26 ms | 34 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 0 ms | 1 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 34 ms | 35 ms | 34 ms | 41 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 35 ms | 31 ms | 25 ms | 35 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 32 ms | 30 ms | 29 ms | 32 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 31 ms | 33 ms | 30 ms | 31 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 40 ms | 35 ms | 32 ms | 40 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 50 ms | 41 ms | 39 ms | 50 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 33 ms | 30 ms | 32 ms | 33 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 32 ms | 40 ms | 32 ms | 43 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 2 ms | 1 ms | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 17 ms | 16 ms | 16 ms | 17 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 2 ms | 1 ms | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 39 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 47 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 15 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 20 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 32 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 55 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 35 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 34 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 42 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for Virtuoso hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 46 ms |
| Load | 120 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 12 ms | 4 ms | 0 ms | 12 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.020 ms | 1.010 ms | 1.005 ms | 1.020 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.009 ms | 1.008 ms | 1.007 ms | 1.009 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.038 ms | 1.038 ms | 1.038 ms | 1.042 ms |
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
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 120 ms | 118 ms | 118 ms | 120 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1.031 ms | 1.034 ms | 1.025 ms | 1.031 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 10 ms | 3 ms | 0 ms | 10 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 115 ms | 112 ms | 111 ms | 115 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 4 ms | 1 ms | 0 ms | 4 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0 ms | 0 ms | 0 ms | 0 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 166 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | -1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 50 ms |
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
| Set up |  | 73 ms | 291 ms | **46 ms** |
| Load |  | 436 ms | 280 ms | **120 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 8 ms | 32 ms | **4 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | **0 ms** | **0 ms** | 1010 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | **0 ms** | 30 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | **0 ms** | 1008 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | **0 ms** | 35 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | **0 ms** | 1038 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | **0 ms** | 31 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | **0 ms** | 30 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1 ms | 33 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | **0 ms** | 35 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **1 ms** | 2 ms | **1 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | **0 ms** | 41 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **1 ms** | 2 ms | **1 ms** |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | **0 ms** | 30 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **1 ms** | 2 ms | **1 ms** |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | **0 ms** | 40 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2 ms** | 3 ms | 118 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | **0 ms** | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 17 ms | **16 ms** | 1034 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | **0 ms** | 1 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2 ms** | 3 ms | 112 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | **0 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | **0 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | **1 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | **0 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 4 ms | **1 ms** | **1 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **13 ms** | 39 ms | 166 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | **1 ms** | 47 ms | **1 ms** |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 18 ms | 15 ms | **1 ms** |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | **1 ms** | 2 ms | -1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **13 ms** | 20 ms | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | **1 ms** | 2 ms | **1 ms** |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0 ms** | **0 ms** | 50 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **0 ms** | 32 ms | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 40 ms | 55 ms | **21 ms** |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | **1 ms** | 35 ms | **1 ms** |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 28 ms | **0 ms** | 2 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **1 ms** | 34 ms | **1 ms** |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **0 ms** | **0 ms** | 6 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | **0 ms** | 42 ms | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | **0 ms** | **0 ms** | **0 ms** |
