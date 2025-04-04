import java.time.LocalDate;

public class ClienteEmpresa extends Cliente {
    private String idFiscal;
    private String tipoEmpresa;
    private int numEmpleados;
    private double facturacionAnual;

    public ClienteEmpresa(String id, String nombre, String direccion, String contacto, String email, LocalDate fechaAlta, String idFiscal, String tipoEmpresa, int numEmpleados, double facturacionAnual) {
        super(id, nombre, direccion, contacto, email, fechaAlta);
        this.idFiscal = idFiscal;
        this.tipoEmpresa = tipoEmpresa;
        //se inicializó numEmpleados
        this.numEmpleados = numEmpleados;
        this.facturacionAnual = facturacionAnual;
    }

    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public double getFacturacionAnual() {
        return facturacionAnual;
    }

    public void setFacturacionAnual(double facturacionAnual) {
        this.facturacionAnual = facturacionAnual;
    }

    @Override
    public String toString() {
        return "Empresa{" +
            super.toString() +
            "idFiscal='" + idFiscal + '\'' +
            ", tipoEmpresa='" + tipoEmpresa + '\'' +
            ", numEmpleados=" + numEmpleados +
            ", facturacionAnual=" + facturacionAnual +
            '}';
    }
}
