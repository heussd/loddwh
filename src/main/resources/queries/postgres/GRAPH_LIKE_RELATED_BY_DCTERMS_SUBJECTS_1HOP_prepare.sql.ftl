<#-- XXX: @Timm The select statement does not use this index -->
DROP INDEX IF EXISTS idx_identifier;

CREATE INDEX idx_identifier on "${Config.TABLE}" ("dcterms_identifier");

DROP INDEX IF EXISTS idx_subjects;

CREATE INDEX idx_subjects on "${Config.TABLE}" USING GIN ("dcterms_subject");