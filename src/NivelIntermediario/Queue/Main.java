package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Inicializando uma fila
        Queue<String> ninjas = new LinkedList<>();

        //Add na fila
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Kakashi");
        ninjas.add("Shikamaru");
        //Mostrando na fila
        System.out.println("Minha Fila: "+ninjas);

        //Removendo da fila | o primeiro da nossa fila (HEAD)
        ninjas.poll();
        System.out.println("(POOL) Minha Fila: "+ninjas);

        //Vendo quem é o HEAD
        System.out.println("O primeiro da nossa fila: "+ninjas.peek());


        //Removendo todos da fila
        for(int i= ninjas.size(); i>=ninjas.size(); i--){
            ninjas.poll();
        }

        //Verificando se a fila esta vazia
        if(ninjas.isEmpty()){
            System.out.println("Minha fila esta vazia!");
        }


    }
}
