| TESTCASE | PostgreSQL (Postgres.app) hebis_1000_rdf.gz | sqlite4java hebis_1000_rdf.gz | SQLite JDBC Xerial hebis_1000_rdf.gz | Virtuoso hebis_1000_rdf.gz |
| :- | :-: | :-: |
| SETUP | 451 ms | 29 ms | 92 ms | 30 ms |
| LOAD | 523 ms | 249 ms | 217 ms | 125 ms |
| ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY | 37 ms | 7 ms | 7 ms | 1633 ms |
| ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES | 38 ms | 3 ms | 6 ms | 1865 ms |
| ENTITY_RETRIEVAL_BY_ID_100_ENTITIES | 37 ms | 2 ms | 5 ms | 2148 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10 | 30 ms | 2 ms | 4 ms | 3 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100 | 29 ms | 2 ms | 4 ms | 2 ms |
| AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL | 28 ms | 1 ms | 4 ms | 2 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP10 | 43 ms | 2 ms | 8 ms | 4 ms |
| AGGREGATE_ISSUES_PER_DECADE_TOP100 | 43 ms | 2 ms | 9 ms | 4 ms |
| AGGREGATE_ISSUES_PER_DECADE_ALL | 44 ms | 1 ms | 7 ms | 4 ms |
| CONDITIONAL_TABLE_SCAN_ALL_STUDIES | 44 ms | 3 ms | 9 ms | 302 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES | 63 ms | 19 ms | 19 ms | 2180 ms |
| CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES | 55 ms | 3 ms | 6 ms | 249 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP | 33 ms | -3 ms | -3 ms | 2 ms |
| GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS | 30 ms | -3 ms | -3 ms | 5 ms |
| SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY | 72 ms | 2 ms | 2 ms | 170 ms |
| SCHEMA_CHANGE_INTRODUCE_STRING_OP | 145 ms | 1 ms | 5 ms | 2 ms |
| SCHEMA_CHANGE_MIGRATE_RDF_TYPE | 565 ms | 2 ms | 2 ms | -3 ms |
| SCHEMA_CHANGE_REMOVE_RDF_TYPE | -3 ms | 0 ms | 1 ms | 48 ms |
| UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM | 133 ms | 11 ms | 18 ms | 25 ms |
| UPDATE_HIGH_SELECTIVITY_NON_ISSUED | 27 ms | 2 ms | 2 ms | 5 ms |
| DELETE_LOW_SELECTIVITY_PAPER_MEDIUM | 36 ms | 1 ms | 5 ms | 5 ms |
| DELETE_HIGH_SELECTIVIY_NON_ISSUED | 37 ms | 1 ms | 4 ms | 4 ms |