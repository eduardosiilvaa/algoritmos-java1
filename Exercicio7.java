public class Exercicio7 {
    
    // calculando o salário total do vendedor e apresentá-lo na tela.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas realizadas no mês: ");
        double totalVendas = scanner.nextDouble();

        System.out.print("Digite o percentual de comissão (%): ");
        double percentualComissao = scanner.nextDouble();

        double comissao = (percentualComissao / 100) * totalVendas;
        double salarioTotal = salarioFixo + comissao;
        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
        scanner.close();
    }
}
