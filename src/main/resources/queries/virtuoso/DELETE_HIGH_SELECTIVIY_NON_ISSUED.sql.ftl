sparql WITH <%s> 
DELETE 
	{ 
		?s ?p ?o 
	} 
WHERE 
	{    
		?s ?p ?o .   
		filter(     
			not exists
				{       
					?s <http://purl.org/dc/terms/issued> ?a     
				}
		)
	}
