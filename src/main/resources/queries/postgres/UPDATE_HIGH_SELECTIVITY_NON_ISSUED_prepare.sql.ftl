DROP INDEX IF EXISTS issued_idx;
CREATE INDEX issued_idx on justatable ("dcterms_issued");