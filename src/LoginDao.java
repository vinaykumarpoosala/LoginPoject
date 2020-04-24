import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.protocol.Resultset;

public class LoginDao 
{
	public static boolean check(String name ,String pass)
	{
		
		String sql = "select * from registereduser where name=? and password=?";
		String url = "jdbc:mysql://localhost:3306/vinay";
		String uname ="root";
		String password = "vinay@123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, pass);
			boolean rs = st.execute();
			if(rs)
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
