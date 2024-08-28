import java.util.Scanner;

public class obtenerNotaMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una puntuación entre 0 y 100: ");
        int puntuacion = scanner.nextInt();

        if (puntuacion >= 0 && puntuacion <= 100) {
            String nota = obtenerNota(puntuacion);
            System.out.println("La calificacion es: " +nota);
        } else {
            System.out.println("Puntuacion no valida. Debe estar entre 0 y 100.");
        }

        scanner.close();
    }
    public static String obtenerNota(int puntuacion) {
        return switch (puntuacion / 10 ) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}
