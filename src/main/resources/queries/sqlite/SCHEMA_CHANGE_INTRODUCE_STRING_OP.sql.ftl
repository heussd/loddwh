alter table justatable
add column istrop text;

update justatable set istrop=substr(RDF_ABOUT, 30);
