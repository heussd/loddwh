select SUBSTR(DCTERMS_ISSUED, 1, 3), count(DCTERMS_IDENTIFIER) from justatable
group by SUBSTR(DCTERMS_ISSUED, 1, 3)
order by count(DCTERMS_IDENTIFIER) desc
limit 100