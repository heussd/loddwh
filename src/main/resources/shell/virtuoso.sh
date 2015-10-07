#!/bin/bash

cd /usr/local/virtuoso-opensource/var/lib/virtuoso/db

rm virtuoso.db
rm virtuoso.log
rm virtuoso.trx
rm virtuoso-temp.db

virtuoso-t +foreground
