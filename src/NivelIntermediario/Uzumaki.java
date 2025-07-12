package NivelIntermediario;

public class Uzumaki extends Ninja{

    public void ModoSabioAtivar(){
        System.out.println(nome+ " ativou o modo Sabio");
    }

    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uzumaki, um ataque de ar");
    }

}
