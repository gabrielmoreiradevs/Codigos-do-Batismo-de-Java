package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja naruto - 0bjeto
        Uzumaki Naruto = new Uzumaki("Naruto","Aldeia da Folha",15,65,NivelNinja.GENIN,true);

        //Polimorfismo
        Naruto.HabilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();

        // Criar ninja Sasuke Uchiha - Objeto
         Uchiha Sasuke = new Uchiha("Sasuke","Aldeia da Folha",17, 436,NivelNinja.CHUUNIN);

         //Polimorfismo"
        Sasuke.HabilidadeEspecial();
        Sasuke.estrategiaDeBatalhaNinja();

        //Overload de Metodo
        Sasuke.inteligenciaDeCombate();
        Sasuke.inteligenciaDeCombate(149);

        //Testando Sobrecarga
        Uchiha madara = new Uchiha("Madara","Aldeia da Folha",17, 879, NivelNinja.KAGE);
        madara.HabilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

        //Metodo toString
        System.out.println(madara);


    }
}
