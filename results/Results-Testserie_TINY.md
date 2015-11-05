<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[1\. Evaluation Overview, all Databases, Test Series TINY](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [ArangoDB](#ArangoDB) | [MongoDB](#MongoDB) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 19.92 ms | 101.54 ms | 251.00 ms | 200.22 ms | 4.63 ms | 1.08 ms | **0.00 ms** |
| Load |  | 333.77 ms | 275.47 ms | 485.82 ms | 730.97 ms | 634.28 ms | **120.36 ms** | 971.71 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 9.56 ms</font> |<font color="#C0C0C0"> **9.12 ms**</font> |<font color="#C0C0C0"> 15.74 ms</font> |<font color="#C0C0C0"> 15.43 ms</font> |<font color="#C0C0C0"> 18.56 ms</font> |<font color="#C0C0C0"> 172.37 ms</font> |<font color="#C0C0C0"> 216.21 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.45 ms | **0.14 ms** | 0.95 ms | 2.42 ms | 1.77 ms | 6.88 ms | 33.65 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.72 ms**</font> |<font color="#C0C0C0"> 6.49 ms</font> |<font color="#C0C0C0"> 30.24 ms</font> |<font color="#C0C0C0"> 10.79 ms</font> |<font color="#C0C0C0"> 6.71 ms</font> |<font color="#C0C0C0"> 12.79 ms</font> |<font color="#C0C0C0"> 75.56 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.84 ms | **0.39 ms** | 2.25 ms | 22.71 ms | 5.72 ms | 236.84 ms | 37.33 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **2.77 ms**</font> |<font color="#C0C0C0"> 8.02 ms</font> |<font color="#C0C0C0"> 28.29 ms</font> |<font color="#C0C0C0"> 13.18 ms</font> |<font color="#C0C0C0"> 8.40 ms</font> |<font color="#C0C0C0"> 25.06 ms</font> |<font color="#C0C0C0"> 141.25 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.35 ms | **1.87 ms** | 7.80 ms | 187.92 ms | 54.01 ms | 786.02 ms | 135.20 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.27 ms</font> |<font color="#C0C0C0"> 3.85 ms</font> |<font color="#C0C0C0"> 12.27 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.37 ms</font> |<font color="#C0C0C0"> 0.39 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.68 ms | **0.31 ms** | 1.20 ms | 2.70 ms | 5.41 ms | 0.51 ms | 23.15 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.46 ms</font> |<font color="#C0C0C0"> 4.20 ms</font> |<font color="#C0C0C0"> 25.93 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.13 ms</font> |<font color="#C0C0C0"> 0.69 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.58 ms | **0.33 ms** | 1.05 ms | 2.73 ms | 1.73 ms | 0.58 ms | 14.07 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.34 ms</font> |<font color="#C0C0C0"> 4.10 ms</font> |<font color="#C0C0C0"> 28.98 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.11 ms</font> |<font color="#C0C0C0"> 0.43 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.56 ms | **0.28 ms** | 0.97 ms | 2.60 ms | 1.60 ms | 0.67 ms | 16.23 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.44 ms</font> |<font color="#C0C0C0"> 5.26 ms</font> |<font color="#C0C0C0"> 28.23 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.27 ms</font> |<font color="#C0C0C0"> 0.44 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | **0.82 ms** | 1.77 ms | 1.32 ms | 20.77 ms | 2.01 ms | 2.79 ms | 23.43 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.42 ms</font> |<font color="#C0C0C0"> 7.29 ms</font> |<font color="#C0C0C0"> 28.90 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.35 ms</font> |<font color="#C0C0C0"> 0.39 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | **0.87 ms** | 2.06 ms | 1.34 ms | 13.98 ms | 1.94 ms | 2.83 ms | 13.70 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.45 ms</font> |<font color="#C0C0C0"> 7.08 ms</font> |<font color="#C0C0C0"> 28.22 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.18 ms</font> |<font color="#C0C0C0"> 0.29 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | **0.82 ms** | 1.84 ms | 1.51 ms | 13.76 ms | 1.70 ms | 3.31 ms | 10.48 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.41 ms</font> |<font color="#C0C0C0"> 6.12 ms</font> |<font color="#C0C0C0"> 13.70 ms</font> |<font color="#C0C0C0"> 26.47 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.04 ms</font> |<font color="#C0C0C0"> 0.41 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | **1.93 ms** | 3.19 ms | 2.50 ms | 3.04 ms | 3.73 ms | 227.69 ms | 136.03 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.43 ms</font> |<font color="#C0C0C0"> 1.75 ms</font> |<font color="#C0C0C0"> 11.35 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.02 ms</font> |<font color="#C0C0C0"> 0.49 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 17.13 ms | 16.12 ms | 13.92 ms | 51.25 ms | **11.93 ms** | 2371.48 ms | 855.27 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.59 ms</font> |<font color="#C0C0C0"> 1.70 ms</font> |<font color="#C0C0C0"> 30.19 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.33 ms</font> |<font color="#C0C0C0"> 0.69 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | **2.14 ms** | 3.35 ms | 3.02 ms | 14.53 ms | 3.24 ms | 231.32 ms | 301.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 216.96 ms</font> |<font color="#C0C0C0"> 219.92 ms</font> |<font color="#C0C0C0"> 35.88 ms</font> |<font color="#C0C0C0"> 118.35 ms</font> |<font color="#C0C0C0"> **0.81 ms**</font> |<font color="#C0C0C0"> 6.26 ms</font> |<font color="#C0C0C0"> 13.28 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.06 ms | **0.04 ms** | 0.74 ms | 5.17 ms | 2.72 ms | 0.22 ms | 9.18 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **1.35 ms**</font> |<font color="#C0C0C0"> 2.49 ms</font> |<font color="#C0C0C0"> 11.61 ms</font> |<font color="#C0C0C0"> 8.75 ms</font> |<font color="#C0C0C0"> 1.37 ms</font> |<font color="#C0C0C0"> 4.46 ms</font> |<font color="#C0C0C0"> 11.72 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | **0.06 ms** | 0.07 ms | 0.72 ms | 31.78 ms | 19.74 ms | 0.18 ms | 10.77 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.38 ms</font> |<font color="#C0C0C0"> 2.52 ms</font> |<font color="#C0C0C0"> 13.35 ms</font> |<font color="#C0C0C0"> 13.54 ms</font> |<font color="#C0C0C0"> 1.38 ms</font> |<font color="#C0C0C0"> **0.67 ms**</font> |<font color="#C0C0C0"> 9.81 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.09 ms | **0.06 ms** | 0.91 ms | 218.28 ms | 17.57 ms | 0.19 ms | 6.54 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.47 ms</font> |<font color="#C0C0C0"> 1.24 ms</font> |<font color="#C0C0C0"> 9.07 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.16 ms</font> |<font color="#C0C0C0"> 2.54 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **0.84 ms** | 1.06 ms | 34.24 ms | 49.43 ms | 9.70 ms | 176.44 ms | 189.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 4.94 ms</font> |<font color="#C0C0C0"> 14.10 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.65 ms</font> |<font color="#C0C0C0"> 1.31 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **0.69 ms** | 0.78 ms | 28.33 ms | 76.93 ms | 192.58 ms | 1.96 ms | 8.69 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.59 ms</font> |<font color="#C0C0C0"> 1.80 ms</font> |<font color="#C0C0C0"> 26.91 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 82.88 ms</font> |<font color="#C0C0C0"> 2.82 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **0.56 ms** | 0.91 ms | 134.75 ms | 232.24 ms | 16.61 ms | 888.77 ms | 394.62 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.67 ms</font> |<font color="#C0C0C0"> 1.63 ms</font> |<font color="#C0C0C0"> 10.46 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.49 ms</font> |<font color="#C0C0C0"> 0.92 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0.03 ms** | **0.03 ms** | 18.02 ms | 59.35 ms | 3.42 ms | 0.19 ms | 4.21 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.30 ms</font> |<font color="#C0C0C0"> 4.37 ms</font> |<font color="#C0C0C0"> 14.44 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.36 ms</font> |<font color="#C0C0C0"> 0.68 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.92 ms | 12.78 ms | 37.65 ms | 51.10 ms | **3.34 ms** | 26.65 ms | 38.77 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.50 ms</font> |<font color="#C0C0C0"> 6.31 ms</font> |<font color="#C0C0C0"> 14.39 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 2.34 ms</font> |<font color="#C0C0C0"> 18.51 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.01 ms | 1.05 ms | 1.52 ms | 10.21 ms | **0.62 ms** | 3.29 ms | 90.50 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.45 ms</font> |<font color="#C0C0C0"> 5.28 ms</font> |<font color="#C0C0C0"> 28.30 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.64 ms</font> |<font color="#C0C0C0"> 0.85 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.54 ms | 12.15 ms | **2.88 ms** | 5.31 ms | 6.96 ms | 458.68 ms | 5.41 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 2.97 ms</font> |<font color="#C0C0C0"> 29.22 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 21.94 ms</font> |<font color="#C0C0C0"> 0.81 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.08 ms | **0.05 ms** | 1.07 ms | 0.66 ms | 0.32 ms | 1.17 ms | 4.75 ms |

# <a name="toc"></a>[Table of contents](#toc)

1. [Evaluation Overview](#overview)
1. [Test Series Datasets](#testseriesinformation)
1. Evaluation Details
	1. [sqlite4java](#sqlite4java)
	1. [SQLite-Xerial](#SQLite-Xerial)
	1. [PostgreSQL](#PostgreSQL)
	1. [ArangoDB](#ArangoDB)
	1. [MongoDB](#MongoDB)
	1. [Virtuoso](#Virtuoso)
	1. [Fuseki](#Fuseki)
1. [Verify Results](#verifyresults)

## <a name="testseriesinformation"></a>[2\. Test Series Datasets](#testseriesinformation)

| Test Series TINY | Dataset Size |
| :-- | --: |
| hebis_1000_records | 0.077 MB |

## <a name="sqlite4java"></a>[3\.1\. Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series TINY](#sqlite4java)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 19.92 ms |
| Load || 333.77 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.56 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.15 ms | 0.45 ms | 0.12 ms | 1.15 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.72 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.76 ms | 0.84 ms | 0.47 ms | 0.76 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.77 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.90 ms | 2.35 ms | 2.09 ms | 2.90 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.27 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.98 ms | 0.68 ms | 0.55 ms | 0.98 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.46 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.59 ms | 0.58 ms | 0.57 ms | 0.59 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.34 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.56 ms | 0.56 ms | 0.55 ms | 0.56 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 0.86 ms | 0.82 ms | 0.81 ms | 0.86 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.42 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 0.85 ms | 0.87 ms | 0.85 ms | 0.90 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.45 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 0.84 ms | 0.82 ms | 0.82 ms | 0.84 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.41 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 1.97 ms | 1.93 ms | 1.88 ms | 1.97 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 18.60 ms | 17.13 ms | 18.16 ms | 18.60 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.59 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2.26 ms | 2.14 ms | 2.17 ms | 2.26 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">216.96 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.10 ms | 0.06 ms | 0.05 ms | 0.10 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.35 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.08 ms | 0.06 ms | 0.06 ms | 0.08 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.38 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.07 ms | 0.09 ms | 0.06 ms | 0.07 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.47 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.84 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.69 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.59 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.56 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.67 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.30 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.92 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.50 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.01 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.45 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.54 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.08 ms |

## <a name="SQLite-Xerial"></a>[3\.2\. Evaluation Details for SQLite-Xerial, Version 3.8.11, Test Series TINY](#SQLite-Xerial)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 101.54 ms |
| Load || 275.47 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.12 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.26 ms | 0.14 ms | 0.10 ms | 0.26 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.49 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.43 ms | 0.39 ms | 0.42 ms | 0.43 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.02 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 1.95 ms | 1.87 ms | 1.88 ms | 1.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.85 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.35 ms | 0.31 ms | 0.29 ms | 0.35 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.20 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.37 ms | 0.33 ms | 0.32 ms | 0.37 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.10 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.30 ms | 0.28 ms | 0.27 ms | 0.30 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.26 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.32 ms | 1.77 ms | 1.58 ms | 2.32 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.29 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.73 ms | 2.06 ms | 1.83 ms | 2.73 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.08 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.19 ms | 1.84 ms | 1.36 ms | 2.19 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.12 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.95 ms | 3.19 ms | 2.89 ms | 3.95 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.75 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 17.41 ms | 16.12 ms | 15.93 ms | 17.41 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.70 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.79 ms | 3.35 ms | 3.21 ms | 3.79 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">219.92 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.07 ms | 0.04 ms | 0.03 ms | 0.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.49 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.07 ms | 0.07 ms | 0.06 ms | 0.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.52 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.06 ms | 0.06 ms | 0.06 ms | 0.06 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.24 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.06 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.94 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.78 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.80 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.91 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.63 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.03 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.37 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 12.78 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.31 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.05 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.28 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 12.15 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.97 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.05 ms |

## <a name="PostgreSQL"></a>[3\.3\. Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series TINY](#PostgreSQL)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 251.00 ms |
| Load || 485.82 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.74 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.87 ms | 0.95 ms | 0.51 ms | 1.87 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">30.24 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 2.94 ms | 2.25 ms | 1.92 ms | 2.94 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.29 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 6.86 ms | 7.80 ms | 6.86 ms | 9.25 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.27 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2.25 ms | 1.20 ms | 0.73 ms | 2.25 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25.93 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 1.76 ms | 1.05 ms | 0.59 ms | 1.76 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.98 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.73 ms | 0.97 ms | 0.60 ms | 1.73 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.23 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.40 ms | 1.32 ms | 0.82 ms | 2.40 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.90 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.23 ms | 1.34 ms | 0.87 ms | 2.23 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.22 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.28 ms | 1.51 ms | 1.36 ms | 2.28 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.70 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.97 ms | 2.50 ms | 1.77 ms | 3.97 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.35 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.20 ms | 13.92 ms | 12.90 ms | 14.20 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">30.19 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.94 ms | 3.02 ms | 2.36 ms | 3.94 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">35.88 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 1.06 ms | 0.74 ms | 0.57 ms | 1.06 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.61 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 1.15 ms | 0.72 ms | 0.53 ms | 1.15 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.35 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1.09 ms | 0.91 ms | 0.88 ms | 1.09 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.07 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 34.24 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.10 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 28.33 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26.91 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 134.75 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.46 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 18.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.44 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 37.65 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">14.39 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.52 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">28.30 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2.88 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">29.22 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.07 ms |

## <a name="ArangoDB"></a>[3\.4\. Evaluation Details for ArangoDB, Version 2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8, Test Series TINY](#ArangoDB)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 200.22 ms |
| Load || 730.97 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15.43 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.71 ms | 2.42 ms | 2.34 ms | 2.71 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.79 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 23.89 ms | 22.71 ms | 23.89 ms | 24.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.18 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 183.76 ms | 187.92 ms | 181.98 ms | 183.76 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 2.48 ms | 2.70 ms | 2.48 ms | 2.64 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.90 ms | 2.73 ms | 2.69 ms | 2.90 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 2.70 ms | 2.60 ms | 2.42 ms | 2.70 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 29.01 ms | 20.77 ms | 20.96 ms | 29.01 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 14.21 ms | 13.98 ms | 13.73 ms | 14.21 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 13.01 ms | 13.76 ms | 13.01 ms | 13.91 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">26.47 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.58 ms | 3.04 ms | 2.61 ms | 3.58 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 57.40 ms | 51.25 ms | 52.81 ms | 57.40 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 15.36 ms | 14.53 ms | 12.94 ms | 15.36 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">118.35 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 6.98 ms | 5.17 ms | 4.18 ms | 6.98 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.75 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 32.42 ms | 31.78 ms | 32.42 ms | 34.28 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.54 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 219.63 ms | 218.28 ms | 219.63 ms | 222.51 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 49.43 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 76.93 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 232.24 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 59.35 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 51.10 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 10.21 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.31 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.66 ms |

## <a name="MongoDB"></a>[3\.5\. Evaluation Details for MongoDB, Version 3.0.6, Test Series TINY](#MongoDB)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 4.63 ms |
| Load || 634.28 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.56 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 3.89 ms | 1.77 ms | 0.79 ms | 3.89 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.71 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 5.73 ms | 5.72 ms | 5.73 ms | 5.79 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8.40 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 57.92 ms | 54.01 ms | 52.36 ms | 57.92 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 13.25 ms | 5.41 ms | 1.67 ms | 13.25 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 2.07 ms | 1.73 ms | 1.56 ms | 2.07 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1.88 ms | 1.60 ms | 1.40 ms | 1.88 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.36 ms | 2.01 ms | 2.01 ms | 2.36 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.10 ms | 1.94 ms | 1.99 ms | 2.10 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1.90 ms | 1.70 ms | 1.62 ms | 1.90 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3.63 ms | 3.73 ms | 2.93 ms | 3.63 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 14.90 ms | 11.93 ms | 10.67 ms | 14.90 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 3.48 ms | 3.24 ms | 3.14 ms | 3.48 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.81 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 3.75 ms | 2.72 ms | 2.24 ms | 3.75 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.37 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 20.78 ms | 19.74 ms | 19.94 ms | 20.78 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.38 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 17.77 ms | 17.57 ms | 17.22 ms | 17.77 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 9.70 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 192.58 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 16.61 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 3.42 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 3.34 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 0.62 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6.96 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 0.32 ms |

## <a name="Virtuoso"></a>[3\.6\. Evaluation Details for Virtuoso, Version 07.20.3214 / Virtuoso JDBC 4.1, Test Series TINY](#Virtuoso)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 1.08 ms |
| Load || 120.36 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">172.37 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 8.09 ms | 6.88 ms | 6.62 ms | 8.09 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12.79 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 236.19 ms | 236.84 ms | 236.19 ms | 239.43 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25.06 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 764.02 ms | 786.02 ms | 764.02 ms | 793.14 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.37 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 0.67 ms | 0.51 ms | 0.42 ms | 0.67 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.13 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 0.55 ms | 0.58 ms | 0.55 ms | 0.62 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.11 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 0.63 ms | 0.67 ms | 0.63 ms | 0.81 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.27 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 2.85 ms | 2.79 ms | 2.70 ms | 2.85 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.35 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2.98 ms | 2.83 ms | 2.73 ms | 2.98 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.18 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2.98 ms | 3.31 ms | 2.98 ms | 3.71 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.04 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 237.91 ms | 227.69 ms | 223.84 ms | 237.91 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.02 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 2079.13 ms | 2371.48 ms | 2079.13 ms | 2467.11 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.33 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 216.04 ms | 231.32 ms | 216.04 ms | 239.07 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.26 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.25 ms | 0.22 ms | 0.18 ms | 0.25 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.46 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.17 ms | 0.18 ms | 0.17 ms | 0.19 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.67 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 0.19 ms | 0.19 ms | 0.18 ms | 0.19 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.16 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 176.44 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.65 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.96 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">82.88 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 888.77 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.49 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.19 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.36 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 26.65 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.34 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3.29 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.64 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 458.68 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">21.94 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 1.17 ms |

## <a name="Fuseki"></a>[3\.7\. Evaluation Details for Fuseki, Version 2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0, Test Series TINY](#Fuseki)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 0.00 ms |
| Load || 971.71 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">216.21 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 65.10 ms | 33.65 ms | 17.48 ms | 65.10 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">75.56 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 44.84 ms | 37.33 ms | 34.74 ms | 44.84 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">141.25 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 162.75 ms | 135.20 ms | 125.37 ms | 162.75 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.39 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 41.38 ms | 23.15 ms | 11.00 ms | 41.38 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.69 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 15.20 ms | 14.07 ms | 11.22 ms | 15.20 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.43 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 18.76 ms | 16.23 ms | 13.58 ms | 18.76 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.44 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 38.95 ms | 23.43 ms | 17.48 ms | 38.95 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.39 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 14.70 ms | 13.70 ms | 13.86 ms | 14.70 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.29 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 7.80 ms | 10.48 ms | 7.80 ms | 12.48 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.41 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 148.80 ms | 136.03 ms | 128.50 ms | 148.80 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.49 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 850.35 ms | 855.27 ms | 850.35 ms | 861.51 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.69 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 359.10 ms | 301.07 ms | 257.75 ms | 359.10 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">13.28 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 10.49 ms | 9.18 ms | 10.27 ms | 10.49 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11.72 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 12.40 ms | 10.77 ms | 8.90 ms | 12.40 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.81 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6.04 ms | 6.54 ms | 6.04 ms | 6.71 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.54 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 189.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.31 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 8.69 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.82 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 394.62 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.92 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 4.21 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.68 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 38.77 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18.51 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 90.50 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.85 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.41 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.81 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 4.75 ms |

## <a name="verifyresults"></a>[4\. Verify Results](#verifyresults)

| QueryScenario | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [ArangoDB](#ArangoDB) | [MongoDB](#MongoDB) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) |
| :-- | --: | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 1291335309 | 1291335309 | 696172438 | 1291335309 | 1291335309 | -1669804462 | 543801534 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | 894969114 | 894969114 | 1931942411 | -2146674226 | -2146674226 | -1867873114 | -679061818 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | -944038863 | -944038863 | -237656551 | 1495646040 | -790618035 | 704772201 | 1337378817 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -583528932 | -583528932 | 124139519 | 1694017191 | -583528932 | -583528932 | -583528932 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 331781894 | 331781894 | -1835067710 | 460024787 | -1726131793 | -1726131793 | -1726131793 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | 331781894 | 331781894 | -1835067710 | 460024787 | -1726131793 | -1726131793 | -1726131793 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 885971142 | 885971142 | 885971142 | 885971142 | 885971142 | 885971142 | 885971142 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | 1673687082 | 1673687082 | 1673687082 | -1419295611 | -1353318678 | -1353318678 | -1353318678 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | 1673687082 | 1673687082 | 1673687082 | -1419295611 | -1353318678 | -1353318678 | -1353318678 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -1583568449 | -1583568449 | -466729887 | -1848843333 | -1583568449 | -2016518976 | 2090037817 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | 886395747 | 886395747 | 1599237693 | 1118524369 | 277492019 | -1085916089 | -1500397730 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 263637080 | 263637080 | -1980546440 | 1994626286 | 263637080 | -905046715 | -579556442 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 | 179249547 |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 | 1799785752 |
