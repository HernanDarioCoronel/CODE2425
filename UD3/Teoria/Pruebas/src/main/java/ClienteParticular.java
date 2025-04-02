import java.util.Date;

public class ClienteParticular extends Cliente {
    private String dni;
    private String apellidos;
    private boolean nominaDomiciliada;
    private double cuantiaNomina;

    public ClienteParticular(String id, String nombre, String direccion, String contacto, String email, Date fechaAlta, String dni, String apellidos, boolean nominaDomiciliada, double cuantiaNomina) {
        super(id, nombre, direccion, contacto, email, fechaAlta);
        this.dni = dni;
        this.apellidos = apellidos;
        this.nominaDomiciliada = nominaDomiciliada;
        this.cuantiaNomina = cuantiaNomina;
    }
}
