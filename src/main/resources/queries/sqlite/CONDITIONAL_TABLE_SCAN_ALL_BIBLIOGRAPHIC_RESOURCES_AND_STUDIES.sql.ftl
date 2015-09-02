select * from justatable where
RDF_TYPE LIKE '%http://purl.org/dc/terms/BibliographicResource%' and
(LOWER(DCTERMS_TITLE) LIKE '%studie%' OR LOWER(DCTERMS_TITLE) LIKE '%study%')