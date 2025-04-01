import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados da aplicação
        System.out.print("Informe o valor do capital: ");
        double capital = scanner.nextDouble();

        System.out.print("Informe o prazo da aplicação (em meses): ");
        int prazo = scanner.nextInt();

        System.out.print("Informe a taxa de juros mensal: ");
        double taxa = scanner.nextDouble();

        // Calcular o montante com juros compostos
        double montante = capital * Math.pow(1 + taxa / 100, prazo);

        // Exibir o resultado
        System.out.println("Montante a ser recebido: " + montante);

        scanner.close();
    }
}
