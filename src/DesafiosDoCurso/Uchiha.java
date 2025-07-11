package DesafiosDoCurso;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("Habilidade: " + habilidadeEspecial);
    }
}
