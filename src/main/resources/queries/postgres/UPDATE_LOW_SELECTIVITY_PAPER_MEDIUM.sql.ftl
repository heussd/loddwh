<#-- // XXX: @Timm The select statement does not use this index :/ -->

DROP INDEX IF EXISTS idx_types

CREATE INDEX idx_types on ${Config.TABLE} USING GIN (${Codes.DCTERMS_SUBJECT})

select * from ${Config.TABLE} where 'http://purl.org/dc/terms/BibliographicResource' = ANY(rdf_type)