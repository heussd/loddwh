<style style="text/css">tr:hover{background: #FFFF00;}</style>

# Report for Testserie "TINY"


## Evaluation Overview, all Databases, Test Series $TestSeries 

| QueryScenario | Phase | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | ArangoDB | MongoDB | Virtuoso | Apache Jena Fuseki |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 21.64 ms | 102.43 ms | 265.26 ms | 173.09 ms | 3.77 ms | 1.15 ms | **0.00 ms** |
| Load |  | 336.05 ms | 259.77 ms | 493.91 ms | 757.12 ms | 617.20 ms | **120.81 ms** | 1123.90 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 9.52 ms</font> |<font color="#C0C0C0"> **7.48 ms**</font> |<font color="#C0C0C0"> 15.52 ms</font> |<font color="#C0C0C0"> 15.92 ms</font> |<font color="#C0C0C0"> 12.11 ms</font> |<font color="#C0C0C0"> 161.67 ms</font> |<font color="#C0C0C0"> 208.17 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.45 ms | **0.15 ms** | 0.90 ms | 2.27 ms | 0.79 ms | 6.88 ms | 32.89 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.87 ms**</font> |<font color="#C0C0C0"> 6.65 ms</font> |<font color="#C0C0C0"> 14.59 ms</font> |<font color="#C0C0C0"> 10.71 ms</font> |<font color="#C0C0C0"> 6.76 ms</font> |<font color="#C0C0C0"> 12.67 ms</font> |<font color="#C0C0C0"> 81.34 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.88 ms | **0.37 ms** | 2.10 ms | 23.99 ms | 8.27 ms | 227.99 ms | 38.87 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **2.67 ms**</font> |<font color="#C0C0C0"> 8.37 ms</font> |<font color="#C0C0C0"> 16.06 ms</font> |<font color="#C0C0C0"> 14.14 ms</font> |<font color="#C0C0C0"> 8.46 ms</font> |<font color="#C0C0C0"> 26.05 ms</font> |<font color="#C0C0C0"> 159.78 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.42 ms | **1.81 ms** | 6.70 ms | 177.51 ms | 54.76 ms | 814.96 ms | 142.57 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.90 ms</font> |<font color="#C0C0C0"> 4.99 ms</font> |<font color="#C0C0C0"> 14.80 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.27 ms</font> |<font color="#C0C0C0"> 1.88 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.69 ms | **0.31 ms** | 1.76 ms | 2.28 ms | 4.22 ms | 0.50 ms | 25.98 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.51 ms</font> |<font color="#C0C0C0"> 4.15 ms</font> |<font color="#C0C0C0"> 13.17 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.07 ms</font> |<font color="#C0C0C0"> 1.49 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.57 ms | **0.34 ms** | 1.41 ms | 2.57 ms | 2.37 ms | 0.61 ms | 15.15 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.37 ms</font> |<font color="#C0C0C0"> 4.36 ms</font> |<font color="#C0C0C0"> 13.61 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.22 ms</font> |<font color="#C0C0C0"> 0.57 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.56 ms | **0.27 ms** | 1.06 ms | 2.53 ms | 1.84 ms | 0.66 ms | 14.94 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.46 ms</font> |<font color="#C0C0C0"> 5.43 ms</font> |<font color="#C0C0C0"> 15.14 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.44 ms</font> |<font color="#C0C0C0"> 0.72 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **0.84 ms** | 1.56 ms | 1.35 ms | 18.72 ms | 1.96 ms | 2.87 ms | 16.33 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 7.15 ms</font> |<font color="#C0C0C0"> 14.89 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.31 ms</font> |<font color="#C0C0C0"> 0.64 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **0.85 ms** | 1.67 ms | 1.15 ms | 14.51 ms | 1.83 ms | 3.11 ms | 10.11 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.40 ms</font> |<font color="#C0C0C0"> 5.80 ms</font> |<font color="#C0C0C0"> 14.37 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.25 ms</font> |<font color="#C0C0C0"> 0.53 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **0.85 ms** | 1.58 ms | 1.08 ms | 12.33 ms | 1.89 ms | 2.91 ms | 11.70 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.50 ms</font> |<font color="#C0C0C0"> 5.61 ms</font> |<font color="#C0C0C0"> 12.43 ms</font> |<font color="#C0C0C0"> 25.06 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 6.72 ms</font> |<font color="#C0C0C0"> 0.52 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2.09 ms** | 2.95 ms | 2.33 ms | 3.47 ms | 3.43 ms | 227.59 ms | 178.13 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 2.24 ms</font> |<font color="#C0C0C0"> 12.07 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 6.77 ms</font> |<font color="#C0C0C0"> 1.91 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 15.69 ms | 15.70 ms | 14.15 ms | 46.00 ms | **11.60 ms** | 2054.69 ms | 829.94 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.64 ms</font> |<font color="#C0C0C0"> 1.90 ms</font> |<font color="#C0C0C0"> 15.60 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.67 ms</font> |<font color="#C0C0C0"> 1.24 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2.15 ms** | 3.21 ms | 2.29 ms | 14.36 ms | 3.18 ms | 249.41 ms | 222.69 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 202.04 ms</font> |<font color="#C0C0C0"> 193.03 ms</font> |<font color="#C0C0C0"> 21.44 ms</font> |<font color="#C0C0C0"> 112.42 ms</font> |<font color="#C0C0C0"> **0.84 ms**</font> |<font color="#C0C0C0"> 6.39 ms</font> |<font color="#C0C0C0"> 11.56 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | **0.04 ms** | **0.04 ms** | 0.79 ms | 4.59 ms | 2.24 ms | 0.21 ms | 6.52 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.32 ms**</font> |<font color="#C0C0C0"> 2.56 ms</font> |<font color="#C0C0C0"> 11.77 ms</font> |<font color="#C0C0C0"> 8.84 ms</font> |<font color="#C0C0C0"> 1.38 ms</font> |<font color="#C0C0C0"> 4.40 ms</font> |<font color="#C0C0C0"> 10.99 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | **0.07 ms** | **0.07 ms** | 0.57 ms | 13.42 ms | 18.44 ms | 0.19 ms | 8.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.34 ms</font> |<font color="#C0C0C0"> 2.50 ms</font> |<font color="#C0C0C0"> 12.76 ms</font> |<font color="#C0C0C0"> 8.52 ms</font> |<font color="#C0C0C0"> 1.28 ms</font> |<font color="#C0C0C0"> **0.65 ms**</font> |<font color="#C0C0C0"> 10.94 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | **0.06 ms** | **0.06 ms** | 0.98 ms | 10.57 ms | 17.35 ms | 0.24 ms | 6.86 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.43 ms</font> |<font color="#C0C0C0"> 2.26 ms</font> |<font color="#C0C0C0"> 12.86 ms</font> |<font color="#C0C0C0"> 8.57 ms</font> |<font color="#C0C0C0"> **0.75 ms**</font> |<font color="#C0C0C0"> 13.49 ms</font> |<font color="#C0C0C0"> 8.67 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | **0.03 ms** | **0.03 ms** | 0.87 ms | 2.05 ms | 2.10 ms | 0.27 ms | 10.50 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.23 ms**</font> |<font color="#C0C0C0"> 2.31 ms</font> |<font color="#C0C0C0"> 12.19 ms</font> |<font color="#C0C0C0"> 8.31 ms</font> |<font color="#C0C0C0"> 1.26 ms</font> |<font color="#C0C0C0"> 11.33 ms</font> |<font color="#C0C0C0"> 12.28 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | **0.06 ms** | **0.06 ms** | 0.70 ms | 10.55 ms | 17.38 ms | 0.28 ms | 8.76 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.11 ms</font> |<font color="#C0C0C0"> 2.31 ms</font> |<font color="#C0C0C0"> 11.99 ms</font> |<font color="#C0C0C0"> 8.51 ms</font> |<font color="#C0C0C0"> 1.30 ms</font> |<font color="#C0C0C0"> **0.76 ms**</font> |<font color="#C0C0C0"> 12.58 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | **0.05 ms** | 0.06 ms | 0.86 ms | 9.73 ms | 17.36 ms | 0.26 ms | 8.49 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.64 ms</font> |<font color="#C0C0C0"> 1.10 ms</font> |<font color="#C0C0C0"> 10.93 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.21 ms</font> |<font color="#C0C0C0"> 3.09 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **0.88 ms** | 1.07 ms | 12.87 ms | 53.07 ms | 8.15 ms | 175.45 ms | 214.36 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.52 ms</font> |<font color="#C0C0C0"> 4.62 ms</font> |<font color="#C0C0C0"> 14.41 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.48 ms</font> |<font color="#C0C0C0"> 1.21 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **0.74 ms** | 0.78 ms | 29.82 ms | 70.12 ms | 215.32 ms | 1.92 ms | 9.04 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 1.75 ms</font> |<font color="#C0C0C0"> 15.95 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 4.67 ms</font> |<font color="#C0C0C0"> 3.25 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **0.71 ms** | 0.92 ms | 126.39 ms | 287.76 ms | 22.23 ms | 989.59 ms | 347.78 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.79 ms</font> |<font color="#C0C0C0"> 1.25 ms</font> |<font color="#C0C0C0"> 10.86 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.94 ms</font> |<font color="#C0C0C0"> 1.08 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms | **0.02 ms** | 1.74 ms | 51.80 ms | 3.66 ms | 0.20 ms | 4.35 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.36 ms</font> |<font color="#C0C0C0"> 4.78 ms</font> |<font color="#C0C0C0"> 14.80 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.15 ms</font> |<font color="#C0C0C0"> 1.03 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.16 ms | 11.06 ms | 39.66 ms | 39.20 ms | **3.44 ms** | 28.48 ms | 31.37 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.49 ms</font> |<font color="#C0C0C0"> 5.08 ms</font> |<font color="#C0C0C0"> 14.40 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.51 ms</font> |<font color="#C0C0C0"> 17.62 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.95 ms | 1.08 ms | 1.50 ms | 9.94 ms | **0.63 ms** | 2.28 ms | 86.74 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.36 ms</font> |<font color="#C0C0C0"> 4.56 ms</font> |<font color="#C0C0C0"> 13.88 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.06 ms</font> |<font color="#C0C0C0"> 1.26 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.56 ms | 11.48 ms | **2.85 ms** | 5.39 ms | 6.06 ms | 479.56 ms | 5.65 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.45 ms</font> |<font color="#C0C0C0"> 3.46 ms</font> |<font color="#C0C0C0"> 13.51 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 27.25 ms</font> |<font color="#C0C0C0"> 1.19 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.07 ms | **0.04 ms** | 1.04 ms | 0.68 ms | 0.28 ms | 1.13 ms | 3.90 ms |
-----

## Evaluation Details for sqlite4java, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 21.64 ms |
| Load | 336.05 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.52 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.13 ms | 0.45 ms | 0.13 ms | 1.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.87 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.77 ms | 0.88 ms | 0.59 ms | 0.77 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.67 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.95 ms | 2.42 ms | 2.14 ms | 2.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.90 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.97 ms | 0.69 ms | 0.60 ms | 0.97 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.51 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.59 ms | 0.57 ms | 0.57 ms | 0.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.37 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.59 ms | 0.56 ms | 0.55 ms | 0.59 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.46 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 0.89 ms | 0.84 ms | 0.81 ms | 0.89 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 0.86 ms | 0.85 ms | 0.82 ms | 0.86 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.40 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 0.86 ms | 0.85 ms | 0.84 ms | 0.86 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.50 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2.25 ms | 2.09 ms | 2.01 ms | 2.25 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16.64 ms | 15.69 ms | 15.40 ms | 16.64 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.64 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2.31 ms | 2.15 ms | 2.09 ms | 2.31 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">202.04 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.06 ms | 0.04 ms | 0.03 ms | 0.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.32 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.08 ms | 0.07 ms | 0.06 ms | 0.08 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.34 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.08 ms | 0.06 ms | 0.05 ms | 0.08 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.43 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.05 ms | 0.03 ms | 0.03 ms | 0.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.23 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.08 ms | 0.06 ms | 0.05 ms | 0.08 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.11 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.07 ms | 0.05 ms | 0.05 ms | 0.07 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.64 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.88 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.52 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.74 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.71 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.79 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.36 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.16 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.49 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.95 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.36 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.56 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.45 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.07 ms |
-----

## Evaluation Details for SQLite JDBC Xerial, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 102.43 ms |
| Load | 259.77 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.48 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.29 ms | 0.15 ms | 0.08 ms | 0.29 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.65 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.47 ms | 0.37 ms | 0.36 ms | 0.47 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.37 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.85 ms | 1.81 ms | 1.78 ms | 1.85 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.99 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.37 ms | 0.31 ms | 0.28 ms | 0.37 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.15 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.36 ms | 0.34 ms | 0.32 ms | 0.36 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.36 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.29 ms | 0.27 ms | 0.27 ms | 0.29 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.43 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.07 ms | 1.56 ms | 1.29 ms | 2.07 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.15 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.26 ms | 1.67 ms | 1.36 ms | 2.26 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.80 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.04 ms | 1.58 ms | 1.35 ms | 2.04 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.61 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.32 ms | 2.95 ms | 2.80 ms | 3.32 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.24 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16.68 ms | 15.70 ms | 15.78 ms | 16.68 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.90 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.73 ms | 3.21 ms | 2.97 ms | 3.73 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">193.03 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.07 ms | 0.04 ms | 0.03 ms | 0.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.56 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.07 ms | 0.07 ms | 0.06 ms | 0.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.50 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.06 ms | 0.06 ms | 0.06 ms | 0.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.26 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.04 ms | 0.03 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.31 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.06 ms | 0.06 ms | 0.06 ms | 0.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.31 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.07 ms | 0.06 ms | 0.06 ms | 0.07 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.10 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.07 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.62 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.78 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.75 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.92 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.25 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.78 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 11.06 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.08 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.08 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.56 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 11.48 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.46 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.04 ms |
-----

## Evaluation Details for PostgreSQL (Postgres.app), Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 265.26 ms |
| Load | 493.91 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.52 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.73 ms | 0.90 ms | 0.46 ms | 1.73 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.59 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 3.16 ms | 2.10 ms | 1.68 ms | 3.16 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.06 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 6.59 ms | 6.70 ms | 6.59 ms | 6.60 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.80 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 3.85 ms | 1.76 ms | 0.77 ms | 3.85 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.17 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.26 ms | 1.41 ms | 0.98 ms | 2.26 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.61 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.04 ms | 1.06 ms | 0.62 ms | 2.04 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.14 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.12 ms | 1.35 ms | 1.07 ms | 2.12 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.89 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.85 ms | 1.15 ms | 0.77 ms | 1.85 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.37 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.69 ms | 1.08 ms | 0.80 ms | 1.69 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.38 ms | 2.33 ms | 1.74 ms | 3.38 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.07 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.38 ms | 14.15 ms | 13.02 ms | 14.38 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.60 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.53 ms | 2.29 ms | 1.70 ms | 3.53 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">21.44 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 1.23 ms | 0.79 ms | 0.64 ms | 1.23 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.77 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.81 ms | 0.57 ms | 0.37 ms | 0.81 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.76 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1.39 ms | 0.98 ms | 0.88 ms | 1.39 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.86 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 1.07 ms | 0.87 ms | 0.70 ms | 1.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.19 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.95 ms | 0.70 ms | 0.59 ms | 0.95 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.99 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 1.03 ms | 0.86 ms | 0.58 ms | 1.03 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.93 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 12.87 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.41 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 29.82 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.95 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 126.39 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.86 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 1.74 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.80 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 39.66 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.40 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.50 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.88 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.85 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.51 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.04 ms |
-----

## Evaluation Details for ArangoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 173.09 ms |
| Load | 757.12 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.92 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.33 ms | 2.27 ms | 2.33 ms | 2.34 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.71 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 22.74 ms | 23.99 ms | 22.74 ms | 25.61 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.14 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 184.72 ms | 177.51 ms | 177.84 ms | 184.72 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2.50 ms | 2.28 ms | 2.39 ms | 2.50 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.64 ms | 2.57 ms | 2.48 ms | 2.64 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.41 ms | 2.53 ms | 2.41 ms | 2.68 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 25.42 ms | 18.72 ms | 15.05 ms | 25.42 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 15.62 ms | 14.51 ms | 15.54 ms | 15.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 12.12 ms | 12.33 ms | 12.12 ms | 12.66 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25.06 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.73 ms | 3.47 ms | 3.53 ms | 3.73 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 49.34 ms | 46.00 ms | 45.47 ms | 49.34 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 14.69 ms | 14.36 ms | 13.83 ms | 14.69 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">112.42 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 6.52 ms | 4.59 ms | 4.33 ms | 6.52 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.84 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 13.32 ms | 13.42 ms | 13.32 ms | 14.26 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.52 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 10.90 ms | 10.57 ms | 10.90 ms | 11.67 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.57 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2.48 ms | 2.05 ms | 1.95 ms | 2.48 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.31 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 11.40 ms | 10.55 ms | 10.72 ms | 11.40 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.51 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 11.97 ms | 9.73 ms | 8.58 ms | 11.97 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 53.07 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 70.12 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 287.76 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 51.80 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 39.20 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 9.94 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.39 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.68 ms |
-----

## Evaluation Details for MongoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 3.77 ms |
| Load | 617.20 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.11 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.01 ms | 0.79 ms | 0.71 ms | 1.01 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.76 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 12.64 ms | 8.27 ms | 6.23 ms | 12.64 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.46 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 57.07 ms | 54.76 ms | 53.40 ms | 57.07 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 9.65 ms | 4.22 ms | 1.59 ms | 9.65 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.35 ms | 2.37 ms | 2.28 ms | 2.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.78 ms | 1.84 ms | 1.29 ms | 2.78 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.64 ms | 1.96 ms | 1.65 ms | 2.64 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.96 ms | 1.83 ms | 1.69 ms | 1.96 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.99 ms | 1.89 ms | 1.71 ms | 1.99 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4.39 ms | 3.43 ms | 2.98 ms | 4.39 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 13.52 ms | 11.60 ms | 10.70 ms | 13.52 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.44 ms | 3.18 ms | 3.08 ms | 3.44 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.84 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 2.62 ms | 2.24 ms | 2.00 ms | 2.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.38 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 19.44 ms | 18.44 ms | 17.89 ms | 19.44 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.28 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 17.54 ms | 17.35 ms | 17.04 ms | 17.54 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.75 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2.57 ms | 2.10 ms | 1.83 ms | 2.57 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.26 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 17.55 ms | 17.38 ms | 16.85 ms | 17.55 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.30 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 17.42 ms | 17.36 ms | 17.26 ms | 17.42 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 8.15 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 215.32 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 22.23 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.66 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.44 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.63 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.06 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.28 ms |
-----

## Evaluation Details for Virtuoso, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 1.15 ms |
| Load | 120.81 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">161.67 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 8.07 ms | 6.88 ms | 6.52 ms | 8.07 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.67 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 230.66 ms | 227.99 ms | 228.63 ms | 230.66 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26.05 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 802.37 ms | 814.96 ms | 802.37 ms | 842.02 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.27 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.49 ms | 0.50 ms | 0.49 ms | 0.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.07 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.57 ms | 0.61 ms | 0.57 ms | 0.62 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.22 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.75 ms | 0.66 ms | 0.68 ms | 0.75 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.44 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.83 ms | 2.87 ms | 2.83 ms | 2.91 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.31 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.92 ms | 3.11 ms | 2.85 ms | 2.92 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.25 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 3.02 ms | 2.91 ms | 2.85 ms | 3.02 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.72 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 223.42 ms | 227.59 ms | 223.42 ms | 228.34 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.77 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 2042.17 ms | 2054.69 ms | 2042.17 ms | 2057.04 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.67 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 246.98 ms | 249.41 ms | 246.98 ms | 256.27 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.39 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.24 ms | 0.21 ms | 0.19 ms | 0.24 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.40 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.21 ms | 0.19 ms | 0.19 ms | 0.21 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.65 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.27 ms | 0.24 ms | 0.21 ms | 0.27 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.49 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.29 ms | 0.27 ms | 0.26 ms | 0.29 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.33 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.31 ms | 0.28 ms | 0.27 ms | 0.31 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.76 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.27 ms | 0.26 ms | 0.25 ms | 0.27 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.21 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 175.45 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.48 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.92 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.67 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 989.59 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.94 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.20 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.15 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 28.48 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.51 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2.28 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.06 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 479.56 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.25 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.13 ms |
-----

## Evaluation Details for Apache Jena Fuseki, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 0.00 ms |
| Load | 1123.90 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">208.17 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 62.60 ms | 32.89 ms | 21.21 ms | 62.60 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">81.34 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 46.44 ms | 38.87 ms | 34.69 ms | 46.44 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">159.78 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 167.90 ms | 142.57 ms | 132.38 ms | 167.90 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.88 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 51.09 ms | 25.98 ms | 16.35 ms | 51.09 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.49 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 19.80 ms | 15.15 ms | 12.42 ms | 19.80 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.57 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 15.78 ms | 14.94 ms | 12.12 ms | 15.78 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.72 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 24.94 ms | 16.33 ms | 12.16 ms | 24.94 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.64 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 12.99 ms | 10.11 ms | 8.58 ms | 12.99 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.53 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 13.21 ms | 11.70 ms | 11.67 ms | 13.21 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.52 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 175.52 ms | 178.13 ms | 175.52 ms | 185.53 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.91 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 979.65 ms | 829.94 ms | 816.08 ms | 979.65 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.24 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 267.44 ms | 222.69 ms | 202.85 ms | 267.44 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.56 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 6.36 ms | 6.52 ms | 5.99 ms | 6.36 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.99 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 6.65 ms | 8.62 ms | 6.65 ms | 7.63 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.94 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 7.37 ms | 6.86 ms | 6.84 ms | 7.37 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.67 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 9.60 ms | 10.50 ms | 6.77 ms | 9.60 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.28 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 10.99 ms | 8.76 ms | 7.94 ms | 10.99 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.58 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 8.70 ms | 8.49 ms | 8.70 ms | 9.09 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.09 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 214.36 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.21 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9.04 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.25 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 347.78 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.08 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 4.35 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.03 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 31.37 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.62 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 86.74 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.26 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.65 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.19 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.90 ms |
-----

## Verify results

| QueryScenario | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | ArangoDB | MongoDB | Virtuoso | Apache Jena Fuseki |
| :-- | --: | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | -1671377699 | -1671377699 | -1476232815 | -1671377699 | -1671377699 | -451022016 | 1124225119 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | -626479104 | -626479104 | -1307754295 | 504889620 | 504889620 | 31498958 | -34739162 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 894449015 | 894449015 | 1055376212 | 1119005638 | -626503181 | 1068418863 | -218850764 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -579739424 | -579739424 | 127929027 | 1697806699 | -579739424 | -579739424 | -579739424 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 335571402 | 335571402 | -1831278202 | 463814295 | -1722342285 | -1722342285 | -1722342285 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | 335571402 | 335571402 | -1831278202 | 463814295 | -1722342285 | -1722342285 | -1722342285 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 889760650 | 889760650 | 889760650 | 889760650 | 889760650 | 889760650 | 889760650 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | 1677476590 | 1677476590 | 1677476590 | -1415506103 | -1349529170 | -1349529170 | -1349529170 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | 1677476590 | 1677476590 | 1677476590 | -1415506103 | -1349529170 | -1349529170 | -1349529170 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | 778216839 | 778216839 | -1533257423 | 1526360431 | 778216839 | -1527461614 | -347457695 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | -768488453 | -768488453 | 339099715 | 151417977 | -587593997 | -1449022809 | 1479809287 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | -1766455874 | -1766455874 | -71788482 | 874238082 | -1766455874 | 1531013977 | -1392199472 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 | 1082557601 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 | 2041548238 |
