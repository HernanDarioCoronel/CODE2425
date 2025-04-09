import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//  corregir intereses
//  corriente 0%
//  inversion 20%
//  ahorro cuando saldo > 100k -> 10%
//         Cuando saldo <= 100k -> 5%
//         intereses anuales siempre
//  añadir excepciones y capturarlas
class BancoTest {
    Cliente cliente1;
    Cliente cliente2;
    CuentaBancaria ctaCorrienteCliente1;
    CuentaBancaria ctaAhorrosCliente1;
    CuentaBancaria ctaCorrienteCliente2;
    CuentaBancaria ctaInversionCliente2;
    Banco banco;

    /*
        @BeforeAll
        static void mensaje() {
            System.out.println("<----------- Test de Banco");
        }

        @AfterAll
        static void mensajeFinal() {
            System.out.println("<----------- Fin Test de Banco\n\n");
        }
    */
    @BeforeEach
    void inicializaciones() {
        cliente1 = new ClienteParticular(
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
        cliente2 = new ClienteParticular(
            "1",
            "Carlitos",
            "Calle Falsa 312",
            "231 123 312",
            "carlitos12213@gmail.com",
            LocalDate.now(),
            "15345878X",
            "Diaz",
            true,
            0);

        banco = new Banco("1", "Banco Santander", "Calle Muy Real 321", 150);
        ctaCorrienteCliente1 = new CuentaCorriente("1", cliente1, new Date(2025 - 1900, 3, 9), 3764.56);
        ctaCorrienteCliente2 = new CuentaCorriente("2", cliente2, new Date(2025 - 1900, 3, 9), 1260.26);
        ctaAhorrosCliente1 = new CuentaAhorro("3", cliente1, new Date(2025 - 1900, 3, 9), 654);
        ctaInversionCliente2 = new CuentaInversion("4", cliente2, new Date(2025 - 1900, 3, 9), 5456.55);

        cliente1.getCuentas().add(ctaAhorrosCliente1);
        cliente1.getCuentas().add(ctaAhorrosCliente1);

        cliente2.getCuentas().add(ctaCorrienteCliente2);
        cliente2.getCuentas().add(ctaInversionCliente2);
        //  stack overflow exception
    }

    /*
        @AfterEach
        void endMsg() {
            System.out.print("\nFin Test\n");
        }
    */
    @Test
    void testAddCliente() {
        banco.addCliente(cliente1);
        Assertions.assertThrows(NullPointerException.class, () -> banco.addCliente(null));
    }

    @Test
    void testToString() {
        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        Assertions.assertEquals("""
            Banco Santander: {
            Id Fiscal: '1'
            Direccion: 'Calle Muy Real 321'
            Numero de Empleados: 150
            Clientes: {
            	Cliente Particular: {
            		Nombre: 'Pepito'
            		Id: '1'
            		Direccion: 'Calle Falsa 123'
            		Contacto: '123 123 123'
            		Email: 'pepito123@gmail.com'
            		Fecha de Alta: '2025-04-09'
            		Moroso: 'no'
            		Antiguedad: '0'
            		Cuentas: {
            		Cuenta de Ahorro: {
            			Id='3'
            			Fecha de Creacion=Wed Apr 09 00:00:00 CEST 2025
            			Saldo=654.0
            			Tipo de Interes=0.05
            		}
            		Cuenta de Ahorro: {
            			Id='3'
            			Fecha de Creacion=Wed Apr 09 00:00:00 CEST 2025
            			Saldo=654.0
            			Tipo de Interes=0.05
            		}
            	}
            		DNI='12345678X'
            		Apellidos='Diaz'
            		Nomina Domiciliada=false
            		Cuantia de la Nomina=0.0
            	Cliente Particular: {
            		Nombre: 'Carlitos'
            		Id: '1'
            		Direccion: 'Calle Falsa 312'
            		Contacto: '231 123 312'
            		Email: 'carlitos12213@gmail.com'
            		Fecha de Alta: '2025-04-09'
            		Moroso: 'no'
            		Antiguedad: '0'
            		Cuentas: {
            		Cuenta Corriente: {
            			Id='2'
            			Fecha de Creacion=Wed Apr 09 00:00:00 CEST 2025
            			Saldo=1260.26
            			Tipo de Interes=0.0
            		}
            		Cuenta de Inversion: {
            			Id='4'
            			Fecha de Creacion=Wed Apr 09 00:00:00 CEST 2025
            			Saldo=5456.55
            			Tipo de Interes=0.2
            		}
            	}
            		DNI='15345878X'
            		Apellidos='Diaz'
            		Nomina Domiciliada=true
            		Cuantia de la Nomina=0.0
            }
            """, banco.toString());
    }
}
