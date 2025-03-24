public interface Mantenimiento {
    
    void reparar();
    void limpiar();

    public interface Reparacion {
        void reparar();
    }
    
    
    public interface Limpieza {
       
        void limpiar();
    }


    public class TecnicoReparacion implements Reparacion {
        @Override
        public void reparar() {
            System.out.println("El técnico está realizando reparaciones.");
        }
    }
    
    public class PersonalLimpieza implements Limpieza {
        @Override
        public void limpiar() {
            System.out.println("El personal de limpieza está limpiando.");
        }
    
        public class PrincilMAntenimiento {
            public static void main(String[] args) {
                TecnicoReparacion tecnico = new TecnicoReparacion();
                tecnico.reparar(); 
        
                PersonalLimpieza limpiador = new PersonalLimpieza();
                limpiador.limpiar();  
        }
    
    }

}
}



