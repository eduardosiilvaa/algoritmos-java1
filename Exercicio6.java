import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os números
        System.out.print("Informe o primeiro número (valor do logaritmo): ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo número (base do logaritmo): ");
        double numero2 = scanner.nextDouble();

        // Calcular o logaritmo
        double logaritmo = Math.log(numero1) / Math.log(numero2);

        // Exibir o resultado
        System.out.println("Logaritmo de " + numero1 + " na base " + numero2 + " é: " + logaritmo);

        scanner.close();
    }
}
