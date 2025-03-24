public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        
        return titulo;
    }

    public String getAutor() {
        
        return autor;
    }

    public int getPaginas() {
        
        return paginas;
    }

    public class ReporteService {
        public void generarReporte(Libro libro) {
            System.out.println("Generando reporte para: " + libro.getTitulo());

        }

}

public class Persistencia{}
public void GuardarElLibro(Libro Libro){
     System.out.println("guardando libro en la base de datos");
   }

}