package NivelAvancado;

public class Ninja {
    private String nome;
    private String vila;
    private int Idade;

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        Idade = idade;
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

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", vila='" + vila + '\'' +
                ", Idade=" + Idade +
                '}';
    }
}
