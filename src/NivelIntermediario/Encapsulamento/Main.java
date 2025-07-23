package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------- Naruto Uzumaki -----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 17, 30, 1.67);

        System.out.println("Nome: "+naruto.getNome());
        naruto.setNome("Naruto");
        System.out.println("Nome: "+naruto.getNome());


        System.out.println("------------- Sasuke Uchiha ------------");
    }
}
