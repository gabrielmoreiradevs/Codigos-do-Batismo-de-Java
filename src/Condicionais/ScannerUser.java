package Condicionais;
import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {
        /*Usuario consegue digitar coisas para guardarmos*/

        // Abrir objeto: Scanner
        Scanner scanner = new Scanner(System.in);

        //Receber Nome do Ninja
        System.out.println("Digite seu nome: ");
        String NomeDoNinja= scanner.nextLine();
        System.out.println("\nNome: "+NomeDoNinja);

        //Receber Idade do Ninja
        System.out.println("Escreva a idade do ninja: ");
        int IdadeDoNinja= scanner.nextInt();
        System.out.println("\nIdade: "+ IdadeDoNinja + " Anos");

        if(IdadeDoNinja>=18){
            System.out.println("Seu ninja é maior de idade");
        }else {
            System.out.println("Seu ninja é menor de idade");
        }



        //Fechar Scanner
        scanner.close();
    }
}
