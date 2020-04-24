import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchPosts
{
	public static ResultSet getResultSet(String name)
	{
		String sql = "select * from "+name;
		String url = "jdbc:mysql://localhost:3306/vinay";
		String uname ="root";
		String password = "vinay@123";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			
			ResultSet rs =st.executeQuery();
			System.out.println(rs.getRow());
			con.close();
			return rs;
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

}
