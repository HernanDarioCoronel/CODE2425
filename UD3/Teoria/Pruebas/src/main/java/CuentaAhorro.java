import java.util.Date;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String id, Cliente titular, Date fechaCreacion, double saldo) {
        super(id, titular, fechaCreacion, saldo, saldo > 100000 ? 0.10 : 0.05);
    }

    @Override
    public void retirar(double cantidad) {
        throw new UnsupportedOperationException("No se puede retirar dinero de una cuenta de ahorro.");
    }

    @Override
    public double invertir(double cantidad, int meses) {
        return cantidad * meses * 0.05;
    }
}
