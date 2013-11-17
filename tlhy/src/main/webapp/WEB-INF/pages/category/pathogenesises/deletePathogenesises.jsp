<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.category-resources"/>
<html>
<head>
<title>View <fmt:message key="category.title"/> <fmt:message key="pathogenesis.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="pathogenesis.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectCategory?idKey=${category_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="pathogenesis.id.title"/>:
						</td>
						<td>
							${pathogenesis.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="pathogenesis.describ.title"/>:
						</td>
						<td>
							${pathogenesis.describ}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="pathogenesis.pathogenesisfield.title"/>:
						</td>
						<td>
							${pathogenesis.pathogenesisField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="pathogenesis.type.title"/>:
						</td>
						<td>
							${pathogenesis.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteCategoryPathogenesises?category_id=${category_id}&related_pathogenesises_id=${pathogenesis.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
