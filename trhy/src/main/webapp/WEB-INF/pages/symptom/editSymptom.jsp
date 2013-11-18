<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.symptom-resources"/>
<html>
<head>
<title>Edit <fmt:message key="symptom.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="symptom.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexSymptom"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveSymptom" method="POST" modelAttribute="symptom">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<c:if test="${not newFlag}">
						<tr>
							<td class="label" valign="top">
								<fmt:message key="symptom.id.title"/>:
							</td>
							<td>
								${symptom.id}
							&nbsp;
								<form:hidden id="symptom_id" path="id"/>
							</td>
						</tr>
					</c:if>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.describ.title"/>:
						</td>
						<td>
							<form:input id="symptom_describ" path="describ" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "symptom_describ",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="symptom.describ.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.symptomfield.title"/>:
						</td>
						<td>
							<form:input id="symptom_symptomField" path="symptomField" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "symptom_symptomField",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="symptom.symptomfield.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.normal.title"/>:
						</td>
						<td>
							<form:checkbox id="symptom_normal" path="normal" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "symptom_normal",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.type.title"/>:
						</td>
						<td>
							<form:select id="symptom_type" path="type" cssStyle="width:200px;" items="${symptomTypes }" itemLabel="label" itemValue="name"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="category.title"/>:
						</td>
						<td>
							<form:select id="symptom_category" path="category.id" cssStyle="width:200px;" items="${categorys }" itemLabel="categoryField" itemValue="id"/>
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