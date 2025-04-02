import java.util.Date;

public abstract class CuentaBancaria {
    protected String id;
    protected Cliente titular;
    protected Date fechaCreacion;
    protected double saldo;
    protected double tipoInteres;

    public CuentaBancaria(String id, Cliente titular, Date fechaCreacion, double saldo, double tipoInteres) {
        this.id = id;
        this.titular = titular;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public void ingreso(double cantidad) {
        saldo += cantidad;
    }

    public abstract void retirar(double cantidad);

    public double getSaldo() {
        return saldo;
    }

    public abstract double invertir(double cantidad, int meses);
}


