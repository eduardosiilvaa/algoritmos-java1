import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, mediaAritmetica, mediaHarmonica, mediaGeometrica;
		
        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();
        
        mediaAritmetica = (a + b + c) / 3;
        mediaHarmonica = 3 / ((1 / a) + (1 / b) + (1 / c));
        mediaGeometrica = Math.cbrt(a * b * c); // Raíz cúbica

        System.out.printf("Média Aritmética: %.2f%n", mediaAritmetica);
        System.out.printf("Média Harmônica: %.2f%n", mediaHarmonica);
        System.out.printf("Média Geométrica: %.2f%n", mediaGeometrica);

        scanner.close();

	}

}
