-----

# Report for ${name}

| Task | Time |
| :-- | --: |
<#list initialize as init>
| ${init.queryscenario} | ${init.firstorone} ms |
</#list>

### Read-only
| QueryScenario | Phase | First time | Average time | Min time | Max time |
| :-- | :-- | --: | --: | --: | --: |
<#list readOnly as ro>
| ${ro.queryscenario} | ${ro.phase} | ${ro.firstorone} ms | ${ro.avg} ms | ${ro.min} ms | ${ro.max} ms |
</#list>

### Data-changing
| QueryScenario | Phase | Time |
| :-- | :-- | --: |
<#list notReadOnly as nro>
| ${nro.queryscenario} | ${nro.phase} | ${nro.firstorone} ms |
</#list>
