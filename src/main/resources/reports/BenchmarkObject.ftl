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
| ${ro.queryscenario} | ${ro.phase} | ${ro.firstorone} | <#if ro.phase!="Prepare">${ro.avg}</#if> | <#if ro.phase!="Prepare">${ro.min}</#if> | <#if ro.phase!="Prepare">${ro.max}</#if> |
</#list>

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
<#list notReadOnly as nro>
| ${nro.queryscenario} | ${nro.phase} | ${nro.firstorone} |
</#list>
