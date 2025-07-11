package DesafiosDoCurso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroMaximo = 5;
        int contador = 0;
        boolean continuar = true;

        Ninja[] Ninjas = new Ninja[numeroMaximo];

        while(continuar==true) {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Atualizar Habilidades Especiais Ninjas");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    if (contador >= numeroMaximo) {
                        System.out.println("Não é possivel cadastrar um ninja, não temos espaço");
                    } else {
                        System.out.println("Ele é um Uchiha? ");
                        String Uchiha = sc.nextLine();

                        Ninja ninja;

                        if (Uchiha.equalsIgnoreCase("Sim")) {
                            ninja = new Uchiha();
                        } else {
                            ninja = new Ninja();
                        }

                        System.out.println("Digite o nome do Ninja: ");
                        String nome = sc.nextLine();
                        ninja.nome = nome;

                        System.out.println("Digite a idade do Ninja: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        ninja.idade = idade;

                        System.out.println("Digite a missão do Ninja: ");
                        String missao = sc.nextLine();
                        ninja.missao = missao;

                        System.out.println("Digite o nivel dificuldade do Missao: ");
                        String dificuldade = sc.nextLine();
                        ninja.nivelDificuldade = dificuldade;

                        System.out.println("Digite o status da Missao: ");
                        String statusMissao = sc.nextLine();
                        ninja.statusMissao = statusMissao;

                        if (ninja instanceof Uchiha) {
                            System.out.println("Qual Habilidade especial dele: ");
                            String habilidade = sc.nextLine();
                            ((Uchiha) ninja).habilidadeEspecial = habilidade;
                        }

                        Ninjas[contador] = ninja;
                        contador++;
                    }

                    System.out.println("Deseja continuar no Sistema: ");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("Nao")) {
                        continuar = false;
                    }else{}

                    break;
                case 2:
                    System.out.println("Mostrando ninjas\n");
                    if (contador == 0) {
                        System.out.println("Não há ninjas");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            Ninjas[i].mostrarInformacoes();
                        }
                    }

                    System.out.println("Deseja continuar no Sistema: ");
                    String respostas = sc.nextLine();
                    if (respostas.equalsIgnoreCase("Nao")) {
                        continuar = false;
                    }else{}

                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("Não há ninjas cadastrados.");
                        break;
                    }

                    System.out.println("Qual ninja você quer mudar:");
                    String escolha = sc.nextLine();


                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (Ninjas[i].nome.equalsIgnoreCase(escolha)) {
                            encontrado = true;

                            if (Ninjas[i] instanceof Uchiha) {
                                System.out.println("Digite a nova habilidade especial:");
                                String novaHabilidade = sc.nextLine();
                                ((Uchiha) Ninjas[i]).habilidadeEspecial = novaHabilidade;
                                System.out.println("Habilidade atualizada com sucesso!");
                            } else {
                                System.out.println("Esse ninja não é um Uchiha, não possui habilidade especial.");
                            }

                            break; // já encontrou, não precisa continuar
                        }
                    }

                    if (encontrado==false) {
                        System.out.println("Ninja não encontrado.");
                    }

                    System.out.println("Deseja continuar no Sistema: ");
                    String respostass = sc.nextLine();
                    if (respostass.equalsIgnoreCase("Nao")) {
                        continuar = false;
                    }else{}

                    break;


                default:
                    System.out.println("Não temos essa opção");
            }
        }











        sc.close();
    }
}
