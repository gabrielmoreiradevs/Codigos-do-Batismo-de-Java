package NivelIntermediario.Enuns;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar Cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();
    }
}
