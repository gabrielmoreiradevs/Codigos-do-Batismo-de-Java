package DesafiosDoCurso.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    String aldeia;
    String habilidade;
    int idade;

    public NinjaBasico() {}

    public NinjaBasico(String nome, String aldeia, int idade,  String habilidade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    public String executarHabilidade() {
        return "\nExecutando Habilidade do "+nome+ ": " + habilidade+"\n";
    }

}
