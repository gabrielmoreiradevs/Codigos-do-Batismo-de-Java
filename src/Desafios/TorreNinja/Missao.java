package Desafios.TorreNinja;

public record Missao(String descricao, int nivelPerigo) {

    @Override
    public String toString() {
        return "Descricao: "+descricao+", Nivel: "+nivelPerigo +" |";
    }
}
