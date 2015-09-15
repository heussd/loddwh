sparql INSERT into <%s> 
	{  
		?s <http://purl.org/dc/terms/issued> '0'
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
