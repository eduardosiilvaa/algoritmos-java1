import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o primeiro número: ");
      double numero1 = scanner.nextDouble();
      
      System.out.print("Digite o segundo número (base do logaritmo): ");
      double numero2 = scanner.nextDouble();

      
      double resultado = Math.log(numero1) / Math.log(numero2);

      // Imprimindo o resultado
      System.out.println("O logaritmo de " + numero1 + " na base " + numero2 + " é: " + resultado);

      scanner.close();
  }
}
