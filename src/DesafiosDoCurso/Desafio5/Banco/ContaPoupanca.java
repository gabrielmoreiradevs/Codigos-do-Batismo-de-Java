package DesafiosDoCurso.Desafio5.Banco;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void  depositar(double valor, TipoConta tipoConta){
        if(valor<=0){
            System.out.println("Não é possivel depositar valores abaixo ou igual a zero");
        } else if (valor > 0) {
            saldo += valor-(valor*0.01); //Aplicaçao de taxa de 1%
            System.out.println("\nVocê adicionou um saldo: " + valor +" | (Taxa de "+(valor*0.01)+" LulaCoins)");
            consultarSaldo();
        }
    }
}
