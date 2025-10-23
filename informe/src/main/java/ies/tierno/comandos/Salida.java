package ies.tierno.comandos;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Salida {
    public Map<String, String> registrarComandos(String[] comandos) throws IOException, InterruptedException {

        Map<String, String> resultados = new LinkedHashMap<>();
        for (String comando : comandos) {
            String salida = EjecutarComandos.ejecutorComandos(comando);
            resultados.put(comando, salida);
        }
        return resultados;
    }
}
