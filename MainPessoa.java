package Bloco1;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(30, "Ana", "ana@gmail.com");

        p1.cumprimentar();
        System.out.println(p1.toString());

        int quantidadePessoas = 3;
        Pessoa [] p = new Pessoa[quantidadePessoas];
        p[0] = new Pessoa(10, "Júlia", "julia@gmail.com");
        p[1] = new Pessoa(18, "Carlos", "carlos@gmail.com");
        p[2] = new Pessoa(34, "Carol", "carol@gmail.com");

        for (Pessoa pessoa : p) pessoa.cumprimentar();
    }
}