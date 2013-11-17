<%@page language="java" isELIgnored="false" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.answer-resources"/>
<html>
<head>
<title>View <fmt:message key="answer.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="answer.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAnswer"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="answer.id.title"/>:
						</td>
						<td>
							${answer.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="answer.record.title"/>:
						</td>
						<td>
							${answer.record}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="answer.createtime.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${answer.createTime.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="user.title"/></h1>
					
						<c:if test='${answer.user != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="user.birthday.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${answer.user.birthday.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.birthplace.title"/>:
						</td>
						<td>
							${answer.user.birthplace}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.currentaddress.title"/>:
						</td>
						<td>
							${answer.user.currentAddress}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.email.title"/>:
						</td>
						<td>
							${answer.user.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.interest.title"/>:
						</td>
						<td>
							${answer.user.interest}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.mobile.title"/>:
						</td>
						<td>
							${answer.user.mobile}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.name.title"/>:
						</td>
						<td>
							${answer.user.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.sex.title"/>:
						</td>
						<td>
							${answer.user.sex}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="user.sleeptime.title"/>:
						</td>
						<td>
							${answer.user.sleepTime}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editAnswerUser?answer_id=${answer.id}&user_id=${answer.user.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteAnswerUser?answer_id=${answer.id}&related_user_id=${answer.user.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${answer.user == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAnswerUser?answer_id=${answer.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="user.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="question.title"/></h1>
					
						<c:if test='${answer.question != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="question.questionfield.title"/>:
						</td>
						<td>
							${answer.question.questionField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editAnswerQuestion?answer_id=${answer.id}&question_id=${answer.question.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteAnswerQuestion?answer_id=${answer.id}&related_question_id=${answer.question.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${answer.question == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAnswerQuestion?answer_id=${answer.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="question.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>