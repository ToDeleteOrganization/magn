<%@ include file="/WEB-INF/templates/magnoliaDemoModule/includes/taglibs.jsp"%>

<html>
<head>
<cms:init />
<title>${content.title}</title>
</head>

<body>
	<cms:area name="header" />
	<div style="color: blue;">
		<h4>${content.title}</h4>
	</div>

	<div style="color: green;">
		<h4>${content.text}</h4>
	</div>

	<cms:area name="main" />

	<div style="color: red;">
		<h4>${content.customProperty}</h4>
	</div>
	<cms:area name="footer" />
</body>

</html>
