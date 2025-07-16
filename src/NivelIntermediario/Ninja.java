package NivelIntermediario;

public abstract class Ninja implements Estrategia {

    // Criando a class Ninja.
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodo Geral! Todos os Ninjas Tem
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é "+nome+" e esse é meu ataque especial");
    }

    //Sobre escrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println(nome + " Essa é minha estrategia de combate basica");
    }

}
