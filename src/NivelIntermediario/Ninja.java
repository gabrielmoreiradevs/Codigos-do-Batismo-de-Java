package NivelIntermediario;

public class Ninja {

    // Criando a class Ninja.
    String nome;
    String aldeia;
    int idade;

    //Criando metodo publico, personalizado (SEM RETORNO/VOID)
    public void ShariganAtivado (){
        System.out.println(nome + " ativou o Sharigan");
    }

    //Criando metodo publico String (Retorno de uma frase)
    public String boasVindas (){
        return "Boas Vindas " + nome;
    }

    //Metodo Int
    public int anosParaHokage(int idadeMinima){
        return idadeMinima - idade;
    }

}
