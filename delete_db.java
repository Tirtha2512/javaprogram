import java.sql.*;
public class delete_db
{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///db_connect", "root", "");
            Statement st = con.createStatement();
            String qry = "delete from first where roll_no=101";

            int ans=st.executeUpdate(qry);

            if(ans>0)
                System.out.println("recored deleted"+ans);
            else
                System.out.println(" no recored found");

        }
        catch(Exception e)
        {
            System.out.println("Error..."+e);
        }
    }
}
