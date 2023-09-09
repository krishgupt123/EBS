package Electricity;
import java.sql.*;
public class Conn {
  Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///project2", "root", "Admin");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}