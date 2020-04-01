/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.DaoHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author fabio
 */
public class LivroDB {
    DaoHelper dcon = new DaoHelper();
    Connection con = null;
    public LivroDB() {
        con = dcon.conectar();
    }
    
    public int cadastrarLivro(String titulo, String  autores, 
        String editora, String cidade, String ano, String resumo) {
        String sql = "insert into livros values(?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm;
        int retorno=0;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, titulo);
            pstm.setString(2, autores);
            pstm.setString(3, editora);
            pstm.setString(4, cidade);
            pstm.setString(5, ano);
            pstm.setString(6, resumo);
            retorno = pstm.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Não conseguiu enviar comando para o banco de dados");
        }
    return retorno;
    }
     public void buscarAutor(String autor){
        try {
            String sql = "select * from livros where autores like ?";
            PreparedStatement pstm;
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, autor);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("Titulo:" + rs.getString("titulo"));
                System.out.println("Autores:" + rs.getString("autores"));
                System.out.println("Editora:" + rs.getString("editora"));
                System.out.println("Cidade:" + rs.getString("cidade"));
                System.out.println("Ano:" + rs.getString("ano"));
                System.out.println("Resumo:" + rs.getString("resumo"));
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível executar a consulta");
        }
        
        
    }
    public void listarLivro(){
        try {
            Statement stm = null;
            stm = con.createStatement();
            String sql = "select * from livros";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Titulo:" + rs.getString("titulo"));
                System.out.println("Autores:" + rs.getString("autores"));
                System.out.println("Editora:" + rs.getString("editora"));
                System.out.println("Cidade:" + rs.getString("cidade"));
                System.out.println("Ano:" + rs.getString("ano"));
                System.out.println("Resumo:" + rs.getString("resumo"));
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível selecionar os dados");
        }
        
    }
    public int removerLivro(String titulo){
        int retorno = 0;
        PreparedStatement pstm = null;
        String sql = "delete from livros where titulo = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, titulo);
            retorno = pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Não foi possível remover o livro");
        }
        
        
        return retorno;
    }
    
}
