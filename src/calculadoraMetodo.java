import java.util.Scanner;

public class calculadoraMetodo {
    public static void main(String[] args) {
        menu();
    }
    public static void  menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("CALCULADORA");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Ingrese el primer numero: ");
                double numero1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double numero2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " +sumar(numero1, numero2));
                        break;
                    case 2 :
                        System.out.println("Resultado: " +restar(numero1, numero2));
                        break;
                    case 3:
                        System.out.println("Resultado: " +multiplicar(numero1, numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                        System.out.println("Resultado: " +dividir(numero1, numero2));
                } else {
                            System.out.println("Error: No es posible dividir entre 0");
                        }
                        break;
            }
        } else if (opcion != 5) {
                System.out.println("opcion no válida. Intente de nuevo. ");
            }
    } while (opcion != 5);
        System.out.println("Gracias por usar la calculadora. ");
        scanner.close();
}
public static double sumar(double a, double b ) {
    return a + b;
    }
    public static double restar (double a, double b) {
        return a - b;
    }
    public static double multiplicar (double a, double b) {
        return a * b;
    }
    public static double dividir (double a, double b) {
        return a / b;
    }

}
