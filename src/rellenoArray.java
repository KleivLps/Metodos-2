import java.util.Scanner;

public class rellenoArray {

    public void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int indiceFinal = 0;
        int tamaño = array.length;

        while (indiceFinal < tamaño - 1) {
            System.out.println("Ingrese un numero para rellenar el array: ");
            int numero = scanner.nextInt();

            int indice;
            do {
                System.out.println("Ingresa el indice hasta el cual quieres rellenar el array ( debe ser mayor que " + indiceFinal + " y menor que " + tamaño + "): ");
                indice = scanner.nextInt();

                if (indice <= indiceFinal || indice >= tamaño) {
                    System.out.println("Indice no valido. Debe ser mayor que el ultimo indice (" + indiceFinal + ") y menor que " +tamaño+ ".");
                }
            } while (indice <= indiceFinal || indice >= tamaño);

            for (int i = indiceFinal; i <= indice; i++) {
                array[i] = numero;
            }

            indiceFinal = indice;
        }
        System.out.println("Array rellenado: ");
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del array: ");
        int tamaño = scanner.nextInt();

        int[] array = new int[tamaño];

        rellenoArray rellenar = new rellenoArray();
        rellenar.rellenarArray(array);
    }
}
