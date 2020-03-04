/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
/**
 *
 * @author fabio
 */
public class DBUtils {
    public Connection conectar(){
        System.out.println("Teste de acesso ao Derby");
        Connection con = null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ClinicaPP", "root", "unit2020");
            System.out.print("Conexão efetuada com sucesso");
        } catch(ClassNotFoundException cnfe){
            System.out.println("Classe não identificado");
        } catch(SQLException sqle){
            System.out.println("Erro de conexão");
        }
        return con;
    }
    public void fecharConexao(Connection con){
        try{
            con.close();
            System.out.println("\n Conexão fechada");
        } catch(SQLException sqle){
            System.out.println("Problema ao fechar a conexão");
        }
    }
}
