<style style="text/css">tr:hover{background: #FFFF00;}</style>


## <a name="overview"></a>[1\. Evaluation Overview, all Databases, Test Series MEDIUM](#overview)

| QueryScenario | Phase | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [MongoDB](#MongoDB) |
| :-- | :-- | --: | --: | --: | --: |
| Set up |  | 40.53 ms | 110.38 ms | 242.69 ms | **7.42 ms** |
| Load |  | 4.42E5 ms | **4.03E5 ms** | 5.96E5 ms | 6.88E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 15458.78 ms</font> |<font color="#C0C0C0"> 16513.53 ms</font> |<font color="#C0C0C0"> **4146.86 ms**</font> |<font color="#C0C0C0"> 15847.46 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.72 ms | **0.16 ms** | 1.30 ms | 999.25 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> **3262.02 ms**</font> |<font color="#C0C0C0"> 8772.34 ms</font> |<font color="#C0C0C0"> 3819.37 ms</font> |<font color="#C0C0C0"> 12924.41 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.32 ms | **0.40 ms** | 2.31 ms | 9527.43 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3735.61 ms</font> |<font color="#C0C0C0"> 9252.77 ms</font> |<font color="#C0C0C0"> **3734.02 ms**</font> |<font color="#C0C0C0"> 12830.62 ms</font> |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.47 ms | **1.84 ms** | 3.63 ms | 99333.86 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.62 ms</font> |<font color="#C0C0C0"> 5657.30 ms</font> |<font color="#C0C0C0"> 3302.00 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 3958.27 ms | **795.35 ms** | 1138.18 ms | 4043.91 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.90 ms</font> |<font color="#C0C0C0"> 6328.80 ms</font> |<font color="#C0C0C0"> 3290.99 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3992.14 ms | **838.87 ms** | 1174.99 ms | 3870.72 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.52 ms</font> |<font color="#C0C0C0"> 6177.23 ms</font> |<font color="#C0C0C0"> 3416.82 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 4273.47 ms | **1112.13 ms** | 1592.18 ms | 5229.01 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.93 ms</font> |<font color="#C0C0C0"> 9436.19 ms</font> |<font color="#C0C0C0"> 5484.88 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3992.82 ms | 5587.86 ms | **975.43 ms** | 3063.77 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.83 ms</font> |<font color="#C0C0C0"> 9695.52 ms</font> |<font color="#C0C0C0"> 5048.58 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 4269.83 ms | 5626.93 ms | **1034.89 ms** | 2758.35 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.98 ms</font> |<font color="#C0C0C0"> 9649.27 ms</font> |<font color="#C0C0C0"> 5204.96 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 4025.16 ms | 5580.76 ms | **1010.88 ms** | 2920.50 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.33 ms</font> |<font color="#C0C0C0"> 7273.73 ms</font> |<font color="#C0C0C0"> 4308.43 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3842.06 ms | 4965.95 ms | **1989.96 ms** | 3676.14 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.35 ms</font> |<font color="#C0C0C0"> 4.47 ms</font> |<font color="#C0C0C0"> 2237.44 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 25422.12 ms | 27719.41 ms | 29016.58 ms | **15985.97 ms** |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 3.26 ms</font> |<font color="#C0C0C0"> 4.08 ms</font> |<font color="#C0C0C0"> 6118.23 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4796.04 ms | 5815.28 ms | **2164.36 ms** | 4907.33 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 4.52E5 ms</font> |<font color="#C0C0C0"> 3.68E5 ms</font> |<font color="#C0C0C0"> 5182.16 ms</font> |<font color="#C0C0C0"> **3626.48 ms**</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 250.13 ms | **25.24 ms** | 3439.19 ms | 7374.98 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1884.54 ms</font> |<font color="#C0C0C0"> 2284.02 ms</font> |<font color="#C0C0C0"> **1443.27 ms**</font> |<font color="#C0C0C0"> 3878.45 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 305.42 ms | 66.58 ms | **0.70 ms** | 87055.70 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1991.27 ms</font> |<font color="#C0C0C0"> 2354.19 ms</font> |<font color="#C0C0C0"> **1412.10 ms**</font> |<font color="#C0C0C0"> 3824.36 ms</font> |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 2563.30 ms | **1385.49 ms** | 3408.91 ms | 7.24E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 7.26 ms</font> |<font color="#C0C0C0"> 4.11 ms</font> |<font color="#C0C0C0"> 10.58 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.14 ms | **0.99 ms** | 25215.62 ms | 17724.65 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 1.15 ms</font> |<font color="#C0C0C0"> 4678.78 ms</font> |<font color="#C0C0C0"> 3456.47 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | **21181.29 ms** | 23606.17 ms | 1.69E5 ms | 2.33E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 7.29 ms</font> |<font color="#C0C0C0"> 6.13 ms</font> |<font color="#C0C0C0"> 4841.35 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | **66071.02 ms** | 77057.79 ms | 5.04E5 ms | 66910.28 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.33 ms</font> |<font color="#C0C0C0"> 4.08 ms</font> |<font color="#C0C0C0"> 24.04 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 13795.24 ms | 17329.30 ms | **57.96 ms** | 15041.54 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.72 ms</font> |<font color="#C0C0C0"> 8249.80 ms</font> |<font color="#C0C0C0"> 3809.45 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 17342.08 ms | 25041.33 ms | 1.57E5 ms | **15549.93 ms** |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 6.50 ms</font> |<font color="#C0C0C0"> 5910.08 ms</font> |<font color="#C0C0C0"> 5607.18 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3341.25 ms | **2984.77 ms** | 12806.84 ms | 3800.26 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 2.72 ms</font> |<font color="#C0C0C0"> 5132.60 ms</font> |<font color="#C0C0C0"> 3404.44 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | **7494.29 ms** | 15184.78 ms | 15042.79 ms | 16511.32 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> |<font color="#C0C0C0"> 0.85 ms</font> |<font color="#C0C0C0"> 323.05 ms</font> |<font color="#C0C0C0"> 1920.53 ms</font> |<font color="#C0C0C0"> **0.00 ms**</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 281.05 ms | 217.26 ms | **97.68 ms** | 659.22 ms |

# <a name="toc"></a>[Table of contents](#toc)

1. [Evaluation Overview](#overview)
1. [Test Series Datasets](#testseriesinformation)
1. Evaluation Details
	1. [sqlite4java](#sqlite4java)
	1. [SQLite-Xerial](#SQLite-Xerial)
	1. [PostgreSQL](#PostgreSQL)
	1. [MongoDB](#MongoDB)
1. [Verify Results](#verifyresults)

## <a name="testseriesinformation"></a>[2\. Test Series Datasets](#testseriesinformation)

| Test Series MEDIUM | Dataset Size |
| :-- | --: |
| hebis_10147116_13050073_rdf_gz | 206.285 MB |

## <a name="sqlite4java"></a>[3\.1\. Evaluation Details for sqlite4java, Version 392 with SQLite 3.8.7, Test Series MEDIUM](#sqlite4java)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 40.53 ms |
| Load || 4.42E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15458.78 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1.94 ms | 0.13 ms | 0.08 ms | 0.72 ms | 0.13 ms | 1.94 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3262.02 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 1.54 ms | 0.59 ms | 1.81 ms | 1.32 ms | 0.59 ms | 1.54 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3735.61 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 3.23 ms | 2.10 ms | 2.08 ms | 2.47 ms | 2.10 ms | 3.23 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.62 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 4091.66 ms | 3925.19 ms | 3857.96 ms | 3958.27 ms | 3925.19 ms | 4091.66 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.90 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3940.71 ms | 3940.56 ms | 4095.16 ms | 3992.14 ms | 3940.56 ms | 3940.71 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.52 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 4372.55 ms | 4272.08 ms | 4175.79 ms | 4273.47 ms | 4272.08 ms | 4372.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.93 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3916.88 ms | 4104.62 ms | 3956.97 ms | 3992.82 ms | 3916.88 ms | 4104.62 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.83 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 4239.59 ms | 4456.20 ms | 4113.70 ms | 4269.83 ms | 4239.59 ms | 4456.20 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.98 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 4025.15 ms | 4002.77 ms | 4047.56 ms | 4025.16 ms | 4002.77 ms | 4025.15 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.33 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3896.76 ms | 3810.43 ms | 3818.99 ms | 3842.06 ms | 3810.43 ms | 3896.76 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.35 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 24721.64 ms | 26283.99 ms | 25260.73 ms | 25422.12 ms | 24721.64 ms | 26283.99 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.26 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4780.61 ms | 4891.59 ms | 4715.94 ms | 4796.04 ms | 4780.61 ms | 4891.59 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.52E5 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 692.92 ms | 30.96 ms | 26.51 ms | 250.13 ms | 30.96 ms | 692.92 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1884.54 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 718.32 ms | 126.55 ms | 71.37 ms | 305.42 ms | 126.55 ms | 718.32 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1991.27 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 4100.08 ms | 1850.90 ms | 1738.90 ms | 2563.30 ms | 1850.90 ms | 4100.08 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.26 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 1.14 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1.15 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 21181.29 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7.29 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 66071.02 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.33 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 13795.24 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.72 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 17342.08 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.50 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3341.25 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2.72 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 7494.29 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.85 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 281.05 ms |

## <a name="SQLite-Xerial"></a>[3\.2\. Evaluation Details for SQLite-Xerial, Version 3.8.11, Test Series MEDIUM](#SQLite-Xerial)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 110.38 ms |
| Load || 4.03E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">16513.53 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 0.33 ms | 0.08 ms | 0.06 ms | 0.16 ms | 0.08 ms | 0.33 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8772.34 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 0.50 ms | 0.42 ms | 0.28 ms | 0.40 ms | 0.42 ms | 0.50 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9252.77 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 2.20 ms | 1.66 ms | 1.66 ms | 1.84 ms | 1.66 ms | 2.20 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5657.30 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 788.82 ms | 810.48 ms | 786.76 ms | 795.35 ms | 788.82 ms | 810.48 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6328.80 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 838.30 ms | 839.70 ms | 838.60 ms | 838.87 ms | 838.30 ms | 839.70 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6177.23 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1136.18 ms | 1115.80 ms | 1084.41 ms | 1112.13 ms | 1115.80 ms | 1136.18 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9436.19 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 5656.21 ms | 5577.21 ms | 5530.15 ms | 5587.86 ms | 5577.21 ms | 5656.21 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9695.52 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 5786.55 ms | 5513.64 ms | 5580.60 ms | 5626.93 ms | 5513.64 ms | 5786.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">9649.27 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 5655.68 ms | 5536.46 ms | 5550.16 ms | 5580.76 ms | 5536.46 ms | 5655.68 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">7273.73 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 4967.76 ms | 4846.15 ms | 5083.95 ms | 4965.95 ms | 4846.15 ms | 4967.76 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.47 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 27866.32 ms | 27506.99 ms | 27784.92 ms | 27719.41 ms | 27506.99 ms | 27866.32 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.08 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 5937.04 ms | 5730.20 ms | 5778.59 ms | 5815.28 ms | 5730.20 ms | 5937.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3.68E5 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 27.04 ms | 24.64 ms | 24.05 ms | 25.24 ms | 24.64 ms | 27.04 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2284.02 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 68.14 ms | 65.88 ms | 65.73 ms | 66.58 ms | 65.88 ms | 68.14 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2354.19 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 1390.77 ms | 1400.37 ms | 1365.34 ms | 1385.49 ms | 1390.77 ms | 1400.37 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.11 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 0.99 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4678.78 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 23606.17 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6.13 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 77057.79 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4.08 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 17329.30 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">8249.80 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 25041.33 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5910.08 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 2984.77 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5132.60 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 15184.78 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">323.05 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 217.26 ms |

## <a name="PostgreSQL"></a>[3\.3\. Evaluation Details for PostgreSQL, Version PostgreSQL 9.4.4 on x86_64-apple-darwin14.3.0, compiled by Apple LLVM version 6.1.0 (clang-602.0.53) (based on LLVM 3.6.0svn), 64-bit / 9.4-1201-jdbc41, Test Series MEDIUM](#PostgreSQL)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 242.69 ms |
| Load || 5.96E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4146.86 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 3.05 ms | 0.40 ms | 0.46 ms | 1.30 ms | 0.40 ms | 3.05 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3819.37 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 4.69 ms | 1.08 ms | 1.16 ms | 2.31 ms | 1.08 ms | 4.69 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3734.02 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 4.95 ms | 3.04 ms | 2.91 ms | 3.63 ms | 3.04 ms | 4.95 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3302.00 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 1339.26 ms | 1038.67 ms | 1036.60 ms | 1138.18 ms | 1038.67 ms | 1339.26 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3290.99 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 1327.32 ms | 1075.72 ms | 1121.94 ms | 1174.99 ms | 1075.72 ms | 1327.32 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3416.82 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 1820.37 ms | 1520.27 ms | 1435.92 ms | 1592.18 ms | 1520.27 ms | 1820.37 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5484.88 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 1287.32 ms | 813.11 ms | 825.87 ms | 975.43 ms | 813.11 ms | 1287.32 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5048.58 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 1213.48 ms | 990.76 ms | 900.43 ms | 1034.89 ms | 990.76 ms | 1213.48 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5204.96 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 1300.03 ms | 896.77 ms | 835.86 ms | 1010.88 ms | 896.77 ms | 1300.03 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4308.43 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 2236.56 ms | 1893.35 ms | 1839.98 ms | 1989.96 ms | 1893.35 ms | 2236.56 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">2237.44 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 34506.99 ms | 28414.42 ms | 24128.33 ms | 29016.58 ms | 28414.42 ms | 34506.99 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">6118.23 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 2459.65 ms | 2031.49 ms | 2001.93 ms | 2164.36 ms | 2031.49 ms | 2459.65 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5182.16 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 3538.66 ms | 3389.98 ms | 3388.95 ms | 3439.19 ms | 3389.98 ms | 3538.66 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1443.27 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 1.21 ms | 0.44 ms | 0.46 ms | 0.70 ms | 0.44 ms | 1.21 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1412.10 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 3470.75 ms | 3384.40 ms | 3371.56 ms | 3408.91 ms | 3384.40 ms | 3470.75 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">10.58 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 25215.62 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3456.47 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 1.69E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">4841.35 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 5.04E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">24.04 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 57.96 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3809.45 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 1.57E5 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">5607.18 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 12806.84 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3404.44 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 15042.79 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">1920.53 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 97.68 ms |

## <a name="MongoDB"></a>[3\.4\. Evaluation Details for MongoDB, Version 3.0.6, Test Series MEDIUM](#MongoDB)

| QueryScenario | Phase | 1st Exec | 2nd Exec | 3rd Exec | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
| Set up || 7.42 ms |
| Load || 6.88E5 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">15847.46 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | Query | 1064.41 ms | 940.48 ms | 992.86 ms | 999.25 ms | 940.48 ms | 1064.41 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12924.41 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | Query | 9480.23 ms | 9674.86 ms | 9427.21 ms | 9527.43 ms | 9480.23 ms | 9674.86 ms |
| <font color="#C0C0C0">ENTITY_RETRIEVAL_BY_ID_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">12830.62 ms</font> |  |  |  |  |  |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | Query | 98832.38 ms | 99950.01 ms | 99219.20 ms | 99333.86 ms | 98832.38 ms | 99950.01 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | Query | 4166.53 ms | 4162.24 ms | 3802.95 ms | 4043.91 ms | 4162.24 ms | 4166.53 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | Query | 3851.31 ms | 3842.43 ms | 3918.42 ms | 3870.72 ms | 3842.43 ms | 3851.31 ms |
| <font color="#C0C0C0">AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | Query | 5047.42 ms | 5338.55 ms | 5301.05 ms | 5229.01 ms | 5047.42 ms | 5338.55 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP10</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | Query | 3121.95 ms | 3083.72 ms | 2985.64 ms | 3063.77 ms | 3083.72 ms | 3121.95 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_TOP100</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | Query | 2867.48 ms | 2687.86 ms | 2719.70 ms | 2758.35 ms | 2687.86 ms | 2867.48 ms |
| <font color="#C0C0C0">AGGREGATE_ISSUES_PER_DECADE_ALL</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| AGGREGATE_ISSUES_PER_DECADE_ALL | Query | 2800.85 ms | 2847.12 ms | 3113.52 ms | 2920.50 ms | 2800.85 ms | 2847.12 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | Query | 3642.24 ms | 3765.52 ms | 3620.67 ms | 3676.14 ms | 3642.24 ms | 3765.52 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | Query | 16023.49 ms | 16218.87 ms | 15715.56 ms | 15985.97 ms | 16023.49 ms | 16218.87 ms |
| <font color="#C0C0C0">CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |  |  |  |  |  |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | Query | 4753.62 ms | 5081.69 ms | 4886.67 ms | 4907.33 ms | 4753.62 ms | 5081.69 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3626.48 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY | Query | 7385.30 ms | 7368.93 ms | 7370.72 ms | 7374.98 ms | 7368.93 ms | 7385.30 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3878.45 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES | Query | 83988.05 ms | 86836.24 ms | 90342.80 ms | 87055.70 ms | 83988.05 ms | 86836.24 ms |
| <font color="#C0C0C0">GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">3824.36 ms</font> |  |  |  |  |  |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES | Query | 7.25E5 ms | 7.08E5 ms | 7.38E5 ms | 7.24E5 ms | 7.08E5 ms | 7.25E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | Query | 17724.65 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_INTRODUCE_STRING_OP</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | Query | 2.33E5 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_MIGRATE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | Query | 66910.28 ms |
| <font color="#C0C0C0">SCHEMA_CHANGE_REMOVE_RDF_TYPE</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | Query | 15041.54 ms |
| <font color="#C0C0C0">UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 15549.93 ms |
| <font color="#C0C0C0">UPDATE_HIGH_SELECTIVITY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | Query | 3800.26 ms |
| <font color="#C0C0C0">DELETE_LOW_SELECTIVITY_PAPER_MEDIUM</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | Query | 16511.32 ms |
| <font color="#C0C0C0">DELETE_HIGH_SELECTIVIY_NON_ISSUED</font> | <font color="#C0C0C0">Prepare</font> | <font color="#C0C0C0">0.00 ms</font> |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | Query | 659.22 ms |

## <a name="verifyresults"></a>[4\. Verify Results](#verifyresults)

| QueryScenario | [sqlite4java](#sqlite4java) | [SQLite-Xerial](#SQLite-Xerial) | [PostgreSQL](#PostgreSQL) | [MongoDB](#MongoDB) |
| :-- | --: | --: | --: | --: |
| **_ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY_** | 183003720 | 183003720 | 2147029917 | -1234568223 |
| **_ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES_** | -697403916 | -697403916 | -1064698612 | -1601278454 |
| **_ENTITY_RETRIEVAL_BY_ID_100_ENTITIES_** | 712704393 | 712704393 | -429770817 | -1854819011 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10_** | -1171407182 | -1171407182 | 1036830978 | -155495598 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100_** | 1565953347 | 1565953347 | 2046082798 | -1713102365 |
| **_AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL_** | 924193170 | 924193170 | -699181208 | 1940104754 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP10_** | 703096602 | 703096602 | 703096602 | 322806878 |
| **_AGGREGATE_ISSUES_PER_DECADE_TOP100_** | 319031819 | 319031819 | 319031819 | 1983994085 |
| **_AGGREGATE_ISSUES_PER_DECADE_ALL_** | 319031819 | 319031819 | 319031819 | 1983994085 |
| **_CONDITIONAL_TABLE_SCAN_ALL_STUDIES_** | -2076523569 | -2076523569 | 1460937583 | -1574077829 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_** | -597014367 | -597014367 | 203022939 | 15976803 |
| **_CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES_** | 2007091515 | 2007091515 | -1702283323 | -637540735 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY_** | 320861599 | 320861599 | 1487492447 | 1653937535 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES_** | 320861599 | 320861599 | 763152112 | 1653937535 |
| **_GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES_** | 320861599 | 320861599 | 1487492447 | 1653937535 |
| **_SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_SCHEMA_CHANGE_INTRODUCE_STRING_OP_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_SCHEMA_CHANGE_MIGRATE_RDF_TYPE_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_SCHEMA_CHANGE_REMOVE_RDF_TYPE_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_UPDATE_HIGH_SELECTIVITY_NON_ISSUED_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_DELETE_LOW_SELECTIVITY_PAPER_MEDIUM_** | 81934384 | 81934384 | 81934384 | 77356726 |
| **_DELETE_HIGH_SELECTIVIY_NON_ISSUED_** | 81934384 | 81934384 | 81934384 | 77356726 |
