package NivelIntermediario;

public abstract class Ninja implements Estrategia {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Kage

    // Criando a class Ninja.
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    boolean vivo;


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga de construtor com novos atributos
    //Sobrecarga não redeclarar o construtor, apenas os novos atributos.
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, boolean vivo) {
        this(nome,aldeia,idade,numeroDeMissoesConcluidas,rank);
        this.vivo = vivo;
    }

    // Metodo Geral! Todos os Ninjas Tem
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque especial");
    }

    //Sobre escrevendo o metodo da interface
    public void estrategiaDeBatalhaNinja() {
        System.out.println(nome + " Essa é minha estrategia de combate basica");
    }

    //Inteligncia de combate
    public void inteligenciaDeCombate() {
        System.out.println(nome + " Essa é minha inteligencia de combate");
    }

    //Sobrecarga de Metodo - Inteligncia de combate
    public void inteligenciaDeCombate(int QI) {

        if(QI>150){
            System.out.println("Seu QI é "+QI+" e você é um genio");
        }else if(QI<=150){
            System.out.println("Treine seu QI: "+QI);
        }

    }


    @Override
    public String toString() {
        return "Meu nome é "+ nome + " eu sou da "+aldeia+ " e tenho "+idade;
    }
}
