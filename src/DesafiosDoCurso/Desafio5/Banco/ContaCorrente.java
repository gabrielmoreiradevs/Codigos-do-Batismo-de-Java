package DesafiosDoCurso.Desafio5.Banco;

import java.sql.SQLOutput;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor, TipoConta tipoConta){
        if(valor<=0){
            System.out.println("Não é possivel depositar valores abaixo ou igual a zero");
        } else if (valor > 0) {
            saldo += valor;
            System.out.println("\nVocê adicionou um saldo: " + valor);
            consultarSaldo();
        }
    }

}
