public class ItemPedido {
    
    int sequencial;
    Produto produto;
    double quantidade;

    public ItemPedido(int sequencial, Produto produto, double quantidade){
        this.sequencial = sequencial;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
