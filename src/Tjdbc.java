import java.sql.*;

class Tjdbc {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/travel_mngt";
            String user = "root";
            String pwd = "29-05-2004";
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection Established");

            Statement st = con.createStatement();
            
            
            String q = "create table bticket ("
                    + "`name` varchar(30), "
                    + "`from` varchar(30), "
                    + "`to` varchar(20), "
                    + "`date` varchar(20), "
                    + "`time` varchar(10), "
                    + "ticket varchar(10), "
                    + "`class` varchar(15), "
                    + "passengers varchar(15), "
                    + "price varchar(15) "
                    + ")";
                st.execute(q); 
            
             String q2 = "create table detail ("
                    + "first varchar(30), "
                    + "surname varchar(20), "
                    + "address varchar(30), "
                    + "postcode varchar(10), "
                    + "phone integer(20), "
                    + "Email varchar(30), "
                    + "rTAx double, "
                    + "rSubTotal double, "
                    + "rTotal double"
                    + ")"; 
                st.execute(q2); 
                
            System.out.println("Table created successfully");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            if (con != null) {
                con.close();
                System.out.println("Connection closed");
            }
        }
    }
}
