package Desafios;

public class NinjaJounin extends Ninja{

    public NinjaJounin(String nome, Vila vila, int nivel) {
        super(nome, vila, nivel);
    }

    @Override
    public void executarMissao(){
        System.out.println(getNome() + "da vila "+getVila()+ " esta executando uma missão de um Ninja "+getNivel() + " uma missão considera para um ninja desse nivel");
    }
}
