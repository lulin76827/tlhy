<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.category-resources"/>
<html>
<head>
<title>View <fmt:message key="category.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="category.title"/>详情</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCategory"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="category.id.title"/>:
						</td>
						<td>
							${category.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="category.categoryfield.title"/>:
						</td>
						<td>
							${category.categoryField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="category.describ.title"/>:
						</td>
						<td>
							${category.describ}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="symptom.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCategorySymptoms?category_id=${category.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="symptom.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="symptom.describ.title"/></th>
						<th class="thead"><fmt:message key="symptom.symptomfield.title"/></th>
						<th class="thead"><fmt:message key="symptom.normal.title"/></th>
						<th class="thead"><fmt:message key="symptom.type.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${category.symptoms}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCategorySymptoms?category_id=${category.id}&symptoms_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCategorySymptoms?category_id=${category.id}&symptoms_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCategorySymptoms?category_id=${category.id}&related_symptoms_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.describ}
						&nbsp;
						</td>
						<td>
							${current.symptomField}
						&nbsp;
						</td>
						<td>
							${current.normal}
						&nbsp;
						</td>
						<td>
							${current.type}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="question.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCategoryQuestions?category_id=${category.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="question.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="question.type.title"/></th>
						<th class="thead"><fmt:message key="question.questionItem.title"/></th>
						<th class="thead"><fmt:message key="question.questionfield.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${category.questions}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCategoryQuestions?category_id=${category.id}&questions_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCategoryQuestions?category_id=${category.id}&questions_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCategoryQuestions?category_id=${category.id}&related_questions_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td nowrap="nowrap" class="tabletd">
						
							${current.type.label}
						&nbsp;
						</td>
						<td nowrap="nowrap" class="tabletd">
							
								${current.questionItem}
							&nbsp;
						</td>
						<td>
							${current.questionField}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="medicine.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCategoryMedicines?category_id=${category.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="medicine.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="medicine.describ.title"/></th>
						<th class="thead"><fmt:message key="medicine.medicinefield.title"/></th>
						<th class="thead"><fmt:message key="medicine.type.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${category.medicines}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCategoryMedicines?category_id=${category.id}&medicines_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCategoryMedicines?category_id=${category.id}&medicines_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCategoryMedicines?category_id=${category.id}&related_medicines_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.describ}
						&nbsp;
						</td>
						<td>
							${current.medicineField}
						&nbsp;
						</td>
						<td>
							${current.type}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="pathogenesis.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCategoryPathogenesises?category_id=${category.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="pathogenesis.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="pathogenesis.describ.title"/></th>
						<th class="thead"><fmt:message key="pathogenesis.pathogenesisfield.title"/></th>
						<th class="thead"><fmt:message key="pathogenesis.type.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${category.pathogenesises}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCategoryPathogenesises?category_id=${category.id}&pathogenesises_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCategoryPathogenesises?category_id=${category.id}&pathogenesises_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCategoryPathogenesises?category_id=${category.id}&related_pathogenesises_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.describ}
						&nbsp;
						</td>
						<td>
							${current.pathogenesisField}
						&nbsp;
						</td>
						<td>
							${current.type}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="usercategory.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCategoryUserCategories?category_id=${category.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usercategory.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="usercategory.score.title"/></th>
						<th class="thead"><fmt:message key="usercategory.createtime.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${category.userCategories}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCategoryUserCategories?category_id=${category.id}&usercategories_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCategoryUserCategories?category_id=${category.id}&usercategories_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCategoryUserCategories?category_id=${category.id}&related_usercategories_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.score}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.createTime.time}"/>
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