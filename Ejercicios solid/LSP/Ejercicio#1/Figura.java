public abstract class Figura {
    public abstract double calcularArea();

    public class Circulo extends Figura {
        private double radio;
    
        public Circulo(double radio) {
            this.radio = radio;
        }
    
        @Override
        public double calcularArea() {
            return Math.PI * Math.pow(radio, 2);
        }
    }
    
    public class Rectangulo extends Figura {
        private double ancho;
        private double alto;
    
        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
    
        @Override
        public double calcularArea() {
            return ancho * alto;
        }
    }
    
    public class Prueba {
        public static void main(String[] args) {
           
            Figura figura = new Figura() {
                @Override
                public double calcularArea() {
                    return 0; 
                }
            };
            
            Figura circulo = figura.new Circulo(5);
            Figura rectangulo = figura.new Rectangulo(4, 6);
    
            System.out.println("Área del círculo: " + circulo.calcularArea());
            System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        }
    }
}
