import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de segundos
        System.out.print("Informe o número de segundos: ");
        int segundos = scanner.nextInt();

        // Calcular horas, minutos e segundos
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        // Exibir o resultado
        System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos");

        scanner.close();
    }
}
