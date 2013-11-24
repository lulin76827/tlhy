<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>

<sec:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">  
	<sec:authentication property="principal" var="authentication"/>
 	 用户名：${authentication.username }<span style="padding-left: 10px;"/>
 <a href="<c:url value="j_spring_security_logout"/>">退出</a><span style="padding-left: 20px;"/>   
</sec:authorize>

<sec:authorize ifNotGranted="ROLE_USER,ROLE_ADMIN"> 
	<c:if test="${error}">
		<div style="color:orange;">
			用户名或者密码错误
		</div>
	</c:if>
	<form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'>
		<table cellpadding="0" cellspacing="0" id="viewTable">
			<tr>
				<td class="label" valign="top">用户名：</td>
				<td  cssStyle="width:200px;"><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td class="label" valign="top">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
				<td  cssStyle="width:200px;"><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td>
				&nbsp;
				</td>
				<td>
				<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="登录"/></span>
				</td>
			</tr>
		</table>
	</form>
</sec:authorize>
    