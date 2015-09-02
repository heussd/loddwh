alter table ${Config.TABLE} add column manifestation boolean default false;
update ${Config.TABLE} set manifestation = true where 'http://purl.org/vocab/frbr/core#Manifestation' = ANY(RDF_TYPE);

alter table ${Config.TABLE} add column bibliographicresource boolean default false;
update ${Config.TABLE} set bibliographicresource = true where 'http://purl.org/dc/terms/BibliographicResource' = ANY(RDF_TYPE);

alter table ${Config.TABLE} add column book boolean default false;
update ${Config.TABLE} set book = true where 'http://purl.org/ontology/bibo/Book' = ANY(RDF_TYPE);

alter table ${Config.TABLE} drop column RDF_TYPE;
