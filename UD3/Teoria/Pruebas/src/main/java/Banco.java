import java.util.ArrayList;
import java.util.List;

public class Banco {
    //se cambió todos a private y se implementaron getters y setters
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
        if (cliente != null) {
            clientes.add(cliente);
        } else {
            throw new NullPointerException("Cliente no puede ser nulo");
        }
    }

    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void marcarMoroso(Cliente cliente) {
        cliente.setMoroso(true);
    }

    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
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

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();

        datos.append(nombre).append(": {\n");
        datos.append("Id Fiscal: '").append(idFiscal).append("'\n");
        datos.append("Direccion: '").append(direccion).append("'\n");
        datos.append("Numero de Empleados: ").append(numeroEmpleados).append('\n');
        datos.append("Clientes: {");
        for (Cliente cli : clientes) {
            datos.append(cli.toString());
        }
        datos.append("}");


        return datos.toString();
    }
}

