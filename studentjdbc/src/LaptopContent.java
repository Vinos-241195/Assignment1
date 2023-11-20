import java.sql.*;
public class LaptopContent {

	public static void works() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/laptop";
		String username="root";
		String password="vickyvino";
		String Query="select * from works";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("student"+rs.getString(1));
			System.out.println("stuId"+rs.getInt(2));
						
		}
		con.close();
	}
	public static void main(String[]args) throws Exception{
		works();
	}
}
