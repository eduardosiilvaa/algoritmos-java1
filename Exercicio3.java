import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		double cel, far;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe temperatura em Fahrenheit: ");
		far = sc.nextDouble();
		
		cel = (far - 32) / 1.8;
		System.out.print("A temperatura em  graus Celsius é: "+ cel);
		sc.close();
	}

}
