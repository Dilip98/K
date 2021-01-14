import java.sql.*;

public class DemoClass
	{
		public static void main(String[] args) throws Exception
			{
					String url="jdbc:mysql://localhost:3306/sys";
						String uname="root";
						String pass="Dilip123";
						String query="select * From student1 ";
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection(url,uname,pass);
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery(query);
						String name="";	
						while(rs.next())
						{
							name=rs.getInt(1)+" : " + rs.getString(2);
							System.out.println(name);
						}
		                st.close();		
						con.close();
				}
				
	
		}
				
		
	
