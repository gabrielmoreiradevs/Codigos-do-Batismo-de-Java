package NivelFacil.Condicionais;

public class IfEElse {
    public static void main(String[] args) {
        /*Trabalhando com If, Else e Else If | NivelFacil.Condicionais
        *
        * Passar o ninja de nivel pelas missoes
        *
        * */

        // Naruto
        String nome = "Naruto";
        String Rank;

        int idade = 10;
        boolean hokage = false;
        short NumeroDeMissoes = 9;


        if(NumeroDeMissoes == 30 && hokage==false){
            System.out.println("Rank: Chunnin");
        } else if(NumeroDeMissoes >= 20 || hokage==false){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }



    }
}
