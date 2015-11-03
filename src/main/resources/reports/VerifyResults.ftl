
## <a name="verifyresults"></a>[4\. Verify Results](#verifyresults)

| QueryScenario |<#list databases as db> [${db.name}](#${db.linkconformname}) |</#list>
| :-- |<#list databases as db> --: |</#list>
<#list entrys as entry>
<#if entry.hashcodesok=="ok">| ${entry.queryscenario} |</#if><#if entry.hashcodesok=="notok">| **_${entry.queryscenario}_** |</#if><#list entry.hashcodes as dings> ${dings} |</#list>
</#list>
