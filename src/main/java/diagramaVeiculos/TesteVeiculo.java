/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaVeiculos;

/**
 *
 * @author Alexandre
 */
public class TesteVeiculo {
    public static void main(String[] args) {
        
        Automovel carroAle = new Automovel();
        Motocicleta motoAle = new Motocicleta();
        
        System.out.println("===AUTOMÓVEL===");
        carroAle.ligar();
        carroAle.acelerar(120);
        carroAle.frear(0);
        carroAle.desligar();
        carroAle.setAno(2022);
        carroAle.setValor(90000.0);
        System.out.println("Valor de venda à vista do carro é " + Veiculo.calcularValorVenda(carroAle));
        System.out.println("===FIM AUTOMÓVEL===");
        
        System.out.println("===MOTOCILETA===");
        motoAle.ligar();
        motoAle.acelerar(50);
        motoAle.frear(0);
        motoAle.desligar();
        motoAle.setChassi("1236587");
        motoAle.setPlaca("EHT1254");
        motoAle.setValor(20000.0);
        System.out.println("Valor de venda à vista da moto do Cauã placa "
                + motoAle.getPlaca() 
                + " e chassi " 
                + motoAle.getChassi() 
                + " é: " + Veiculo.calcularValorVenda(motoAle));
        System.out.println("===FIM MOTOCICLETA===");
    }
}
