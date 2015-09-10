sparql delete 
from <%s> 
	{
		?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?v
	} 
where 
	{
		?s a <http://www.w3.org/1999/02/22-rdf-syntax-ns#Description>
	}

<#-- Eher fehlerhaft -->