package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> bolsa;

    public void adcionarItem(T item){
        bolsa.add(item);
    }

    //Construtor da Bolsa Com items
    public Bolsa(List<T> bolsa) {
        this.bolsa = new ArrayList<>();
    }

    //Construtor da Bolsa SEM items
    public Bolsa() {
        this.bolsa = new ArrayList<>();
    }

    public List<T> getBolsa() {
        return bolsa;
    }

    public void setBolsa(List<T> bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsa{" +
                "bolsa=" + bolsa +
                '}';
    }
}
