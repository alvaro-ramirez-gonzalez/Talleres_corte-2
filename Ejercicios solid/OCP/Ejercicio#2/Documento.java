public abstract class Documento {

    public abstract void exportar();
    public class DocumentoPDF extends Documento {
        @Override
        public void exportar() {
            System.out.println("Exportando documento a PDF...");
        }
    }
    
    public class DocumentoWord extends Documento {
        @Override
        public void exportar() {
            System.out.println("Exportando documento a Word...");
        }
    }
    
    public class DocumentoExcel extends Documento {
        @Override
        public void exportar() {
            System.out.println("Exportando documento a Excel...");
        }
    }
    
    public class GestorDocumentos {
        public void exportarDocumento(Documento documento) {
            documento.exportar();
        }
    }
    

}

