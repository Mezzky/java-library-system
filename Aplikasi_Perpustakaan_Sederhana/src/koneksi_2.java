
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi_2 {
    Connection con;
    public Connection getConnection(){
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n"+e);
        }
        return con;
    }
}
