<style style="text/css">tr:hover{background: #FFFF00;}</style>

# Report for Testserie "TINY"

-----

## Sum up Report for Benchmark

| QueryScenario | Phase | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB |
| :-- | :-- | --: | --: | --: | --: | --: | --: |
| Set up |  | 42.42 ms | 117.33 ms | 262.49 ms | **0.00 ms** | 0.95 ms | 4.83 ms |
| Load |  | 410.60 ms | 221.77 ms | 526.40 ms | 1784.76 ms | **129.71 ms** | 996.01 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 13.26 ms</font> |<font color="#C0C0C0"> **8.81 ms**</font> |<font color="#C0C0C0"> 18.49 ms</font> |<font color="#C0C0C0"> 301.18 ms</font> |<font color="#C0C0C0"> 170.13 ms</font> |<font color="#C0C0C0"> 19.19 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.61 ms | **0.15 ms** | 1.05 ms | 92.80 ms | 6.84 ms | 1.47 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **2.81 ms**</font> |<font color="#C0C0C0"> 7.00 ms</font> |<font color="#C0C0C0"> 16.71 ms</font> |<font color="#C0C0C0"> 132.99 ms</font> |<font color="#C0C0C0"> 13.23 ms</font> |<font color="#C0C0C0"> 10.48 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.25 ms | **0.39 ms** | 2.31 ms | 53.12 ms | 242.35 ms | 7.50 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **4.41 ms**</font> |<font color="#C0C0C0"> 8.61 ms</font> |<font color="#C0C0C0"> 17.33 ms</font> |<font color="#C0C0C0"> 210.82 ms</font> |<font color="#C0C0C0"> 27.90 ms</font> |<font color="#C0C0C0"> 11.89 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.57 ms | **2.09 ms** | 9.05 ms | 180.79 ms | 852.76 ms | 55.50 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 7.41 ms</font> |<font color="#C0C0C0"> 4.71 ms</font> |<font color="#C0C0C0"> 17.90 ms</font> |<font color="#C0C0C0"> 1.79 ms</font> |<font color="#C0C0C0"> 3.75 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1.04 ms | **0.32 ms** | 1.51 ms | 35.27 ms | 0.39 ms | 5.21 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.24 ms</font> |<font color="#C0C0C0"> 4.63 ms</font> |<font color="#C0C0C0"> 18.85 ms</font> |<font color="#C0C0C0"> 0.96 ms</font> |<font color="#C0C0C0"> 1.52 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.75 ms | **0.35 ms** | 1.60 ms | 15.20 ms | 0.54 ms | 1.97 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.10 ms</font> |<font color="#C0C0C0"> 4.58 ms</font> |<font color="#C0C0C0"> 15.61 ms</font> |<font color="#C0C0C0"> 0.86 ms</font> |<font color="#C0C0C0"> 1.47 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.71 ms | **0.34 ms** | 1.01 ms | 15.93 ms | 0.66 ms | 2.35 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.32 ms</font> |<font color="#C0C0C0"> 5.91 ms</font> |<font color="#C0C0C0"> 15.06 ms</font> |<font color="#C0C0C0"> 0.90 ms</font> |<font color="#C0C0C0"> 3.21 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **1.03 ms** | 1.81 ms | 1.15 ms | 24.23 ms | 3.05 ms | 3.60 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.29 ms</font> |<font color="#C0C0C0"> 6.03 ms</font> |<font color="#C0C0C0"> 14.51 ms</font> |<font color="#C0C0C0"> 0.95 ms</font> |<font color="#C0C0C0"> 1.43 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.45 ms | 1.56 ms | **1.13 ms** | 15.16 ms | 3.16 ms | 3.02 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.61 ms</font> |<font color="#C0C0C0"> 5.73 ms</font> |<font color="#C0C0C0"> 14.50 ms</font> |<font color="#C0C0C0"> 1.72 ms</font> |<font color="#C0C0C0"> 3.10 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **1.06 ms** | 1.51 ms | 1.07 ms | 17.85 ms | 2.94 ms | 2.82 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.09 ms</font> |<font color="#C0C0C0"> 5.22 ms</font> |<font color="#C0C0C0"> 13.40 ms</font> |<font color="#C0C0C0"> 0.84 ms</font> |<font color="#C0C0C0"> 9.63 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2.71 ms** | 2.98 ms | 2.84 ms | 226.89 ms | 258.01 ms | 4.02 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.07 ms</font> |<font color="#C0C0C0"> 1.87 ms</font> |<font color="#C0C0C0"> 14.97 ms</font> |<font color="#C0C0C0"> 1.42 ms</font> |<font color="#C0C0C0"> 11.50 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18.06 ms | 19.28 ms | 19.06 ms | 1113.22 ms | 2287.73 ms | **15.73 ms** |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.55 ms</font> |<font color="#C0C0C0"> 2.71 ms</font> |<font color="#C0C0C0"> 18.18 ms</font> |<font color="#C0C0C0"> 1.33 ms</font> |<font color="#C0C0C0"> 7.76 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2.43 ms** | 3.98 ms | 2.64 ms | 226.38 ms | 236.41 ms | 5.51 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 228.39 ms</font> |<font color="#C0C0C0"> 289.61 ms</font> |<font color="#C0C0C0"> 19.91 ms</font> |<font color="#C0C0C0"> 1.24 ms</font> |<font color="#C0C0C0"> 2.46 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | **0.05 ms** | 0.06 ms | 0.76 ms | 5.96 ms | 0.19 ms | 24.84 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 228.20 ms</font> |<font color="#C0C0C0"> 181.50 ms</font> |<font color="#C0C0C0"> 22.75 ms</font> |<font color="#C0C0C0"> 0.75 ms</font> |<font color="#C0C0C0"> 5.23 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | **0.04 ms** | 0.05 ms | 1.04 ms | 8.47 ms | 0.29 ms | 22.26 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.25 ms</font> |<font color="#C0C0C0"> 1.16 ms</font> |<font color="#C0C0C0"> 12.89 ms</font> |<font color="#C0C0C0"> 4.87 ms</font> |<font color="#C0C0C0"> 1.65 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **0.64 ms** | 1.25 ms | 15.57 ms | 231.26 ms | 168.13 ms | 10.50 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.85 ms</font> |<font color="#C0C0C0"> 4.39 ms</font> |<font color="#C0C0C0"> 17.65 ms</font> |<font color="#C0C0C0"> 1.38 ms</font> |<font color="#C0C0C0"> 2.30 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.73 ms | **0.67 ms** | 34.14 ms | 8.06 ms | 1.97 ms | 237.19 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.74 ms</font> |<font color="#C0C0C0"> 1.74 ms</font> |<font color="#C0C0C0"> 18.71 ms</font> |<font color="#C0C0C0"> 3.70 ms</font> |<font color="#C0C0C0"> 5.65 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **0.67 ms** | **0.67 ms** | 128.36 ms | 499.16 ms | 882.82 ms | 26.90 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.30 ms</font> |<font color="#C0C0C0"> 1.52 ms</font> |<font color="#C0C0C0"> 11.09 ms</font> |<font color="#C0C0C0"> 1.13 ms</font> |<font color="#C0C0C0"> 1.92 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0.03 ms** | 0.04 ms | 1.68 ms | 5.49 ms | 0.18 ms | 6.54 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.23 ms</font> |<font color="#C0C0C0"> 4.01 ms</font> |<font color="#C0C0C0"> 12.80 ms</font> |<font color="#C0C0C0"> 1.34 ms</font> |<font color="#C0C0C0"> 1.35 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 8.28 ms | 10.65 ms | 73.38 ms | 39.48 ms | 21.85 ms | **6.52 ms** |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.09 ms</font> |<font color="#C0C0C0"> 4.50 ms</font> |<font color="#C0C0C0"> 13.31 ms</font> |<font color="#C0C0C0"> 34.25 ms</font> |<font color="#C0C0C0"> 1.75 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.89 ms | **0.74 ms** | 1.51 ms | 107.22 ms | 2.33 ms | 1.13 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.78 ms</font> |<font color="#C0C0C0"> 4.58 ms</font> |<font color="#C0C0C0"> 13.23 ms</font> |<font color="#C0C0C0"> 1.43 ms</font> |<font color="#C0C0C0"> 1.74 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.65 ms | 11.50 ms | **2.23 ms** | 6.40 ms | 467.89 ms | 7.23 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.85 ms</font> |<font color="#C0C0C0"> 2.90 ms</font> |<font color="#C0C0C0"> 12.80 ms</font> |<font color="#C0C0C0"> 1.11 ms</font> |<font color="#C0C0C0"> 23.18 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.08 ms | **0.04 ms** | 1.12 ms | 4.67 ms | 1.20 ms | 0.31 ms |
-----

## Evaluation Results for sqlite4java Version Version, Series Testseries

| Task | Time |
| :-- | --: |
| Set up | 42.42 ms |
| Load | 410.60 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.26 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.64 ms | 0.61 ms | 0.10 ms | 1.64 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.81 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.92 ms | 1.25 ms | 0.73 ms | 0.92 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.41 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4.16 ms | 3.57 ms | 3.08 ms | 4.16 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.41 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1.59 ms | 1.04 ms | 0.83 ms | 1.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.24 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.78 ms | 0.75 ms | 0.74 ms | 0.78 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.10 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.73 ms | 0.71 ms | 0.70 ms | 0.73 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.32 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1.06 ms | 1.03 ms | 1.01 ms | 1.06 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.29 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.48 ms | 1.45 ms | 1.48 ms | 1.78 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.61 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.21 ms | 1.06 ms | 1.01 ms | 1.21 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.09 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2.37 ms | 2.71 ms | 2.37 ms | 2.92 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.07 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18.61 ms | 18.06 ms | 18.42 ms | 18.61 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.55 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2.62 ms | 2.43 ms | 2.36 ms | 2.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">228.39 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0.08 ms | 0.05 ms | 0.03 ms | 0.08 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">228.20 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.07 ms | 0.04 ms | 0.03 ms | 0.07 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.25 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.64 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.85 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.73 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.74 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.30 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.23 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 8.28 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.09 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.89 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.78 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.65 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.85 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.08 ms |
-----

## Evaluation Results for SQLite JDBC Xerial Version Version, Series Testseries

| Task | Time |
| :-- | --: |
| Set up | 117.33 ms |
| Load | 221.77 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.81 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.28 ms | 0.15 ms | 0.08 ms | 0.28 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.00 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.44 ms | 0.39 ms | 0.42 ms | 0.44 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.61 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.09 ms | 2.09 ms | 2.09 ms | 2.13 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.71 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.36 ms | 0.32 ms | 0.31 ms | 0.36 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.63 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.38 ms | 0.35 ms | 0.33 ms | 0.38 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.58 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.41 ms | 0.34 ms | 0.31 ms | 0.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.91 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.37 ms | 1.81 ms | 1.46 ms | 2.37 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.03 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.03 ms | 1.56 ms | 1.33 ms | 2.03 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.73 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.90 ms | 1.51 ms | 1.28 ms | 1.90 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.22 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.34 ms | 2.98 ms | 2.89 ms | 3.34 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.87 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18.44 ms | 19.28 ms | 17.43 ms | 18.44 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.71 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4.84 ms | 3.98 ms | 3.63 ms | 4.84 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">289.61 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0.10 ms | 0.06 ms | 0.05 ms | 0.10 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">181.50 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.06 ms | 0.05 ms | 0.04 ms | 0.06 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.16 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.25 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.39 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.74 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.52 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.04 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.01 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 10.65 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.50 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.74 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.58 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 11.50 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.90 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.04 ms |
-----

## Evaluation Results for PostgreSQL (Postgres.app) Version Version, Series Testseries

| Task | Time |
| :-- | --: |
| Set up | 262.49 ms |
| Load | 526.40 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.49 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.22 ms | 1.05 ms | 0.49 ms | 2.22 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.71 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 3.27 ms | 2.31 ms | 1.86 ms | 3.27 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.33 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 10.63 ms | 9.05 ms | 7.79 ms | 10.63 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.90 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2.87 ms | 1.51 ms | 0.98 ms | 2.87 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.85 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.65 ms | 1.60 ms | 1.08 ms | 2.65 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.61 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.76 ms | 1.01 ms | 0.61 ms | 1.76 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.06 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.00 ms | 1.15 ms | 0.78 ms | 2.00 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.51 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.76 ms | 1.13 ms | 0.85 ms | 1.76 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.50 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.70 ms | 1.07 ms | 0.71 ms | 1.70 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.40 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4.14 ms | 2.84 ms | 2.37 ms | 4.14 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.97 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18.66 ms | 19.06 ms | 18.61 ms | 18.66 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.18 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4.00 ms | 2.64 ms | 2.04 ms | 4.00 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19.91 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 1.33 ms | 0.76 ms | 0.47 ms | 1.33 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">22.75 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 1.79 ms | 1.04 ms | 0.70 ms | 1.79 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.89 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 15.57 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.65 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 34.14 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.71 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 128.36 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.09 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 1.68 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.80 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 73.38 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.31 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.51 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.23 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.23 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.80 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.12 ms |
-----

## Evaluation Results for Apache Jena Fuseki Version Version, Series Testseries

| Task | Time |
| :-- | --: |
| Set up | 0.00 ms |
| Load | 1784.76 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">301.18 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 227.04 ms | 92.80 ms | 25.05 ms | 227.04 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">132.99 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 53.65 ms | 53.12 ms | 53.65 ms | 58.59 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">210.82 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 216.90 ms | 180.79 ms | 166.66 ms | 216.90 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.79 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 79.11 ms | 35.27 ms | 14.16 ms | 79.11 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.96 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 15.52 ms | 15.20 ms | 14.84 ms | 15.52 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.86 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 19.33 ms | 15.93 ms | 14.68 ms | 19.33 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.90 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 30.00 ms | 24.23 ms | 24.80 ms | 30.00 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.95 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 15.69 ms | 15.16 ms | 13.67 ms | 15.69 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.72 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 14.37 ms | 17.85 ms | 14.37 ms | 19.31 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.84 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 256.33 ms | 226.89 ms | 221.27 ms | 256.33 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.42 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1464.68 ms | 1113.22 ms | 1117.92 ms | 1464.68 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.33 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 227.95 ms | 226.38 ms | 227.95 ms | 229.31 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.24 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 7.35 ms | 5.96 ms | 5.43 ms | 7.35 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.75 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 9.79 ms | 8.47 ms | 7.57 ms | 9.79 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.87 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 231.26 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.38 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 8.06 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.70 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 499.16 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.13 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 5.49 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.34 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 39.48 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">34.25 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 107.22 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.43 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.40 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.11 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 4.67 ms |
-----

## Evaluation Results for Virtuoso Version Version, Series Testseries

| Task | Time |
| :-- | --: |
| Set up | 0.95 ms |
| Load | 129.71 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">170.13 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 7.76 ms | 6.84 ms | 6.25 ms | 7.76 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.23 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 241.45 ms | 242.35 ms | 240.27 ms | 241.45 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.90 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 853.32 ms | 852.76 ms | 853.32 ms | 860.65 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.75 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.56 ms | 0.39 ms | 0.32 ms | 0.56 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.52 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.48 ms | 0.54 ms | 0.48 ms | 0.48 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.47 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.86 ms | 0.66 ms | 0.63 ms | 0.86 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.21 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3.16 ms | 3.05 ms | 2.97 ms | 3.16 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.43 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 3.06 ms | 3.16 ms | 3.06 ms | 3.15 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.10 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.98 ms | 2.94 ms | 2.93 ms | 2.98 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.63 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 252.94 ms | 258.01 ms | 242.54 ms | 252.94 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.50 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 2384.57 ms | 2287.73 ms | 2280.00 ms | 2384.57 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.76 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 243.52 ms | 236.41 ms | 234.99 ms | 243.52 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.46 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 0.22 ms | 0.19 ms | 0.17 ms | 0.22 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.23 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 0.34 ms | 0.29 ms | 0.28 ms | 0.34 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.65 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 168.13 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.30 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.97 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.65 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 882.82 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.92 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.18 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.35 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 21.85 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.75 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2.33 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.74 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 467.89 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">23.18 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.20 ms |
-----

## Evaluation Results for MongoDB Version Version, Series Testseries

| Task | Time |
| :-- | --: |
| Set up | 4.83 ms |
| Load | 996.01 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19.19 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.15 ms | 1.47 ms | 1.04 ms | 2.15 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.48 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 7.43 ms | 7.50 ms | 7.43 ms | 7.72 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.89 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 61.91 ms | 55.50 ms | 53.12 ms | 61.91 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 12.63 ms | 5.21 ms | 1.27 ms | 12.63 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.03 ms | 1.97 ms | 2.03 ms | 2.13 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 3.34 ms | 2.35 ms | 1.94 ms | 3.34 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 5.41 ms | 3.60 ms | 2.84 ms | 5.41 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 3.22 ms | 3.02 ms | 2.50 ms | 3.22 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 3.58 ms | 2.82 ms | 2.49 ms | 3.58 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4.42 ms | 4.02 ms | 4.28 ms | 4.42 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16.22 ms | 15.73 ms | 12.83 ms | 16.22 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 5.94 ms | 5.51 ms | 5.18 ms | 5.94 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | Query | 26.83 ms | 24.84 ms | 26.14 ms | 26.83 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | Query | 24.19 ms | 22.26 ms | 21.86 ms | 24.19 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 10.50 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 237.19 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 26.90 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 6.54 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.52 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.13 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.23 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.31 ms |
-----

## Verify results

| QueryScenario | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB |
| :-- | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 158602837 | 158602837 | 2000841960 | 158602837 | 1196601585 | 983984294 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | 2053900848 | 2053900848 | 939677525 | 252377070 | -1673737200 | -526522855 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 648922170 | 648922170 | -1343867640 | 1831259928 | 1329120980 | -20109913 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -299315579 | -299315579 | 1437367096 | -299315579 | -913884620 | -1991349169 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 615995247 | 615995247 | 1230920781 | -1441918440 | 260624290 | 1907243130 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | 615995247 | 615995247 | 1230920781 | -1441918440 | 260624290 | 1907243130 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 1170184495 | 1170184495 | 1170184495 | 1170184495 | 1170184495 | 1170184495 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | 1957900435 | 1957900435 | -813798185 | -1069105325 | -560581183 | 322354661 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | 1957900435 | 1957900435 | -813798185 | -1069105325 | -560581183 | 322354661 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | 2010826335 | 2010826335 | -1473612607 | -1932174503 | -1655525710 | -861288009 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | 2091663132 | 2091663132 | -140729106 | -2010447849 | 1793102542 | -1395397628 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | -458278182 | -458278182 | -487481030 | -252480616 | 1830651649 | -1453391881 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | 1532099765 | 1532099765 | 1532099765 | 1532099765 | 1532099765 | 1532099765 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | 1532099765 | 1532099765 | 1532099765 | 1532099765 | 1532099765 | 1532099765 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 | 688323751 |
