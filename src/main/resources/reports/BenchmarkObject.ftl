-----

# Report for ${name}

| Task | Time |
| :-- | --: |
<#list initialize as init>
| ${init.queryscenario} | ${init.firstorone} |
</#list>

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
<#list readOnly as ro>
| ${ro.queryscenario} | ${ro.phase} | ${ro.firstorone} | ${ro.avg} | ${ro.min} | ${ro.max} |
</#list>

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
<#list notReadOnly as nro>
| ${nro.queryscenario} | ${nro.phase} | ${nro.firstorone} |
</#list>
