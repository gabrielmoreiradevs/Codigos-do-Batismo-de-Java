package NivelFacil.Desafios;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner para ler Entrada

        String[] nomeNinjas = new String[10]; //Array List para guardar o nome dos Ninjas
        String nomeDoNinja = null; // Variavel temporaria para guardar o nome do Ninja
        int op = 0; // Variavel para opção do menu
        int index=0; // Variavel para controle de Index
        boolean continuar = true; //Controle de saida do Menu

        while(continuar==true){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            op = input.nextInt();
            input.nextLine();

            switch (op){
                case 1:

                    if(index>=10){
                        System.out.println("Limite de Ninjas Atingido! (10)");
                    }else{
                        System.out.println("Digite o nome do ninja");
                        nomeDoNinja = input.nextLine(); //Lendo a entrada e guardando na variavel temporaria
                        nomeNinjas[index] = nomeDoNinja; // Adicionando o Nome do ninja na Array List
                        index++; // Aumentando o index a cada Nome cadastrada, para o proximo nome estar na posição certa
                    }

                    break;
                case 2:
                    int control= 0; // Controle de Null
                    System.out.println("\nListando Ninjas");

                    for(int i=0;i< nomeNinjas.length;i++){ // Verificando se a null em nossa lista
                        if(nomeNinjas[i] == null){
                            control++; // se tiver aumenta 1 em nosso controle
                        }
                    }

                    if(control==nomeNinjas.length){ // se nosso controle estiver 10, temos nenhum nome na lista
                        System.out.println("\nNão temos ninjas Cadastrados");
                    }else{
                        for (int i = 0; i < nomeNinjas.length; i++) {// For para sempre listar a quantidade certa de ninjas
                            if (nomeNinjas[i] != null) { // Listar todos os nomes diferente null
                                System.out.println(i + ") "+ nomeNinjas[i]);
                            }
                        }
                    }

                    break;
                case 3:
                    System.out.println("\nSaindo!");
                    continuar = false; // Saindo do Loop
                    break;
                default:
                    System.out.println("\nNão temos essa opção, repita o processo!");
            }
        }

        input.close(); // Fechando Scanner
    }
}
