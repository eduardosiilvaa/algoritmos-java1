import java.util.Scanner;
    public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Esse algoritmo apresenta a quantidade de horas, minutos e  segundos.
        System.out.print("Digite o número de segundos: ");
        int totalSegundos = scanner.nextInt();

        //Calculo
        int horas = totalSegundos / 3600; 
        int minutos = (totalSegundos % 3600) / 60; 
        int segundos = totalSegundos % 60; 
        
        // resultado
        System.out.println(totalSegundos + " segundos correspondem a:");
        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
        
        scanner.close();
    }
}
