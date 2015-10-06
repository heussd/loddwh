alter table justatable add column manifestation boolean default false;
update justatable set manifestation = true where 'http://purl.org/vocab/frbr/core#Manifestation' = ANY(RDF_TYPE);

alter table justatable add column bibliographicresource boolean default false;
update justatable set bibliographicresource = true where 'http://purl.org/dc/terms/BibliographicResource' = ANY(RDF_TYPE);

alter table justatable add column book boolean default false;
update justatable set book = true where 'http://purl.org/ontology/bibo/Book' = ANY(RDF_TYPE);