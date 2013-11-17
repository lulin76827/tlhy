<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.user-resources"/>
<html>
<head>
<title>View <fmt:message key="user.title"/> <fmt:message key="usercategory.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="usercategory.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectUser?idKey=${user_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="usercategory.id.title"/>:
						</td>
						<td>
							${usercategory.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="usercategory.score.title"/>:
						</td>
						<td>
							${usercategory.score}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="usercategory.createtime.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${usercategory.createTime.time}"/>
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
