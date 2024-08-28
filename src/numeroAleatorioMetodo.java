import java.util.Scanner;

public class numeroAleatorioMetodo {

    public int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int adivinarNumero = numeroAleatorio(1,20);
        int intentos;

        System.out.println("Adivina el numero entre el 1 y 20: ");

        do {
            System.out.println("Ingresa el numero: ");
            intentos=scanner.nextInt();

            if (intentos < adivinarNumero) {
                System.out.println("El numero es mayor. ");
            } else if (intentos > adivinarNumero) {
                System.out.println("El numero es menor. ");
            } else {
                System.out.println("¡felicidades! Lograste adivinar el numero.");
            }
        } while (intentos != adivinarNumero);
    }

    public static void main(String[] args) {
        numeroAleatorioMetodo jugar = new numeroAleatorioMetodo();
        jugar.jugar();
    }
}
