
public class Socio {

    private String nombre;
    private int numeroSocio;

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public ComprobantePrestamo solicitarPrestamo(
            Biblioteca biblioteca, Libro libro) {

        System.out.println(nombre + " solicita el libro: "
                + libro.getTitulo());

        return biblioteca.prestarLibro(libro, this);
    }
}
