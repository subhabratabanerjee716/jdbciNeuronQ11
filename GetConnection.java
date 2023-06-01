package JdbcQ;
import java.sql.*;
public class GetConnection {
	
	static public Connection getCon()  {
	
		Connection connect = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","1234");
		
		connect=con;
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connect;
	
	
	}
}
