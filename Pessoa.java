package Bloco1;

public class Pessoa {
    private int id;
    private String nome;
    private String email;


    public Pessoa(int id, String nome, String email ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + id + " anos. Meu email é " + email + " .");
    }

    public String toString() {
        return nome+" tem "+id+" anos";
    }
}