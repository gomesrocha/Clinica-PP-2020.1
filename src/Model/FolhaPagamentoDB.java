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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 10361
 */
public class FolhaPagamentoDB {

    // Criar atributos para conectar ao banco de dados
    DBUtils db = null;
    Connection con = null;

    // Construtor inicializando os objetos
    public FolhaPagamentoDB() {
        db = new DBUtils();
        con = db.conectar();
    }

    public ArrayList<FolhaPagamentoModel> listarFolhaPagamento() {

        ArrayList<FolhaPagamentoModel> fp = new ArrayList();
        FolhaPagamentoModel fpm;
        try {
            Statement stmt = con.createStatement();
            String sql = "select * from FOLHA";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                fpm = new FolhaPagamentoModel(rs.getDouble(2),
                        rs.getDouble(3), rs.getDouble(4), rs.getDouble(5));
                fp.add(fpm);
                System.out.println(rs.getDouble(2));
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao enviar consulta");
        }
        return fp;

    }
    public void cadastrarFolha(FolhaPagamentoModel fpm){
        String sql = "insert into folha(salario, inss, irrf, salarioliquido)"
                    + "values(?, ?, ?, ?)";
        
        try {   
            PreparedStatement pstm = con.prepareStatement(sql);
            System.out.println(fpm.getSalarioBruto());
            System.out.println(fpm.getInss());
                    
            pstm.setDouble(1, fpm.getSalarioBruto());
            pstm.setDouble(2, fpm.getInss());
            pstm.setDouble(3, fpm.getIrrf());
            pstm.setDouble(4, fpm.getSalarioLiquido());
            pstm.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir dados no banco");
        }
        
    }

}
