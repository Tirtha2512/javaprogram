import java.sql.*;
public class display_db
{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///db_connect", "root", "");
            Statement st = con.createStatement();

            String qry = "select * from first";

            ResultSet rs=st.executeQuery(qry);
            while (rs.next())
            {
              String roll = rs.getString("roll_no");
                String nm= rs.getString("Name");

                System.out.println(roll+""+nm);

            }
        }
        catch(Exception e)
        {
            System.out.println("Error..."+e);
        }
    }
}
