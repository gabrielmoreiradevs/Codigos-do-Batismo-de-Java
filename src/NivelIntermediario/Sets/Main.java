package NivelIntermediario.Sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Criando uma lista Comunto
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sakura");
        ninjaList.add("Sasuke");
        ninjaList.add("Naruto");

        //Transformando a lista em um HashSet que não permite duplicatas
        Set<String> ninjaSet = new HashSet<>(ninjaList);
        System.out.println(ninjaSet);

        //Removendo, não podemos usar Index, pois nao tem ordenação!
        ninjaSet.remove("Sakura");
        System.out.println(ninjaSet);

        //Transformando a lista em um TreeSet que não permite duplicatas e deixa em ordem lógica!
        Set<String> ninjaTree = new TreeSet<>(ninjaList);
        System.out.println(ninjaTree);

        //Transformando a lista em um TreeSet que não permite duplicatas e deixa em ordem de implementação
        Set<String> ninjaLinkedHash = new LinkedHashSet<>(ninjaList);
        System.out.println(ninjaLinkedHash);
    }
}
