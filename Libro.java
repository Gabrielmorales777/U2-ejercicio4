public class Libro {
     private String titulo;
     private String autor;
     private boolean disponibilidad;

     public Libro(String titulo, String autor) {
         this.titulo = titulo;
         this.autor = autor;
         this.disponibilidad = true;
     }
     public String getTitulo() {
         return titulo;
     }
     public String getAutor() {
         return autor;
     }
        public boolean isDisponible() {
            return disponibilidad;
        }
        public void setDisponible(boolean disponible) {
         this.disponibilidad = disponible;
        }
}
