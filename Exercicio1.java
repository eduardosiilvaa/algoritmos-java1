import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular a média
        double media = (numero1 + numero2) / 2;

        // Exibir o resultado
        System.out.println("A média é: " + media);

        scanner.close();
    }
}
