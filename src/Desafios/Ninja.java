package Desafios;

public abstract class Ninja {

    private String nome;
    private Vila vila;
    private int nivel;

    public Ninja(String nome, Vila vila, int nivel) {
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

    public Vila getVila() {
        return vila;
    }

    public void setVila(Vila vila) {
        this.vila = vila;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public abstract void executarMissao();

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", vila='" + vila + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
