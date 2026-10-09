import java.sql.*;
public class update_db
{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///db_connect", "root", "");
            Statement st = con.createStatement();

            String qry = "Update first set name='ram' where roll_no=101";
            st.executeUpdate(qry);
            System.out.println("recored updated....");
        }
        catch(Exception e)
        {
            System.out.println("Error..."+e);
        }
    }
}
