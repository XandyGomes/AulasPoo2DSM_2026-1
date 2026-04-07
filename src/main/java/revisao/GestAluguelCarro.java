/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author Alexandre
 */
public class GestAluguelCarro {
    private String modelo;
    private double valorDiaria;
    private int kmInicial;
    private int kmFinal;
    private boolean alugado;
    
    public void inicializar(String modelo, double valor){
        this.modelo = modelo;
        this.valorDiaria = valor;
        this.alugado = false;
    }
    
    public void retirarCarro(int kmAtual){
        if(!alugado){
            this.kmInicial = kmAtual;
            this.alugado = true;
            System.out.println("Veículo "+ modelo +" retirado com sucesso.");
        }else{
            System.out.println("Erro: O veículo já está alugado.");
        }
    }
    
    public void devolverCarro(int kmAtual){
        if(alugado){
            if(kmAtual >= kmInicial){
                this.kmFinal = kmAtual;
                this.alugado = false;
                System.out.println("Veículo devolvido. KM rodados: "+ (kmFinal - kmInicial));
            }else{
                System.out.println("Erro: KM de devolução menos que o de saída.");
            }
        }else{
            System.out.println("Erro: Este veículo não consta como alugado");
        }
    }
    
    public double calcularValorTotal(int dias){
        return dias * valorDiaria;
                
    }
    
    //getters e setters para todos os atributos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    
}
