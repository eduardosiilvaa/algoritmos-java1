import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a temperatura em Fahrenheit
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converter para Celsius
        double celsius = (fahrenheit - 32) / 1.8;

        // Exibir o resultado
        System.out.println("Temperatura em Celsius: " + celsius);

        scanner.close();
    }
}
