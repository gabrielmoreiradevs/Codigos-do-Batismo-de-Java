package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        sasuke.shariganAtivado();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha", 48);
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();

    }
}
