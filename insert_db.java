import java.sql.*;
public class insert_db
{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///db_connect", "root", "");
            Statement st = con.createStatement();
            int roll_no = 101;
            String nm = "php";

            String qry = "insert into first(roll_no,name)values('" + roll_no + "','" + nm + "'),(201,'Mysql')";

            int ans=st.executeUpdate(qry);
            System.out.println("recored inserted...."+ans);
        }
        catch(Exception e)
        {
            System.out.println("Error..."+e);
        }
    }
}
