describe *
where 
{	
	?s ?o ?p .
	optional { ?s <http://purl.org/dc/terms/title> ?title . }
	filter regex(?title, 'stud(ie|y)', 'i') .
}