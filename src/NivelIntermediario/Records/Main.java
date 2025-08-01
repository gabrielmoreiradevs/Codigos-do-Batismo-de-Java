package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto","naruto@hotmail.com",99999999);

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@hotmail.com", 111111111);
        System.out.println(cadastro.getNome());
        System.out.println(cadastroRecord.nome());

    }
}
