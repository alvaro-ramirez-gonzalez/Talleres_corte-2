import java.util.Scanner;

public class SimuladorCajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(1000); // Saldo inicial de 1000
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta, scanner);
        cajero.mostrarMenu();
    }
}