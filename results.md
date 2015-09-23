-----

# Report for sqlite4java hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 32 ms |
| Load | 327 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 6 ms | 2 ms | 0 ms | 6 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 0 ms | 0 ms | 0 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 3 ms | 1 ms | 0 ms | 3 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 21 ms | 17 ms | 15 ms | 21 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 3 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 0 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 0 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 11 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 0 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 0 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for SQLite JDBC Xerial hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 106 ms |
| Load | 220 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 5 ms | 4 ms | 3 ms | 5 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1 ms | 0 ms | 1 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 4 ms | 3 ms | 3 ms | 4 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 4 ms | 3 ms | 3 ms | 4 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 4 ms | 3 ms | 3 ms | 4 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 4 ms | 3 ms | 3 ms | 4 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 3 ms | 3 ms | 3 ms | 3 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 6 ms | 5 ms | 6 ms | 6 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2 ms | 1 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 6 ms | 5 ms | 5 ms | 6 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 6 ms | 6 ms | 6 ms | 7 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 3 ms | 2 ms | 2 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 7 ms | 5 ms | 5 ms | 7 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 1 ms | 1 ms | 1 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 19 ms | 18 ms | 17 ms | 19 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | -1 ms | -1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | -1 ms | -1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 4 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 3 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 13 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 2 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 4 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 0 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 4 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0 ms |
-----

# Report for PostgreSQL (Postgres.app) hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 446 ms |
| Load | 481 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 26 ms | 25 ms | 25 ms | 26 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 4 ms | 3 ms | 4 ms | 4 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 25 ms | 24 ms | 25 ms | 25 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 4 ms | 4 ms | 4 ms | 4 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 24 ms | 23 ms | 24 ms | 24 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4 ms | 4 ms | 4 ms | 4 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 20 ms | 16 ms | 15 ms | 20 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 15 ms | 15 ms | 15 ms | 15 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 15 ms | 15 ms | 14 ms | 15 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 35 ms | 37 ms | 35 ms | 40 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3 ms | 2 ms | 2 ms | 3 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 35 ms | 38 ms | 35 ms | 39 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 3 ms | 3 ms | 3 ms | 3 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 37 ms | 35 ms | 35 ms | 37 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 3 ms | 2 ms | 2 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 32 ms | 30 ms | 30 ms | 32 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 7 ms | 6 ms | 7 ms | 7 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 39 ms | 48 ms | 39 ms | 44 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 31 ms | 28 ms | 27 ms | 31 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 50 ms | 45 ms | 44 ms | 50 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 7 ms | 7 ms | 7 ms | 7 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 20 ms | 20 ms | 20 ms | 21 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 1 ms | 1 ms | 1 ms | 1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 21 ms | 22 ms | 21 ms | 22 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 1 ms | 1 ms | 1 ms | 1 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 13 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 59 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 36 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 128 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 30 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 554 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | -1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | -1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 24 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 94 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 15 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 29 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 23 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1 ms |
-----

# Report for Apache Jena Fuseki hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 545 ms |
| Load | 225 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 25 ms | 9 ms | 1 ms | 25 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 284 ms | 272 ms | 255 ms | 284 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 1 ms | 1 ms | 1 ms | 1 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 287 ms | 324 ms | 272 ms | 287 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 2 ms | 1 ms | 1 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 392 ms | 378 ms | 368 ms | 392 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 9 ms | 3 ms | 0 ms | 9 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 18 ms | 8 ms | 4 ms | 18 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 7 ms | 6 ms | 6 ms | 7 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 5 ms | 5 ms | 5 ms | 5 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 9 ms | 3 ms | 0 ms | 9 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 8 ms | 7 ms | 6 ms | 8 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 7 ms | 7 ms | 7 ms | 7 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 7 ms | 6 ms | 6 ms | 7 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 3 ms | 1 ms | 0 ms | 3 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 72 ms | 74 ms | 72 ms | 76 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 0 ms | 0 ms | 0 ms | 0 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 685 ms | 668 ms | 685 ms | 724 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 187 ms | 194 ms | 187 ms | 194 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 5 ms | 4 ms | 5 ms | 5 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 3 ms | 3 ms | 3 ms | 3 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 2 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 135 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 4 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 2 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 286 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 0 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 2 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 23 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 14 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 63 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3 ms |
-----

# Report for Virtuoso hebis_1000_rdf.gz

| Task | Time |
| :-- | --: |
| Set up | 38 ms |
| Load | 128 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | 11 ms | 3 ms | 0 ms | 11 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1,943 ms | 1,892 ms | 1,935 ms | 1,943 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | 7 ms | 2 ms | 0 ms | 7 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1,805 ms | 1,726 ms | 1,690 ms | 1,805 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | 7 ms | 2 ms | 0 ms | 7 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1,830 ms | 1,726 ms | 1,673 ms | 1,830 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2 ms | 2 ms | 2 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | 6 ms | 2 ms | 0 ms | 6 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 253 ms | 256 ms | 253 ms | 256 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | 7 ms | 2 ms | 0 ms | 7 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1,751 ms | 1,909 ms | 1,751 ms | 1,928 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | 7 ms | 2 ms | 0 ms | 7 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 265 ms | 283 ms | 265 ms | 297 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | 1 ms | 0 ms | 0 ms | 1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0 ms | 0 ms | 0 ms | 0 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | 4 ms | 1 ms | 0 ms | 4 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0 ms | 0 ms | 0 ms | 0 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 0 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 204 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | 3 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 429 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 26 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | 1 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 4 ms |
-----

# Sum up Report for Benchmark

