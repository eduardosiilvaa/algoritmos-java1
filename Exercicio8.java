import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados
        System.out.print("Informe o número total de veículos no estacionamento: ");
        int totalVeiculos = scanner.nextInt();

        System.out.print("Informe o total de rodas no estacionamento: ");
        int totalRodas = scanner.nextInt();

        // Calcular a quantidade de carros e motos
        int carros = (totalRodas - totalVeiculos * 2) / 2;
        int motos = totalVeiculos - carros;

        // Exibir o resultado
        System.out.println("Carros: " + carros);
        System.out.println("Motos: " + motos);

        scanner.close();
    }
}
