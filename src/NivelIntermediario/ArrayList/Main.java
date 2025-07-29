package NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array são estaticos não altera de tamanho
        String[] ninjas= new String[2]; // Objeto de MEMORIA | Não altera de tamanho
        ninjas[0] = "Sasuke";
        ninjas[1] = "Naruto";
        System.out.println("Print de Array: "+ ninjas[0]);

        System.out.println("----------------------");

        //Listas

        //Listas não sao estaticas, podem aumentar e dinimuir.
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");

        System.out.println("Print de ArrayList: "+ ninjasList + " | Tamanho da lista: "+ ninjasList.size() + " elementos");

        //Removendo da Lista
        ninjasList.remove("Sasuke Uchiha");
        System.out.println("Print de ArrayList: "+ ninjasList);

        // Trocar elementos (Naruto para Sasuke) | Ver tamanho da lista
        ninjasList.set(0, "Sasuke Uchiha");
        System.out.println("Print de ArrayList: "+ ninjasList + " | Tamanho da lista: "+ ninjasList.size() + " elementos");

    }
}
