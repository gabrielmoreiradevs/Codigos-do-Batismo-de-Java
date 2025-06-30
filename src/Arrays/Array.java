package Arrays;

public class Array {
    public static void main(String[] args) {

        //Tipo[] nomeDaVariavel = new Tipo[qtdElementos]
        //Tipo[] nomeDaVariavel = {Conteudo};

        // Arrays são do tipo de Referencia
        String[] ninja= new String[5];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";

        /*System.out.println(ninja[1]); //Sasuke
        System.out.println(ninja); //Referencia da Memoria*/
        System.out.println(ninja[4]); //Nulo

        int[] idade= new int[2];
        idade[1]=15;

        //System.out.println(idade[1]); // 15
        System.out.println(idade[0]); // O = Vazio

        boolean[] falseOrTrue= new boolean[2];
        falseOrTrue[1]=true;

        //System.out.println(falseOrTrue[1]); //True
        System.out.println(falseOrTrue[0]); // False

    }
}
