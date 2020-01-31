package jdbc.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import jdbc.entites.User;

public class Main {

	public static void main(String[] args) {
		User user = getUsersFromDb(123);
		
		System.out.println(user);
	}

	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db" + "?user=root"
					+ "&password=root" + "&useUnicode=true" + "&useJDBCCompliantTimezoneShift=true"
					+ "&useLegacyDatetimeCode=false" + "&serverTimezone=UTC");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	
	public static User getUsersFromDb(long id) {
		User user = null;
		Connection connection = getConnection();
		try (PreparedStatement pstmt = connection.prepareStatement("select * from users where id = ?")) {

			pstmt.setLong(1, id);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				long userId = rs.getLong(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				int age = rs.getInt(4);
				LocalDate birthDate = rs.getDate(5).toLocalDate();

				user = new User(userId, firstName, lastName, age, birthDate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;

	}
}