| QueryScenario | Phase | sqlite4java hebis_1000_rdf.gz | SQLite JDBC Xerial hebis_1000_rdf.gz | PostgreSQL (Postgres.app) hebis_1000_rdf.gz | Apache Jena Fuseki hebis_1000_rdf.gz | Virtuoso hebis_1000_rdf.gz |
| :-- | :-- | --: | --: | --: | --: | --: |
| Set up |  | **32 ms** | 106 ms | 446 ms | 545 ms | 38 ms |
| Load |  | 327 ms | 220 ms | 481 ms | 225 ms | **128 ms** |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Prepare | **2 ms** | 4 ms | 25 ms | 9 ms | 3 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | **0 ms** | **0 ms** | 3 ms | 272 ms | 1892 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Prepare | **0 ms** | 3 ms | 24 ms | 1 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | **1 ms** | **1 ms** | 4 ms | 324 ms | 1726 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Prepare | **0 ms** | 3 ms | 23 ms | 1 ms | 2 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | **0 ms** | 1 ms | 4 ms | 378 ms | 1726 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Prepare | 1 ms | 3 ms | 16 ms | 3 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | **0 ms** | **0 ms** | 2 ms | 8 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Prepare | **0 ms** | 3 ms | 15 ms | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | **0 ms** | **0 ms** | 2 ms | 6 ms | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Prepare | **0 ms** | 3 ms | 15 ms | **0 ms** | **0 ms** |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | **0 ms** | **0 ms** | 2 ms | 5 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Prepare | **0 ms** | 5 ms | 37 ms | 3 ms | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **0 ms** | 1 ms | 2 ms | 7 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Prepare | **0 ms** | 5 ms | 38 ms | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **0 ms** | 2 ms | 3 ms | 7 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Prepare | **0 ms** | 6 ms | 35 ms | **0 ms** | **0 ms** |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **0 ms** | 2 ms | 2 ms | 6 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Prepare | **0 ms** | 5 ms | 30 ms | 1 ms | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2 ms** | 3 ms | 6 ms | 74 ms | 256 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Prepare | **0 ms** | 1 ms | 48 ms | **0 ms** | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | **17 ms** | 18 ms | 28 ms | 668 ms | 1909 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Prepare | **0 ms** | **0 ms** | 45 ms | **0 ms** | 2 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2 ms** | 3 ms | 7 ms | 194 ms | 283 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Prepare | -1 ms | -1 ms | 20 ms | **0 ms** | **0 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | -1 ms | -1 ms | 1 ms | 4 ms | **0 ms** |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Prepare | -1 ms | -1 ms | 22 ms | **0 ms** | 1 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | -1 ms | -1 ms | 1 ms | 3 ms | **0 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Prepare | 3 ms | 1 ms | 13 ms | 2 ms | **0 ms** |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1 ms | **0 ms** | 59 ms | 135 ms | 204 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Prepare | **0 ms** | 4 ms | 36 ms | 1 ms | 1 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **0 ms** | **0 ms** | 128 ms | 4 ms | 1 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Prepare | **0 ms** | 1 ms | 30 ms | 2 ms | 3 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **0 ms** | **0 ms** | 554 ms | 286 ms | 429 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Prepare | 1 ms | 1 ms | -1 ms | **0 ms** | 1 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0 ms** | **0 ms** | -1 ms | 2 ms | **0 ms** |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **0 ms** | 3 ms | 24 ms | **0 ms** | 1 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **11 ms** | 13 ms | 94 ms | 23 ms | 26 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Prepare | **0 ms** | 2 ms | 15 ms | 14 ms | 1 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | **0 ms** | **0 ms** | 1 ms | 63 ms | 3 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Prepare | **0 ms** | 4 ms | 29 ms | 1 ms | 1 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **0 ms** | **0 ms** | 1 ms | 3 ms | 5 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Prepare | **0 ms** | 4 ms | 23 ms | 1 ms | 1 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | **0 ms** | **0 ms** | 1 ms | 3 ms | 4 ms |
-----

# Verify results

| QueryScenario | sqlite4java hebis_1000_rdf.gz | SQLite JDBC Xerial hebis_1000_rdf.gz | PostgreSQL (Postgres.app) hebis_1000_rdf.gz | Apache Jena Fuseki hebis_1000_rdf.gz | Virtuoso hebis_1000_rdf.gz |
| :-- | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 861866485 | 483212120 | 245201347 | 1003138839 | 1328426949 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | 33362016 | 1921174419 | -825114633 | 2122855592 | -1907278994 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 14515286 | -462663661 | -1367318928 | 708038404 | 1091363015 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | 115975678 | 115975678 | 115975678 | 115975678 | 115975678 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | 115975678 | 115975678 | 115975678 | 115975678 | 115975678 |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | 115975678 | 115975678 | 115975678 | 115975678 | 115975678 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 115975678 | 115975678 | 115975678 | 115975678 | 115975678 |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | 115975678 | 115975678 | 115975678 | 115975678 | 115975678 |
| AGGREGATE_ISSUES_PER_DECADE_ALL | 115975678 | 115975678 | 115975678 | 115975678 | 115975678 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -1012128918 | -1012128918 | 322159926 | 1796582390 | -1788190367 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | -1068098606 | -1068098606 | -221312794 | -29994897 | 1462015246 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 1512806583 | 1512806583 | 1187429815 | -1336474167 | 1665350426 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_** |  |  | 1927529430 | 1927529430 | 1927529430 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_** |  |  | 1927529430 | 1927529430 | 1927529430 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
| **_SCHEMA_CHANGE_REMOVE_RDF_TYPE_** | 2079991031 | 2079991031 |  | 2079991031 | 2079991031 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 2079991031 | 2079991031 | 2079991031 | 2079991031 | 2079991031 |
