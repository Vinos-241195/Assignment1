import java.sql.*;
public class Contentupdate {
	public static void works() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/laptop";
		String username="root";
		String password="vickyvino";
		String Query="delete from works where stuId=111";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception{
		works();
	}

}
