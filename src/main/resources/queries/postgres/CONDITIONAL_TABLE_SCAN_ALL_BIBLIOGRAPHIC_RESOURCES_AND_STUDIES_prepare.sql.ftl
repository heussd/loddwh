DROP INDEX IF EXISTS RDF_TYPE_idx;
CREATE INDEX RDF_TYPE_idx on justatable USING GIN ("rdf_type");

drop index if exists DCTERMS_TITLE_idx;
CREATE INDEX DCTERMS_TITLE_idx ON justatable (DCTERMS_TITLE);