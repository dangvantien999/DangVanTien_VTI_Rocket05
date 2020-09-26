<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head></head>

<body>

	<h1>Department List</h1>

	<h1>${departments}</h1>

	<table>
		<tr>
			<td>DepartmentID</td>
			<td>DepartmentName</td>
			<td></td>
		</tr>
		<c:forEach items="${departments}" var="dept">
			<tr>
				<td>${dept.id}</td>
				<td>${dept.name}</td>
				<td><a href="<c:url value='/departments/updateInput/${dept.id}' />">update</a></td>
				<td><a href="<c:url value='/departments/delete/${dept.id}' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>