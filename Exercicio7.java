import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados do vendedor
        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe o valor total das vendas: ");
        double totalVendas = scanner.nextDouble();

        System.out.print("Informe o percentual de comissão sobre as vendas: ");
        double percentualComissao = scanner.nextDouble();

        // Calcular o salário total
        double salarioTotal = salarioFixo + (totalVendas * percentualComissao / 100);

        // Exibir o resultado
        System.out.println("Salário total do vendedor: " + salarioTotal);

        scanner.close();
    }
}
