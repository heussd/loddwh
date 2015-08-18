select SUBSTR(${Codes.DCTERMS_ISSUED}, 1, 3), count(${Codes.DCTERMS_IDENTIFIER}) from ${Config.TABLE}
group by SUBSTR(${Codes.DCTERMS_ISSUED}, 1, 3)
order by SUBSTR(${Codes.DCTERMS_ISSUED}, 1, 3)
top 10