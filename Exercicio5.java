import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados do funcionário
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Informe o valor do salário família: ");
        double salarioFamilia = scanner.nextDouble();

        System.out.print("Informe o número de filhos menores de 14 anos: ");
        int numeroFilhos = scanner.nextInt();

        // Calcular o salário bruto
        double salarioBruto = (horasTrabalhadas * valorPorHora) + (salarioFamilia * numeroFilhos);

        // Exibir o resultado
        System.out.println("Salário bruto: " + salarioBruto);

        scanner.close();
    }
}
