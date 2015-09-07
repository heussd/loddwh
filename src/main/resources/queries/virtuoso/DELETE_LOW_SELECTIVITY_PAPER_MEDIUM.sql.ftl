DELETE from <hebis_1000_test> 
 { ?s ?p ?o }
WHERE
 { 
   ?s ?p ?o .
   FILTER (
    EXISTS{
     ?s <http://purl.org/dc/terms/medium> 'paper' 
}
   )
 }
