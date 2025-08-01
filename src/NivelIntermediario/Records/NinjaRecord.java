package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {
    //Todos atributos são FINAL por padrão sem setter!
    //Não existe getNome e sim so nome
    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
