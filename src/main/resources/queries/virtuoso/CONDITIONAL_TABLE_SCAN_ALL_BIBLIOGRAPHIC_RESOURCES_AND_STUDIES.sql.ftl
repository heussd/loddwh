sparql select * 
from <%s> 
where 
	{	
		?s <http://purl.org/dc/terms/title> ?title 	
		filter regex(?title, 'stud(ie|y)', 'i') . 	
		?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://purl.org/dc/terms/BibliographicResource> 
		optional{?s <http://purl.org/ontology/bibo/oclcnum> ?oclcnum}	
		optional{?s <http://purl.org/dc/terms/identifier> ?id}	
		optional{?s <http://purl.org/dc/terms/publisher> ?publisher}	
		optional{?s <http://iflastandards.info/ns/isbd/elements/P1017> ?P1017}	
		optional{?s <http://iflastandards.info/ns/isbd/elements/P1016> ?P1016}	
		optional{?s <http://iflastandards.info/ns/isbd/elements/P1008> ?P1008}	
		optional{?s <http://iflastandards.info/ns/isbd/elements/P1006> ?P1006}	
		optional{?s <http://iflastandards.info/ns/isbd/elements/P1004> ?P1004}	
		optional{?s <http://iflastandards.info/ns/isbd/elements/P1018> ?P1018}	
		optional{?s <http://purl.org/dc/terms/issued> ?issued}	
		optional{?s <http://www.w3.org/2002/07/owl#sameAs> ?sameAs}	
		optional{?s <http://purl.org/dc/terms/medium> ?medium}	
		optional{?s <http://purl.org/dc/terms/format> ?format}	
		optional{?s <http://purl.org/ontology/bibo/edition> ?edition}	
		optional{?s <http://purl.org/dc/terms/subject> ?subject}	
		optional{?s <http://purl.org/dc/terms/contributor> ?contributor}
	}
