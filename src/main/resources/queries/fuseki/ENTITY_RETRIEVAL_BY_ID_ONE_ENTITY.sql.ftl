describe *
where 
{	
	?s ?o ?p .
	optional { ?s <http://purl.org/dc/terms/medium> ?medium . }
	optional { ?s <http://purl.org/dc/terms/publisher> ?publisher . }
	optional { ?s <http://purl.org/dc/terms/subject> ?subject . }
	optional { ?s <http://purl.org/dc/terms/contributor> ?contributor . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1008> ?P1008 . }
}
order by ?medium ?P1008 ?contributor ?subject ?s
limit 1