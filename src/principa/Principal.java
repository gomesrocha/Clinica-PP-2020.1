/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principa;

import Model.FuncionarioDB;




/**
 *
 * @author 10361
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*FuncionarioDB fdb = new FuncionarioDB();
        fdb.cadastrarFuncionario("Thiago", "Thiago@gmail.com", "123456789");
        fdb.listarTodosOsFuncionarios();
        fdb.buscarFuncionarioPorNome("Thiago");
        
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

        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/clinicadb",
                    "root", "unit2020");
            System.out.println("Conexão efetuada com sucesso");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Não foi possível se conectar");
        }
        
        String sql = "Insert into funcionario(nome) values('Maria')";
        Statement stm;
        try {
            stm = con.createStatement();
            stm.executeUpdate(sql);
            sql = "select * from funcionario";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       */
  
  
    }

}
