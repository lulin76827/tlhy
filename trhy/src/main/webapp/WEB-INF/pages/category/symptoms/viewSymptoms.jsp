<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.category-resources"/>
<html>
<head>
<title>View <fmt:message key="category.title"/> <fmt:message key="symptom.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="symptom.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectCategory?idKey=${category_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.id.title"/>:
						</td>
						<td>
							${symptom.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.describ.title"/>:
						</td>
						<td>
							${symptom.describ}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.symptomfield.title"/>:
						</td>
						<td>
							${symptom.symptomField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.normal.title"/>:
						</td>
						<td>
							${symptom.normal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.type.title"/>:
						</td>
						<td>
							${symptom.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
