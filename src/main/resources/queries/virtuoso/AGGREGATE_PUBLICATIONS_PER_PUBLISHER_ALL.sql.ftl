select ?publisher (count(?publisher) as ?count) from <loddwhbench> 						
where 
{	
	?a <http://purl.org/dc/terms/publisher> ?publisher .
} 
group by ?publisher 
order by desc(?count)