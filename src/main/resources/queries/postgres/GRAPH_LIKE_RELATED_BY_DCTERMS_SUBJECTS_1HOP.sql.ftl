select * from (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level0
inner join (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level1
	on level0.subject = level1.subject and level0.dcterms_identifier != level1.dcterms_identifier