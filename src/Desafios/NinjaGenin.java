package Desafios;

public class NinjaGenin extends Ninja implements Treinavel{

    public NinjaGenin(String nome, Vila vila, int nivel) {
        super(nome, vila, nivel);
    }

    @Override
    public void executarMissao(){
        System.out.println(getNome()+ " Esta executando uma missão de um Ninja Nivel "+getNivel());
    }

    @Override
    public void treinar(){
        setNivel(getNivel()+1);
        System.out.println("Seu ninja treinou e agora esta nivel "+ getNivel());
    }
}
