/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Aula Projeto de Programação - Unit
 * @author Prof. Fabio Gomes Rocha
 */
public class FolhaPagamentoModel {
    private double salarioBruto;
    private double inss;
    private double irrf;
    private double salarioLiquido;

    public FolhaPagamentoModel(double salarioBruto) {
        this.salarioBruto = salarioBruto;
 
    public double getInss() {
        if(salarioBruto)
        return inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    
    
}
