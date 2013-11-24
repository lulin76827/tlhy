<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.traitdetection-resources"/>
<html>
<head>
<title><fmt:message key="traitdetection.title"/></title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="traitdetection.title"/></h1>
		<div id="tablewrapper">
		<form:form action="${pageContext.request.contextPath}/saveResult" method="POST" modelAttribute="traitdetection">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead">项目</th>
					<th class="thead">问题</th>
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
						<form:hidden path="totalResult" value="${current.id}"/>
						<form:checkbox path="result" value="${current.id}"/>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.questionItem}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.questionField}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>