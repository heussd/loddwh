select
	?s
	(group_concat(distinct ?edition ; separator = ",") as ?edition)
	?oclcum
	?format
	?identifier
	?issued
	?medium
	?publisher
	(group_concat(distinct ?subject ; separator = ",") as ?subject)
	(group_concat(distinct ?title ; separator = ",") as ?title)
	(group_concat(distinct ?contributor ; separator = ",") as ?contributor)
	(group_concat(distinct ?P1004 ; separator = ",") as ?P1004)
	?P1006
	(group_concat(distinct ?P1008 ; separator = ",") as ?P1008)
	(group_concat(distinct ?P1016 ; separator = ",") as ?P1016)
	?P1017
	?P1018
	?sameAs
	(group_concat(distinct ?type ; separator = ",") as ?type)
	?describedby
from <loddwhbench>	
where 
{	
	?s ?o ?p .
	optional { ?s <http://purl.org/ontology/bibo/edition> ?edition . }
	optional { ?s <http://purl.org/ontology/bibo/oclcnum> ?oclcnum . }
	optional { ?s <http://purl.org/dc/terms/format> ?format . }
	optional { ?s <http://purl.org/dc/terms/identifier> ?identifier . }
	optional { ?s <http://purl.org/dc/terms/issued> ?issued . }
	optional { ?s <http://purl.org/dc/terms/medium> ?medium . }
	optional { ?s <http://purl.org/dc/terms/publisher> ?publisher . }
	optional { ?s <http://purl.org/dc/terms/subject> ?subject . }
	optional { ?s <http://purl.org/dc/terms/title> ?title . }
	optional { ?s <http://purl.org/dc/terms/contributor> ?contributor . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1004> ?P1004 . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1006> ?P1006 . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1008> ?P1008 . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1016> ?P1016 . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1017> ?P1017 . }
	optional { ?s <http://iflastandards.info/ns/isbd/elements/P1018> ?P1018 . }
	optional { ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?type . }
	optional { ?s <http://www.w3.org/2002/07/owl#sameAs> ?sameAs . }
	optional { ?s <http://www.w3.org/2007/05/powder-s#describedby> ?describedby . }

	filter regex(?title, 'stud(ie|y)', 'i') .
}