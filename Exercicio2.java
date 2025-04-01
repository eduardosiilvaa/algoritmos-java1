import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		double a, res;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor do produto para acréscimo de 10%: ");
		a = sc.nextDouble();
		
		res = (a*10) / 100 + a;
		
		System.out.println("O valor com acréscimo é: "+ res);
		sc.close();
	}

}
