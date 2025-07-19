package DesafiosDoCurso.Desafio5.Banco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente(0.0, TipoConta.CORRENTE);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0.0, TipoConta.POUPANCA);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nBem vindo ao Banco de Konoha!");
            System.out.println("Selecione seu tipo de conta\n");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupanca");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nSua conta é do tipo " + contaCorrente.tipoConta);
                    System.out.println("Voce tem "+contaCorrente.saldo+" de saldo\n");

                    if(contaCorrente.saldo<=0){
                        System.out.println("Digite o valor que deseja depositar: ");
                        contaCorrente.depositar(input.nextDouble(), TipoConta.CORRENTE);
                        input.nextLine();
                    } else if(contaCorrente.saldo>0){
                        System.out.println("Selecione sua ação\n");
                        System.out.println("1 - Depositar");
                        System.out.println("2 - Transferir");

                        switch (input.nextInt()) {
                            case 1:
                                System.out.println("Digite o valor que deseja depositar: ");
                                contaCorrente.depositar(input.nextDouble(), TipoConta.CORRENTE);
                                input.nextLine();
                                break;
                            case 2:
                                System.out.println("Digite o valor que deseja transferir: ");
                                contaCorrente.transferir(input.nextDouble(), contaPoupanca);
                                input.nextLine();
                                break;

                            default:
                                System.out.println("Não temos essa opção");
                        }
                    }


                    System.out.println("Deseja continuar no Banco de Konoha?");
                    String resposta = input.nextLine();
                    if(resposta.equalsIgnoreCase("Nao") || resposta.equalsIgnoreCase("Não") ){
                        System.out.println("Saindo...");
                        continuar = false;
                    }

                    break;
                case 2:
                    System.out.println("\nSua conta é do tipo " + contaPoupanca.tipoConta);
                    System.out.println("Voce tem "+contaPoupanca.saldo+" de saldo");

                    if(contaPoupanca.saldo<=0){
                        System.out.println("Digite o valor que deseja depositar: ");
                        contaPoupanca.depositar(input.nextDouble(),  TipoConta.POUPANCA);
                        input.nextLine();
                    } else if(contaPoupanca.saldo>0){
                        System.out.println("Selecione sua ação\n");
                        System.out.println("1 - Depositar");
                        System.out.println("2 - Transferir");

                        switch (input.nextInt()) {
                            case 1:
                                System.out.println("Digite o valor que deseja depositar: ");
                                contaPoupanca.depositar(input.nextDouble(), TipoConta.POUPANCA);
                                input.nextLine();
                                break;
                            case 2:
                                System.out.println("Digite o valor que deseja transferir: ");
                                contaCorrente.transferir(input.nextDouble(), contaCorrente);
                                input.nextLine();
                                break;

                            default:
                                System.out.println("Não temos essa opção");
                        }
                    }


                    System.out.println("Deseja continuar no Banco de Konoha?");
                    String respostaP = input.nextLine();

                    if(respostaP.equalsIgnoreCase("Nao") || respostaP.equalsIgnoreCase("Não") ){
                        System.out.println("Saindo...");
                        continuar = false;
                    }

                    break;
                default:
                    System.out.println("Não temos essa opção!");

            }
        }

        input.close();
    }
}
