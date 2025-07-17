package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements ShariganInterface {

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Esse metodo vem da interface
    @Override
    public void shariganAtivado(){
        System.out.println(nome+": Ativou o Sharigan");
    }

}
