#!/bin/bash

rm -R /usr/local/var/loddwhbench
initdb -E UTF8 -D /usr/local/var/loddwhbench
pg_ctl -D /usr/local/var/loddwhbench start
#read -p "Press [Enter] to stop PostgreSQL..."
#pg_ctl -D /usr/local/var/loddwhbench stop -m immediate
