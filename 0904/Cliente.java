public class Cliente {
    String nome;
    String email;
    Cidade municipio;

    
    public Cliente(String nome, String email, Cidade cidade){
        this.nome = nome;
        this.email = email;
        this.municipio = cidade;
    }

    public String getNomeCidade(){
        return this.municipio.nome;
    }
}
