sparql select ?century, (count(*) as ?count) 
from <%s> 
where 
	{	
		?a <http://purl.org/dc/terms/issued> ?century
	} 
group by ?century 
order by desc(?count) 
limit 10

<#-- Todo: Nach Jahrzehnt, nicht Jahrhundert. Century einfach um die letzte Stelle kürzen, 1968 => 196, und damit arbeiten. -->