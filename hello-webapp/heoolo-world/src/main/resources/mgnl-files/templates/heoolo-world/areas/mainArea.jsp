<%@ include file="/WEB-INF/templates/magnoliaDemoModule/includes/taglibs.jsp"%>
 
 
 Main ui area!!!
 
<div id="mainUI">
	<c:forEach items="${components}" var="component">
		<div style="border: solid;margin-top: 100px;">
			<cms:component content="${component}" />
		</div>
	</c:forEach>
</div>
