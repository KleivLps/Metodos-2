import java.io.StringReader;
import java.util.Scanner;

public class validadorContraseñaMetodo {

    public boolean esSegura(String contrasena) {
        return esCorrecta(contrasena) &&
                contieneMayuscula(contrasena) &&
                contieneMinuscula(contrasena) &&
                contieneNumero(contrasena) &&
                contieneCaracter(contrasena);
    }

    public boolean esCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    public boolean contieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean contieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    public boolean contieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public boolean contieneCaracter(String contrasena) {
        String caracteres = "!@#$%^&*()-+=<>?";
        for (char c : contrasena.toCharArray()) {
            if (caracteres.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        validadorContraseñaMetodo validar = new validadorContraseñaMetodo();
        System.out.println("Por favor ingresa la contraseña: ");
        String contrasena = scanner.nextLine();

        if (validar.esSegura(contrasena)) {
            System.out.println("La contrseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }

}
