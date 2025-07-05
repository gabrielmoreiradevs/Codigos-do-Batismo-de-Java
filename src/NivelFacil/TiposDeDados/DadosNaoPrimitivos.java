package NivelFacil.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*Dados não primitivos: String, Array, Class, enum
        * Criar um ninja e atribuir metodos a ele!
        * */

        String nome="Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); //Tudo em Capslock

        System.out.println("Caixa alta: " + nomeUpperCase);
        System.out.println("Caixa Normal: " + nome);

        //Aldeia do naruto
        String aldeia="Aldeia da Folha";
        String aldeialower=aldeia.toLowerCase(); // caixa baixa

        System.out.println("Normal: " + aldeialower);
    }
}
