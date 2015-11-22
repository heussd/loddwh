<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[Evaluation Overview, all Databases, Test Series TINY](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) | [MongoDB](#MongoDB) | [ArangoDB](#ArangoDB) |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 19.21 ms | 95.77 ms | 257.17 ms | 0.94 ms | **0.00 ms** | 5.88 ms | 206.65 ms |
| Load |  | 329.39 ms | 266.72 ms | 500.93 ms | **121.22 ms** | 1061.05 ms | 580.58 ms | 726.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **6.24 ms**</font> |<font color="#C0C0C0"> 7.66 ms</font> |<font color="#C0C0C0"> 15.99 ms</font> |<font color="#C0C0C0"> 101.60 ms</font> |<font color="#C0C0C0"> 234.38 ms</font> |<font color="#C0C0C0"> 15.66 ms</font> |<font color="#C0C0C0"> 18.10 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.38 ms | **0.23 ms** | 1.02 ms | 63.13 ms | 34.00 ms | 0.82 ms | 2.80 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.59 ms**</font> |<font color="#C0C0C0"> 6.90 ms</font> |<font color="#C0C0C0"> 30.35 ms</font> |<font color="#C0C0C0"> 6.08 ms</font> |<font color="#C0C0C0"> 87.40 ms</font> |<font color="#C0C0C0"> 6.68 ms</font> |<font color="#C0C0C0"> 9.96 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.10 ms | **0.47 ms** | 2.53 ms | 167.30 ms | 38.52 ms | 6.15 ms | 22.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **2.31 ms**</font> |<font color="#C0C0C0"> 7.20 ms</font> |<font color="#C0C0C0"> 28.53 ms</font> |<font color="#C0C0C0"> 12.82 ms</font> |<font color="#C0C0C0"> 149.42 ms</font> |<font color="#C0C0C0"> 8.13 ms</font> |<font color="#C0C0C0"> 13.81 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.68 ms | **2.05 ms** | 5.19 ms | 358.24 ms | 133.77 ms | 55.90 ms | 173.48 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 4.12 ms</font> |<font color="#C0C0C0"> 13.05 ms</font> |<font color="#C0C0C0"> 2.13 ms</font> |<font color="#C0C0C0"> 1.09 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.68 ms | **0.28 ms** | 0.99 ms | 0.46 ms | 28.55 ms | 4.75 ms | 2.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> 3.92 ms</font> |<font color="#C0C0C0"> 27.86 ms</font> |<font color="#C0C0C0"> 1.39 ms</font> |<font color="#C0C0C0"> 0.64 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.62 ms | **0.31 ms** | 1.39 ms | 0.59 ms | 12.56 ms | 1.95 ms | 2.47 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 4.00 ms</font> |<font color="#C0C0C0"> 23.87 ms</font> |<font color="#C0C0C0"> 1.66 ms</font> |<font color="#C0C0C0"> 0.71 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.62 ms | **0.28 ms** | 0.93 ms | 0.62 ms | 13.50 ms | 1.86 ms | 2.29 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.95 ms</font> |<font color="#C0C0C0"> 6.76 ms</font> |<font color="#C0C0C0"> 27.34 ms</font> |<font color="#C0C0C0"> 1.79 ms</font> |<font color="#C0C0C0"> 0.71 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **0.89 ms** | 1.70 ms | 1.17 ms | 2.87 ms | 19.63 ms | 1.85 ms | 21.49 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.62 ms</font> |<font color="#C0C0C0"> 5.74 ms</font> |<font color="#C0C0C0"> 28.94 ms</font> |<font color="#C0C0C0"> 1.56 ms</font> |<font color="#C0C0C0"> 0.62 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **0.91 ms** | 1.55 ms | 1.22 ms | 2.88 ms | 14.80 ms | 1.84 ms | 12.92 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.57 ms</font> |<font color="#C0C0C0"> 5.77 ms</font> |<font color="#C0C0C0"> 28.31 ms</font> |<font color="#C0C0C0"> 1.74 ms</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **0.96 ms** | 1.55 ms | 1.34 ms | 2.84 ms | 11.95 ms | 1.84 ms | 13.95 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 4.54 ms</font> |<font color="#C0C0C0"> 12.11 ms</font> |<font color="#C0C0C0"> 6.96 ms</font> |<font color="#C0C0C0"> 2.18 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 45.35 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **2.29 ms** | 2.89 ms | 2.45 ms | 231.78 ms | 133.41 ms | 2.97 ms | 3.39 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.57 ms</font> |<font color="#C0C0C0"> 1.82 ms</font> |<font color="#C0C0C0"> 11.78 ms</font> |<font color="#C0C0C0"> 8.22 ms</font> |<font color="#C0C0C0"> 1.60 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 15.26 ms | 16.23 ms | 14.46 ms | 1962.31 ms | 757.57 ms | **8.54 ms** | 47.13 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.65 ms</font> |<font color="#C0C0C0"> 1.68 ms</font> |<font color="#C0C0C0"> 28.68 ms</font> |<font color="#C0C0C0"> 7.66 ms</font> |<font color="#C0C0C0"> 1.34 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2.25 ms** | 3.36 ms | 2.45 ms | 231.65 ms | 288.08 ms | 3.15 ms | 13.36 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 209.98 ms</font> |<font color="#C0C0C0"> 186.85 ms</font> |<font color="#C0C0C0"> 42.63 ms</font> |<font color="#C0C0C0"> 3.20 ms</font> |<font color="#C0C0C0"> 13.00 ms</font> |<font color="#C0C0C0"> **0.80 ms**</font> |<font color="#C0C0C0"> 121.40 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.10 ms | **0.09 ms** | 0.80 ms | 0.72 ms | 7.91 ms | 2.78 ms | 4.97 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.55 ms</font> |<font color="#C0C0C0"> 2.45 ms</font> |<font color="#C0C0C0"> 11.49 ms</font> |<font color="#C0C0C0"> 1.83 ms</font> |<font color="#C0C0C0"> 10.83 ms</font> |<font color="#C0C0C0"> **1.32 ms**</font> |<font color="#C0C0C0"> 8.11 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | **0.10 ms** | 0.12 ms | 0.72 ms | 1.13 ms | 8.35 ms | 19.65 ms | 31.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.05 ms**</font> |<font color="#C0C0C0"> 2.28 ms</font> |<font color="#C0C0C0"> 11.94 ms</font> |<font color="#C0C0C0"> 1.82 ms</font> |<font color="#C0C0C0"> 10.88 ms</font> |<font color="#C0C0C0"> 1.25 ms</font> |<font color="#C0C0C0"> 11.50 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | **0.10 ms** | 0.12 ms | 0.96 ms | 1.12 ms | 6.82 ms | 17.61 ms | 212.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.56 ms</font> |<font color="#C0C0C0"> 1.21 ms</font> |<font color="#C0C0C0"> 8.94 ms</font> |<font color="#C0C0C0"> 1.55 ms</font> |<font color="#C0C0C0"> 3.16 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.95 ms | **0.83 ms** | 32.83 ms | 158.15 ms | 236.66 ms | 10.27 ms | 53.24 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.66 ms</font> |<font color="#C0C0C0"> 4.21 ms</font> |<font color="#C0C0C0"> 14.26 ms</font> |<font color="#C0C0C0"> 2.69 ms</font> |<font color="#C0C0C0"> 1.22 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 7.52 ms | 8.60 ms | 27.75 ms | **2.17 ms** | 7.66 ms | 187.42 ms | 66.43 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.90 ms</font> |<font color="#C0C0C0"> 1.69 ms</font> |<font color="#C0C0C0"> 26.15 ms</font> |<font color="#C0C0C0"> 5.73 ms</font> |<font color="#C0C0C0"> 3.11 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **12.17 ms** | 16.79 ms | 135.54 ms | 1010.09 ms | 368.64 ms | 17.36 ms | 234.75 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.18 ms</font> |<font color="#C0C0C0"> 1.85 ms</font> |<font color="#C0C0C0"> 10.30 ms</font> |<font color="#C0C0C0"> 2.20 ms</font> |<font color="#C0C0C0"> 1.04 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 4.43 ms | 7.41 ms | 16.27 ms | **0.21 ms** | 5.33 ms | 3.38 ms | 58.49 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.49 ms</font> |<font color="#C0C0C0"> 4.54 ms</font> |<font color="#C0C0C0"> 15.56 ms</font> |<font color="#C0C0C0"> 1.31 ms</font> |<font color="#C0C0C0"> 0.99 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.32 ms | 9.39 ms | 40.54 ms | 20.29 ms | 33.38 ms | **3.30 ms** | 57.54 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 4.12 ms</font> |<font color="#C0C0C0"> 15.46 ms</font> |<font color="#C0C0C0"> 1.67 ms</font> |<font color="#C0C0C0"> 23.21 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.00 ms | 0.78 ms | 2.04 ms | 2.08 ms | 73.33 ms | **0.58 ms** | 9.66 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.34 ms</font> |<font color="#C0C0C0"> 4.05 ms</font> |<font color="#C0C0C0"> 29.06 ms</font> |<font color="#C0C0C0"> 1.56 ms</font> |<font color="#C0C0C0"> 1.24 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **2.56 ms** | 5.32 ms | 2.73 ms | 512.00 ms | 5.31 ms | 5.45 ms | 4.21 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.31 ms</font> |<font color="#C0C0C0"> 2.50 ms</font> |<font color="#C0C0C0"> 27.70 ms</font> |<font color="#C0C0C0"> 27.79 ms</font> |<font color="#C0C0C0"> 0.72 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.06 ms | **0.04 ms** | 1.28 ms | 2.14 ms | 3.67 ms | 0.26 ms | 0.69 ms |

# <a name="toc"></a>[Table of contents](#toc)

- [Evaluation Overview](#overview)
- [Test Series Datasets](#testseriesinformation)
- Evaluation Details
    - [sqlite4java](#sqlite4java)
    - [SQLite-Xerial](#SQLite-Xerial)
    - [PostgreSQL](#PostgreSQL)
    - [Virtuoso](#Virtuoso)
    - [Fuseki](#Fuseki)
    - [MongoDB](#MongoDB)
    - [ArangoDB](#ArangoDB)

## <a name="testseriesinformation"></a>[Test Series Datasets](#testseriesinformation)

| Test Series TINY | Dataset Size |
| :-- | --: |
| hebis_1000_records | 0.077 MB |

## <a name="sqlite4java"></a>[Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series TINY](#sqlite4java)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 19.21 ms |
| Load || 329.39 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.24 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 3.77 ms | 0.19 ms | 0.16 ms | 1.38 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.59 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.85 ms | 0.72 ms | 1.75 ms | 1.10 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.31 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.07 ms | 2.55 ms | 2.43 ms | 2.68 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.89 ms | 0.60 ms | 0.55 ms | 0.68 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.66 ms | 0.63 ms | 0.59 ms | 0.62 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.64 ms | 0.61 ms | 0.62 ms | 0.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.95 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 0.94 ms | 0.87 ms | 0.88 ms | 0.89 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.62 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 0.93 ms | 0.91 ms | 0.90 ms | 0.91 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.57 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 0.94 ms | 0.86 ms | 1.07 ms | 0.96 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2.50 ms | 2.29 ms | 2.09 ms | 2.29 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.57 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 17.67 ms | 14.48 ms | 13.62 ms | 15.26 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.65 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2.49 ms | 2.18 ms | 2.09 ms | 2.25 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">209.98 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.10 ms | 0.09 ms | 0.11 ms | 0.10 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.55 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.11 ms | 0.10 ms | 0.10 ms | 0.10 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.05 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.11 ms | 0.10 ms | 0.10 ms | 0.10 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.56 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.95 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.66 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 7.52 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.90 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 12.17 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.18 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 4.43 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.49 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.32 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.00 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.34 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.56 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.31 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.06 ms |

## <a name="SQLite-Xerial"></a>[Evaluation Details for SQLite-Xerial, Version 3.8.11, Test Series TINY](#SQLite-Xerial)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 95.77 ms |
| Load || 266.72 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.66 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.41 ms | 0.15 ms | 0.14 ms | 0.23 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.90 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.52 ms | 0.51 ms | 0.38 ms | 0.47 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.20 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.03 ms | 2.03 ms | 2.08 ms | 2.05 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.12 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.31 ms | 0.27 ms | 0.27 ms | 0.28 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.92 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.34 ms | 0.31 ms | 0.30 ms | 0.31 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.30 ms | 0.27 ms | 0.26 ms | 0.28 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.76 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.20 ms | 1.47 ms | 1.42 ms | 1.70 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.74 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.03 ms | 1.36 ms | 1.26 ms | 1.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.77 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.01 ms | 1.38 ms | 1.26 ms | 1.55 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.54 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.24 ms | 2.61 ms | 2.80 ms | 2.89 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.82 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 15.93 ms | 15.55 ms | 17.21 ms | 16.23 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.68 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.94 ms | 2.95 ms | 3.20 ms | 3.36 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">186.85 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.10 ms | 0.09 ms | 0.08 ms | 0.09 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.45 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.13 ms | 0.12 ms | 0.12 ms | 0.12 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.28 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.12 ms | 0.12 ms | 0.11 ms | 0.12 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.21 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.21 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 8.60 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.69 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 16.79 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.85 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 7.41 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.54 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 9.39 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.12 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.78 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.05 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.32 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.50 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.04 ms |

## <a name="PostgreSQL"></a>[Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series TINY](#PostgreSQL)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 257.17 ms |
| Load || 500.93 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.99 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.95 ms | 0.59 ms | 0.51 ms | 1.02 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">30.35 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 3.97 ms | 2.05 ms | 1.55 ms | 2.53 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.53 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 6.95 ms | 4.09 ms | 4.53 ms | 5.19 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.05 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1.84 ms | 0.62 ms | 0.51 ms | 0.99 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.86 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.43 ms | 0.98 ms | 0.77 ms | 1.39 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">23.87 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.63 ms | 0.59 ms | 0.57 ms | 0.93 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.34 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.07 ms | 0.75 ms | 0.69 ms | 1.17 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.94 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.10 ms | 0.74 ms | 0.80 ms | 1.22 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.31 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.04 ms | 0.91 ms | 1.06 ms | 1.34 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.11 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.81 ms | 1.80 ms | 1.75 ms | 2.45 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.78 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.45 ms | 14.44 ms | 14.51 ms | 14.46 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.68 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.82 ms | 1.82 ms | 1.71 ms | 2.45 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">42.63 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.94 ms | 0.80 ms | 0.65 ms | 0.80 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.49 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 1.05 ms | 0.60 ms | 0.50 ms | 0.72 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.94 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1.17 ms | 0.84 ms | 0.87 ms | 0.96 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.94 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 32.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.26 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 27.75 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26.15 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 135.54 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.30 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 16.27 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.56 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 40.54 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.46 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2.04 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">29.06 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.73 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.70 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.28 ms |

## <a name="Virtuoso"></a>[Evaluation Details for Virtuoso, Version 07.20.3214 / Virtuoso JDBC 4.1, Test Series TINY](#Virtuoso)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 0.94 ms |
| Load || 121.22 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">101.60 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 181.26 ms | 4.33 ms | 3.82 ms | 63.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.08 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 165.51 ms | 154.80 ms | 181.59 ms | 167.30 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.82 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 378.78 ms | 350.67 ms | 345.26 ms | 358.24 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.13 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.57 ms | 0.42 ms | 0.37 ms | 0.46 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.39 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.59 ms | 0.62 ms | 0.57 ms | 0.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.66 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.66 ms | 0.61 ms | 0.59 ms | 0.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.79 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.84 ms | 3.07 ms | 2.71 ms | 2.87 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.56 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 3.02 ms | 2.86 ms | 2.77 ms | 2.88 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.74 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.96 ms | 2.77 ms | 2.78 ms | 2.84 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.96 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 231.79 ms | 238.46 ms | 225.08 ms | 231.78 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.22 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1961.22 ms | 1948.46 ms | 1977.24 ms | 1962.31 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.66 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 222.93 ms | 206.68 ms | 265.33 ms | 231.65 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.20 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 1.42 ms | 0.38 ms | 0.36 ms | 0.72 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.83 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 2.68 ms | 0.34 ms | 0.38 ms | 1.13 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.82 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 2.66 ms | 0.36 ms | 0.34 ms | 1.12 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.55 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 158.15 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.69 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 2.17 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.73 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1010.09 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.20 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.21 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.31 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 20.29 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.67 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2.08 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.56 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 512.00 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">27.79 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 2.14 ms |

## <a name="Fuseki"></a>[Evaluation Details for Fuseki, Version 2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0, Test Series TINY](#Fuseki)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 0.00 ms |
| Load || 1061.05 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">234.38 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 65.55 ms | 18.27 ms | 18.20 ms | 34.00 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">87.40 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 45.87 ms | 35.32 ms | 34.36 ms | 38.52 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">149.42 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 156.12 ms | 124.47 ms | 120.72 ms | 133.77 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.09 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 62.18 ms | 12.84 ms | 10.64 ms | 28.55 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.64 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 11.91 ms | 10.78 ms | 15.00 ms | 12.56 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.71 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 16.92 ms | 10.11 ms | 13.48 ms | 13.50 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.71 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 23.03 ms | 17.83 ms | 18.01 ms | 19.63 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.62 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 12.77 ms | 21.76 ms | 9.86 ms | 14.80 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 9.11 ms | 11.06 ms | 15.68 ms | 11.95 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.18 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 168.15 ms | 131.36 ms | 100.71 ms | 133.41 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.60 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 880.06 ms | 656.41 ms | 736.24 ms | 757.57 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.34 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 292.72 ms | 295.55 ms | 275.96 ms | 288.08 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.00 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 9.48 ms | 7.44 ms | 6.81 ms | 7.91 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.83 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 8.14 ms | 8.80 ms | 8.10 ms | 8.35 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.88 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6.79 ms | 7.08 ms | 6.58 ms | 6.82 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.16 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 236.66 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.22 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 7.66 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.11 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 368.64 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.04 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 5.33 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.99 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 33.38 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">23.21 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 73.33 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.24 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.31 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.72 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.67 ms |

## <a name="MongoDB"></a>[Evaluation Details for MongoDB, Version 3.0.6, Test Series TINY](#MongoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 5.88 ms |
| Load || 580.58 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.66 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.20 ms | 0.65 ms | 0.62 ms | 0.82 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.68 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 6.45 ms | 6.00 ms | 6.00 ms | 6.15 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.13 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 61.39 ms | 52.48 ms | 53.83 ms | 55.90 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 11.66 ms | 1.22 ms | 1.37 ms | 4.75 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.32 ms | 1.93 ms | 1.60 ms | 1.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.49 ms | 1.40 ms | 1.70 ms | 1.86 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.19 ms | 1.80 ms | 1.58 ms | 1.85 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.11 ms | 1.60 ms | 1.81 ms | 1.84 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.15 ms | 1.62 ms | 1.74 ms | 1.84 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.36 ms | 2.78 ms | 2.78 ms | 2.97 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 10.48 ms | 7.52 ms | 7.62 ms | 8.54 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.51 ms | 2.98 ms | 2.97 ms | 3.15 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.80 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 4.03 ms | 2.34 ms | 1.97 ms | 2.78 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.32 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 22.19 ms | 18.74 ms | 18.02 ms | 19.65 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.25 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 17.41 ms | 17.69 ms | 17.73 ms | 17.61 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 10.27 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 187.42 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 17.36 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.38 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.30 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.58 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.45 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.26 ms |

## <a name="ArangoDB"></a>[Evaluation Details for ArangoDB, Version 2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8, Test Series TINY](#ArangoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | 
| :-- | :-- | --: | --: | --: | --: |
| Set up || 206.65 ms |
| Load || 726.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.10 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 3.36 ms | 2.66 ms | 2.39 ms | 2.80 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.96 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 22.44 ms | 23.33 ms | 20.61 ms | 22.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.81 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 179.61 ms | 170.19 ms | 170.65 ms | 173.48 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2.47 ms | 2.40 ms | 2.17 ms | 2.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.69 ms | 2.39 ms | 2.33 ms | 2.47 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.29 ms | 2.25 ms | 2.32 ms | 2.29 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 31.67 ms | 17.44 ms | 15.35 ms | 21.49 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 12.07 ms | 13.90 ms | 12.79 ms | 12.92 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 15.40 ms | 13.65 ms | 12.81 ms | 13.95 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">45.35 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4.10 ms | 3.19 ms | 2.86 ms | 3.39 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 54.89 ms | 43.66 ms | 42.85 ms | 47.13 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 14.64 ms | 13.03 ms | 12.42 ms | 13.36 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">121.40 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 6.48 ms | 4.56 ms | 3.87 ms | 4.97 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.11 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 32.09 ms | 31.94 ms | 29.12 ms | 31.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.50 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 218.05 ms | 213.27 ms | 206.68 ms | 212.67 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 53.24 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 66.43 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 234.75 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 58.49 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 57.54 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 9.66 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4.21 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.69 ms |
