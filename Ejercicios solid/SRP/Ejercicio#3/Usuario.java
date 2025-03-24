public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
    public class AutenticacionDeServicio {
        public boolean autenticar(Usuario usuario, String contrasena) {
         return usuario.getContrasena().equals(contrasena);
     }
 }
 
 public class ValidacionServicio {
     public boolean validarDatos(Usuario usuario) {
         return usuario.getNombre() != null && !usuario.getNombre().isEmpty() 
                && usuario.getContrasena() != null && !usuario.getContrasena().isEmpty();
     }
 }
 

}

