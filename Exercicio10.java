import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os três valores
        System.out.print("Informe o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double c = scanner.nextDouble();

        // Calcular as médias
        double mediaAritmetica = (a + b + c) / 3;
        double mediaHarmonica = 3 / (1/a + 1/b + 1/c);
        double mediaGeometrica = Math.pow(a * b * c, 1.0/3.0);

        // Exibir o resultado
        System.out.println("Média Aritmética: " + mediaAritmetica);
        System.out.println("Média Harmônica: " + mediaHarmonica);
        System.out.println("Média Geométrica: " + mediaGeometrica);

        scanner.close();
    }
}
