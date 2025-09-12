public class ItemPedido {
    
    int sequencial;
    Produto produto;
    double quantidade;

    ItemPedido(int sequencial, Produto produto, int quantidade){
        this.sequencial = sequencial;
        this.quantidade = quantidade;
    }
}
