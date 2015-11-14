alter table justatable add column manifestation boolean default false;
update justatable set manifestation = "true" where RDF_TYPE like "%http://purl.org/vocab/frbr/core#Manifestation%";

alter table justatable add column bibliographicresource boolean default false;
update justatable set bibliographicresource = "true" where RDF_TYPE like "%http://purl.org/dc/terms/BibliographicResource%";

alter table justatable add column book boolean default false;
update justatable set book = "true" where RDF_TYPE like "%http://purl.org/ontology/bibo/Book%"
