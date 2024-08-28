import java.util.Scanner;

public class calcularAreasMetodos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Selecciona la figura geometrica: ");
            System.out.println("1. circulo ");
            System.out.println("2. triangulo ");
            System.out.println("3. paralelogramo ");
            System.out.println("4. salir ");
            System.out.println("Opcion:");
            int opcionFiguras = scanner.nextInt();

        switch (opcionFiguras){
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularTriangulo(scanner);
                break;
            case 3:
                calcularParalelogramo(scanner);
                break;
            case 4:
                salir = true;
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida. Intente nuevamente.");
        }
    }
}
public static void calcularCirculo(Scanner scanner) {
    System.out.println("Ingrese el radio del circulo: ");
    double radio = scanner.nextDouble();

    System.out.println("¿Que desea calcular?: ");
    System.out.println("1. Perimetro ");
    System.out.println("2. Area ");
    System.out.println("Opcion: ");
    int opcion = scanner.nextInt();

    switch (opcion){
        case 1:
            double perimetroCirculo = 2* Math.PI * radio;
            System.out.println("El perimetro del circulo es: " +perimetroCirculo);
            break;
        case 2:
            double areaCirculo = Math.PI *Math.pow(radio, 2);

            System.out.println("El area del cirtulo es: " +areaCirculo);
            break;
        default:
            System.out.println("Opcion no Valida.");
    }
}

public static void calcularTriangulo(Scanner scanner) {
    System.out.println("¿Que desea calcular?");
    System.out.println("1. Perimetro");
    System.out.println("2. Area");
    System.out.println("Opcion: ");
    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("Ingrese la longitud del lado a: ");
            double a = scanner.nextDouble();
            System.out.println("Ingrese la longitud del lado b: ");
            double b = scanner.nextDouble();
            System.out.println("Ingrese la longitud del lado c: ");
            double c = scanner.nextDouble();
            double perimetroTriangulo = a + b + c;
            System.out.println("El perimetro del triangulo es: " +perimetroTriangulo);
            break;
        case 2:
            System.out.println("Ingrese la base del triangulo: ");
            double base = scanner.nextDouble();
            System.out.println("Ingrese la altura del triangulo: ");
            double altura = scanner.nextDouble();
            double areaTriangulo = (base * altura) / 2;
            System.out.println("El area del triangulo es: " + areaTriangulo);
            break;
        default:
            System.out.println("Opcion no valida. ");
    }
    }

    public static void calcularParalelogramo(Scanner scanner) {
        System.out.println("¿Que desea calcular?");
        System.out.println("1. Perimetro");
        System.out.println("2. Area");
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la longitud del lado a: ");
                double a = scanner.nextDouble();
                System.out.println("Ingrese la longitud del lado b: ");
                double b = scanner.nextDouble();
                double perimetroParalelogramo = 2* (a + b);
                System.out.println("El perimetro del paralelogramo es: " +perimetroParalelogramo);
                break;
            case 2:
                System.out.println("Ingrese la base del paralelogramo: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del paralelogramo: ");
                double altura = scanner.nextDouble();
                double areaParalelogramo = base * altura;
                System.out.println("El area del paralelogramo es: " +areaParalelogramo);
                break;
            default:
                System.out.println("Opcion no valida. ");
        }
    }
}
