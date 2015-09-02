select ${Codes.DCTERMS_PUBLISHER}, count(${Codes.DCTERMS_PUBLISHER}) from ${Config.TABLE}
group by ${Codes.DCTERMS_PUBLISHER}
order by count(${Codes.DCTERMS_PUBLISHER})
desc