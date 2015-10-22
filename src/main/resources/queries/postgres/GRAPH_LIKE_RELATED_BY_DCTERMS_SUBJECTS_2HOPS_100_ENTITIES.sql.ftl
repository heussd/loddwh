select level0.dcterms_identifier, level0.subject, level1.dcterms_identifier, level1.subject, level2.dcterms_identifier
from unnestedsubjects level0
inner join unnestedsubjects level1 on (level1.subject = level0.subject and level1.dcterms_identifier <> level0.dcterms_identifier)
inner join unnestedsubjects level2 on (level2.subject = level1.subject and level2.dcterms_identifier <> level1.dcterms_identifier and level1.dcterms_identifier <> level0.dcterms_identifier)