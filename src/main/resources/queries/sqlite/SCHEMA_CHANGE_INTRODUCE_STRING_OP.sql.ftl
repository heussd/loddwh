alter table justatable
add column istrop text;

update justatable set istrop=substring(RDF_ABOUT from '........$');
