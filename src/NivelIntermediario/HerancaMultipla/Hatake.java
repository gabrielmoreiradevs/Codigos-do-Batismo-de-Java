package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements ShariganInterface, AnbuInterface {

    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void boasVindas(){
        System.out.println(nome+ ": Eu sou um Hatake");
    }

    // Esse metodo vem da Interface
    @Override
    public void shariganAtivado(){
        System.out.println(nome+": Ativou o Sharigan");
    }

    @Override
    public void ninjaDeElite(){
        System.out.println(nome+": Eu sou um Ninja de Elite da Anbu");
    }
}
