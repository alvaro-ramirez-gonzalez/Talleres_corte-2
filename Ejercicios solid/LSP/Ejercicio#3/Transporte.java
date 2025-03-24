public class Transporte {

    public void mover() {
        System.out.println("El transporte se mueve");
    }
    public static class Bicicleta extends Transporte {
        @Override
        public void mover() {
            System.out.println("La bicicleta se mueve");
        }
    }

    public static class Coche extends Transporte {
        @Override
        public void mover() {
            System.out.println("El coche se mueve");
        }
    }

    public static class Prueba {
        public static void main(String[] args) {
            Transporte transporte = new Transporte();
            transporte.mover();

            Bicicleta bicicleta = new Bicicleta();
            bicicleta.mover();

            Coche coche = new Coche();
            coche.mover();
        }
    }
}
