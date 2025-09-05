import java.math.BigDecimal;
import java.util.Date;

public class Venda {
    public static void main(String[] args){

        Cidade cidade = new Cidade("Birigui", "SP");
        Cliente cliente = new Cliente("João", "joao@gmail.com", cidade);
        Pedido pedido = new Pedido(1, new Date(), new BigDecimal("250.57"), cliente);

        System.out.println("Pedido n° " + pedido.numero);
        System.out.println("Data: " + pedido.data);
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Cidade: " + pedido.getNomeCidadeDoCliente());
        System.out.println("Valor: R$ " + pedido.valor);
    }    
}
