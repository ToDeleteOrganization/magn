<%@ include file="/templates/heoolo-world/includes/taglibs.jsp"%>

<c:if test="${not empty content.photo}">
	Picture: 
    <%-- Using JSP 2.2 method calling from EL - requires Servlet 3.0 (Tomcat 7) --%>
    <%-- On previous versions this exception is thrown: The function getAssetLink must be used with a prefix when a default namespace is not specified --%>
    <img style="float: right;margin: 10px;" src="${damfn.getAssetLink(content.photo)}"/>
</c:if>