WITH <loddwhbench> 
DELETE 
	{ 
		?s ?p ?o 
	} 
WHERE 
	{ 
		?s ?p ?o ; 
			<http://purl.org/dc/terms/medium> 'paper' 
	}
