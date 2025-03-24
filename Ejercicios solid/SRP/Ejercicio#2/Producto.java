public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public class EtiquetaService {
        public void generarEtiqueta(Producto producto) {
            System.out.println("Etiqueta del producto: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
        }
    
    }

    public class CalculoPrecioService {
        public double calcularPrecioConImpuesto(Producto producto, double impuesto) {
            return producto.getPrecio() * (1 + impuesto);
        }
    }
}