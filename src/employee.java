import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employee {
	public static void main(String[] args) {
		
		String url  ="jdbc:mysql://localhost:3306/shubhamdb1";
	    String username = "root";
	    String password = "root";
	    String sql="INSERT INTO employee VALUES(10,'a',25,'marketing')";
	    String sql2 = "select * FROM student Where id>3";

	    
	    //STEP 1 LOAD/REGISTER THE DRIVE
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2: establish connection
			Connection connection= DriverManager.getConnection(url, username, password);
			
			//3: establish statement
			Statement statement = connection.createStatement();
			
			//4:execute statement
			
			statement.execute(sql2);
			
			//5: close
			
			connection.close();
			System.out.println("all good");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
