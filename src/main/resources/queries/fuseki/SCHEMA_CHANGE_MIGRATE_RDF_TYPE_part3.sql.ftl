delete { }
insert { ?s <http://my.schema/Book> "true"^^<http://www.w3.org/2001/XMLSchema#boolean>}
where {
	?s ?p ?o.
	?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://purl.org/ontology/bibo/Book> . 
}