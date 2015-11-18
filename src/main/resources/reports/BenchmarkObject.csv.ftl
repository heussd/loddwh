<#list initialize as init>
${name},${testserie},${init.queryscenario},Query,"${init.firstorone}"
</#list>
<#list readOnly as ro>${name},${testserie},${ro.queryscenario},${ro.phase},"${ro.firstorone}"<#if ro.phase!="Prepare">,"${ro.second}"</#if><#if ro.phase!="Prepare">,"${ro.third}"</#if><#if ro.phase!="Prepare">,"${ro.avg}"</#if><#--<#if ro.phase!="Prepare">,"${ro.min}"</#if><#if ro.phase!="Prepare">,"${ro.max}"</#if>-->
</#list>
<#list notReadOnly as nro>${name},${testserie},${nro.queryscenario},${nro.phase},"${nro.firstorone}"
</#list>