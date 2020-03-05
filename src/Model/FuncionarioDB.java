/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 10361
 */
public class FuncionarioDB {

    DBUtils dbu = new DBUtils();
    Connection con = dbu.conectar();

    public void cadastrarFuncionario(String nome, String email, String fone) {
        String sql = "Insert into funcionario(nome, email, telefone) values (?, ?, ?)";
        PreparedStatement pstm;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, email);
            pstm.setString(3, fone);
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao executar o comando");
        }
    }

    public void listarTodosOsFuncionarios() {
        Statement stm;
        try {
            stm = con.createStatement();
            String sql = "select * from funcionario";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void buscarFuncionarioPorNome(String nome){
        String sql = "select * from funcionario where NOME like ?";
        PreparedStatement psm;
        try {
            psm = con.prepareStatement(sql);
            psm.setString(1, nome);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("telefone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
