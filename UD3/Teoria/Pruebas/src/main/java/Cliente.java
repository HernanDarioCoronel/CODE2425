import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    protected String id;
    protected String nombre;
    protected String direccion;
    protected String contacto;
    protected String email;
    protected LocalDate fechaAlta;
    protected List<CuentaBancaria> cuentas;
    protected boolean moroso;
    private int antiguedad;

    public Cliente(String id, String nombre, String direccion, String contacto, String email, LocalDate fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.fechaAlta = fechaAlta;
        this.cuentas = new ArrayList<>();
        this.moroso = false;
    }

    public Cliente() {
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public boolean estaEnRojos() {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getSaldo() < 0) {
                return true;
            }
        }
        return moroso;
    }

    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    public void calcularEdad(){
        LocalDate hoy = LocalDate.now();
        this.antiguedad = Period.between(fechaAlta, hoy).getYears();
    }
}


