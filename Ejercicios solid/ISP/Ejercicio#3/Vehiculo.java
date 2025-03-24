public interface Vehiculo {

    void conducir();
    void CargaMercancaia();

    
public interface Conduccion {
    void conducir();
}


public interface TransporteMercancia {
    void cargarMercancia(double peso);
}


public class Automovil implements Conduccion {
    @Override
    public void conducir() {
        System.out.println("El automóvil está en movimiento.");
    }
}


public class Camion implements TransporteMercancia {
    @Override
    public void cargarMercancia(double peso) {
        System.out.println("El camión está cargando " + peso + " kg de mercancía.");
    }
}


public class Camioneta implements Conduccion, TransporteMercancia {
    @Override
    public void conducir() {
        System.out.println("La camioneta está en movimiento.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("La camioneta está cargando " + peso + " kg de mercancía.");
    }
}

}