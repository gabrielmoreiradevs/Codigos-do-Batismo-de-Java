package NivelFacil.Condicionais;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: Maneiras de reduzir o codigo
        * Usado como If e Else
        * variavel = (condicao) ? ValorVerdadeiro : ValorFalso;
        * */

        short numeroDeMissoes = 10;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões": "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);

    }
}
