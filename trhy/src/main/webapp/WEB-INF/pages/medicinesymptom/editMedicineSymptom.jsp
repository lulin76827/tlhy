<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.medicinesymptom-resources"/>
<html>
<head>
<title>Edit <fmt:message key="medicinesymptom.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="medicinesymptom.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexMedicineSymptom"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveMedicineSymptom" method="POST" modelAttribute="medicinesymptom">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<c:if test="${not newFlag}">
						<tr>
							<td class="label" valign="top">
								<fmt:message key="medicinesymptom.id.title"/>:
							</td>
							<td>
								${medicinesymptom.id}
							&nbsp;
								<form:hidden id="medicinesymptom_id" path="id"/>
							</td>
						</tr>
					</c:if>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="medicine.title"/>:
						</td>
						<td>
							<form:select id="medicinesymptom_medicine" path="medicine.id" cssStyle="width:200px;" items="${medicines }" itemLabel="medicineField" itemValue="id"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.title"/>:
						</td>
						<td>
							<form:select id="medicinesymptom_symptom" path="symptom.id" cssStyle="width:200px;" items="${symptoms }" itemLabel="symptomField" itemValue="id"/>
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