import java.sql.*;

public class StudentInsert{
	public static void insert()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/laptop";
		String username="root";
		String password="vickyvino";
		String Query="insert into works values(?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setString(1,"aakash");
		pst.setInt(2, 555);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception{
		insert();
	}

}