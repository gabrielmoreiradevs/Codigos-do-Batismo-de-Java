package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        Pergaminho pergaminho1 = new Pergaminho("Pergaminho do Naruto");
        Shuriken shuriken1 = new Shuriken(12);
        BolsaNinja<Object> bolsa = new BolsaNinja<>();

        bolsa.mostrarItensDaBolsa();
        bolsa.adicionarItemABolsa(new Kunai("Kunai de Fogo"));
        bolsa.adicionarItemABolsa(shuriken1);
        bolsa.mostrarItensDaBolsa();
        bolsa.adicionarItemABolsa(pergaminho1);
        bolsa.mostrarItensDaBolsa();

    }
}
