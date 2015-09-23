describe *
where 
{	
	?s ?o ?p .
	optional { ?s <http://purl.org/dc/terms/title> ?title . }
	optional { ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type . }

	filter regex(?title, 'stud(ie|y)', 'i') .
	?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://purl.org/dc/terms/BibliographicResource> . 
}