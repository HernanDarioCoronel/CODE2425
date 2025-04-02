import java.time.LocalDate;

public class ClienteEmpresa extends Cliente{
    private String idFiscal;
    private String tipoEmpresa;
    private int numEmpleados;
    private double facturacionAnual;

    public ClienteEmpresa(String id, String nombre, String direccion, String contacto, String email, LocalDate fechaAlta, String idFiscal, String tipoEmpresa, int numEmpleados, double facturacionAnual) {
        super(id, nombre, direccion, contacto, email, fechaAlta);
        this.idFiscal = idFiscal;
        this.tipoEmpresa = tipoEmpresa;
        this.facturacionAnual = facturacionAnual;
    }
}
