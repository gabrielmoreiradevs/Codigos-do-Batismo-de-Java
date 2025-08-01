package Desafios.TorreNinja;

public abstract class Ninja {
    private String nome;
    private String vila;
    private int nivel;

    public Ninja(String nome, String vila, int nivel) {
        this.nome = nome;
        this.vila = vila;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void executarMissao(Missao missao) {
        System.out.println("Missão do "+nome+": "+missao.descricao()+" de nivel: "+missao.nivelPerigo());
    }

    public void adicionarMissao(Missao addMissao) {
        System.out.println("O ninja "+nome+" recebeu uma missao: "+addMissao.descricao());
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", vila='" + vila + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
