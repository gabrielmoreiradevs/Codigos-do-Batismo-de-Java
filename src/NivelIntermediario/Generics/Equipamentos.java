package NivelIntermediario.Generics;

public class Equipamentos {
    private String nome;

    public Equipamentos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
