public class ItemPedido {
    
    int sequencial;
    Produto produto;
    double quantidade;

    ItemPedido(int sequencial, Produto produto, double quantidade){
        this.sequencial = sequencial;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
