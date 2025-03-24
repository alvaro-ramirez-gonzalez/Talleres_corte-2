public abstract class Descuento {
    public abstract double aplicarDescuento(double monto);
    public class DescuentoPorcentaje extends Descuento {
        private double porcentaje;
    
        public DescuentoPorcentaje(double porcentaje) {
            this.porcentaje = porcentaje;
        }
    
        @Override
        public double aplicarDescuento(double monto) {
            return monto * (1 - porcentaje);
        }
    }
    
    public class DescuentoFijo extends Descuento {
        private double descuentoFijo;
    
        public DescuentoFijo(double descuentoFijo) {
            this.descuentoFijo = descuentoFijo;
        }
    
        @Override
        public double aplicarDescuento(double monto) {
            return monto - descuentoFijo;
        }
    }
    
    public class Tienda {
        public void aplicarDescuento(Descuento descuento, double monto) {
            double montoConDescuento = descuento.aplicarDescuento(monto);
            System.out.println("Monto con descuento: $" + montoConDescuento);
        }
    }

}