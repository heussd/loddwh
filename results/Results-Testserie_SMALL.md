<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[1\. Evaluation Overview, all Databases, Test Series SMALL](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [ArangoDB](#ArangoDB) | [MongoDB](#MongoDB) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) |
| :-- | :-- | --: | --: | --: | --: | --: | --: | --: |
| Set up |  | 21.56 ms | 74.34 ms | 246.76 ms | 231.04 ms | 3.83 ms | 1.37 ms | **0.00 ms** |
| Load |  | 20849.12 ms | 19345.09 ms | 27159.76 ms | 42961.93 ms | 31103.94 ms | **7798.13 ms** | 30028.31 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 353.43 ms</font> |<font color="#C0C0C0"> 360.99 ms</font> |<font color="#C0C0C0"> **204.45 ms**</font> |<font color="#C0C0C0"> 1736.13 ms</font> |<font color="#C0C0C0"> 614.16 ms</font> |<font color="#C0C0C0"> 2002.52 ms</font> |<font color="#C0C0C0"> 2913.98 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.38 ms | **0.14 ms** | 1.29 ms | 133.07 ms | 42.11 ms | 271.76 ms | 29.25 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 182.63 ms</font> |<font color="#C0C0C0"> 454.08 ms</font> |<font color="#C0C0C0"> 196.94 ms</font> |<font color="#C0C0C0"> 1709.74 ms</font> |<font color="#C0C0C0"> 525.35 ms</font> |<font color="#C0C0C0"> **154.45 ms**</font> |<font color="#C0C0C0"> 2373.82 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.18 ms | **0.47 ms** | 1.44 ms | 1465.11 ms | 409.23 ms | 4453.55 ms | 44.80 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 198.90 ms</font> |<font color="#C0C0C0"> 469.54 ms</font> |<font color="#C0C0C0"> 202.50 ms</font> |<font color="#C0C0C0"> 1939.03 ms</font> |<font color="#C0C0C0"> 532.01 ms</font> |<font color="#C0C0C0"> **180.35 ms**</font> |<font color="#C0C0C0"> 2680.30 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.43 ms | **2.05 ms** | 3.88 ms | 14364.12 ms | 4132.37 ms | 39474.63 ms | 134.98 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.21 ms</font> |<font color="#C0C0C0"> 204.64 ms</font> |<font color="#C0C0C0"> 92.88 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.51 ms</font> |<font color="#C0C0C0"> 0.54 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 144.11 ms | 31.55 ms | 52.07 ms | 149.97 ms | 84.51 ms | **21.84 ms** | 151.47 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 228.76 ms</font> |<font color="#C0C0C0"> 97.19 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.31 ms</font> |<font color="#C0C0C0"> 0.48 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 146.79 ms | 36.38 ms | 44.58 ms | 158.12 ms | 83.55 ms | **25.41 ms** | 95.40 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.55 ms</font> |<font color="#C0C0C0"> 237.02 ms</font> |<font color="#C0C0C0"> 103.40 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.36 ms</font> |<font color="#C0C0C0"> 0.38 ms</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 154.48 ms | **47.66 ms** | 56.50 ms | 318.55 ms | 109.42 ms | 112.43 ms | 408.97 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.72 ms</font> |<font color="#C0C0C0"> 429.58 ms</font> |<font color="#C0C0C0"> 245.67 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.36 ms</font> |<font color="#C0C0C0"> 0.36 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 168.23 ms | 264.40 ms | **58.98 ms** | 364.87 ms | 116.41 ms | 261.79 ms | 165.84 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.58 ms</font> |<font color="#C0C0C0"> 453.85 ms</font> |<font color="#C0C0C0"> 263.86 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.34 ms</font> |<font color="#C0C0C0"> 0.40 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 168.51 ms | 247.89 ms | **51.86 ms** | 378.55 ms | 116.18 ms | 250.12 ms | 122.57 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.57 ms</font> |<font color="#C0C0C0"> 471.32 ms</font> |<font color="#C0C0C0"> 249.04 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.42 ms</font> |<font color="#C0C0C0"> 0.39 ms</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 182.58 ms | 272.27 ms | **53.95 ms** | 381.14 ms | 114.40 ms | 246.36 ms | 132.98 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.69 ms</font> |<font color="#C0C0C0"> 436.95 ms</font> |<font color="#C0C0C0"> 188.55 ms</font> |<font color="#C0C0C0"> 1510.34 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.13 ms</font> |<font color="#C0C0C0"> 0.33 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 248.58 ms | 311.39 ms | **139.14 ms** | 158.06 ms | 236.37 ms | 15792.11 ms | 7171.26 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.56 ms</font> |<font color="#C0C0C0"> 2.38 ms</font> |<font color="#C0C0C0"> 125.66 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.62 ms</font> |<font color="#C0C0C0"> Error</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1178.36 ms | 1284.46 ms | 1181.40 ms | 3352.16 ms | **546.13 ms** | 3.07E5 ms | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.87 ms</font> |<font color="#C0C0C0"> 2.26 ms</font> |<font color="#C0C0C0"> 299.31 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 7.65 ms</font> |<font color="#C0C0C0"> 0.61 ms</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 303.15 ms | 344.34 ms | **136.66 ms** | 713.34 ms | 268.44 ms | 15488.42 ms | 4.38E5 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 18315.80 ms</font> |<font color="#C0C0C0"> 18350.46 ms</font> |<font color="#C0C0C0"> 202.51 ms</font> |<font color="#C0C0C0"> 19536.94 ms</font> |<font color="#C0C0C0"> **78.87 ms**</font> |<font color="#C0C0C0"> 82.35 ms</font> |<font color="#C0C0C0"> 18662.59 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | **0.15 ms** | 0.17 ms | 8.59 ms | 74.79 ms | 287.32 ms | 6.40 ms | 2457.82 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 88.01 ms</font> |<font color="#C0C0C0"> 92.41 ms</font> |<font color="#C0C0C0"> 72.38 ms</font> |<font color="#C0C0C0"> 993.71 ms</font> |<font color="#C0C0C0"> 81.16 ms</font> |<font color="#C0C0C0"> **39.19 ms**</font> |<font color="#C0C0C0"> 11960.95 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.48 ms | **0.45 ms** | 6.29 ms | 698.38 ms | 3385.69 ms | 0.48 ms | 25.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 90.52 ms</font> |<font color="#C0C0C0"> 94.58 ms</font> |<font color="#C0C0C0"> 76.19 ms</font> |<font color="#C0C0C0"> 1720.48 ms</font> |<font color="#C0C0C0"> 88.97 ms</font> |<font color="#C0C0C0"> **63.04 ms**</font> |<font color="#C0C0C0"> 11444.82 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 15.84 ms | 11.47 ms | 7.13 ms | 6961.73 ms | 44399.59 ms | **6.22 ms** | 1508.94 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.85 ms</font> |<font color="#C0C0C0"> 2.78 ms</font> |<font color="#C0C0C0"> 9.22 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.23 ms</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | **1.48 ms** | 2.39 ms | 819.81 ms | 7020.43 ms | 620.83 ms | 18972.43 ms | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.52 ms</font> |<font color="#C0C0C0"> 213.42 ms</font> |<font color="#C0C0C0"> 165.57 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 199.03 ms</font> |<font color="#C0C0C0"> 1.12 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 2.22 ms | **0.83 ms** | 5096.88 ms | 6941.50 ms | 9929.10 ms | 602.48 ms | 9026.97 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.54 ms</font> |<font color="#C0C0C0"> 1.23 ms</font> |<font color="#C0C0C0"> 205.61 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 5.07 ms</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.59 ms | **0.59 ms** | 15138.06 ms | 29271.22 ms | 2426.79 ms | 1.08E5 ms | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.61 ms</font> |<font color="#C0C0C0"> 1.22 ms</font> |<font color="#C0C0C0"> 9.89 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1.17 ms</font> |<font color="#C0C0C0"> Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | **0.02 ms** | **0.02 ms** | 21.20 ms | 5863.15 ms | 483.13 ms | 0.17 ms | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.26 ms</font> |<font color="#C0C0C0"> 171.27 ms</font> |<font color="#C0C0C0"> 196.70 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.99 ms</font> |<font color="#C0C0C0"> Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 844.94 ms | 1211.39 ms | 2350.89 ms | 6793.59 ms | **409.18 ms** | 4461.88 ms | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.63 ms</font> |<font color="#C0C0C0"> 228.54 ms</font> |<font color="#C0C0C0"> 199.73 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 0.01 ms</font> |<font color="#C0C0C0"> 1.66 ms</font> |<font color="#C0C0C0"> 19.82 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 115.88 ms | **36.50 ms** | 95.77 ms | 1065.73 ms | 58.78 ms | 413.01 ms | 1.70E5 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.48 ms</font> |<font color="#C0C0C0"> 227.60 ms</font> |<font color="#C0C0C0"> 181.72 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> Error</font> |<font color="#C0C0C0"> 0.86 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 556.65 ms | 1994.22 ms | 433.93 ms | 833.39 ms | 502.26 ms | Error | **5.22 ms** |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.47 ms</font> |<font color="#C0C0C0"> 25.13 ms</font> |<font color="#C0C0C0"> 127.07 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> **0.00 ms**</font> |<font color="#C0C0C0"> 1098.13 ms</font> |<font color="#C0C0C0"> 0.73 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 15.90 ms | 13.53 ms | **2.28 ms** | 23.80 ms | 6.38 ms | 13757.44 ms | 3.84 ms |

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

| Test Series SMALL | Dataset Size |
| :-- | --: |
| hebis_100000_records | 7.865 MB |

## <a name="sqlite4java"></a>[3\.1\. Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series SMALL](#sqlite4java)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 21.56 ms |
| Load || 20849.12 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">353.43 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.93 ms | 0.38 ms | 0.12 ms | 0.93 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">182.63 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.80 ms | 1.18 ms | 0.80 ms | 1.32 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">198.90 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.65 ms | 2.43 ms | 1.96 ms | 2.65 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.21 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 146.11 ms | 144.11 ms | 146.11 ms | 146.52 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 154.32 ms | 146.79 ms | 147.23 ms | 154.32 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.55 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 154.75 ms | 154.48 ms | 151.24 ms | 154.75 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.72 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 174.29 ms | 168.23 ms | 163.15 ms | 174.29 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.58 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 168.68 ms | 168.51 ms | 167.62 ms | 168.68 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.57 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 174.83 ms | 182.58 ms | 174.83 ms | 182.16 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.69 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 257.59 ms | 248.58 ms | 247.15 ms | 257.59 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.56 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1140.58 ms | 1178.36 ms | 1140.58 ms | 1199.77 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.87 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 307.60 ms | 303.15 ms | 304.24 ms | 307.60 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18315.80 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.27 ms | 0.15 ms | 0.10 ms | 0.27 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">88.01 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.65 ms | 0.48 ms | 0.40 ms | 0.65 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">90.52 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 16.62 ms | 15.84 ms | 15.35 ms | 16.62 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.85 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.48 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.52 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 2.22 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.59 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.26 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 844.94 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.63 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 115.88 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 556.65 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.47 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 15.90 ms |

## <a name="SQLite-Xerial"></a>[3\.2\. Evaluation Details for SQLite-Xerial, Version 3.8.11, Test Series SMALL](#SQLite-Xerial)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 74.34 ms |
| Load || 19345.09 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">360.99 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.28 ms | 0.14 ms | 0.09 ms | 0.28 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">454.08 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.54 ms | 0.47 ms | 0.51 ms | 0.54 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">469.54 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.43 ms | 2.05 ms | 2.05 ms | 2.43 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">204.64 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 35.53 ms | 31.55 ms | 27.88 ms | 35.53 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">228.76 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 36.52 ms | 36.38 ms | 36.52 ms | 37.57 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">237.02 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 50.71 ms | 47.66 ms | 44.46 ms | 50.71 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">429.58 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 265.88 ms | 264.40 ms | 260.40 ms | 265.88 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">453.85 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 247.45 ms | 247.89 ms | 247.45 ms | 248.23 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">471.32 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 284.25 ms | 272.27 ms | 267.48 ms | 284.25 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">436.95 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 336.99 ms | 311.39 ms | 291.42 ms | 336.99 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.38 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1306.61 ms | 1284.46 ms | 1273.79 ms | 1306.61 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.26 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 345.83 ms | 344.34 ms | 336.43 ms | 345.83 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18350.46 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 0.30 ms | 0.17 ms | 0.12 ms | 0.30 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">92.41 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.58 ms | 0.45 ms | 0.36 ms | 0.58 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">94.58 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 13.15 ms | 11.47 ms | 10.69 ms | 13.15 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.78 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 2.39 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">213.42 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 0.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.23 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 0.59 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.22 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.02 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">171.27 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1211.39 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">228.54 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 36.50 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">227.60 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1994.22 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">25.13 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 13.53 ms |

## <a name="PostgreSQL"></a>[3\.3\. Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series SMALL](#PostgreSQL)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 246.76 ms |
| Load || 27159.76 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">204.45 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 2.61 ms | 1.29 ms | 0.68 ms | 2.61 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">196.94 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 2.37 ms | 1.44 ms | 1.06 ms | 2.37 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">202.50 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4.94 ms | 3.88 ms | 3.37 ms | 4.94 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">92.88 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 72.56 ms | 52.07 ms | 43.88 ms | 72.56 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">97.19 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 54.77 ms | 44.58 ms | 36.40 ms | 54.77 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">103.40 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 71.48 ms | 56.50 ms | 48.25 ms | 71.48 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">245.67 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 72.44 ms | 58.98 ms | 54.43 ms | 72.44 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">263.86 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 66.42 ms | 51.86 ms | 40.92 ms | 66.42 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">249.04 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 57.28 ms | 53.95 ms | 53.47 ms | 57.28 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">188.55 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 152.40 ms | 139.14 ms | 135.08 ms | 152.40 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">125.66 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 1110.00 ms | 1181.40 ms | 1110.00 ms | 1270.36 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">299.31 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 152.09 ms | 136.66 ms | 131.05 ms | 152.09 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">202.51 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 11.42 ms | 8.59 ms | 7.28 ms | 11.42 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">72.38 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 6.75 ms | 6.29 ms | 5.73 ms | 6.75 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">76.19 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 7.81 ms | 7.13 ms | 6.99 ms | 7.81 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.22 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 819.81 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">165.57 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 5096.88 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">205.61 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 15138.06 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9.89 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 21.20 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">196.70 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 2350.89 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">199.73 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 95.77 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">181.72 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 433.93 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">127.07 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 2.28 ms |

## <a name="ArangoDB"></a>[3\.4\. Evaluation Details for ArangoDB, Version 2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8, Test Series SMALL](#ArangoDB)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 231.04 ms |
| Load || 42961.93 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1736.13 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 132.43 ms | 133.07 ms | 132.43 ms | 134.45 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1709.74 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1471.95 ms | 1465.11 ms | 1471.95 ms | 1501.92 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1939.03 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 14929.83 ms | 14364.12 ms | 13863.97 ms | 14929.83 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 150.42 ms | 149.97 ms | 150.42 ms | 150.94 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 154.46 ms | 158.12 ms | 154.46 ms | 157.39 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 344.02 ms | 318.55 ms | 321.16 ms | 344.02 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 382.09 ms | 364.87 ms | 351.16 ms | 382.09 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 372.10 ms | 378.55 ms | 372.10 ms | 398.54 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 380.24 ms | 381.14 ms | 374.00 ms | 380.24 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1510.34 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 163.85 ms | 158.06 ms | 160.65 ms | 163.85 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 3455.69 ms | 3352.16 ms | 3268.40 ms | 3455.69 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 743.39 ms | 713.34 ms | 706.27 ms | 743.39 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19536.94 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 85.86 ms | 74.79 ms | 68.04 ms | 85.86 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">993.71 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 693.88 ms | 698.38 ms | 689.34 ms | 693.88 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1720.48 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6810.10 ms | 6961.73 ms | 6810.10 ms | 7057.71 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 7020.43 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 6941.50 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 29271.22 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 5863.15 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 6793.59 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1065.73 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 833.39 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 23.80 ms |

## <a name="MongoDB"></a>[3\.5\. Evaluation Details for MongoDB, Version 3.0.6, Test Series SMALL](#MongoDB)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 3.83 ms |
| Load || 31103.94 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">614.16 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 43.77 ms | 42.11 ms | 39.27 ms | 43.77 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">525.35 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 407.63 ms | 409.23 ms | 407.63 ms | 419.96 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">532.01 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4158.55 ms | 4132.37 ms | 4129.76 ms | 4158.55 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 89.46 ms | 84.51 ms | 84.96 ms | 89.46 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 83.37 ms | 83.55 ms | 83.37 ms | 83.79 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 113.50 ms | 109.42 ms | 109.61 ms | 113.50 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 112.61 ms | 116.41 ms | 112.61 ms | 120.12 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 115.81 ms | 116.18 ms | 114.67 ms | 115.81 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 118.94 ms | 114.40 ms | 112.55 ms | 118.94 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 236.57 ms | 236.37 ms | 224.41 ms | 236.57 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 548.57 ms | 546.13 ms | 532.74 ms | 548.57 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 266.63 ms | 268.44 ms | 266.63 ms | 271.61 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">78.87 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 283.56 ms | 287.32 ms | 283.56 ms | 286.14 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">81.16 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 3202.81 ms | 3385.69 ms | 3202.81 ms | 3313.78 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">88.97 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 44245.95 ms | 44399.59 ms | 44245.95 ms | 45608.54 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 620.83 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9929.10 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 2426.79 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 483.13 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 409.18 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.01 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 58.78 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 502.26 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 6.38 ms |

## <a name="Virtuoso"></a>[3\.6\. Evaluation Details for Virtuoso, Version 07.20.3214 / Virtuoso JDBC 4.1, Test Series SMALL](#Virtuoso)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 1.37 ms |
| Load || 7798.13 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2002.52 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 260.36 ms | 271.76 ms | 260.36 ms | 275.20 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">154.45 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 4457.22 ms | 4453.55 ms | 4429.21 ms | 4457.22 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">180.35 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 39887.19 ms | 39474.63 ms | 37939.16 ms | 39887.19 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.51 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 20.94 ms | 21.84 ms | 20.94 ms | 21.78 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.31 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 23.83 ms | 25.41 ms | 23.83 ms | 27.76 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.36 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 122.98 ms | 112.43 ms | 105.72 ms | 122.98 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.36 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 269.33 ms | 261.79 ms | 258.16 ms | 269.33 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.34 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 251.52 ms | 250.12 ms | 251.52 ms | 257.28 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.42 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 252.49 ms | 246.36 ms | 243.51 ms | 252.49 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.13 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 15199.07 ms | 15792.11 ms | 15199.07 ms | 16316.86 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.62 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 3.18E5 ms | 3.07E5 ms | 2.93E5 ms | 3.18E5 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.65 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 15226.33 ms | 15488.42 ms | 15226.33 ms | 15511.81 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">82.35 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 7.05 ms | 6.40 ms | 5.91 ms | 7.05 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">39.19 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 0.52 ms | 0.48 ms | 0.45 ms | 0.52 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">63.04 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 6.38 ms | 6.22 ms | 6.23 ms | 6.38 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.23 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 18972.43 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">199.03 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 602.48 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5.07 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 1.08E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.17 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 0.17 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.99 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 4461.88 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.66 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 413.01 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1098.13 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 13757.44 ms |

## <a name="Fuseki"></a>[3\.7\. Evaluation Details for Fuseki, Version 2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0, Test Series SMALL](#Fuseki)

| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 0.00 ms |
| Load || 30028.31 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2913.98 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 59.53 ms | 29.25 ms | 14.32 ms | 59.53 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2373.82 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 57.01 ms | 44.80 ms | 38.88 ms | 57.01 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2680.30 ms</font> |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 154.41 ms | 134.98 ms | 117.73 ms | 154.41 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.54 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 235.30 ms | 151.47 ms | 121.31 ms | 235.30 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.48 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 132.95 ms | 95.40 ms | 82.81 ms | 132.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.38 ms</font> |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 474.09 ms | 408.97 ms | 413.76 ms | 474.09 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.36 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 194.05 ms | 165.84 ms | 143.85 ms | 194.05 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.40 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 126.46 ms | 122.57 ms | 126.46 ms | 128.73 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.39 ms</font> |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 139.65 ms | 132.98 ms | 137.57 ms | 139.65 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.33 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 7854.29 ms | 7171.26 ms | 6944.53 ms | 7854.29 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | Error | Error | Error | Error |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.61 ms</font> |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 5.23E5 ms | 4.38E5 ms | 4.09E5 ms | 5.23E5 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">18662.59 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 3728.62 ms | 2457.82 ms | 3497.02 ms | 3728.62 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11960.95 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 26.29 ms | 25.05 ms | 7.94 ms | 26.29 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">11444.82 ms</font> |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 2248.02 ms | 1508.94 ms | 120.21 ms | 2248.02 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.12 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 9026.97 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | Error |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">Error</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | Error |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">19.82 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 1.70E5 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.86 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 5.22 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.73 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 3.84 ms |

## <a name="verifyresults"></a>[4\. Verify Results](#verifyresults)

| QueryScenario | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [ArangoDB](#ArangoDB) | [MongoDB](#MongoDB) | [Virtuoso](#Virtuoso) | [Fuseki](#Fuseki) |
| :-- | --: | --: | --: | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | -1561971405 | -1561971405 | -893169302 | 223914858 | -1561971405 | 350879876 | -862253540 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | 1240047246 | 1240047246 | -2001464288 | 386052410 | 1240047246 | -248001241 | 1590338745 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 1026421390 | 1026421390 | -1147107316 | 1479689030 | 1922438184 | 147341970 | -707389574 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -815258274 | -815258274 | 534174809 | 532661423 | -815258274 | 1076168121 | 1076168121 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 1138877253 | 1138877253 | 760930356 | 2073221864 | 1138877253 | 1810343141 | 1810343141 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | -1629862324 | -1629862324 | 1275111066 | -1054613001 | -1629862324 | -683235552 | -683235552 |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | -73307437 | -73307437 | -73307437 | -73307437 | -73307437 | -73307437 | -73307437 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | -1558327026 | -1558327026 | -1558327026 | -876870743 | -489400657 | -489400657 | -489400657 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | -1558327026 | -1558327026 | -1558327026 | -876870743 | -489400657 | -489400657 | -489400657 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | 56552878 | 56552878 | -2043057484 | 1050986388 | 56552878 | -1694170935 | -884432386 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | -904531008 | -904531008 | -551124570 | 1210647261 | -904531008 | -57195296 |  |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 305506946 | 305506946 | 1611627064 | -320443730 | 305506946 | 1325242502 | 528393536 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY_** | 607282443 | 607282443 | 25784451 | -900309419 | 607282443 | 1767224211 | -1300963007 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES_** | 900951422 | 900951422 | 674599005 | 476100530 | -1509446964 | -205400967 | 1464201904 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES_** | 1498018394 | 1498018394 | 25784451 | 772538181 | -147081651 | 1767224211 | -1300963007 |
| **_SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY_** | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |  |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |
| **_SCHEMA_CHANGE_MIGRATE_RDF_TYPE_** | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |  |
| **_SCHEMA_CHANGE_REMOVE_RDF_TYPE_** | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |  |
| **_UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |  |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |
| **_DELETE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |  | 1318887779 |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 | 1318887779 |
