import java.time.LocalDate;

public class ClienteParticular extends Cliente {
    private String dni;
    private String apellidos;
    private boolean nominaDomiciliada;
    private double cuantiaNomina;

    public ClienteParticular(String id, String nombre, String direccion, String contacto, String email, LocalDate fechaAlta, String dni, String apellidos, boolean nominaDomiciliada, double cuantiaNomina) {
        super(id, nombre, direccion, contacto, email, fechaAlta);
        this.dni = dni;
        this.apellidos = apellidos;
        this.nominaDomiciliada = nominaDomiciliada;
        this.cuantiaNomina = cuantiaNomina;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean isNominaDomiciliada() {
        return nominaDomiciliada;
    }

    public void setNominaDomiciliada(boolean nominaDomiciliada) {
        this.nominaDomiciliada = nominaDomiciliada;
    }

    public double getCuantiaNomina() {
        return cuantiaNomina;
    }

    public void setCuantiaNomina(double cuantiaNomina) {
        this.cuantiaNomina = cuantiaNomina;
    }

    @Override
    public String toString() {
        return "ClienteParticular{" +
            super.toString() +
            "dni='" + dni + '\'' +
            ", apellidos='" + apellidos + '\'' +
            ", nominaDomiciliada=" + nominaDomiciliada +
            ", cuantiaNomina=" + cuantiaNomina +
            '}';
    }
}
