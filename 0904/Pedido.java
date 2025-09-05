import java.math.BigDecimal;
import java.util.Date;

public class Pedido {
    int numero;
    Date data;
    BigDecimal valor;
    Cliente cliente;
    
    public Pedido(int numero, Date data, BigDecimal valor, Cliente cliente){
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.cliente = cliente;
    }
}
