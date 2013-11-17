<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.medicinesymptom-resources"/>
<html>
<head>
<title>View <fmt:message key="medicinesymptom.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="medicinesymptom.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexMedicineSymptom"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="medicinesymptom.id.title"/>:
						</td>
						<td>
							${medicinesymptom.id}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="symptom.title"/></h1>
					
						<c:if test='${medicinesymptom.symptom != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="symptom.describ.title"/>:
						</td>
						<td>
							${medicinesymptom.symptom.describ}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="symptom.symptomfield.title"/>:
						</td>
						<td>
							${medicinesymptom.symptom.symptomField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="symptom.normal.title"/>:
						</td>
						<td>
							${medicinesymptom.symptom.normal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="symptom.type.title"/>:
						</td>
						<td>
							${medicinesymptom.symptom.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editMedicineSymptomSymptom?medicinesymptom_id=${medicinesymptom.id}&symptom_id=${medicinesymptom.symptom.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteMedicineSymptomSymptom?medicinesymptom_id=${medicinesymptom.id}&related_symptom_id=${medicinesymptom.symptom.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${medicinesymptom.symptom == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newMedicineSymptomSymptom?medicinesymptom_id=${medicinesymptom.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="symptom.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="medicine.title"/></h1>
					
						<c:if test='${medicinesymptom.medicine != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="medicine.describ.title"/>:
						</td>
						<td>
							${medicinesymptom.medicine.describ}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="medicine.medicinefield.title"/>:
						</td>
						<td>
							${medicinesymptom.medicine.medicineField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="medicine.type.title"/>:
						</td>
						<td>
							${medicinesymptom.medicine.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editMedicineSymptomMedicine?medicinesymptom_id=${medicinesymptom.id}&medicine_id=${medicinesymptom.medicine.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteMedicineSymptomMedicine?medicinesymptom_id=${medicinesymptom.id}&related_medicine_id=${medicinesymptom.medicine.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${medicinesymptom.medicine == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newMedicineSymptomMedicine?medicinesymptom_id=${medicinesymptom.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="medicine.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>