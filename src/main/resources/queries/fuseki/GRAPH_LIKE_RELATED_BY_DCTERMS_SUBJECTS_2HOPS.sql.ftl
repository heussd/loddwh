select ?orig_id ?orig_subj ?related_id ?secondRelated_id from <loddwhbench>
where
{  
	?s1 <http://purl.org/dc/terms/identifier> ?orig_id .   
	?s1 <http://purl.org/dc/terms/subject> ?orig_subj .   

	?s2 <http://purl.org/dc/terms/identifier> ?related_id .   
	?s2 <http://purl.org/dc/terms/subject> ?orig_subj . 
	?s2 <http://purl.org/dc/terms/subject> ?related_subj .   

	?s3 <http://purl.org/dc/terms/identifier> ?secondRelated_id .   
	?s3 <http://purl.org/dc/terms/subject> ?related_subj .    
	filter( ?related_subj != ?orig_subj && ?orig_id != ?related_id && ?related_id != ?secondRelated_id)
}