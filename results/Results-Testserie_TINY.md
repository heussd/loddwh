<style style="text/css">tr:hover{background: #FFFF00;}</style>

# Report for Testserie "TINY"


## Evaluation Overview, all Databases, Test Series $TestSeries 

| QueryScenario | Phase | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB | ArangoDB |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 20.35 ms | 98.88 ms | 247.57 ms | **0.00 ms** | 1.13 ms | 4.18 ms | 193.99 ms |
| Load |  | 320.61 ms | 193.21 ms | 372.01 ms | 1104.84 ms | **119.03 ms** | 615.33 ms | 675.87 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 9.29 ms</font> |<font color="#C0C0C0"> **7.54 ms**</font> |<font color="#C0C0C0"> 16.16 ms</font> |<font color="#C0C0C0"> 310.32 ms</font> |<font color="#C0C0C0"> 159.14 ms</font> |<font color="#C0C0C0"> 20.30 ms</font> |<font color="#C0C0C0"> 15.10 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.39 ms | **0.14 ms** | 0.90 ms | 30.09 ms | 6.86 ms | 0.95 ms | 2.11 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.44 ms**</font> |<font color="#C0C0C0"> 6.23 ms</font> |<font color="#C0C0C0"> 14.91 ms</font> |<font color="#C0C0C0"> 73.37 ms</font> |<font color="#C0C0C0"> 12.89 ms</font> |<font color="#C0C0C0"> 7.60 ms</font> |<font color="#C0C0C0"> 9.93 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.85 ms | **0.37 ms** | 1.99 ms | 37.37 ms | 233.55 ms | 6.64 ms | 18.99 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **2.51 ms**</font> |<font color="#C0C0C0"> 7.64 ms</font> |<font color="#C0C0C0"> 15.41 ms</font> |<font color="#C0C0C0"> 140.45 ms</font> |<font color="#C0C0C0"> 25.35 ms</font> |<font color="#C0C0C0"> 8.10 ms</font> |<font color="#C0C0C0"> 13.50 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.45 ms | **1.74 ms** | 6.32 ms | 132.60 ms | 769.57 ms | 57.28 ms | 166.57 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.92 ms</font> |<font color="#C0C0C0"> 4.38 ms</font> |<font color="#C0C0C0"> 14.32 ms</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 1.22 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.66 ms | **0.27 ms** | 1.03 ms | 25.02 ms | 0.45 ms | 5.79 ms | 2.00 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 3.74 ms</font> |<font color="#C0C0C0"> 13.48 ms</font> |<font color="#C0C0C0"> 0.52 ms</font> |<font color="#C0C0C0"> 1.07 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.58 ms | **0.32 ms** | 1.18 ms | 13.25 ms | 0.59 ms | 3.22 ms | 2.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.34 ms</font> |<font color="#C0C0C0"> 4.19 ms</font> |<font color="#C0C0C0"> 12.68 ms</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 1.12 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.55 ms | **0.27 ms** | 0.92 ms | 14.89 ms | 0.67 ms | 1.41 ms | 2.18 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.45 ms</font> |<font color="#C0C0C0"> 5.59 ms</font> |<font color="#C0C0C0"> 14.23 ms</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 1.24 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **0.82 ms** | 1.56 ms | 1.01 ms | 18.59 ms | 2.89 ms | 1.90 ms | 15.60 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.42 ms</font> |<font color="#C0C0C0"> 5.53 ms</font> |<font color="#C0C0C0"> 15.00 ms</font> |<font color="#C0C0C0"> 0.32 ms</font> |<font color="#C0C0C0"> 1.06 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **0.83 ms** | 1.48 ms | 1.09 ms | 10.18 ms | 2.78 ms | 1.81 ms | 13.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.40 ms</font> |<font color="#C0C0C0"> 7.02 ms</font> |<font color="#C0C0C0"> 14.46 ms</font> |<font color="#C0C0C0"> 0.41 ms</font> |<font color="#C0C0C0"> 0.97 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **0.83 ms** | 1.73 ms | 1.12 ms | 10.71 ms | 2.78 ms | 1.71 ms | 11.85 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 7.50 ms</font> |<font color="#C0C0C0"> 14.29 ms</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 6.73 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 23.31 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **1.98 ms** | 3.10 ms | 2.33 ms | 151.21 ms | 216.31 ms | 3.01 ms | 2.92 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.45 ms</font> |<font color="#C0C0C0"> 1.59 ms</font> |<font color="#C0C0C0"> 13.12 ms</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> 6.96 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 15.17 ms | 15.25 ms | 14.40 ms | 860.22 ms | 1965.68 ms | **11.25 ms** | 50.40 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.57 ms</font> |<font color="#C0C0C0"> 1.59 ms</font> |<font color="#C0C0C0"> 15.27 ms</font> |<font color="#C0C0C0"> 0.71 ms</font> |<font color="#C0C0C0"> 6.75 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2.03 ms** | 3.41 ms | 2.12 ms | 267.08 ms | 209.10 ms | 3.45 ms | 14.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 185.58 ms</font> |<font color="#C0C0C0"> 275.89 ms</font> |<font color="#C0C0C0"> 17.93 ms</font> |<font color="#C0C0C0"> 12.57 ms</font> |<font color="#C0C0C0"> 5.55 ms</font> |<font color="#C0C0C0"> **0.83 ms**</font> |<font color="#C0C0C0"> 254.66 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | **0.03 ms** | **0.03 ms** | 0.40 ms | 7.63 ms | 0.20 ms | 3.59 ms | 4.68 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 200.62 ms</font> |<font color="#C0C0C0"> 174.58 ms</font> |<font color="#C0C0C0"> 18.16 ms</font> |<font color="#C0C0C0"> 11.17 ms</font> |<font color="#C0C0C0"> 4.45 ms</font> |<font color="#C0C0C0"> **1.56 ms**</font> |<font color="#C0C0C0"> 7.84 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | **0.03 ms** | 0.05 ms | 0.50 ms | 7.15 ms | 0.20 ms | 19.76 ms | 11.99 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 166.16 ms</font> |<font color="#C0C0C0"> 163.75 ms</font> |<font color="#C0C0C0"> 19.39 ms</font> |<font color="#C0C0C0"> 11.73 ms</font> |<font color="#C0C0C0"> **0.69 ms**</font> |<font color="#C0C0C0"> 1.22 ms</font> |<font color="#C0C0C0"> 7.65 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.03 ms | **0.02 ms** | 0.46 ms | 6.65 ms | 0.21 ms | 17.87 ms | 9.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 256.63 ms</font> |<font color="#C0C0C0"> 163.78 ms</font> |<font color="#C0C0C0"> 18.07 ms</font> |<font color="#C0C0C0"> 8.66 ms</font> |<font color="#C0C0C0"> 12.74 ms</font> |<font color="#C0C0C0"> **0.73 ms**</font> |<font color="#C0C0C0"> 7.68 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | **0.02 ms** | 0.03 ms | 0.58 ms | 9.72 ms | 0.28 ms | 2.20 ms | 1.57 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 154.44 ms</font> |<font color="#C0C0C0"> 165.23 ms</font> |<font color="#C0C0C0"> 17.46 ms</font> |<font color="#C0C0C0"> 11.78 ms</font> |<font color="#C0C0C0"> 12.84 ms</font> |<font color="#C0C0C0"> **1.37 ms**</font> |<font color="#C0C0C0"> 8.31 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | **0.02 ms** | **0.02 ms** | 0.54 ms | 8.59 ms | 0.28 ms | 18.00 ms | 8.15 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 158.33 ms</font> |<font color="#C0C0C0"> 157.92 ms</font> |<font color="#C0C0C0"> 17.29 ms</font> |<font color="#C0C0C0"> 12.83 ms</font> |<font color="#C0C0C0"> **0.82 ms**</font> |<font color="#C0C0C0"> 1.37 ms</font> |<font color="#C0C0C0"> 7.56 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.04 ms | **0.02 ms** | 0.55 ms | 8.04 ms | 0.26 ms | 17.93 ms | 8.16 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.54 ms</font> |<font color="#C0C0C0"> 1.02 ms</font> |<font color="#C0C0C0"> 9.30 ms</font> |<font color="#C0C0C0"> 2.36 ms</font> |<font color="#C0C0C0"> 1.19 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **0.96 ms** | 1.09 ms | 15.01 ms | 155.61 ms | 159.38 ms | 7.73 ms | 32.89 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 3.92 ms</font> |<font color="#C0C0C0"> 15.59 ms</font> |<font color="#C0C0C0"> 0.95 ms</font> |<font color="#C0C0C0"> 1.52 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.83 ms | **0.74 ms** | 27.58 ms | 8.84 ms | 1.93 ms | 179.25 ms | 47.16 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.60 ms</font> |<font color="#C0C0C0"> 1.28 ms</font> |<font color="#C0C0C0"> 16.09 ms</font> |<font color="#C0C0C0"> 3.24 ms</font> |<font color="#C0C0C0"> 4.39 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.70 ms | **0.61 ms** | 150.12 ms | 396.95 ms | 832.56 ms | 17.20 ms | 145.80 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.88 ms</font> |<font color="#C0C0C0"> 1.13 ms</font> |<font color="#C0C0C0"> 10.97 ms</font> |<font color="#C0C0C0"> 0.91 ms</font> |<font color="#C0C0C0"> 1.20 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.04 ms | **0.02 ms** | 1.63 ms | 4.92 ms | 0.17 ms | 3.50 ms | 35.59 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.40 ms</font> |<font color="#C0C0C0"> 3.74 ms</font> |<font color="#C0C0C0"> 13.10 ms</font> |<font color="#C0C0C0"> 0.96 ms</font> |<font color="#C0C0C0"> 1.00 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.76 ms | 11.46 ms | 16.49 ms | 32.23 ms | 20.31 ms | **3.37 ms** | 31.63 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> 3.92 ms</font> |<font color="#C0C0C0"> 14.68 ms</font> |<font color="#C0C0C0"> 25.70 ms</font> |<font color="#C0C0C0"> 1.25 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.22 ms | 0.87 ms | 1.64 ms | 67.70 ms | 2.00 ms | **0.68 ms** | 7.76 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.30 ms</font> |<font color="#C0C0C0"> 3.88 ms</font> |<font color="#C0C0C0"> 15.27 ms</font> |<font color="#C0C0C0"> 0.84 ms</font> |<font color="#C0C0C0"> 1.07 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.63 ms | 11.22 ms | **2.63 ms** | 4.73 ms | 386.46 ms | 5.83 ms | 4.31 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 2.51 ms</font> |<font color="#C0C0C0"> 14.22 ms</font> |<font color="#C0C0C0"> 0.69 ms</font> |<font color="#C0C0C0"> 20.80 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.10 ms | **0.04 ms** | 1.08 ms | 3.53 ms | 1.09 ms | 0.37 ms | 0.46 ms |
-----

## Evaluation Details for sqlite4java, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 20.35 ms |
| Load | 320.61 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.29 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.96 ms | 0.39 ms | 0.13 ms | 0.96 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.44 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.75 ms | 0.85 ms | 0.52 ms | 0.75 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.51 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.00 ms | 2.45 ms | 2.12 ms | 3.00 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.92 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.92 ms | 0.66 ms | 0.54 ms | 0.92 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.59 ms | 0.58 ms | 0.56 ms | 0.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.34 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.56 ms | 0.55 ms | 0.54 ms | 0.56 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.45 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 0.87 ms | 0.82 ms | 0.81 ms | 0.87 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.42 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 0.84 ms | 0.83 ms | 0.82 ms | 0.84 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.40 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 0.84 ms | 0.83 ms | 0.84 ms | 0.85 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2.07 ms | 1.98 ms | 1.94 ms | 2.07 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.45 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16.20 ms | 15.17 ms | 15.14 ms | 16.20 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.57 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2.13 ms | 2.03 ms | 2.02 ms | 2.13 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">185.58 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.05 ms | 0.03 ms | 0.02 ms | 0.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">200.62 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.04 ms | 0.03 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">166.16 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.05 ms | 0.03 ms | 0.02 ms | 0.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">256.63 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.03 ms | 0.02 ms | 0.02 ms | 0.03 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">154.44 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.03 ms | 0.02 ms | 0.02 ms | 0.03 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">158.33 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.06 ms | 0.04 ms | 0.04 ms | 0.06 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.54 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.96 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.60 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.70 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.88 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.04 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.40 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7.76 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.22 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.30 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.63 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.10 ms |
-----

## Evaluation Details for SQLite JDBC Xerial, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 98.88 ms |
| Load | 193.21 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.54 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.27 ms | 0.14 ms | 0.07 ms | 0.27 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.23 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.40 ms | 0.37 ms | 0.39 ms | 0.40 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.64 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.83 ms | 1.74 ms | 1.71 ms | 1.83 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.38 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.30 ms | 0.27 ms | 0.26 ms | 0.30 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.74 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.33 ms | 0.32 ms | 0.30 ms | 0.33 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.19 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.30 ms | 0.27 ms | 0.27 ms | 0.30 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.59 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.10 ms | 1.56 ms | 1.25 ms | 2.10 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.53 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.91 ms | 1.48 ms | 1.27 ms | 1.91 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.02 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.92 ms | 1.73 ms | 1.65 ms | 1.92 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.50 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.89 ms | 3.10 ms | 2.86 ms | 3.89 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.59 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 15.67 ms | 15.25 ms | 14.73 ms | 15.67 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.59 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4.05 ms | 3.41 ms | 3.15 ms | 4.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">275.89 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.05 ms | 0.03 ms | 0.03 ms | 0.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">174.58 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.03 ms | 0.05 ms | 0.03 ms | 0.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">163.75 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.02 ms | 0.02 ms | 0.02 ms | 0.02 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">163.78 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.02 ms | 0.03 ms | 0.02 ms | 0.03 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">165.23 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.02 ms | 0.02 ms | 0.02 ms | 0.03 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">157.92 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.02 ms | 0.02 ms | 0.02 ms | 0.03 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.02 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.09 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.92 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.74 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.28 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.61 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.13 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.74 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 11.46 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.92 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.87 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.88 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 11.22 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.51 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.04 ms |
-----

## Evaluation Details for PostgreSQL (Postgres.app), Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 247.57 ms |
| Load | 372.01 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.16 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.77 ms | 0.90 ms | 0.43 ms | 1.77 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.91 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 2.84 ms | 1.99 ms | 1.86 ms | 2.84 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.41 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 7.08 ms | 6.32 ms | 6.25 ms | 7.08 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.32 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1.96 ms | 1.03 ms | 0.64 ms | 1.96 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 1.81 ms | 1.18 ms | 0.70 ms | 1.81 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.68 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.61 ms | 0.92 ms | 0.59 ms | 1.61 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.23 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1.66 ms | 1.01 ms | 0.69 ms | 1.66 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1.88 ms | 1.09 ms | 0.66 ms | 1.88 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.46 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.65 ms | 1.12 ms | 0.97 ms | 1.65 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.29 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.63 ms | 2.33 ms | 1.68 ms | 3.63 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.12 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.90 ms | 14.40 ms | 13.94 ms | 14.90 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.27 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.22 ms | 2.12 ms | 1.67 ms | 3.22 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.93 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.60 ms | 0.40 ms | 0.29 ms | 0.60 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.16 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.70 ms | 0.50 ms | 0.43 ms | 0.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19.39 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.70 ms | 0.46 ms | 0.36 ms | 0.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.07 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.82 ms | 0.58 ms | 0.45 ms | 0.82 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.46 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.79 ms | 0.54 ms | 0.41 ms | 0.79 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">17.29 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.78 ms | 0.55 ms | 0.40 ms | 0.78 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.30 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 15.01 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.59 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 27.58 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16.09 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 150.12 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.97 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 1.63 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.10 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 16.49 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.68 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.64 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.27 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.63 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.22 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.08 ms |
-----

## Evaluation Details for Apache Jena Fuseki, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 0.00 ms |
| Load | 1104.84 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">310.32 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 58.37 ms | 30.09 ms | 16.53 ms | 58.37 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">73.37 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 47.20 ms | 37.37 ms | 33.23 ms | 47.20 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">140.45 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 158.41 ms | 132.60 ms | 122.74 ms | 158.41 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 41.36 ms | 25.02 ms | 20.79 ms | 41.36 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.52 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 13.00 ms | 13.25 ms | 13.00 ms | 13.49 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 17.16 ms | 14.89 ms | 12.98 ms | 17.16 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 34.57 ms | 18.59 ms | 12.78 ms | 34.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.32 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 9.13 ms | 10.18 ms | 9.13 ms | 12.31 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.41 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 9.14 ms | 10.71 ms | 9.14 ms | 9.59 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 191.13 ms | 151.21 ms | 124.26 ms | 191.13 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 826.25 ms | 860.22 ms | 826.25 ms | 904.98 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.71 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 304.34 ms | 267.08 ms | 282.65 ms | 304.34 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.57 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 8.62 ms | 7.63 ms | 7.26 ms | 8.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.17 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 6.71 ms | 7.15 ms | 6.71 ms | 6.79 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.73 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6.22 ms | 6.65 ms | 6.22 ms | 7.41 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.66 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 12.50 ms | 9.72 ms | 8.63 ms | 12.50 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.78 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 10.27 ms | 8.59 ms | 7.90 ms | 10.27 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.83 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 8.20 ms | 8.04 ms | 7.38 ms | 8.20 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.36 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 155.61 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.95 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 8.84 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.24 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 396.95 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.91 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 4.92 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.96 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 32.23 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25.70 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 67.70 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.84 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4.73 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.69 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.53 ms |
-----

## Evaluation Details for Virtuoso, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 1.13 ms |
| Load | 119.03 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">159.14 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 7.49 ms | 6.86 ms | 6.18 ms | 7.49 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.89 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 218.02 ms | 233.55 ms | 218.02 ms | 245.22 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25.35 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 762.33 ms | 769.57 ms | 762.33 ms | 780.90 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.22 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.49 ms | 0.45 ms | 0.46 ms | 0.49 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.07 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.58 ms | 0.59 ms | 0.58 ms | 0.62 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.12 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.85 ms | 0.67 ms | 0.57 ms | 0.85 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.24 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3.09 ms | 2.89 ms | 2.84 ms | 3.09 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.06 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.82 ms | 2.78 ms | 2.77 ms | 2.82 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.97 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.87 ms | 2.78 ms | 2.74 ms | 2.87 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.73 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 216.83 ms | 216.31 ms | 213.42 ms | 216.83 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.96 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 2001.90 ms | 1965.68 ms | 1954.55 ms | 2001.90 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.75 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 199.75 ms | 209.10 ms | 199.75 ms | 211.58 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.55 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.23 ms | 0.20 ms | 0.19 ms | 0.23 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.45 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.18 ms | 0.20 ms | 0.18 ms | 0.19 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.69 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.22 ms | 0.21 ms | 0.22 ms | 0.22 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.74 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 0.30 ms | 0.28 ms | 0.26 ms | 0.30 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.84 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 0.31 ms | 0.28 ms | 0.26 ms | 0.31 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.82 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 0.28 ms | 0.26 ms | 0.23 ms | 0.28 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.19 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 159.38 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.52 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.93 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.39 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 832.56 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.20 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.17 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 20.31 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.25 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2.00 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.07 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 386.46 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">20.80 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.09 ms |
-----

## Evaluation Details for MongoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 4.18 ms |
| Load | 615.33 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">20.30 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.47 ms | 0.95 ms | 0.70 ms | 1.47 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.60 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 6.64 ms | 6.64 ms | 6.43 ms | 6.64 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.10 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 61.23 ms | 57.28 ms | 55.73 ms | 61.23 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 10.56 ms | 5.79 ms | 3.43 ms | 10.56 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3.99 ms | 3.22 ms | 3.77 ms | 3.99 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.53 ms | 1.41 ms | 1.36 ms | 1.53 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.10 ms | 1.90 ms | 1.70 ms | 2.10 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.03 ms | 1.81 ms | 1.70 ms | 2.03 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.91 ms | 1.71 ms | 1.66 ms | 1.91 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.07 ms | 3.01 ms | 2.97 ms | 3.07 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 10.82 ms | 11.25 ms | 8.66 ms | 10.82 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4.02 ms | 3.45 ms | 3.30 ms | 4.02 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.83 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 6.70 ms | 3.59 ms | 2.04 ms | 6.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.56 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 20.41 ms | 19.76 ms | 20.12 ms | 20.41 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.22 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 17.81 ms | 17.87 ms | 17.81 ms | 18.18 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.73 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 2.59 ms | 2.20 ms | 1.92 ms | 2.59 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.37 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 18.56 ms | 18.00 ms | 17.54 ms | 18.56 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.37 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 18.64 ms | 17.93 ms | 17.61 ms | 18.64 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 7.73 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 179.25 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 17.20 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.50 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.37 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.68 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.83 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.37 ms |
-----

## Evaluation Details for ArangoDB, Version $Version, Test Series $Testseries

| Task | Time |
| :-- | --: |
| Set up | 193.99 ms |
| Load | 675.87 ms |

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.10 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.40 ms | 2.11 ms | 1.96 ms | 2.40 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.93 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 20.19 ms | 18.99 ms | 18.93 ms | 20.19 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.50 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 182.74 ms | 166.57 ms | 162.46 ms | 182.74 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1.93 ms | 2.00 ms | 1.93 ms | 2.13 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.46 ms | 2.33 ms | 2.29 ms | 2.46 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.23 ms | 2.18 ms | 2.19 ms | 2.23 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 15.70 ms | 15.60 ms | 15.70 ms | 16.19 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 15.57 ms | 13.62 ms | 12.59 ms | 15.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 11.83 ms | 11.85 ms | 11.83 ms | 12.31 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">23.31 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.11 ms | 2.92 ms | 2.75 ms | 3.11 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 45.90 ms | 50.40 ms | 45.90 ms | 53.21 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 16.69 ms | 14.62 ms | 13.68 ms | 16.69 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">254.66 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 8.19 ms | 4.68 ms | 3.38 ms | 8.19 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.84 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 12.69 ms | 11.99 ms | 12.07 ms | 12.69 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.65 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 10.80 ms | 9.05 ms | 7.05 ms | 10.80 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.68 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | Query | 1.81 ms | 1.57 ms | 1.53 ms | 1.81 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.31 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | Query | 8.23 ms | 8.15 ms | 8.23 ms | 9.01 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.56 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | Query | 7.01 ms | 8.16 ms | 7.01 ms | 7.06 ms |

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 32.89 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 47.16 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 145.80 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 35.59 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 31.63 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 7.76 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4.31 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.46 ms |
-----

## Verify results

| QueryScenario | sqlite4java | SQLite JDBC Xerial | PostgreSQL (Postgres.app) | Apache Jena Fuseki | Virtuoso | MongoDB | ArangoDB |
| :-- | --: | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | -1319616107 | -1319616107 | -1124471223 | 1475986711 | -99260424 | -1319616107 | -1319616107 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | -274717512 | -274717512 | -955992703 | 317022430 | 383260550 | 856651212 | 856651212 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 1246210607 | 1246210607 | 1407137804 | 132910828 | 1420180455 | -274741589 | 1470767230 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | 223977958 | 223977958 | 931646409 | 223977958 | 223977958 | 223977958 | -1793443215 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 1139288784 | 1139288784 | -1027560820 | -918624903 | -918624903 | -918624903 | 1267531677 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | 1139288784 | 1139288784 | -1027560820 | -918624903 | -918624903 | -918624903 | 1267531677 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 1693478032 | 1693478032 | 1693478032 | 1693478032 | 1693478032 | 1693478032 | 1693478032 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | -1813773324 | -1813773324 | -1813773324 | -545811788 | -545811788 | -545811788 | -611788721 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | -1813773324 | -1813773324 | -1813773324 | -545811788 | -545811788 | -545811788 | -611788721 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | 1129978431 | 1129978431 | -1181495831 | 4303897 | -1175700022 | 1129978431 | 2054314283 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | -416726861 | -416726861 | 690861307 | -714860305 | -1097261217 | -235832405 | 1729521811 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | -1414694282 | -1414694282 | 279973110 | -1040437880 | 1882775569 | -1414694282 | -566229850 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 | 806614668 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 | 1114339464 |
