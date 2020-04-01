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
 *
 * @author fabio
 */
public class DaoHelper {

    public Connection conectar() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Livro", "root", "unit2020");
            System.out.println("Conexão efetuada com sucesso");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("1 Não foi possível conectar o banco de dados");
        } catch (SQLException ex) {
            System.out.println("2 Não foi possível conectar o banco de dados");
        }
        return con;
    }

}
