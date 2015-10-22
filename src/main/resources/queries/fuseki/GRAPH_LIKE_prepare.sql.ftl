select ?identifier
where 
{	
	?s <http://purl.org/dc/terms/identifier> ?identifier .
	?s <http://purl.org/dc/terms/subject> ?subject . 
	optional { ?s <http://purl.org/dc/terms/medium> ?medium . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1008> ?P1008 . }
	optional { ?s <http://purl.org/dc/terms/contributor> ?contributor . }
	optional { ?s <http://purl.org/dc/terms/issued> ?issued . }
}
order by ?medium ?P1008 ?contributor ?issued ?identifier
