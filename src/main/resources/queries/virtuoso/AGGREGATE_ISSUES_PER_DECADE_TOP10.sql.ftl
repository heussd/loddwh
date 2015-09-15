sparql select substr(?century,1,3) as ?decade, (count(*) as ?count) 
from <%s> 
where 
	{	
		?a <http://purl.org/dc/terms/issued> ?century
	} 
group by substr(?century,1,3) 
order by desc(?count) 
limit 10
