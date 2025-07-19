package DesafiosDoCurso.Desafio5.Banco;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo,  TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }


    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
        }else if (valor > saldo) {
            System.out.println("Você não pode transferir mais do que R$" + saldo);
        }else if (valor<=saldo) {
            saldo -= valor;

            contaDestino.depositar(valor, contaDestino.tipoConta);
            System.out.println("\nTransferencia realizada com sucesso!");
        }
    }

    public abstract void depositar(double valor, TipoConta tipoConta);

    @Override
    public String toString() {
        return "Sua conta bancaria tem saldo de: "+ saldo;
    }
}
