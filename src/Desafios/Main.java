package Desafios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personagem personagem = new Personagem();

        System.out.println("Insira os dados do seu Personagem\n");

        System.out.println("Nome: ");
        personagem.nome = input.nextLine();

        System.out.println("Classe: ");
        personagem.Classe = input.nextLine();

        System.out.println("Nivel: ");
        personagem.Nivel = input.nextInt();
        input.nextLine();

        personagem.infos();
        input.close();
    }
}
