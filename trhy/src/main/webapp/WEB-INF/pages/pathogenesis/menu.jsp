<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.pathogenesis-resources"/>
<a class="button" href="${pageContext.request.contextPath}/indexPathogenesis"><span><img src="images/icons/view.gif" /><fmt:message key="navigation.view"/><fmt:message key="pathogenesis.title"/>列表</span></a>
