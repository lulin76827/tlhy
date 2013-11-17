<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.answer-resources"/>
<html>
<head>
<title>View <fmt:message key="answer.title"/> <fmt:message key="user.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="user.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectAnswer?idKey=${answer_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.id.title"/>:
						</td>
						<td>
							${user.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.birthday.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${user.birthday.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.birthplace.title"/>:
						</td>
						<td>
							${user.birthplace}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.currentaddress.title"/>:
						</td>
						<td>
							${user.currentAddress}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.email.title"/>:
						</td>
						<td>
							${user.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.interest.title"/>:
						</td>
						<td>
							${user.interest}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.mobile.title"/>:
						</td>
						<td>
							${user.mobile}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.name.title"/>:
						</td>
						<td>
							${user.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.sex.title"/>:
						</td>
						<td>
							${user.sex}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.sleeptime.title"/>:
						</td>
						<td>
							${user.sleepTime}
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
