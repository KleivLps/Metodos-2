public class generarNumeroAleatorio {
    public int numeroAleatorio() {
        int numero =(int) Math.floor(Math.random() * 365) +1;
        return numero;

    }

    public static void main(String[] args) {
        generarNumeroAleatorio generador = new generarNumeroAleatorio();
        System.out.println("Numero aleatorio: " +generador.numeroAleatorio());
    }
}
