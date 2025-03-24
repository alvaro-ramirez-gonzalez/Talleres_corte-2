public interface GeneradorReporte {
    
    void generarReporte(String datos);
    public class ReportePDF implements GeneradorReporte {
        @Override
        public void generarReporte(String datos) {
            System.out.println("Generando reporte en PDF con los datos: " + datos);
        }
    }
    
    public class ReporteExcel implements GeneradorReporte {
        @Override
        public void generarReporte(String datos) {
            System.out.println("Generando reporte en Excel con los datos: " + datos);
        }
    }
    
    public class GestorReportes {
        private GeneradorReporte generadorReporte;
    
        public GestorReportes(GeneradorReporte generadorReporte) {
            this.generadorReporte = generadorReporte;
        }
    
        public void generar(String datos) {
            generadorReporte.generarReporte(datos);
        }
    }
    
    public class Principal {
        public static void main(String[] args) {
            GeneradorReporte reportePDF = new ReportePDF();
            GestorReportes gestor = new GestorReportes(reportePDF);
            gestor.generar("Datos para el reporte en PDF");
    
            GeneradorReporte reporteExcel = new ReporteExcel();
            gestor = new GestorReportes(reporteExcel);
            gestor.generar("Datos para el reporte en Excel");
        }
    }

}

