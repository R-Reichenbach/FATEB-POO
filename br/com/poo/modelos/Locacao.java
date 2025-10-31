package br.com.poo.modelos;

import java.time.LocalDate;

public class Locacao {
    private Carro carro;
    private Cliente cliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean ativo;

    public Locacao() {
        // Construtor vazio
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getModeloCarro() {
        return this.carro.getModelo();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNomeCliente() {
        return this.cliente.getNome();
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void iniciaLocacao(LocalDate dataInicio) throws Exception {
        if (this.cliente != null && this.carro != null) {
            this.dataInicio = dataInicio;
            this.ativo = true;
        } else {
            throw new Exception("O cliente e o carro são obrigatorios para iniciar uma locação");
        }
    }

    public void finalizaLocacao(LocalDate dataFim) throws Exception {
        if (this.ativo == true) {
            this.dataFim = dataFim;
            this.ativo = false;
        } else {
            throw new Exception("Para finalizar uma locação ela precisa estar ativa");
        }
    }

}