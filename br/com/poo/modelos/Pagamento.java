package br.com.poo.modelos;

public class Pagamento {
    private Locacao locacao;
    private double valor;
    
    public Pagamento() {
        // Construtor vazio
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void finalizaPagamento() {
        if (this.locacao.getAtivo() == false) {
            // Imprimir mensagem
            System.out.println("Pagamento finalizado com sucesso");
            System.out.println("Valor pago pelo cliente: R$ " + this.valor);
        }
    }
}