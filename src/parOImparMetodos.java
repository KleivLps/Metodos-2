import java.util.Scanner;

public class parOImparMetodos {
    public static void main(String[] args) {
   int numero = solicitarNumero();

   if (esPar(numero)) {
       System.out.println("El numero es par.");
   } else {
       System.out.println("El numero es impar. ");
   }
    }
    public static int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}