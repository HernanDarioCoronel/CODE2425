import java.util.Date;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String id, Cliente titular, Date fechaCreacion, double saldo) {
        super(id, titular, fechaCreacion, saldo, saldo > 100000 ? 0.10 : 0.05);
    }

    @Override
    public void retirar(double cantidad) {
        throw new UnsupportedOperationException("No se puede retirar dinero de una cuenta de ahorro.");
    }
    //pensé en implementar un atributo "LocalDateTime ultimoRetiro" para verificar que el último retiro fue hace un mes o mas
    //pero no quería modificar demasiado la lógica del programa asi que asumiré que al invertir se retira todo el saldo ingresado
    @Override
    public double invertir(double cantidad, int meses) {
        return cantidad * meses * (1 + 0.05);
    }
}
