import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o preço do produto
        System.out.print("Informe o valor do produto: ");
        double preco = scanner.nextDouble();

        // Calcular o novo preço com 10% de acréscimo
        double novoPreco = preco * 1.10;

        // Exibir o novo preço
        System.out.println("Novo valor do produto: " + novoPreco);

        scanner.close();
    }
}
