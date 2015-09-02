select SUBSTR(${Codes.DCTERMS_ISSUED}, 1, 3), count(${Codes.DCTERMS_IDENTIFIER}) from ${Config.TABLE}
group by SUBSTR(${Codes.DCTERMS_ISSUED}, 1, 3)
order by count(DCTERMS_IDENTIFIER) desc
limit 10