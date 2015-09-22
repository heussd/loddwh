
# Sum up Report for Benchmark

| QueryScenario | Phase |<#list databases as db> ${db} |</#list>
| :-- | :-- |<#list databases as db> --: |</#list>
<#list entrys as entry>
| ${entry.queryscenario} | ${entry.phase} |<#list entry.avgvalues as dings><#if dings==entry.lowest> **${dings} ms** |</#if><#if dings!=entry.lowest> ${dings} ms |</#if></#list>
</#list>
