import org.junit.jupiter.api.*;

import java.rmi.NotBoundException;
import java.time.LocalDate;

//  corregir intereses
//  corriente 0%
//  inversion 20%
//  ahorro cuando saldo > 100k -> 10%
//         Cuando saldo <= 100k -> 5%
//         intereses anuales siempre
//  añadir excepciones y capturarlas
class BancoTest {
    Cliente cliente;
    Banco banco;

    @BeforeAll
    static void mensaje() {
        System.out.println("<----------- Test de Banco");
    }

    @AfterAll
    static void mensajeFinal() {
        System.out.println("<----------- Fin Test de Banco\n\n");
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

        banco = new Banco("1", "Banco Santander", "Calle Muy Real 321", 150);
    }

    @AfterEach
    void endMsg() {
        System.out.print("\nFin Test\n");
    }

    @Test
    void testAddCliente() {

    }
}
