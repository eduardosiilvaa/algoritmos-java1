import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          //  calcular e imprimir o salário bruto a ser recebido
          System.out.print("Digite o número de horas trabalhadas no mês: ");
          int horasTrabalhadas = scanner.nextInt();
          System.out.print("Digite o valor recebido por hora de trabalho: ");
          double valorHora = scanner.nextDouble();
          System.out.print("Digite o valor do salário família: ");
          double salarioFamilia = scanner.nextDouble();
          System.out.print("Digite o número de filhos com idade menor que 14 anos: ");
          int numFilhos = scanner.nextInt();
         
          // Calculo
          double salarioBase = horasTrabalhadas * valorHora; 
          double salarioFamiliaTotal = salarioFamilia * numFilhos; 
          double salarioBruto = salarioBase + salarioFamiliaTotal;           
          // resultado
          System.out.println("Salário bruto a ser recebido: R$ " + salarioBruto);        
          scanner.close();
      }
  }
