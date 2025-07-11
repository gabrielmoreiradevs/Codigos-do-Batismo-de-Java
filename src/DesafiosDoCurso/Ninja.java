package DesafiosDoCurso;

public class Ninja {
    String nome;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
    }

}
