import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String id, Cliente titular, Date fechaCreacion, double saldo) {
        //cta corriente tiene cero intereses
        super(id, titular, fechaCreacion, saldo, 0);
    }

    @Override
    public void retirar(double cantidad) {
        this.setSaldo(this.getSaldo() - cantidad);
    }

    //se lanza una excepcion ya que no tiene sentido implementar invertir con 0% de intereses
    @Override
    public double invertir(double cantidad, int meses) {
        throw new UnsupportedOperationException("Cuenta corriente no tiene intereses");
    }

    @Override
    public String toString() {
        return "\n\t\tCuenta Corriente: {" +
            super.toString() +
            "\t\t}";
    }
}
