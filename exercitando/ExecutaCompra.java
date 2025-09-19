import java.util.Scanner;

public class ExecutaCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o produto
        System.out.println("Digite o Código do Produto:");
        String codProd = scanner.nextLine();

        System.out.println("Digite o nome do Produto:");
        String nomeProd = scanner.nextLine();

        System.out.println("Digite o valor do Produto:");
        double precoProd = scanner.nextDouble();
        scanner.nextLine(); 

        Produto produto = new Produto(codProd, nomeProd, precoProd);

        // Criando a cidade
        System.out.println("Digite o UF da Cidade:");
        String ufCidade = scanner.nextLine();

        System.out.println("Digite o nome da Cidade:");
        String nomeCidade = scanner.nextLine();

        Cidade cidade = new Cidade(nomeCidade, ufCidade); 

        // Criando o cliente
        System.out.println("Digite o Documento:");
        String documento = scanner.nextLine();

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        Cliente cliente = new Cliente(documento, nomeCliente, cidade);

        // Fazer a venda
        System.out.println("Digite a quantidade comprada:");
        double quantidade = scanner.nextDouble();
        scanner.nextLine(); 


        ItemPedido item = new ItemPedido(1,produto, quantidade);
        double subtotal = item.produto.preco * item.quantidade;

        // Mostrar os resultados
        System.out.println("Valor total das vendas: " + subtotal);
        System.out.println("A cidade do Cliente é: " + cliente.cidade.nome);
        System.out.println("Preço unitário do produto: " + produto.preco);

        scanner.close();
    }
}