public interface Almacenamiento {
    
    void guardar(String nombreArchivo, String contenido);
    String recuperar(String nombreArchivo);
    public class AlmacenamientoLocal implements Almacenamiento {
        @Override
        public void guardar(String nombreArchivo, String contenido) {
            System.out.println("Guardando localmente el archivo: " + nombreArchivo);
        }
    
        @Override
        public String recuperar(String nombreArchivo) {
            System.out.println("Recuperando localmente el archivo: " + nombreArchivo);
            return "Contenido del archivo " + nombreArchivo;
        }
    }
    
    public class AlmacenamientoNube implements Almacenamiento {
        @Override
        public void guardar(String nombreArchivo, String contenido) {
            System.out.println("Guardando en la nube el archivo: " + nombreArchivo);
        }
    
        @Override
        public String recuperar(String nombreArchivo) {
            System.out.println("Recuperando de la nube el archivo: " + nombreArchivo);
            return "Contenido del archivo " + nombreArchivo;
        }
    }
    
    public class GestorArchivos {
        private Almacenamiento almacenamiento;
    
        public GestorArchivos(Almacenamiento almacenamiento) {
            this.almacenamiento = almacenamiento;
        }
    
        public void guardarArchivo(String nombreArchivo, String contenido) {
            almacenamiento.guardar(nombreArchivo, contenido);
        }
    
        public String recuperarArchivo(String nombreArchivo) {
            return almacenamiento.recuperar(nombreArchivo);
        }
    }
    
    public class Principal {
        public static void main(String[] args) {
            Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
            GestorArchivos gestor = new GestorArchivos(almacenamientoLocal);
            gestor.guardarArchivo("archivo1.txt", "Contenido de prueba");
            gestor.recuperarArchivo("archivo1.txt");
    
            Almacenamiento almacenamientoNube = new AlmacenamientoNube();
            gestor = new GestorArchivos(almacenamientoNube);
            gestor.guardarArchivo("archivo2.txt", "Contenido de prueba en la nube");
            gestor.recuperarArchivo("archivo2.txt");
        }
    }

}

