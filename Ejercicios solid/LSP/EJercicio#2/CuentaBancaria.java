public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad no válida o saldo insuficiente.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public static class CuentaAhorros extends CuentaBancaria {
        private double tasaInteres;
    
        public CuentaAhorros(double saldoInicial, double tasaInteres) {
            super(saldoInicial);
            if (tasaInteres < 0 || tasaInteres > 1) {
                throw new IllegalArgumentException("La tasa de interés debe ser un valor entre 0 y 1.");
            }
            this.tasaInteres = tasaInteres;
        }
    
        public void aplicarInteres() {
            double interes = saldo * tasaInteres;
            saldo += interes;
        }
    }

    public static class ClassPrueba {
        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaAhorros(1000, 0.05);
            cuenta.depositar(500);
            cuenta.retirar(200);
            if (cuenta instanceof CuentaAhorros) {
                ((CuentaAhorros) cuenta).aplicarInteres();
            }
            System.out.println("Saldo final: " + cuenta.obtenerSaldo());
        }
    }
}





