package Condicionais;
import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Lacos de Repetição: Repetidindo um codigo infinito ou ate a condição
        * While = For
        * */


        //While(condição Verdadeira){}

        /*
        int numeroDeClones = 0;
        int numeroMaxClones = 40;

        while(numeroDeClones<=numeroMaxClones){
            System.out.println("(WHILE) Criei o Clone: " + numeroDeClones);
            numeroDeClones++;
        }
        */

        //For(variavel; condição; incremento);
        for (int i = 0; i <= 40; i++) {
            System.out.println("(FOR) Criei o Clone: " + i);
        }

    }
}
