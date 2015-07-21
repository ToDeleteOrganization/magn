<%@ include file="/templates/heoolo-world/includes/taglibs.jsp"%>

<html>

	<head>
		<cms:init />
		<title>${content.title}</title>
		<link href="/hyapp/docroot/heoolo-world/css/style.css" rel="stylesheet" type="text/css" media="all">

		<script type="text/javascript" src="/hyapp/docroot/heoolo-world/js/jquery-1.9.1.min.js"></script>
		<script type="text/javascript" src="/hyapp/docroot/heoolo-world/js/bootstrap.min.js"></script>
	</head>

	<body>
		<cms:area name="header" />

		<cms:area name="mainArea" />

		<cms:area name="footer" />
	</body>

</html>
