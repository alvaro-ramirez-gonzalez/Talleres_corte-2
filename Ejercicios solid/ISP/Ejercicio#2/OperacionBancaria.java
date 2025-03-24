public interface OperacionBancaria {

    void transferiri (double monto , String cuentaDestino);
    void  retirar (double monto);
    void pagarFactura(String factura , double monto);

    public interface Transferencia {
    
        void trasferiri (double monto ,String cueantaDestino);
        
        public interface Retiro {

            void retirar (double monto);
       
        }
   
    public  interface PagoFactuara{
        
        void pagarFactura(String factura , double monto);
    }
     
    public class ServicioTrasferencia implements Transferencia{

        @Override
        public void trasferiri(double monto, String cueantaDestino) {
        
            System.out.println("Trasnferencia");
         
        }
    
    }

    public class ServicioRetiro implements Retiro {
        @Override
        public void retirar(double monto) {
            System.out.println("Retiro de " + monto + " realizado.");
        }
    }

public class ServicioPagoFactura implements PagoFactuara{
    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.println("Pago de factura " + factura + " de " + monto + " realizado.");
    }

}
}
}
