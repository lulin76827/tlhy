<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.question-resources"/>
<html>
<head>
<title>List <fmt:message key="question.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>管理<fmt:message key="question.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newQuestion"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="question.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="question.type.title"/></th>
					<th class="thead"><fmt:message key="question.questionItem.title"/></th>
					<th class="thead"><fmt:message key="question.questionfield.title"/></th>
					<th class="thead"><fmt:message key="category.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${questions}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectQuestion?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editQuestion?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteQuestion?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.type.label}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.questionItem}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.questionField}
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