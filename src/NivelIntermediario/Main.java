package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja naruto - 0bjeto
        Uzumaki Naruto = new Uzumaki("Naruto","Aldeia da Folha",15);

        //Polimorfismo
        Naruto.HabilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();

        // Criar ninja Sasuke Uchiha - Objeto
         Uchiha Sasuke = new Uchiha("Sasuke","Aldeia da Folha",17);

         //Polimorfismo
        Sasuke.HabilidadeEspecial();
        Sasuke.estrategiaDeBatalhaNinja();


    }
}
