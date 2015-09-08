select * from justatable where dcterms_identifier in
(select dcterms_identifier from justatable order by random() limit 10);