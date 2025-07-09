package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja naruto - 0bjeto
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 15;
        Naruto.aldeia = "Aldeia da Folha";

        // Criar ninja Sasuke Uchiha - Objeto
         Ninja Sasuke = new Ninja();

         Sasuke.nome = "Sasuke Uchiha";
         Sasuke.idade = 17;
         Sasuke.aldeia = "Aldeia da Folha";

         //Metodo Void
        Sasuke.ShariganAtivado();

         //Aplicando Metodo String
        String boasVindas = Sasuke.boasVindas();
        System.out.println(boasVindas);


        //Aplicando Metodo Int (Com Parametro)
        int idade = Sasuke.anosParaHokage(50);
        System.out.println("Ainda falta "+idade+" anos para se tornar Hokage");

    }
}
