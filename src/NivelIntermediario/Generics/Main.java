package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        Equipamentos faca = new Equipamentos("Faca");
        Equipamentos moeda = new Equipamentos("Moeda");

        Bolsa<Equipamentos> bolsa = new Bolsa<>();

        System.out.println(bolsa);
        bolsa.adcionarItem(faca);
        System.out.println(bolsa);
        bolsa.adcionarItem(moeda);
        System.out.println(bolsa);

    }
}
