import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCase1 {
	public static void main(String[] args) {
		
		String url  ="jdbc:mysql://localhost:3306/shubhamdb1";
	    String username = "root";
	    String password = "root";
	    String sql="DELETE FROM student WHERE id=2";

	    Connection connection=null;
	
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2: establish connection
			connection= DriverManager.getConnection(url, username, password);
			
			//3: establish statement
			Statement statement = connection.createStatement();
			
			//4:execute statement
			
			statement.execute(sql);
			
			//5: close
			
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("all good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
