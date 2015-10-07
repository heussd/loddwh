describe * where {
  ?s ?p ?o .
  ?s <http://purl.org/dc/terms/identifier> ?identifier .
  FILTER( ?identifier IN ( ##ids## ))
}