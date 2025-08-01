package Desafios.TorreNinja;

public class Main {
    public static void main(String[] args) {
        //Desafio criado pelo ChatGPT

        NinjaGenin ninjaGenin = new NinjaGenin("Naruto", "Aldeia da Folha", 2);
        Missao missao1 = new Missao("Ajudar o Hokage", 2);
        Missao missao2 = new Missao("Matar Inimigo", 5);
        Missao missao3 = new Missao("Ajudar um Gato", 1);

        System.out.println(ninjaGenin.mostrarMissoes());
        ninjaGenin.adicionarMissao(missao1);
        ninjaGenin.adicionarMissao(missao2);
        ninjaGenin.adicionarMissao(missao3);
        System.out.println(ninjaGenin.mostrarMissoes());
        ninjaGenin.executarMissao(missao1);
        ninjaGenin.executarMissao(missao2);
        ninjaGenin.executarMissao(missao3);
        System.out.println(ninjaGenin.mostrarMissoes());
        ninjaGenin.executarMissao(missao3);





    }
}
