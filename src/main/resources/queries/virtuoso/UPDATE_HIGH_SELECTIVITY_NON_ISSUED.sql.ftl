sparql INSERT into <%s> 
	{  
		?s <http://purl.org/dc/terms/issued> '0'
	} 
WHERE 
	{ 
		?s <http://purl.org/dc/terms/issued> ?o .    
		FILTER(     
			!EXISTS
			{      
				?s <http://purl.org/dc/terms/issued> ?a    
			} 
		)
	}

<#-- Bei hebis_1000 f�gt er �ber 5000 ein? Kann ja nicht richtig sein. -->
