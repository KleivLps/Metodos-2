import java.util.Scanner;

public class generadorArrayAleatorio {

    public int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public int[] generarArrayRandom(int tamaño, int min, int max) {
        int[] array = new int[tamaño];

        for (int i = 0; i <tamaño; i++) {
            array[i] = numeroAleatorio(min, max);
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        generadorArrayAleatorio generador = new generadorArrayAleatorio();

        System.out.println("Ingresa el tamaño del array: ");
        int tamaño = scanner.nextInt();

        System.out.println("Ingresa el valor minimo del rango: ");
        int min = scanner.nextInt();

        System.out.println("Ingresa el valor maximo del rango: ");
        int max = scanner.nextInt();

        int[] arrayAleatorio = generador.generarArrayRandom(tamaño, min, max);

        System.out.println("Array generado: ");
        for (int num : arrayAleatorio) {
            System.out.println( num + "");
        }
    }
}
