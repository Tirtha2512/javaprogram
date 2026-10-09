import java.sql.*;
public class db_connect
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///db_connect","root","");
            Statement st=con.createStatement();
            String qry="create table first(roll_no int,name varchar(10))";

            int ans=st.executeUpdate(qry);
            System.out.println("table created first try..."+ans);
        }
        catch(Exception e)
        {
            System.out.println("Error..."+e);
        }
    }
}
