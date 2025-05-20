package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        /*
        * Crie um programa que represente três ninjas da Vila
        da Folha (Konoha) de "Naruto" e suas respectivas
        missões.
        *
        Cada ninja tem um nome, uma idade e uma missão
        atribuída a ele, com o nome da missão, nível de
        dificuldade e status de conclusão
        * */

        String NomeNinja1 = "Naruto Uzumaki";
        int IdadeNinja1 = 17;
        String MissaoNinja1 = "Patrulha nas Fronteiras de Konoha";
        char DificuldadeMissao1 = 'B';
        boolean ConcluidoMissao1 = true;

        String NomeNinja2 = "Sakura Haruno";
        int IdadeNinja2 = 17;
        String MissaoNinja2 = "Assistência Médica em Campo de Batalha";
        char DificuldadeMissao2 = 'A';
        boolean ConcluidoMissao2 = false;

        String NomeNinja3 = "Sasuke Uchiha";
        int IdadeNinja3 = 12;
        String MissaoNinja3 = "Investigação de Atividades da Akatsuki";
        char DificuldadeMissao3 = 'F';
        boolean ConcluidoMissao3 = true;

        if(IdadeNinja1 < 15  && (DificuldadeMissao1 != 'C' || DificuldadeMissao1 != 'D')){
            ConcluidoMissao1 = false;
        } else if(IdadeNinja2<15 && (DificuldadeMissao2 != 'C' || DificuldadeMissao2 != 'D')) {
            ConcluidoMissao2 = false;
        } else if (IdadeNinja3<15 && (DificuldadeMissao3 != 'C' || DificuldadeMissao3 != 'D')) {
            ConcluidoMissao3 = false;
        }


        System.out.println("==============================");
        System.out.println("==== Relatorio dos Ninjas ====");
        System.out.println("");
        System.out.println("Nome: " + NomeNinja1);
        System.out.println("Idade: " + IdadeNinja1);
        System.out.println("Missao: " + MissaoNinja1);
        if(IdadeNinja1 < 15  && (DificuldadeMissao1 != 'C' || DificuldadeMissao1 != 'D')){
            System.out.println("A missão não pode ser concluida devido a idade do Ninja");
        } else {
            System.out.println("Dificuldade: " + DificuldadeMissao1);
        }
        System.out.println("Concluido: " + ConcluidoMissao1);

        System.out.println("");

        System.out.println("Nome: " + NomeNinja2);
        System.out.println("Idade: " + IdadeNinja2);
        System.out.println("Missao: " + MissaoNinja2);
        if(IdadeNinja2 < 15  && (DificuldadeMissao2 != 'C' || DificuldadeMissao2 != 'D')){
            System.out.println("A missão não pode ser concluida devido a idade do Ninja");
        } else {
            System.out.println("Dificuldade: " + DificuldadeMissao2);
        }
        System.out.println("Concluido: " + ConcluidoMissao2);

        System.out.println("");

        System.out.println("Nome: " + NomeNinja3);
        System.out.println("Idade: " + IdadeNinja3);
        System.out.println("Missao: " + MissaoNinja3);
        if(IdadeNinja3 < 15  && (DificuldadeMissao3 != 'C' || DificuldadeMissao3 != 'D')){
            System.out.println("A missão não pode ser concluida devido a idade do Ninja");
        } else {
            System.out.println("Dificuldade: " + DificuldadeMissao3);
        }
        System.out.println("Concluido: " + ConcluidoMissao3);

        System.out.println("");

        System.out.println("==============================");

    }
}
