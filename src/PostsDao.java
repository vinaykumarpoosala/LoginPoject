import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PostsDao 
{
	public static boolean getResultSet(String name,String postdata,String title)
	{
		String sql = "insert into "+name+"values(?,?)";
		String url = "jdbc:mysql://localhost:3306/vinay";
		String uname ="root";
		String password = "vinay@123";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, postdata);
			st.setString(2, title);
			st.execute();
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
