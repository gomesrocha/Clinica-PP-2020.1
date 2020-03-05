/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import principa.Principal;

/**
 *
 * @author 10361
 */
public class DBUtils {

    public Connection conectar() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/clinicadb",
                "root", "unit2020");
        System.out.println("Conexão efetuada com sucesso");
        } catch (ClassNotFoundException ex) {
            System.out.println("Drive não encontrado");
        } catch (SQLException ex) {
            System.out.println("Não foi possível conectar");
        }
        
        return con;
    }
    public void fecharConexao(Connection con){
        try {
            con.close();
            System.out.println("Conexão fechada com sucesso");
        } catch (SQLException ex) {
            System.out.println("Não foi possível desconectar");
        }
        
    }

}
