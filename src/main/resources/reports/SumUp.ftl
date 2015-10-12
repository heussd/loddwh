-----

## Evaluation Overview, all Databases, Test Series $TestSeries 

| QueryScenario | Phase |<#list databases as db> ${db} |</#list>
| :-- | :-- |<#list databases as db> --: |</#list>
<#list entrys as entry>
| <#if entry.phase=="Prepare"><font color="#C0C0C0"></#if>${entry.queryscenario}<#if entry.phase=="Prepare"></font></#if> | <#if entry.phase=="Prepare"><font color="#C0C0C0"></#if>${entry.phase}<#if entry.phase=="Prepare"></font></#if> |<#list entry.avgvalues as dings><#if entry.phase=="Prepare"><font color="#C0C0C0"></#if><#if dings==entry.lowest> **${dings}**<#if entry.phase=="Prepare"></font></#if> |</#if><#if dings!=entry.lowest> ${dings}<#if entry.phase=="Prepare"></font></#if> |</#if></#list>
</#list>
