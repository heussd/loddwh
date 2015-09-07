select * from justatable where
	'http://purl.org/dc/terms/BibliographicResource' = ANY(RDF_TYPE)
	and (DCTERMS_TITLE ILIKE '%studie%' OR DCTERMS_TITLE ILIKE '%study%')