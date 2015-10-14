select ?decade (count(*) as ?count)
where 
{	
	?a <http://purl.org/dc/terms/issued> ?century
} 
group by (substr(?century,1,3) as ?decade)
order by desc(?count) ?decade
limit 10
