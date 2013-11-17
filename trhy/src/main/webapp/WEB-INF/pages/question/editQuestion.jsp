<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.question-resources"/>
<html>
<head>
<title>Edit <fmt:message key="question.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="question.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexQuestion"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveQuestion" method="POST" modelAttribute="question">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="question.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="question_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "question_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="question.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${question.id}
						&nbsp;
									<form:hidden id="question_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="question.questionfield.title"/>:
						</td>
						<td>
							<form:input id="question_questionField" path="questionField" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "question_questionField",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="question.questionfield.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="question.category.title"/>:
						</td>
						<td>
							<form:select id="question_category" path="category.id" cssStyle="width:200px;" items="${categorys }" itemLabel="categoryField" itemValue="id"/>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>