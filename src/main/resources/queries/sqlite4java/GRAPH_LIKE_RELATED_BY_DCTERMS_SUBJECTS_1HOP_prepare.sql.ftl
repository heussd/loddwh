drop view if exists unnestedsubjects;

create view unnestedsubjects as
(SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable where dcterms_subject <> '{}');

CREATE INDEX unnestedsubjects_identifer ON unnestedsubjects (dcterms_identifier);
CREATE INDEX unnestedsubjects_subject ON unnestedsubjects (subject);


-- Old gin index - was never really used.
-- DROP INDEX IF EXISTS idx_identifier;
-- CREATE INDEX idx_identifier on "${Config.TABLE}" ("dcterms_identifier");
-- DROP INDEX IF EXISTS idx_subjects;
-- CREATE INDEX idx_subjects on "${Config.TABLE}" USING GIN ("dcterms_subject");