"Evaluation Details for ${name}, Version ${version}, Test Series ${testserie}"
QueryScenario,Phase,1st Exec,2nd Exec,3rd Exec,Average time,Min time,Max time
<#list initialize as init>
${init.queryscenario},,"${init.firstorone}"
</#list>
<#list readOnly as ro>
${ro.queryscenario},${ro.phase},"${ro.firstorone}"<#if ro.phase!="Prepare">,"${ro.second}"</#if><#if ro.phase!="Prepare">,"${ro.third}"</#if><#if ro.phase!="Prepare">,"${ro.avg}"</#if><#if ro.phase!="Prepare">,"${ro.min}"</#if><#if ro.phase!="Prepare">,"${ro.max}"</#if>
</#list>
<#list notReadOnly as nro>
${nro.queryscenario},${nro.phase},"${nro.firstorone}"
</#list>

