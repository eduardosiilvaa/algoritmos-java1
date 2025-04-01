import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		double a, b, media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o primeiro número para gerar a média aritmética: ");
		a = sc.nextDouble();
		System.out.print("Informe o segundo número para gerar a média aritmética: ");
		b = sc.nextDouble();
		
		media = (a + b) / 2;
		
		System.out.println("A média dos números é: "+ media);
		
		sc.close();
	}
}
