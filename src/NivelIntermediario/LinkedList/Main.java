package NivelIntermediario.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Inicializando
        LinkedList<String> linkedList = new LinkedList<>();

        //Adicionando Elementos
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura");
        //Mostrando Lista
        System.out.println(linkedList);

        //Adicionando elemento no index 1
        linkedList.add(1, "Kakashi Hatake");
        System.out.println(linkedList);

        //Removendo elemento no index 2
        linkedList.remove(2);
        System.out.println(linkedList);



    }
}
