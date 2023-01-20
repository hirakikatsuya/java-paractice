import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCtransaction {

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL);
			connection.setAutoCommit(false);
			PreparedStatement statement = connection.prepareStatement("update user set money = ? where id = ?") ;
			statement.setLong(1, 44000);
			statement.setLong(2, 2L);
			statement.execute();
			statement.setLong(1, 22000);
			statement.setLong(2, 1L);
			statement.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}