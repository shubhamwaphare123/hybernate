import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url  ="jdbc:mysql://localhost:3306/shubhamdb1";
	    String username = "root";
	    String password = "root";
	    String sql = "UPDATE student SET name ='aaa' WHERE id=5 ";
	    String sql2 = "select * FROM student Where id>3";


	    Connection connection=null;
	    
		try {
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2
			connection= DriverManager.getConnection(url, username, password);
			//step 3	
			Statement statement = connection.createStatement();
			//step4
			ResultSet resultSet =statement.executeQuery(sql2);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("====================================");
			}



		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("connection closed");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
	}

}
