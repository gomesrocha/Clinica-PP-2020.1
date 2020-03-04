/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fabio
 */
public class FuncionarioDB {
    DBUtils dbu = new DBUtils();
    Connection con = dbu.conectar();
    public void todosOsDados(){
        try{
            Statement stmt = con.createStatement();
            String sql = "Select * from FUNCIONARIO";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("NOME"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta");
        }
    }
}
