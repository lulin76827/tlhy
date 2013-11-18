<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.category-resources"/>
<html>
<head>
<title>Edit <fmt:message key="category.title"/> <fmt:message key="usercategory.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="usercategory.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectCategory?idKey=${category_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveCategoryUserCategories" method="POST" modelAttribute="usercategory">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<c:if test="${not newFlag}">
						<tr>
							<td class="label" valign="top">
								<fmt:message key="usercategory.id.title"/>:
							</td>
							<td>
								${usercategory.id}
							&nbsp;
								<form:hidden id="usercategory_id" path="id"/>
							</td>
						</tr>
					</c:if>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="usercategory.score.title"/>:
						</td>
						<td>
							<form:input id="usercategory_score" path="score" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "usercategory_score",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="usercategory.score.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="usercategory.createtime.title"/>:
						</td>
						<td>
							<input id="usercategory_createTime" name="createTime" type="text" value="<fmt:formatDate value="${usercategory.createTime.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "usercategory_createTime",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="category_id" value="${category_id}" >
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
