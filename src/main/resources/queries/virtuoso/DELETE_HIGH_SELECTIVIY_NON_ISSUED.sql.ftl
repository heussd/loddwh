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

<#-- Kann nicht richtig sein, l�scht nur 2 Teile oder so -->
