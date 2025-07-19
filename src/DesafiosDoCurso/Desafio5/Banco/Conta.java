package DesafiosDoCurso.Desafio5.Banco;

public interface Conta {

    void consultarSaldo();
    void depositar(double valor, TipoConta tipoConta);
    void transferir(double valor, ContaBancaria contaDestino);

}
