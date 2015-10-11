-----

## Report for ${name}

| Task | Time |
| :-- | --: |
<#list initialize as init>
| ${init.queryscenario} | ${init.firstorone} |
</#list>

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
<#list readOnly as ro>
| <#if ro.phase=="Prepare"><font color="#C0C0C0"></#if>${ro.queryscenario}<#if ro.phase=="Prepare"></font></#if> | <#if ro.phase=="Prepare"><font color="#C0C0C0"></#if>${ro.phase}<#if ro.phase=="Prepare"></font></#if> | <#if ro.phase=="Prepare"><font color="#C0C0C0"></#if>${ro.firstorone}<#if ro.phase=="Prepare"></font></#if> | <#if ro.phase!="Prepare">${ro.avg}</#if> | <#if ro.phase!="Prepare">${ro.min}</#if> | <#if ro.phase!="Prepare">${ro.max}</#if> |
</#list>

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
<#list notReadOnly as nro>
| <#if nro.phase=="Prepare"><font color="#C0C0C0"></#if>${nro.queryscenario}<#if nro.phase=="Prepare"></font></#if> | <#if nro.phase=="Prepare"><font color="#C0C0C0"></#if>${nro.phase}<#if nro.phase=="Prepare"></font></#if> | <#if nro.phase=="Prepare"><font color="#C0C0C0"></#if>${nro.firstorone}<#if nro.phase=="Prepare"></font></#if> |
</#list>
