public class Pedido {
    
    String numero;
    Cliente cliente;
    ItemPedido itempedido;

    public Pedido(String numero, Cliente cliente, ItemPedido itempedido){
        this.numero = numero;
        this.cliente = cliente;
        this.itempedido = itempedido;
    }
}
