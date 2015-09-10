sparql select ?orig_id ?orig_subj ?related_id 
from <%s> 
where
	{  
		?s1 <http://purl.org/dc/terms/identifier> ?orig_id .   
		?s1 <http://purl.org/dc/terms/subject> ?orig_subj .   
		?s2 <http://purl.org/dc/terms/identifier> ?related_id .   
		?s2 <http://purl.org/dc/terms/subject> ?related_subj .   
		filter(    
			sameterm(?orig_subj, ?related_subj) && !sameterm(?orig_id, ?related_id)  
		)
	}
