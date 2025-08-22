package NivelAvancado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjaList = new ArrayList<>();

        ninjaList.add((new Ninja("Naruto", "Konoha", 10)));
        ninjaList.add((new Ninja("Gabriel", "Suna", 17)));
        ninjaList.add((new Ninja("Saruka", "Hatake", 15)));
        ninjaList.add((new Ninja("Sasuke", "Konoha", 99)));
        ninjaList.add((new Ninja("Gaara", "Suna", 39)));
        ninjaList.add((new Ninja("Isabela", "Konoha", 16)));

        Ninja NinjaVelho = ninjaList.stream()
                .max((n1,n2) -> n1.getNome().compareTo(n2.getNome()))
                .orElse(null);

        System.out.println(NinjaVelho);



    }
}
