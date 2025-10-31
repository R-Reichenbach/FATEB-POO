package br.com.poo.modelos;

public class Cliente {
    
    private String nome;
    private String cnh;

    public Cliente() {
        // Construtor vazio
    }

    public Cliente(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCnh(String cnh) throws Exception {
        if (this.cnh == null) {
            this.cnh = cnh;
        } else {
            throw new Exception("CNH do cliente já foi informado e nao pode ser alterado");
        }
    }

    public String getCnh() {
        return this.cnh;
    }

}