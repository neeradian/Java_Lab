import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample{
    static final String DB_URL = "jdbc:mysql://localhost/0";
    static final String USER = "guest";
    static final String PASS = "guest123";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS))
        {
            Statement stmt = conn.createStatement();
            String sql ="CREATE DATABASE STUDENTS";
            stmt.executeUpdate(sql);
            System.out.println("Database created Succesfully...");

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}