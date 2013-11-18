<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.medicine-resources"/>
<html>
<head>
<title>View <fmt:message key="medicine.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="medicine.title"/>详情</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexMedicine"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="medicine.id.title"/>:
						</td>
						<td>
							${medicine.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="medicine.describ.title"/>:
						</td>
						<td>
							${medicine.describ}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="medicine.medicinefield.title"/>:
						</td>
						<td>
							${medicine.medicineField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="medicine.type.title"/>:
						</td>
						<td>
							${medicine.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="category.title"/></h1>
					
						<c:if test='${medicine.category != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="category.categoryfield.title"/>:
						</td>
						<td>
							${medicine.category.categoryField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="category.describ.title"/>:
						</td>
						<td>
							${medicine.category.describ}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editMedicineCategory?medicine_id=${medicine.id}&category_id=${medicine.category.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteMedicineCategory?medicine_id=${medicine.id}&related_category_id=${medicine.category.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${medicine.category == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newMedicineCategory?medicine_id=${medicine.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="category.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="medicinesymptom.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newMedicineMedicineSymptoms?medicine_id=${medicine.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="medicinesymptom.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="symptom.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${medicine.medicineSymptoms}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectMedicineMedicineSymptoms?medicine_id=${medicine.id}&medicinesymptoms_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editMedicineMedicineSymptoms?medicine_id=${medicine.id}&medicinesymptoms_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteMedicineMedicineSymptoms?medicine_id=${medicine.id}&related_medicinesymptoms_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td nowrap="nowrap" class="tabletd">
						
							${current.symptom.symptomField}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>