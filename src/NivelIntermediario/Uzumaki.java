package NivelIntermediario;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // SobreEscrever da classe ninja
    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uzumaki, um ataque de ar");
    }

}
