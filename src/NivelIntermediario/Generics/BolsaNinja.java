package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    //Inicializando Lista de Item
    private List<T> bolsa;

    //Construtor de bolsaVazia
    public BolsaNinja() {
        this.bolsa = new ArrayList<>();
    }

    //Adcionar Ferramentas a bolsa
    public void adicionarItemABolsa(T item){
        bolsa.add(item);
    }

    //Mostrar ferramentas
    public void mostrarItensDaBolsa(){
        System.out.println("-------- Bolsa -------");
        for(T item : bolsa){
            System.out.println(item);
        }
        System.out.println("----------------------");
    }

    @Override
    public String toString() {
        return "Bolsa: " + bolsa;
    }
}