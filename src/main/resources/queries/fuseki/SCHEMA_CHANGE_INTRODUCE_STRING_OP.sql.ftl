delete { ?s <http://my.schema/change> 'something' } 						
insert { ?s <http://my.schema/subjectid> ?subjectid } 							
WHERE 
{ 
	?s <http://purl.org/dc/terms/subject> ?subject .
	BIND(substr(?subject,22) as ?subjectid)
}