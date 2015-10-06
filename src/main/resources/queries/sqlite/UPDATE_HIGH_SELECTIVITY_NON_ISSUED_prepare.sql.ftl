drop index if exists issued_idx;
CREATE INDEX issued_idx ON justatable (dcterms_issued);