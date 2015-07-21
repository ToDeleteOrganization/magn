<%@ include file="/templates/heoolo-world/includes/taglibs.jsp"%>

<div class="footer">
	<c:forEach items="${components}" var="component">
		<cms:component content="${component}" />
	</c:forEach>
</div>
