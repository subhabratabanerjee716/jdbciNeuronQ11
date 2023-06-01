package JdbcQ;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Dao d = new Dao();
		ResultSet r=d.select();
		
		while(r.next()) {
			
			
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
		}

	}

}
