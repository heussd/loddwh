drop index if exists DCTERMS_ISSUED_idx;
CREATE INDEX DCTERMS_ISSUED_idx ON justatable (DCTERMS_ISSUED);
