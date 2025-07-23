package Desafios;

public class NinjaChunin extends Ninja implements Treinavel{

    public NinjaChunin(String nome, Vila vila, int nivel) {
        super(nome, vila, nivel);
    }

    @Override
    public void executarMissao(){
        System.out.println(getNome() + " da vila "+getVila()+ " esta executando uma missão de um Ninja "+getNivel());
    }


    @Override
    public void treinar(){
        setNivel(getNivel()+5);
        System.out.println("Seu ninja treinou e agora esta nivel "+ getNivel());
    }
}
