import java.util.Scanner;

public class aula3 {

    public static void main(String[] args){
        byte idade = 20;
        System.out.println("minha idade é: " + idade);

        double precoProduto = 199.99;
        System.out.println("o preço do produto é: " + precoProduto);

        double precoProdutoComDesconto = precoProduto * (1 - 0.15);
        System.out.println("Após o  desconto do produto o valor final é: " + precoProdutoComDesconto);

        Scanner scanner = new Scanner(System.in);

        double desconto = scanner.nextDouble();

        precoProdutoComDesconto = precoProduto * (1 - desconto);
        System.out.println("Após o  desconto do produto o valor final é: " + precoProdutoComDesconto);


    }
}
