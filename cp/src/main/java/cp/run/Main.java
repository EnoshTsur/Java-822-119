package cp.run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import cp.connections.run.ConnectionPool;
import entities.User;

public class Main {

	public static void main(String[] args) {

		ConnectionPool pool = ConnectionPool.getInstance();
		
		Connection connection = pool.getConnection();
		
		try(PreparedStatement preparedStatement = connection.prepareStatement("select * from users")) {
					
			ResultSet resultSet = preparedStatement.executeQuery();

			User user = null;
			
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				int age = resultSet.getInt(4);
				LocalDate birthDate = resultSet.getDate(5).toLocalDate();
				user = new User(id, firstName, lastName, age, birthDate);
				System.out.println(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
