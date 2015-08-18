alter table justatable add column ${Config.NEWCOLUMN} text
update justatable set RDF_ABOUT=substring(RDF_ABOUT from '........$');