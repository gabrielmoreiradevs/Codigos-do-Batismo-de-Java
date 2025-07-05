package NivelFacil.Condicionais;
import java.util.Scanner;

public class CondicionaisExerc {
    public static void main(String[] args) {

        // Desafio Gerado pelo ChatGPT não esta no curso

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar==true) {
            System.out.println("\nBem vindo ao sistema de Cadastro");
            System.out.print("Informe os seguintes dados\n");

            System.out.println("\nNome: ");
            String nome = sc.nextLine();

            System.out.println("\nIdade: ");
            short idade = sc.nextShort();
            sc.nextLine();

            if(idade<14){
                System.out.println("\nAcesso negado. Idade mínima: 14 anos.");
                System.out.println("Sua idade: "+idade+" anos.");
                break;
            }

            System.out.println("\nMensal, Trimestral ou Anual!");
            System.out.println("Plano: ");
            String plano = sc.nextLine();

            if(plano.equalsIgnoreCase("mensal")){
                System.out.println("Bem vindo " +nome+ ", seu plano é o Mensal e custa: R$100");
            }else if(plano.equalsIgnoreCase("trimestral")){
                System.out.println("Bem vindo " +nome+ ", seu Plano é o Trimestral e custa R$270");
            }else if(plano.equalsIgnoreCase("anual")){
                System.out.println("Bem vindo " +nome+ ", seu Plano é o Anual e custa R$960");
            }else{
                System.out.println(nome + " você não selecionou nenhum plano");
            }

            System.out.println("\nDeseja Cadastrar outro Cliente? ");
            String cadastro = sc.nextLine();

            if(cadastro.equalsIgnoreCase("nao")){
                continuar = false;
            }

            sc.close();
        }
    }
}
