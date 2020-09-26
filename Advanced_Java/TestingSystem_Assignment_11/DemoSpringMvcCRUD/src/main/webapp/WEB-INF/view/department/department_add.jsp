<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head></head>
<body>

	<h1>Add department</h1>

	<form method="POST" action="add" modelAttribute="department">
		<table>
			<tr>
				<td><label for="id">DepartmentID: </label></td>
				<td><input name="id" readonly="readonly" /></td>
			</tr>
			<tr>
				<td><label for="name">DepartmentName: </label></td>
				<td><input name="name" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Add/Update" /></td>
			</tr>
		</table>
	</form>

</body>
</html>