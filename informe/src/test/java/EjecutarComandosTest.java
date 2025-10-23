
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ies.tierno.comandos.EjecutarComandos;

class EjecutarComandosTest {

    @Test
    void testEjecutarComandoEcho() throws IOException, InterruptedException {
        String salida = EjecutarComandos.ejecutorComandos("echo hola");

        assertNotNull(salida);
        assertTrue(salida.contains("hola"));
    }
}
