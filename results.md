-----

# Report for sqlite4java hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 71 ms |
| Load | 507 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 28 ms | 9 ms | 0 ms | 28 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2 ms | 0 ms | 0 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 5 ms | 1 ms | 0 ms | 5 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1 ms | 0 ms | 0 ms | 1 ms |
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
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 23 ms | 20 ms | 20 ms | 23 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 5 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 24 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 22 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 14 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 43 ms |
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
| Set up | 777 ms |
| Load | 299 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 32 ms | 29 ms | 24 ms | 32 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 33 ms | 33 ms | 33 ms | 33 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 0 ms | 1 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 31 ms | 31 ms | 31 ms | 33 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 30 ms | 29 ms | 29 ms | 30 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 30 ms | 30 ms | 29 ms | 30 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 31 ms | 29 ms | 31 ms | 32 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 33 ms | 32 ms | 26 ms | 33 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 36 ms | 35 ms | 36 ms | 40 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 34 ms | 37 ms | 34 ms | 39 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 40 ms | 38 ms | 40 ms | 41 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 2 ms | 1 ms | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18 ms | 19 ms | 18 ms | 18 ms |
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
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 25 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 33 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 25 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 28 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 33 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 57 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 33 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 40 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 40 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for Virtuoso hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 48 ms |
| Load | 121 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 12 ms | 4 ms | 0 ms | 12 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.020 ms | 1.011 ms | 1.007 ms | 1.020 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 9 ms | 3 ms | 0 ms | 9 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.012 ms | 1.013 ms | 1.010 ms | 1.012 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.038 ms | 1.037 ms | 1.038 ms | 1.042 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
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
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 120 ms | 119 ms | 119 ms | 120 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1.036 ms | 1.039 ms | 1.036 ms | 1.037 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 113 ms | 113 ms | 113 ms | 114 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 4 ms | 1 ms | 0 ms | 4 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0 ms | 0 ms | 0 ms | 0 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 163 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 2 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | -1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 50 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 21 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 2 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for Virtuoso hebis_10000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 33 ms |
| Load | 1.904 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 8 ms | 3 ms | 1 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 16.373 ms | 16.273 ms | 16.111 ms | 16.373 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 8 ms | 3 ms | 1 ms | 8 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 14.050 ms | 14.065 ms | 14.050 ms | 14.089 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 9 ms | 3 ms | 0 ms | 9 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 14.315 ms | 14.369 ms | 14.315 ms | 14.421 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 6 ms | 7 ms | 6 ms | 7 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 7 ms | 7 ms | 6 ms | 7 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 6 ms | 6 ms | 6 ms | 8 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 6 ms | 6 ms | 6 ms | 6 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 8 ms | 2 ms | 0 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 1.291 ms | 1.253 ms | 1.244 ms | 1.291 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 8 ms | 3 ms | 1 ms | 8 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.137 ms | 14.311 ms | 14.137 ms | 14.573 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 9 ms | 3 ms | 0 ms | 9 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 1.231 ms | 1.214 ms | 1.202 ms | 1.231 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 2 ms | 0 ms | 0 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 15 ms | 14 ms | 14 ms | 15 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.615 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 51 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | -1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 593 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 242 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 1 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 30 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 145 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 2 ms |

# Sum up Report for Benchmark

| QueryScenario | Phase | sqlite4java hebis_1000_rdf.gz | SQLite JDBC Xerial hebis_1000_rdf.gz | Virtuoso hebis_1000_rdf.gz | Virtuoso hebis_10000_rdf.gz |
| :-- | :-- | --: | --: | --: | --: |
| Set up |  | 71 ms | 777 ms | 48 ms | **33 ms** |
| Load |  | 507 ms | 299 ms | **121 ms** | 1904 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 9 ms | 29 ms | 4 ms | **3 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | **0 ms** | **0 ms** | 1011 ms | 16273 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | **0 ms** | 33 ms | 3 ms | 3 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | **0 ms** | 1013 ms | 14065 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | **0 ms** | 31 ms | 2 ms | 3 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | **0 ms** | 1037 ms | 14369 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1 ms | 29 ms | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | **0 ms** | **0 ms** | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | **0 ms** | 30 ms | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | **0 ms** | **0 ms** | **0 ms** | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | **0 ms** | 29 ms | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | **0 ms** | **0 ms** | **0 ms** | 7 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | **0 ms** | 32 ms | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **1 ms** | 2 ms | **1 ms** | 7 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | **0 ms** | 35 ms | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **1 ms** | 2 ms | **1 ms** | 6 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | **0 ms** | 37 ms | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **1 ms** | 2 ms | **1 ms** | 6 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | **0 ms** | 38 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2 ms** | 3 ms | 119 ms | 1253 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | **0 ms** | 1 ms | 2 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 20 ms | **19 ms** | 1039 ms | 14311 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | **0 ms** | 1 ms | 2 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2 ms** | 3 ms | 113 ms | 1214 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | **-1 ms** | **-1 ms** | 0 ms | 0 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | **-1 ms** | **-1 ms** | 0 ms | 14 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | **-1 ms** | **-1 ms** | 1 ms | **-1 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | **-1 ms** | **-1 ms** | 0 ms | **-1 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 5 ms | **1 ms** | **1 ms** | **1 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **24 ms** | 25 ms | 163 ms | 1615 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | **1 ms** | 33 ms | 2 ms | **1 ms** |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 22 ms | 25 ms | **1 ms** | 51 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 1 ms | 2 ms | **-1 ms** | **-1 ms** |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 14 ms | 28 ms | **-1 ms** | **-1 ms** |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 2 ms | **1 ms** | **1 ms** | **1 ms** |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0 ms** | **0 ms** | 50 ms | 593 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **1 ms** | 33 ms | **1 ms** | **1 ms** |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 43 ms | 57 ms | **21 ms** | 242 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | **1 ms** | 33 ms | 2 ms | **1 ms** |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 26 ms | **0 ms** | 2 ms | 30 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **1 ms** | 40 ms | **1 ms** | **1 ms** |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **0 ms** | **0 ms** | 7 ms | 145 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | **0 ms** | 40 ms | 1 ms | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | **0 ms** | **0 ms** | **0 ms** | 2 ms |
