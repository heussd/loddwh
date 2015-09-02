select level0.dcterms_identifier, level0.subject, level1.dcterms_identifier
from unnestedsubjects level0
inner join unnestedsubjects level1 on (level1.subject = level0.subject and level1.dcterms_identifier <> level0.dcterms_identifier)

-- Using unnest operator to "flaten" arrays: about twice as slower than using an indexed materialized view
--select * from (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level0
--inner join (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level1
--	on level0.subject = level1.subject and level0.dcterms_identifier != level1.dcterms_identifier

-- Using native array operations - about 1/3 SLOWER than unnesting
-- select level0.dcterms_identifier, level0.dcterms_subject, level1.dcterms_identifier from justatable level0
-- inner join justatable level1 on level0.dcterms_subject && level1.dcterms_subject 
-- where level0.dcterms_subject <> '{}' and level0.dcterms_subject <> level1.dcterms_subject