package DesafiosDoCurso.Desafio06;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continuar = true;

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        while (continuar) {
            System.out.println("---- Sistema de Ninjas ----\n");

            System.out.println("1- Exibir Ninjas | 2- Adicionar um Ninja | 3- Remover o Primeiro Ninja | 4- Ordenar lista | 5- Buscar Ninja \nO que deseja fazer: ");
            int op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nossa lista atual");
                    System.out.println(listDeNinjas);

                    System.out.println("\n Deseja Continuar? ");
                    String yesOrNo = input.nextLine();
                    if (yesOrNo.equalsIgnoreCase("nao")) {
                        continuar = false;
                    }
                    break;

                case 2:
                    System.out.println("Nome do Ninja: ");
                    String nome = input.nextLine();
                    System.out.println("Idade do Ninja: ");
                    int idade = input.nextInt();
                    input.nextLine();
                    System.out.println("Vila do ninja: ");
                    String vila = input.nextLine();
                    listDeNinjas.add(0,new Ninja(nome, idade, vila));

                    System.out.println("\n Deseja Continuar? ");
                    String yesOrNoo = input.nextLine();
                    if (yesOrNoo.equalsIgnoreCase("nao")) {
                        continuar = false;
                    }
                    break;
                case 3:
                    System.out.println("\nNinja removido: "+ listDeNinjas.peek());
                    listDeNinjas.poll();

                    System.out.println("\n Deseja Continuar? ");
                    String yesOrNooo = input.nextLine();
                    if (yesOrNooo.equalsIgnoreCase("não")) {
                        continuar = false;
                    }
                    break;
                case 4:
                    System.out.println("Você deseja ordenar a lista por: \n1- Nome | 2- Idade | 3- Vila");
                    int ordenacao = input.nextInt();
                    input.nextLine();
                    switch (ordenacao) {
                        case 1:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getNome));
                            listDeNinjas.forEach(System.out::println);
                            break;
                        case 2:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                            listDeNinjas.forEach(System.out::println);
                            break;
                        case 3:
                            listDeNinjas.sort(Comparator.comparing(Ninja::getVila));
                            listDeNinjas.forEach(System.out::println);
                            break;
                        default:
                            System.out.println("Não temos essa opção");
                    }
                    System.out.println("\n Deseja Continuar? ");
                    String yesOrNoooo = input.nextLine();
                    if (yesOrNoooo.equalsIgnoreCase("não")) {
                        continuar = false;
                    }
                    break;
                case 5:
                    List<Ninja> ninjaList = new ArrayList<>(listDeNinjas);
                    ninjaList.sort(Comparator.comparing(Ninja::getNome));

                    System.out.println("Qual é o nome do ninja: ");
                    String ninjaNome = input.nextLine();

                    int index = Collections.binarySearch(ninjaList, new Ninja( ninjaNome, 0, ""),
                            Comparator.comparing(Ninja::getNome));

                    if (index >= 0) {
                        System.out.println("Ninja encontrado: " + ninjaList.get(index));
                    } else {
                        System.out.println("Ninja não encontrado");
                    }

                    System.out.println("\n Deseja Continuar? ");
                    String yesOrNooooo = input.nextLine();
                    if (yesOrNooooo.equalsIgnoreCase("não")) {
                        continuar = false;
                    }
                    break;
                default:
                    System.out.println("Não temos essa opção!");
            }
        }

        System.out.println("Saindo...");
        input.close();
    }
}
