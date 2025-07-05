package NivelFacil.Condicionais;

import java.util.Scanner;

public class ScannerExerc {
    public static void main(String[] args) {
        /*FIXAÇÃO DE CONTEUDO || NÃO TEM ESSE EXERC NO CURSO*/
        Scanner sc = new Scanner(System.in);

        String Clube;
        double ValorCompra;

        System.out.println("Qual o valor da sua compra: ");
        ValorCompra = sc.nextDouble();
        sc.nextLine();

        System.out.println("Você é membro do clube?  (sim/não)");
        Clube = sc.nextLine();

        if(Clube.equalsIgnoreCase("sim")) {
           ValorCompra = ValorCompra-(ValorCompra*0.1);
            System.out.println("Valor da sua compra via clube: " +  ValorCompra);
        }else {
            System.out.println("Valor da sua compra: " +  ValorCompra);
        }

        sc.close();
    }
}
