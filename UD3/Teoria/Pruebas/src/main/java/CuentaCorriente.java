import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String id, Cliente titular, Date fechaCreacion, double saldo) {
        super(id, titular, fechaCreacion, saldo, saldo > 100 ? 0.02 : 0.01);
    }

    @Override
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    @Override
    public double invertir(double cantidad, int meses) {
        return cantidad * meses * 0.01;
    }
}
