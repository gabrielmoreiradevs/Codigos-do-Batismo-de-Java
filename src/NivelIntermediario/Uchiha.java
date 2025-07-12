package NivelIntermediario;

public class Uchiha extends Ninja {

    public void ShariganAtivado (){
        System.out.println(nome + " ativou o Sharigan");
    }

    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha, um ataque de fogo");
    }

}
