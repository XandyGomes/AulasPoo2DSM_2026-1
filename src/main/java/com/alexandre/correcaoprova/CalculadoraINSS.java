/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.correcaoprova;

/**
 *
 * @author Alexandre
 */
public class CalculadoraINSS {
    
    private double porcentagemINSS;

    public double getPorcentagemINSS() {
        return porcentagemINSS;
    }

    public void setPorcentagemINSS(double porcentagemINSS) {
        this.porcentagemINSS = porcentagemINSS;
    }
    
    public double calcularDescontoINSS(double salarioBruto){
        return salarioBruto * (porcentagemINSS / 100);
    }
    
}
