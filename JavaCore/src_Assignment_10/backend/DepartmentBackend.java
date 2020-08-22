package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Department;
import ultis.jdbcUntils;

public class DepartmentBackend {

	public Department getDepartmentByID(int id) throws Exception {

		// get connection
		Connection connection = jdbcUntils.connect();

		// Create a statement object
		String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setInt(1, id);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// Step 5: handling result set
		if (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentId"));
			department.setName(resultSet.getString("DepartmentName"));

			jdbcUntils.disconnect();
			return department;

		} else {
			jdbcUntils.disconnect();
			throw new Exception(
					messagePoperties.getProperty("department.getDepartmentByID.cannotFindDepartmentById") + id);
		}
	}
}
	