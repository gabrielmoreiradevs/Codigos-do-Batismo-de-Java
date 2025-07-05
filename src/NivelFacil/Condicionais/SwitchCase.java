package NivelFacil.Condicionais;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
      /*
      * Switch Cases: Servem para gerar casos especificos
      * Objetivo: O usuario vai dizer qual personagem ele quer escolher!
      * */

        // Criando Scanner
        Scanner scanner= new Scanner(System.in);

        //Pedindo Escolha
        System.out.println("Escolha entre os seguintes ninjas:");
        System.out.println("1: Naruto | 2: Sakura | 3: Sasuke Uchiha");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu o Naruto");
                break;
            case 2:
                System.out.println("Você escolheu o Sakura");
                break;
            case 3:
                System.out.println("Você escolheu o Sasuke");
                break;
            default:
                System.out.println("Você não escolheu nada!");
        }


        //Fechando Scanner
        scanner.close();
    }
}
