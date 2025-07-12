package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja naruto - 0bjeto
        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 15;
        Naruto.aldeia = "Aldeia da Folha";

        //Polimorfismo
        Naruto.HabilidadeEspecial();

        // Criar ninja Sasuke Uchiha - Objeto
         Uchiha Sasuke = new Uchiha();

         Sasuke.nome = "Sasuke Uchiha";
         Sasuke.idade = 17;
         Sasuke.aldeia = "Aldeia da Folha";

         //Polimorfismo
        Sasuke.HabilidadeEspecial();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";

        //Polimorfismo
        Sakura.HabilidadeEspecial();

        /*
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Haruno";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.UsarByakugan();
        */

        // Interfaces
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        Boruto.ModoSabioAtivar();
        Boruto.ativarOKarma();
        Boruto.ativarJougan();


    }
}
