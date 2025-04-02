import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {
    Cliente cliente;

    @BeforeAll
    static void mensaje() {
        System.out.println("<----------- Test de Cliente");
    }

    @AfterAll
    static void mensajeFinal() {
        System.out.println("<----------- Fin Test de Cliente\n\n");
    }

    @BeforeEach
    void inicializaciones() {
        cliente = new ClienteParticular(
            "1",
            "Pepito",
            "Calle Falsa 123",
            "123 123 123",
            "pepito123@gmail.com",
            LocalDate.now(),
            "12345678X",
            "Diaz",
            false,
            0);
    }

    @AfterEach
    void endMsg() {
        System.out.print("\nFin Test\n");
    }

    @Test
    void testCambiarNombre() {
        cliente.cambiarNombre("Paco");
        assertEquals("Paco", cliente.getNombre());
    }

    @Test
    void testCalcularAntiguedad() {
        cliente.calcularAntiguedad();
        assertEquals(0, cliente.getAntiguedad());
    }
}

