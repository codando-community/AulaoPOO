package Bloco2;

// Essa é uma forma de abstração + composição: cada classe foca em sua própria responsabilidade.
public class Carro {
    private int placa;
    private String modelo;
    private Motor motor; // Composição: Carro TEM UM Motor

    public Carro() {
        motor = new Motor(); // instanciando o motor dentro do carro
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro...");
        motor.ligar(); // o carro delega ao motor a tarefa de ligar
    }

    public void desligarCarro() {
        System.out.println("Desligando o carro...");
        motor.desligar(); // o carro delega ao motor a tarefa de desligar
    }
}