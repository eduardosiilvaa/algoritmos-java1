import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      // Aqui mostra o total de quantos carros e motos há no estacionamento
      System.out.print("Digite o total de veículos: ");
      int totalVeiculos = scanner.nextInt();
      
      System.out.print("Digite o total de rodas: ");
      int totalRodas = scanner.nextInt();
      
      int carros = (totalRodas - 2 * totalVeiculos) / 2;
      int motos = totalVeiculos - carros;
      
      // Exibe o resultado
      System.out.println("Total de carros: " + carros);
      System.out.println("Total de motos: " + motos);
      
      scanner.close();
  }
}
