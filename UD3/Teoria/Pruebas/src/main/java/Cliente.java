import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    //se cambió todos a private y se implementaron getters y setters
    private String id;
    private String nombre;
    private String direccion;
    private String contacto;
    private String email;
    private LocalDate fechaAlta;
    private List<CuentaBancaria> cuentas;
    private boolean moroso;
    private int antiguedad;

    protected Cliente(String id, String nombre, String direccion, String contacto, String email, LocalDate fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        //se inicializó email
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.cuentas = new ArrayList<>();
        this.moroso = false;
    }

    // Eliminado un constructor vacío

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

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void calcularAntiguedad() {
        LocalDate hoy = LocalDate.now();
        this.antiguedad = Period.between(fechaAlta, hoy).getYears();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        datos.append(", nombre: {'").append(nombre).append("'\n");
        datos.append("id: '").append(id).append("'\n");
        datos.append(", direccion: '").append(direccion).append("'\n");
        datos.append(", contacto: '").append(contacto).append("'\n");
        datos.append(", email: '").append(email).append("'\n");
        datos.append(", fechaAlta: '").append(fechaAlta).append("'\n");
        datos.append(", moroso: '").append(moroso ? "si" : "no").append("'\n");
        datos.append(", antiguedad: '").append(antiguedad).append("'\n");
        datos.append("Cuentas: {");
        for (CuentaBancaria cta : cuentas) {
            datos.append(cta.toString());
        }
        datos.append("}");

        return datos.toString();
    }
}



