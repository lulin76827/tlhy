<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.user-resources"/>
<div id="contentarea">				
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1>养生堂</h1>
			<p class="line">&nbsp;</p>
			<sec:authorize ifAllGranted="ROLE_ADMIN">
				<jsp:include page="/WEB-INF/pages/user/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/answer/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/question/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/account/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/medicinesymptom/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/medicine/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/pathogenesis/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/symptom/menu.jsp" />
			</sec:authorize>
			<sec:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
				<jsp:include page="/WEB-INF/pages/category/menu.jsp" />
				<jsp:include page="/WEB-INF/pages/usercategory/menu.jsp" />
			</sec:authorize>
			<sec:authorize ifAllGranted="ROLE_USER">
				<jsp:include page="/WEB-INF/pages/traitdetection/menu.jsp" />
			</sec:authorize>
<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>