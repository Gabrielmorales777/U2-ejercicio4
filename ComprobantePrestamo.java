
public class ComprobantePrestamo {

    private Libro libro;
    private Socio socio;

    public ComprobantePrestamo(Libro libro, Socio socio) {
        this.libro = libro;
        this.socio = socio;
    }

    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PRÉSTAMO -----");
        System.out.println("Socio: " + socio.getNombre());
        System.out.println("Número de socio: " + socio.getNumeroSocio());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("----------------------------------");
    }
}
