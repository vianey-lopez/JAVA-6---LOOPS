import java.util.Random;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random tómbola = new Random();


        System.out.println("Ingresa el número total de participantes:");
        int totalParticipantes = scanner.nextInt();
        int numeroGanador;
        do {
            numeroGanador = tómbola.nextInt(totalParticipantes);
        }while(numeroGanador == 0);



        System.out.println("El número ganador es: " + numeroGanador);

        scanner.close();
    }
}
