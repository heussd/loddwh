sparql WITH <%s> DELETE {
  ?s ?p ?o
} WHERE {
  ?s ?p ?o ;
     <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?o
}
