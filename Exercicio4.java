import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	        double capital, prazo, taxaJuros, montante;
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do capital aplicado (C): ");
	        capital = scanner.nextDouble();

	        System.out.print("Digite o prazo de aplicação em meses (n): ");
	        prazo = scanner.nextInt();

	        System.out.print("Digite a taxa de juros mensal (i) em percentual (ex: 5 para 5%): ");
	        taxaJuros = scanner.nextDouble() / 100; // Converte a taxa de juros para decimal

	        // Fórmula de Juros Compostos: M = C * (1 + i)^n
	        montante = capital * Math.pow((1 + taxaJuros), prazo);

	        System.out.printf("O montante a ser recebido após %f meses é: R$ %.2f\n", prazo, montante);

	        scanner.close();

	}

}
