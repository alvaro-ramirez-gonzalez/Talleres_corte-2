public interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contraseña);

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
       
        System.out.println("Autenticando localmente al usuario: " + usuario);
        return true; 
    }
}

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
       
        System.out.println("Autenticando con OAuth al usuario: " + usuario);
        return true; 
    }

}

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean iniciarSesion(String usuario, String contraseña) {
        return servicioAutenticacion.autenticar(usuario, contraseña);
    }
}

public class Ptrincipal {
    public static void main(String[] args) {
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(autenticacionLocal);
        gestor.iniciarSesion("usuario1", "contraseña123");

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(autenticacionOAuth);
        gestor.iniciarSesion("usuario2", "contraseña456");
    }
}


}
