package DesafiosDoCurso.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto", "Aldeia da Folha", 17, "Sharigan");

        Naruto.mostrarInformacoes();
        System.out.println(Naruto.executarHabilidade());

        NinjaAvançado Tobirama = new NinjaAvançado("Tobirama", "Konohagakure", 76, "Água", "ninjutsu");

        Tobirama.mostrarInformacoes();
        System.out.println(Tobirama.executarHabilidade());

    }
}
