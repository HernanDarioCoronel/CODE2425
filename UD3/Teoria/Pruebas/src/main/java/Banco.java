import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String idFiscal;
    private String nombre;
    private String direccion;
    private int numeroEmpleados;
    private List<Cliente> clientes;


    public Banco(String idFiscal, String nombre, String direccion, int numeroEmpleados) {
        this.idFiscal = idFiscal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void marcarMoroso(Cliente cliente) {
        cliente.setMoroso(true);
    }
}

