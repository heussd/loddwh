select * from ${Config.TABLE} where
	'http://purl.org/dc/terms/BibliographicResource' = ANY(${Codes.RDF_TYPE})
	and (${Codes.DCTERMS_TITLE} ILIKE '%studie%' OR ${Codes.DCTERMS_TITLE} ILIKE '%study%')