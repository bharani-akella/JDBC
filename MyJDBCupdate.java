package interview;
import java.sql.*;
public class MyJDBCupdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interview","root","avisibha");
Statement st=con.createStatement();
st.executeUpdate("update book set name='tim' where author='avinash'");

ResultSet rs=st.executeQuery("Select * from book");

System.out.println("Name Cost Author");
while(rs.next()){
	System.out.println(rs.getString("name")+" "+rs.getInt("cost")+" "+rs.getString("author"));
}
		
con.close();		
	}

}
