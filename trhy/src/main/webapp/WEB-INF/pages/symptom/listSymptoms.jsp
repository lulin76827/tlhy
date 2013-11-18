<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.symptom-resources"/>
<html>
<head>
<title>List <fmt:message key="symptom.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>管理<fmt:message key="symptom.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSymptom"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="symptom.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="symptom.describ.title"/></th>
					<th class="thead"><fmt:message key="symptom.symptomfield.title"/></th>
					<th class="thead"><fmt:message key="symptom.normal.title"/></th>
					<th class="thead"><fmt:message key="symptom.type.title"/></th>
					<th class="thead"><fmt:message key="category.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${symptoms}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectSymptom?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editSymptom?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteSymptom?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.describ}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.symptomField}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.normal}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.type.label}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.category.categoryField}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>