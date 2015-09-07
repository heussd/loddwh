select DCTERMS_PUBLISHER, count(DCTERMS_PUBLISHER) from justatable
group by DCTERMS_PUBLISHER
order by count(DCTERMS_PUBLISHER)
desc limit 100;
