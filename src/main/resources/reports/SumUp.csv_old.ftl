"Evaluation Overview, all Databases, Test Series ${testserie}"
QueryScenario,Phase<#list databases as db>,"${db.name}"</#list>
<#list entrys as entry>
${entry.queryscenario},${entry.phase}<#list entry.avgvalues as dings>,"${dings}"</#list>
</#list>

