package NivelIntermediario;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //SobreEscrever da classe ninja
    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha, um ataque de fogo");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println(nome+ " Essa é minha estrategia de Batalha");
    }
}
