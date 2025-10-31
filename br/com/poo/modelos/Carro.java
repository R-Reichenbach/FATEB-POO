package br.com.poo.modelos;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private boolean disponivel;

    public Carro() {
        // construtor vazio
        this.disponivel = true;
    }

    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.disponivel = true;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPlaca(String placa) throws Exception {
        if (this.placa == null) {
            this.placa = placa;
        } else {
            throw new Exception("A placa do carro já foi definida");
        }
    }

    public String getPlaca() {
        return this.placa;
    }
}