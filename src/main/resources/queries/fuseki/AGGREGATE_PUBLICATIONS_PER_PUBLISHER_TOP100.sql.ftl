select ?publisher (count(?publisher) as ?count)				
where 
{	
	?a <http://purl.org/dc/terms/publisher> ?publisher .
} 
group by ?publisher 
order by desc(?count) ?publisher
limit 100
