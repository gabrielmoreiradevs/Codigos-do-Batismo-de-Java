package NivelIntermediario;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //TODO: Sobrecarga de Construtores
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    //SobreEscrever da classe ninja
    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: "+ numeroDeMissoesConcluidas);
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println(nome+ " Essa é minha estrategia de Batalha");
    }
}
