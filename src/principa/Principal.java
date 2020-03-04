/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principa;

import Model.FuncionarioDB;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;


/**
 *
 * @author 10361
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        try {
            Path arquivo = Paths.get("arquivo.txt");
            BufferedWriter bw = null;
            
            Files.createFile(arquivo);
            bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
            bw.write("Texto");
            bw.close();
    
        } catch (IOException ex) {
            System.out.println("Deu merda no arquivo");
        }
*/
  
    FuncionarioDB fdb = new FuncionarioDB();
    fdb.todosOsDados();
    fdb.cadastrarFuncionario();
    fdb.todosOsDados();
    }

}
