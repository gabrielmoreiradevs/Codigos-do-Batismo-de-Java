package Desafios.TorreNinja;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NinjaGenin extends Ninja{
    
    public NinjaGenin(String nome, String vila, int nivel) {
        super(nome, vila, nivel);
    }
    
    List<Missao> MissaoPendentes = new ArrayList<>();
    Stack<Missao> MissaoConcluida = new Stack<>();
    
    @Override
    public void executarMissao(Missao missao) {
        boolean jaExiste = false;
        for (Missao m : MissaoPendentes) {
            if (m.descricao().equals(missao.descricao())) {
                jaExiste = true;
                break;
            }
        }

        if(missao.nivelPerigo()>3){
            System.out.println("Ninja de nivel baixo não pode executar essa missão");
        } else if (jaExiste) {
            MissaoConcluida.push(missao);
            MissaoPendentes.remove(missao);

            System.out.println("Missão do "+getNome()+": "+missao.descricao()+" de nivel: "+missao.nivelPerigo());
        } else {
            System.out.println("Missao Inexistente");
        }
    }

    @Override
    public void adicionarMissao(Missao addMissao) {
        boolean jaExiste = false;
        for (Missao m : MissaoPendentes) {
            if (m.descricao().equals(addMissao.descricao())) {
                jaExiste = true;
                break;
            }
        }
        if (jaExiste) {
            System.out.println("O ninja ja tem essa missao");
        } else {
            MissaoPendentes.add(addMissao);
            System.out.println("O ninja " + getNome() + " recebeu uma missao: " + addMissao.descricao());
        }
    }

    public String mostrarMissoes(){
        return "Missoes Pendentes: "+MissaoPendentes+" | Missoes Concluidas: "+ MissaoConcluida;
    }

}
