public abstract class Mensajero {
    public abstract void enviarMensaje(String mensaje);
    public class MensajeroEmail extends Mensajero {
        @Override
        public void enviarMensaje(String mensaje) {
            System.out.println("Enviando correo electrónico: " + mensaje);
        }
    }
    
    public class MensajeroSMS extends Mensajero {
        @Override
        public void enviarMensaje(String mensaje) {
            System.out.println("Enviando SMS: " + mensaje);
        }
    }
    
    public class MensajeroPush extends Mensajero {
        @Override
        public void enviarMensaje(String mensaje) {
            System.out.println("Enviando notificación push: " + mensaje);
        }
    }
    
    public class GestorMensajes {
        public void enviarMensaje(Mensajero mensajero, String mensaje) {
            mensajero.enviarMensaje(mensaje);
        }
    }

}

