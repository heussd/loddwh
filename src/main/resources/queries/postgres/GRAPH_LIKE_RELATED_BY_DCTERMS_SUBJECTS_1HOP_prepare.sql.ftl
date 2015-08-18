<#-- XXX: @Timm The select statement does not use this index :/-->
DROP INDEX IF EXISTS idx_identifier

CREATE INDEX idx_identifier on "${Config.TABLE}" ("${Codes.DCTERMS_IDENTIFIER}")

DROP INDEX IF EXISTS idx_subjects
CREATE INDEX idx_subjects on "${Config.TABLE}" USING GIN ("${Codes.DCTERMS_SUBJECT}")