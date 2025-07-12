package DesafiosDoCurso.Desafio4;

public class NinjaAvançado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvançado() {
    }

    public NinjaAvançado(String nome, String aldeia, int idade, String habilidade, String especialidade) {
        super(nome, aldeia, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

}
