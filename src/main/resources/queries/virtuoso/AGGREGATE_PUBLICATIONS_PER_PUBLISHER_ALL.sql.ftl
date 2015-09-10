sparql select ?publisher, (count(*) as ?count) 
from <%s> 
where 
	{	
		?a <http://purl.org/dc/terms/publisher> ?publisher
	} 
group by ?publisher 
order by desc(?count)
