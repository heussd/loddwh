delete { ?s <http://my.schema/change> 'something' } #the delete clause will not have any impact while the given triples do not exist
insert { ?s <http://my.schema/change> 'cheesecake' } #used delete-insert statement since simple insert statement does not work with variables
WHERE 
{ 
	?s ?p ?o 
}