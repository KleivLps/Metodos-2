public class imprimirArrayConsola {
    public static void main(String[] args) {
        //Array

        int[] arrayEntero = {1, 2, 3, 4, 5};
        String[] arrayString ={"Buenas", "Noches", "Perú", "Lindo"};
        int[] [] arrayBidimensionalEntero = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String[] [] arrayBidimensionalString = {
                {"uno", "Dos", "Tres"},
                {"Cuatro", "Cinco", "Seis"},
                {"Siete", "Ocho", "Nueve"}
        };
        //Array Sobrecargado
        imprimirArray(arrayEntero);
        imprimirArray(arrayString);
        imprimirArray(arrayBidimensionalEntero);
        imprimirArray(arrayBidimensionalString);
    }

    //Metodo para imprimir array de enteros

    public static void imprimirArray(int[] array) {
        System.out.println("Arreglo de enteros: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(String[] array) {
        System.out.println("Arreglo de Strings: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(int[][] array) {
        System.out.println("Arreglo bidimensional de enteros: ");
        for (int[] fila : array) {
            for (int i : fila) {
            System.out.print(i + " ");
        }
        System.out.println();
        }
    }
    public static void imprimirArray(String[][] array) {
        System.out.println("Arreglo bidimensional de strings: ");
        for (String[] fila : array) {
            for (String s : fila) {
                System.out.print(s + " ");
            }
        System.out.println();
    }
}
    }
