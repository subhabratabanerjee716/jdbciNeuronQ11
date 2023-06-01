package JdbcQ;
import java.sql.*;
public class Dao {

	public ResultSet select() {
		
		Connection con = GetConnection.getCon();
		
		ResultSet set=null;
		
		try {
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			set =rs;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return set;
		
	}
	
}
