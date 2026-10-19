
public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Socio socio = new Socio("Gabriel", 101);

        Libro libro = new Libro(
                "El principito", "Antoine de Saint-Exupéry");

        
        ComprobantePrestamo comprobante =
                socio.solicitarPrestamo(biblioteca, libro);

        if (comprobante != null) {
            comprobante.mostrarComprobante();
        }

        System.out.println();


        ComprobantePrestamo segundoComprobante =
                socio.solicitarPrestamo(biblioteca, libro);

        if (segundoComprobante != null) {
            segundoComprobante.mostrarComprobante();
        } else {
            System.out.println("No se pudo realizar el segundo préstamo.");
        }
    }
}
