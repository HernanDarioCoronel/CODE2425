import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void testCambiarNombre(){
        Cliente clientito = new Cliente();
        clientito.cambiarNombre("Paco");
        assertEquals("raul", clientito.nombre);
    }
}
