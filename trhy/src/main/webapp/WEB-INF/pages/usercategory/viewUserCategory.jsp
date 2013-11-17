<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.usercategory-resources"/>
<html>
<head>
<title>View <fmt:message key="usercategory.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="usercategory.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexUserCategory"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="user.title"/></h1>
					
						<c:if test='${usercategory.user != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="user.birthday.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${usercategory.user.birthday.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.birthplace.title"/>:
						</td>
						<td>
							${usercategory.user.birthplace}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.currentaddress.title"/>:
						</td>
						<td>
							${usercategory.user.currentAddress}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.email.title"/>:
						</td>
						<td>
							${usercategory.user.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.interest.title"/>:
						</td>
						<td>
							${usercategory.user.interest}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.mobile.title"/>:
						</td>
						<td>
							${usercategory.user.mobile}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.name.title"/>:
						</td>
						<td>
							${usercategory.user.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.sex.title"/>:
						</td>
						<td>
							${usercategory.user.sex}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.sleeptime.title"/>:
						</td>
						<td>
							${usercategory.user.sleepTime}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editUserCategoryUser?usercategory_id=${usercategory.id}&user_id=${usercategory.user.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteUserCategoryUser?usercategory_id=${usercategory.id}&related_user_id=${usercategory.user.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${usercategory.user == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUserCategoryUser?usercategory_id=${usercategory.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="user.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="category.title"/></h1>
					
						<c:if test='${usercategory.category != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="category.categoryfield.title"/>:
						</td>
						<td>
							${usercategory.category.categoryField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="category.describ.title"/>:
						</td>
						<td>
							${usercategory.category.describ}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editUserCategoryCategory?usercategory_id=${usercategory.id}&category_id=${usercategory.category.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteUserCategoryCategory?usercategory_id=${usercategory.id}&related_category_id=${usercategory.category.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${usercategory.category == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUserCategoryCategory?usercategory_id=${usercategory.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="category.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>