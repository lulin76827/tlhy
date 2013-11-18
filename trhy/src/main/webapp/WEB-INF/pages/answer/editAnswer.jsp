<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.answer-resources"/>
<html>
<head>
<title>Edit <fmt:message key="answer.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="answer.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAnswer"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveAnswer" method="POST" modelAttribute="answer">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<c:if test="${not newFlag}">
						<tr>
							<td class="label" valign="top">
								<fmt:message key="answer.id.title"/>:
							</td>
							<td>
								${answer.id}
							&nbsp;
								<form:hidden id="answer_id" path="id"/>
							</td>
						</tr>
					</c:if>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.title"/>:
						</td>
						<td>
							<form:select id="answer_user" path="user.id" cssStyle="width:200px;" items="${users }" itemLabel="name" itemValue="id"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="question.title"/>:
						</td>
						<td>
							<form:select id="answer_question" path="question.id" cssStyle="width:300px;" items="${questions }" itemLabel="label" itemValue="id"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="answer.record.title"/>:
						</td>
						<td>
							<form:input id="answer_record" path="record" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "answer_record",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="answer.record.help"/>", constraints : {places:0}}})); </script>
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