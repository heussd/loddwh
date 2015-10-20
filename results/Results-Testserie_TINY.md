<style style="text/css">tr:hover{background: #FFFF00;}</style>

# Report for Testserie "TINY"


## Evaluation Overview, all Databases, Test Series $TestSeries 

| QueryScenario | Phase | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB |
| :-- | :-- | --: | --: | --: | --: | --: | --: |
| Set up |  | 19.79 ms | 98.64 ms | 265.10 ms | **0.00 ms** | 1.03 ms | 5.03 ms |
| Load |  | 312.27 ms | 203.24 ms | 387.87 ms | 1011.68 ms | **125.93 ms** | 614.30 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 8.57 ms</font> |<font color="#C0C0C0"> **7.22 ms**</font> |<font color="#C0C0C0"> 17.49 ms</font> |<font color="#C0C0C0"> 227.11 ms</font> |<font color="#C0C0C0"> 161.75 ms</font> |<font color="#C0C0C0"> 29.71 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.45 ms | **0.13 ms** | 0.88 ms | 74.64 ms | 6.50 ms | 0.92 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.56 ms**</font> |<font color="#C0C0C0"> 7.38 ms</font> |<font color="#C0C0C0"> 16.40 ms</font> |<font color="#C0C0C0"> 84.31 ms</font> |<font color="#C0C0C0"> 12.22 ms</font> |<font color="#C0C0C0"> 6.94 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.86 ms | **0.39 ms** | 2.17 ms | 38.78 ms | 233.90 ms | 6.17 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **2.52 ms**</font> |<font color="#C0C0C0"> 8.39 ms</font> |<font color="#C0C0C0"> 16.79 ms</font> |<font color="#C0C0C0"> 155.60 ms</font> |<font color="#C0C0C0"> 26.66 ms</font> |<font color="#C0C0C0"> 7.59 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.43 ms | **1.84 ms** | 7.20 ms | 133.18 ms | 788.44 ms | 58.25 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.03 ms</font> |<font color="#C0C0C0"> 4.16 ms</font> |<font color="#C0C0C0"> 12.40 ms</font> |<font color="#C0C0C0"> 0.53 ms</font> |<font color="#C0C0C0"> 1.25 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.67 ms | **0.28 ms** | 1.10 ms | 26.72 ms | 0.48 ms | 5.23 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 3.84 ms</font> |<font color="#C0C0C0"> 12.45 ms</font> |<font color="#C0C0C0"> 0.49 ms</font> |<font color="#C0C0C0"> 1.19 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.57 ms | **0.31 ms** | 0.92 ms | 12.04 ms | 0.56 ms | 2.34 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.33 ms</font> |<font color="#C0C0C0"> 4.43 ms</font> |<font color="#C0C0C0"> 12.77 ms</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 1.08 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.55 ms | **0.28 ms** | 0.86 ms | 12.90 ms | 0.64 ms | 1.76 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 5.31 ms</font> |<font color="#C0C0C0"> 14.29 ms</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 1.26 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **0.89 ms** | 1.51 ms | 1.09 ms | 20.78 ms | 2.84 ms | 1.79 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 6.01 ms</font> |<font color="#C0C0C0"> 14.05 ms</font> |<font color="#C0C0C0"> 0.50 ms</font> |<font color="#C0C0C0"> 1.08 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **0.90 ms** | 1.53 ms | 1.03 ms | 13.30 ms | 2.80 ms | 1.78 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.41 ms</font> |<font color="#C0C0C0"> 5.64 ms</font> |<font color="#C0C0C0"> 14.81 ms</font> |<font color="#C0C0C0"> 0.45 ms</font> |<font color="#C0C0C0"> 1.07 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **0.83 ms** | 1.49 ms | 1.04 ms | 10.96 ms | 2.74 ms | 1.69 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.38 ms</font> |<font color="#C0C0C0"> 5.04 ms</font> |<font color="#C0C0C0"> 13.22 ms</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 6.43 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2.01 ms** | 3.31 ms | 2.45 ms | 154.81 ms | 223.92 ms | 3.16 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.49 ms</font> |<font color="#C0C0C0"> 2.79 ms</font> |<font color="#C0C0C0"> 13.05 ms</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> 6.78 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 15.08 ms | 19.01 ms | 12.96 ms | 765.62 ms | 2055.25 ms | **9.22 ms** |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.56 ms</font> |<font color="#C0C0C0"> 1.77 ms</font> |<font color="#C0C0C0"> 15.90 ms</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 6.75 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2.05 ms** | 3.26 ms | 2.18 ms | 189.59 ms | 211.42 ms | 3.29 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 200.17 ms</font> |<font color="#C0C0C0"> 275.76 ms</font> |<font color="#C0C0C0"> 18.01 ms</font> |<font color="#C0C0C0"> 0.41 ms</font> |<font color="#C0C0C0"> 1.59 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | **0.05 ms** | 0.07 ms | 0.54 ms | 7.63 ms | 0.18 ms | 17.17 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 212.37 ms</font> |<font color="#C0C0C0"> 187.64 ms</font> |<font color="#C0C0C0"> 17.18 ms</font> |<font color="#C0C0C0"> 0.58 ms</font> |<font color="#C0C0C0"> 4.60 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.05 ms | **0.04 ms** | 0.73 ms | 14.22 ms | 0.23 ms | 15.98 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.17 ms</font> |<font color="#C0C0C0"> 1.14 ms</font> |<font color="#C0C0C0"> 9.63 ms</font> |<font color="#C0C0C0"> 3.30 ms</font> |<font color="#C0C0C0"> 1.05 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **0.80 ms** | 1.04 ms | 11.93 ms | 177.82 ms | 160.49 ms | 10.70 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.55 ms</font> |<font color="#C0C0C0"> 3.96 ms</font> |<font color="#C0C0C0"> 15.01 ms</font> |<font color="#C0C0C0"> 0.98 ms</font> |<font color="#C0C0C0"> 1.85 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **0.73 ms** | 0.74 ms | 27.34 ms | 9.40 ms | 2.21 ms | 174.06 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 1.25 ms</font> |<font color="#C0C0C0"> 14.56 ms</font> |<font color="#C0C0C0"> 2.49 ms</font> |<font color="#C0C0C0"> 4.58 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **0.73 ms** | 0.75 ms | 123.93 ms | 306.24 ms | 826.51 ms | 17.16 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.81 ms</font> |<font color="#C0C0C0"> 1.48 ms</font> |<font color="#C0C0C0"> 12.39 ms</font> |<font color="#C0C0C0"> 0.69 ms</font> |<font color="#C0C0C0"> 1.15 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.05 ms | **0.03 ms** | 1.80 ms | 6.22 ms | 0.18 ms | 3.62 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.91 ms</font> |<font color="#C0C0C0"> 5.35 ms</font> |<font color="#C0C0C0"> 13.83 ms</font> |<font color="#C0C0C0"> 0.84 ms</font> |<font color="#C0C0C0"> 1.08 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.35 ms | 12.54 ms | 46.66 ms | 26.27 ms | 20.26 ms | **3.47 ms** |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.46 ms</font> |<font color="#C0C0C0"> 5.32 ms</font> |<font color="#C0C0C0"> 14.90 ms</font> |<font color="#C0C0C0"> 27.76 ms</font> |<font color="#C0C0C0"> 1.35 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.97 ms | 0.94 ms | 1.51 ms | 124.28 ms | 1.97 ms | **0.66 ms** |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.28 ms</font> |<font color="#C0C0C0"> 4.74 ms</font> |<font color="#C0C0C0"> 15.52 ms</font> |<font color="#C0C0C0"> 1.05 ms</font> |<font color="#C0C0C0"> 1.20 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.42 ms | 12.80 ms | **2.62 ms** | 5.10 ms | 404.62 ms | 6.05 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 3.39 ms</font> |<font color="#C0C0C0"> 13.13 ms</font> |<font color="#C0C0C0"> 0.58 ms</font> |<font color="#C0C0C0"> 24.85 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.08 ms | **0.06 ms** | 0.99 ms | 3.59 ms | 1.09 ms | 0.31 ms |
-----

## Evaluation Details for sqlite4java, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 19.79 ms |
| Load | 312.27 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.57 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.16 ms | 0.45 ms | 0.10 ms | 1.16 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.56 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.78 ms | 0.86 ms | 0.52 ms | 0.78 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.52 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.03 ms | 2.43 ms | 2.12 ms | 3.03 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.03 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.96 ms | 0.67 ms | 0.54 ms | 0.96 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.59 ms | 0.57 ms | 0.57 ms | 0.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.33 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.56 ms | 0.55 ms | 0.54 ms | 0.56 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 0.84 ms | 0.89 ms | 0.84 ms | 0.88 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 0.99 ms | 0.90 ms | 0.87 ms | 0.99 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.41 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 0.83 ms | 0.83 ms | 0.83 ms | 0.84 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.38 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 1.97 ms | 2.01 ms | 1.97 ms | 1.98 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.49 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16.36 ms | 15.08 ms | 14.88 ms | 16.36 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.56 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2.29 ms | 2.05 ms | 1.92 ms | 2.29 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">200.17 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0.09 ms | 0.05 ms | 0.04 ms | 0.09 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">212.37 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.08 ms | 0.05 ms | 0.04 ms | 0.08 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.17 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.80 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.55 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.73 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.73 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.81 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.05 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.91 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.35 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.46 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.97 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.28 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.42 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.08 ms |
-----

## Evaluation Details for SQLite JDBC Xerial, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 98.64 ms |
| Load | 203.24 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.22 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.26 ms | 0.13 ms | 0.08 ms | 0.26 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.38 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.43 ms | 0.39 ms | 0.43 ms | 0.45 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.39 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.89 ms | 1.84 ms | 1.89 ms | 1.93 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.16 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.31 ms | 0.28 ms | 0.27 ms | 0.31 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.84 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.32 ms | 0.31 ms | 0.29 ms | 0.32 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.43 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.30 ms | 0.28 ms | 0.27 ms | 0.30 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.31 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1.91 ms | 1.51 ms | 1.25 ms | 1.91 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.01 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.09 ms | 1.53 ms | 1.24 ms | 2.09 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.64 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.87 ms | 1.49 ms | 1.28 ms | 1.87 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.04 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.41 ms | 3.31 ms | 2.93 ms | 3.41 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.79 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 21.99 ms | 19.01 ms | 17.94 ms | 21.99 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.77 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.67 ms | 3.26 ms | 2.98 ms | 3.67 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">275.76 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0.14 ms | 0.07 ms | 0.04 ms | 0.14 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">187.64 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.06 ms | 0.04 ms | 0.04 ms | 0.06 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.14 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.04 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.96 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.74 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.25 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.75 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.48 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.35 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 12.54 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.32 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.94 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.74 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 12.80 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.39 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.06 ms |
-----

## Evaluation Details for PostgreSQL (Postgres.app), Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 265.10 ms |
| Load | 387.87 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.49 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.68 ms | 0.88 ms | 0.49 ms | 1.68 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.40 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 3.19 ms | 2.17 ms | 1.72 ms | 3.19 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.79 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 7.21 ms | 7.20 ms | 7.21 ms | 8.81 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.40 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1.67 ms | 1.10 ms | 0.81 ms | 1.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.45 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 1.54 ms | 0.92 ms | 0.61 ms | 1.54 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.77 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.50 ms | 0.86 ms | 0.51 ms | 1.50 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.29 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1.78 ms | 1.09 ms | 0.77 ms | 1.78 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.05 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.72 ms | 1.03 ms | 0.71 ms | 1.72 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.81 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.72 ms | 1.04 ms | 0.73 ms | 1.72 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.22 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.36 ms | 2.45 ms | 2.23 ms | 3.36 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.05 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.57 ms | 12.96 ms | 12.26 ms | 14.57 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.90 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.43 ms | 2.18 ms | 1.58 ms | 3.43 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.01 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 1.06 ms | 0.54 ms | 0.30 ms | 1.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.18 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 1.22 ms | 0.73 ms | 0.56 ms | 1.22 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.63 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 11.93 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.01 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 27.34 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.56 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 123.93 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.39 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 1.80 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.83 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 46.66 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.90 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.51 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.52 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.62 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.13 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.99 ms |
-----

## Evaluation Details for Apache Jena Fuseki, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 0.00 ms |
| Load | 1011.68 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">227.11 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 189.14 ms | 74.64 ms | 19.30 ms | 189.14 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">84.31 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 44.51 ms | 38.78 ms | 35.26 ms | 44.51 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">155.60 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 162.98 ms | 133.18 ms | 126.69 ms | 162.98 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.53 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 52.20 ms | 26.72 ms | 17.45 ms | 52.20 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.49 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 12.61 ms | 12.04 ms | 12.18 ms | 12.61 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 16.20 ms | 12.90 ms | 12.82 ms | 16.20 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 26.79 ms | 20.78 ms | 14.13 ms | 26.79 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.50 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 12.55 ms | 13.30 ms | 12.55 ms | 14.06 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.45 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 10.42 ms | 10.96 ms | 10.42 ms | 10.59 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 170.69 ms | 154.81 ms | 139.90 ms | 170.69 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 788.14 ms | 765.62 ms | 788.14 ms | 860.18 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 190.95 ms | 189.59 ms | 190.95 ms | 200.55 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.41 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 8.97 ms | 7.63 ms | 7.07 ms | 8.97 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.58 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 30.13 ms | 14.22 ms | 6.84 ms | 30.13 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.30 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 177.82 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.98 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9.40 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.49 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 306.24 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.69 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 6.22 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.84 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 26.27 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.76 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 124.28 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.05 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.10 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.58 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.59 ms |
-----

## Evaluation Details for Virtuoso, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 1.03 ms |
| Load | 125.93 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">161.75 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 7.37 ms | 6.50 ms | 6.28 ms | 7.37 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.22 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 225.88 ms | 233.90 ms | 224.77 ms | 225.88 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26.66 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 788.88 ms | 788.44 ms | 784.76 ms | 788.88 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.25 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.56 ms | 0.48 ms | 0.45 ms | 0.56 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.19 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.54 ms | 0.56 ms | 0.54 ms | 0.58 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.08 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.80 ms | 0.64 ms | 0.56 ms | 0.80 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.26 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.94 ms | 2.84 ms | 2.87 ms | 2.94 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.08 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.83 ms | 2.80 ms | 2.78 ms | 2.83 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.07 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.82 ms | 2.74 ms | 2.68 ms | 2.82 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 227.71 ms | 223.92 ms | 216.70 ms | 227.71 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.78 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 2081.84 ms | 2055.25 ms | 2081.84 ms | 2086.52 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.75 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 215.65 ms | 211.42 ms | 211.98 ms | 215.65 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.59 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0.22 ms | 0.18 ms | 0.17 ms | 0.22 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.60 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.24 ms | 0.23 ms | 0.22 ms | 0.24 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.05 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 160.49 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.85 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 2.21 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.58 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 826.51 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.15 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.18 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.08 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 20.26 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.35 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.97 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.20 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 404.62 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">24.85 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.09 ms |
-----

## Evaluation Details for MongoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 5.03 ms |
| Load | 614.30 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">29.71 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.26 ms | 0.92 ms | 0.76 ms | 1.26 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.94 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 6.38 ms | 6.17 ms | 6.24 ms | 6.38 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.59 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 60.36 ms | 58.25 ms | 57.75 ms | 60.36 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 12.83 ms | 5.23 ms | 1.38 ms | 12.83 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.20 ms | 2.34 ms | 2.20 ms | 2.97 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.79 ms | 1.76 ms | 1.79 ms | 1.79 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.02 ms | 1.79 ms | 1.69 ms | 2.02 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.89 ms | 1.78 ms | 1.74 ms | 1.89 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.95 ms | 1.69 ms | 1.58 ms | 1.95 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.64 ms | 3.16 ms | 2.86 ms | 3.64 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 11.76 ms | 9.22 ms | 8.17 ms | 11.76 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.59 ms | 3.29 ms | 3.23 ms | 3.59 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 18.53 ms | 17.17 ms | 16.44 ms | 18.53 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 16.72 ms | 15.98 ms | 15.59 ms | 16.72 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 10.70 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 174.06 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 17.16 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.62 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.47 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.66 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.05 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.31 ms |
-----

## Verify results

| QueryScenario | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB |
| :-- | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 154131113 | 154131113 | 985534903 | -856704220 | 181294528 | 154131113 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | -1515263117 | -1515263117 | -75629532 | -762929987 | 1605923039 | -1511002317 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 782433492 | 782433492 | 1935792599 | 815952871 | 313813923 | 2061637760 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | 541034915 | 541034915 | 1248703366 | 541034915 | 541034915 | 541034915 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 1456345741 | 1456345741 | -710503863 | -601567946 | -601567946 | -601567946 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | 1456345741 | 1456345741 | -710503863 | -601567946 | -601567946 | -601567946 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 2010534989 | 2010534989 | 2010534989 | 2010534989 | 2010534989 | 2010534989 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | -1496716367 | -1496716367 | -1496716367 | -228754831 | -228754831 | -228754831 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | -1496716367 | -1496716367 | -1496716367 | -228754831 | -228754831 | -228754831 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | 31534678 | 31534678 | 1806047632 | 1347485736 | 1624134529 | 31534678 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | 1981573461 | 1981573461 | -1156036163 | 1120246630 | 777795485 | -1307772551 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 141789577 | 141789577 | -1502788087 | -1267787673 | 815344592 | 141789577 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | 709850603 | 709850603 | 709850603 | 709850603 | 709850603 | 709850603 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | 709850603 | 709850603 | 709850603 | 709850603 | 709850603 | 709850603 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 | 1406928952 |
