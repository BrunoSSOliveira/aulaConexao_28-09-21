
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    
    public Connection conectaBD(){
        
        Connection conn = null;
        
        String url = "jdbc:mysql://db4free.net:3306/bdaulateste";
        String user = "rogeripa";
        String password = "12345678";
        
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO - conectaBD()" + erro);
        }
        return conn;
    }
    
}
