
import java.util.Date;

public abstract class CuentaBancaria {
    //se cambió todos a private y se implementaron getters y setters
    private String id;
    private Cliente titular;
    private Date fechaCreacion;
    private double saldo;
    private double tipoInteres;

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

    // se implementó retirar ya que no tenia sentido como abstracta
    public void retirar(double cantidad) {
        if (this.saldo - cantidad < 0) {
            throw new UnsupportedOperationException("Saldo insuficiente.");
        } else {
            this.saldo -= cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double invertir(double cantidad, int meses);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        datos.append("\n\t\t\tId='").append(id).append('\'');
        datos.append("\n\t\t\tFecha de Creacion=").append(fechaCreacion);
        datos.append("\n\t\t\tSaldo=").append(saldo);
        datos.append("\n\t\t\tTipo de Interes=").append(tipoInteres);
        datos.append("\n");
        return datos.toString();
    }
}


