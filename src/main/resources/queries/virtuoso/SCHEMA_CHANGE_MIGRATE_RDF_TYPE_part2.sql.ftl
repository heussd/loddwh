with <loddwhbench>
delete { }
insert { ?s <http://my.schema/Manifestation> "true"^^xsd:boolean}
where {
	?s ?p ?o.
	?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://purl.org/vocab/frbr/core#Manifestation> . 
}