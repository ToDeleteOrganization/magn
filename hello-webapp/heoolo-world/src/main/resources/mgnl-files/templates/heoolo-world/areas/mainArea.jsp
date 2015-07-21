<%@ include file="/templates/heoolo-world/includes/taglibs.jsp"%>
 
<div id="mainUI" class="main-content">
	<c:forEach items="${components}" var="component">
		<div style="border: solid;margin-top: 100px;">
			<cms:component content="${component}" />
		</div>
	</c:forEach>
</div>
