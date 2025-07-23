package Desafios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NinjaGenin ninjaGenin = new NinjaGenin("Ninja Genin", Vila.FOLHA, 4);
        NinjaJounin ninjaJounin = new NinjaJounin("Ninja Jounin", Vila.AREIA, 13);
        NinjaChunin ninjaChunin = new NinjaChunin("Ninja Chunin", Vila.NÉVOA, 67);

        ninjaGenin.executarMissao();
        ninjaChunin.executarMissao();
        ninjaJounin.executarMissao();
        System.out.println("------------------------------------------");
        ninjaGenin.treinar();
        ninjaChunin.treinar();
        System.out.println("------------------------------------------");
        System.out.println(ninjaGenin);
        System.out.println(ninjaChunin);

    }
}
