<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.symptom-resources"/>
<html>
<head>
<title>View <fmt:message key="symptom.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="symptom.title"/>详情</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexSymptom"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.id.title"/>:
						</td>
						<td>
							${symptom.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.describ.title"/>:
						</td>
						<td>
							${symptom.describ}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.symptomfield.title"/>:
						</td>
						<td>
							${symptom.symptomField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.normal.title"/>:
						</td>
						<td>
							${symptom.normal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="symptom.type.title"/>:
						</td>
						<td>
							${symptom.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="category.title"/></h1>
					
						<c:if test='${symptom.category != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="category.categoryfield.title"/>:
						</td>
						<td>
							${symptom.category.categoryField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="category.describ.title"/>:
						</td>
						<td>
							${symptom.category.describ}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editSymptomCategory?symptom_id=${symptom.id}&category_id=${symptom.category.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteSymptomCategory?symptom_id=${symptom.id}&related_category_id=${symptom.category.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${symptom.category == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSymptomCategory?symptom_id=${symptom.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="category.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="medicinesymptom.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSymptomMedicineSymptoms?symptom_id=${symptom.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="medicinesymptom.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="medicine.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${symptom.medicineSymptoms}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectSymptomMedicineSymptoms?symptom_id=${symptom.id}&medicinesymptoms_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editSymptomMedicineSymptoms?symptom_id=${symptom.id}&medicinesymptoms_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteSymptomMedicineSymptoms?symptom_id=${symptom.id}&related_medicinesymptoms_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td nowrap="nowrap" class="tabletd">
						
							${current.medicine.medicineField}
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