/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.FolhaPagamentoDB;
import Model.FolhaPagamentoModel;
import Utils.BancoDeDados;

/**
 * Aula Projeto de Programação - Unit
 * @author Prof. Fabio Gomes Rocha
 */
public class FolhaPagamentoControl {
    private FolhaPagamentoModel fpm;
    private double salarioBruto;

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public FolhaPagamentoModel calcularSalario(){
            fpm = new FolhaPagamentoModel(salarioBruto);
            return fpm;
    }
    public void salvar(){
        FolhaPagamentoDB fpdb = new FolhaPagamentoDB();
        fpdb.cadastrarFolha(fpm);
        
     
    }
    
}
