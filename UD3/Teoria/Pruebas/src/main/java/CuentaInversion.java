import java.util.Date;

public class CuentaInversion extends CuentaBancaria{
    public CuentaInversion(String id, Cliente titular, Date fechaCreacion, double saldo) {
        super(id, titular, fechaCreacion, saldo, 0.20);
    }

    @Override
    public void retirar(double cantidad) {
        throw new UnsupportedOperationException("No se puede retirar dinero de una cuenta de inversión.");
    }
    @Override
    public double invertir(double cantidad, int meses) {
        return cantidad * meses * 0.1;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return "Cuenta de Inversion" +
            datos;
    }
}
