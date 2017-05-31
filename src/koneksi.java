

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class koneksi {
Connection conn;
Statement st;
ResultSet rs; 
public static  java.sql.Connection setKoneksi() {
        String konString = "jdbc:mysql://localhost:3306/koperasi";
        java.sql.Connection koneksi = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (java.sql.Connection)
                    DriverManager.getConnection(konString,"root","");
            System.out.println("Koneksi Berhasil");
        }catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }return koneksi;
    }
    public static int execute(String SQL) {
        int status = 0;
        java.sql.Connection koneksi = setKoneksi();
        try{
            Statement st = koneksi.createStatement();
            status = st.executeUpdate(SQL);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    public static ResultSet executeQuery(String SQL) {
        ResultSet rs = null;
        java.sql.Connection koneksi = setKoneksi();
        try{
            Statement st = koneksi.createStatement();
            rs = st.executeQuery(SQL);
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }return rs;
    }
    static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported"
                + "yet.");
    }
}