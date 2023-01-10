package AplikasiGaji;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDB {
    
    static final String jdbc_driver = "com.mysql.jdbc.Driver";
    static final String url         = "jdbc:mysql://localhost:3306/gaji_karyawan";
    static final String user        = "root";
    static final String pass        = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase (){
        try {
            Class.forName(jdbc_driver);
        } catch (ClassNotFoundException cnf){
        
        }
        
        try {
            conn=(Connection) DriverManager.getConnection(url, user, pass); 
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal!");
        }
        return conn;
    }
}