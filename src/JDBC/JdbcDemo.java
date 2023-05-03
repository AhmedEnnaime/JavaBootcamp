package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/java_demo";
        Connection conn = null;

        int rollno = 2;
        String name = "Jane";
        int age = 22;
        String sql = "insert into student (rollno, name, age) " + "values(" + rollno + ",'" + name + "'," + age + ")";

        try {
            conn = DriverManager.getConnection(url, "postgres", "");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m == 1){
                System.out.println("inserted successfully : " + sql);
            } else {
                System.out.println("insertion failed");
            }
        }catch (Exception ex){
            System.err.println(ex);
        }finally {
            conn.close();
        }
    }
}
