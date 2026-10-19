
public class Biblioteca {

    public ComprobantePrestamo prestarLibro(
            Libro libro, Socio socio) {

        if (libro.isDisponible()) {

            libro.setDisponible(false);

            System.out.println("Préstamo aprobado.");

            return new ComprobantePrestamo(libro, socio);

        } else {

            System.out.println("Préstamo rechazado: el libro no está disponible.");

            return null;
        }
    }
}
