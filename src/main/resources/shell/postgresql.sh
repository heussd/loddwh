#!/bin/bash

rm -R /usr/local/var/loddwhbench
initdb -E UTF8 -D /usr/local/var/loddwhbench

pgtune -i /usr/local/var/loddwhbench/postgresql.conf -o /usr/local/var/loddwhbench/postgresql.conf -M 17179869184

pg_ctl -D /usr/local/var/loddwhbench start
#read -p "Press [Enter] to stop PostgreSQL..."
#pg_ctl -D /usr/local/var/loddwhbench stop -m immediate
