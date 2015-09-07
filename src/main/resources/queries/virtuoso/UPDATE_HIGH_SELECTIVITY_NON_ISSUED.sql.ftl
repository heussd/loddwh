INSERT into <hebis_1000_test> {
  ?s <http://purl.org/dc/terms/issued> "0"
}
WHERE {
  ?s ?p ?o . 
  FILTER( 
    !EXISTS{
      ?s <http://purl.org/dc/terms/issued> ?a
    }
  )
}
