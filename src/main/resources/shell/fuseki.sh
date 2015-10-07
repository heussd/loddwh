#!/bin/bash

cd "$HOME/Ph.D./Applications/DB/apache-jena-fuseki-2.3.0/"

rm -Rf run
rm -Rf DB
mkdir DB
./fuseki-server --timeout=3600000,3600000 --loc=DB /DB