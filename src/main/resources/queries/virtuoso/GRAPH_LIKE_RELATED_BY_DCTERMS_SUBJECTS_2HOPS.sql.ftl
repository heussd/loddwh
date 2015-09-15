sparql select ?orig_id ?orig_subj ?related_id ?secondRelated_id 
from <%s> 
where
	{  
		?s1 <http://purl.org/dc/terms/identifier> ?orig_id .   
		?s1 <http://purl.org/dc/terms/subject> ?orig_subj .   
		?s2 <http://purl.org/dc/terms/identifier> ?related_id .   
		?s2 <http://purl.org/dc/terms/subject> ?related_subj .   
		?s3 <http://purl.org/dc/terms/identifier> ?secondRelated_id .   
		?s3 <http://purl.org/dc/terms/subject> ?secondRelated_subj .   
		filter(    
			sameterm(?orig_subj, ?related_subj) && !sameterm(?orig_id, ?related_id) && sameterm(?related_subj, ?secondRelated_subj) && !sameterm(?related_id, ?secondRelated_id)
		)
	}
