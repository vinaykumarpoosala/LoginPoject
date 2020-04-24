import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class RegisterDao 
{
	public static boolean insert(String name ,String email, String pass)
	{
		String sql = "insert into RegisteredUser values(?,?,?)";
		String url = "jdbc:mysql://localhost:3306/vinay";
		String uname ="root";
		String password = "vinay@123";
		String sql1 = "create table "+name+"(posts text)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2,email);
			st.setString(3,pass);
			st.execute();
			PreparedStatement st1 = con.prepareStatement(sql1);
			st1.execute();
			con.close();
			
			return true;
			
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

}
