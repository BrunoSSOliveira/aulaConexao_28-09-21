/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author UNIP
 */
public class UsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarUsuario(UsuarioDTO objUsuarioDTO){
        
        String sql = "insert into usuarios (usuario,nome,endereco,senha) values (?,?,?,?)";
        ConexaoDAO objConexaoDAO = new ConexaoDAO();
        conn = objConexaoDAO.conectaBD();
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getUsuario());
            pstm.setString(2, objUsuarioDTO.getNome());
            pstm.setString(3, objUsuarioDTO.getEndereco());
            pstm.setString(4, objUsuarioDTO.getSenha());
            
            pstm.execute();
            conn.close();
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"UsuarioDAO - cadastrarUsuario" + e);
                    
        }
        
                
    }
}
