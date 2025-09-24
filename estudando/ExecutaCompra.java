import java.util.Scanner;

public class ExecutaCompra{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Nesse trecho estamos declarando que vamos usar o scanner.

        System.out.println("Digite o valor 1");
        String valor1 = scanner.nextLine(); // Digitamos o valor1 e armazenamos na variável valor1 com o scanner.

        System.out.println("Digite o valor 2");
        String valor2 = scanner.nextLine(); // Mesma coisa que foi feita para o valor1, foi feita para o valor2.

        Valores valores = new Valores(valor1, valor2); // Aqui estamos criando o objeto valores da classe Valores.
    }
}
