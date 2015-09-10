sparql select * 
from <%s> 
where 
	{	
		?s 	<http://purl.org/dc/terms/identifier> '268876681' ; 	
			<http://purl.org/dc/terms/medium> ?medium ;		
			<http://purl.org/dc/terms/format> ?format ;		
			<http://purl.org/dc/terms/issued> ?issued ;		
			<http://purl.org/dc/terms/title> ?title ; 	
			<http://purl.org/dc/terms/contributor> ?contributor ; 	
			<http://purl.org/dc/terms/publisher> ?publisher ; 	
			<http://purl.org/dc/terms/identifier> ?id ; 	
			<http://iflastandards.info/ns/isbd/elements/P1018> ?P1018 ; 	
			<http://iflastandards.info/ns/isbd/elements/P1004> ?P1004 ; 	
			<http://iflastandards.info/ns/isbd/elements/P1006> ?P1006 ; 	
			<http://iflastandards.info/ns/isbd/elements/P1016> ?P1016 ; 	
			<http://iflastandards.info/ns/isbd/elements/P1017> ?P1017 ; 	
			<http://purl.org/ontology/bibo/oclcnum> ?oclcnum 
	}
