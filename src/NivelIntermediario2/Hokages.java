package NivelIntermediario2;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();


    public Hokages(){
        //Construtor Vazio, noArgs
    }

    // Criar um construtor com argumento, allArgs (Automatico IntelliJ)
    public Hokages(double altura, double saldoBancario, int missoes, String aldeia, boolean vivoOuNao, int idade, String nome) {
        this.altura = altura;
        this.saldoBancario = saldoBancario;
        this.missoes = missoes;
        this.aldeia = aldeia;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }

}
