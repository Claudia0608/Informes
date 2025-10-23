package ies.tierno;

import java.io.IOException;
import java.util.Map;

import ies.tierno.comandos.Salida;
import ies.tierno.informe.CreadorInforme;
import ies.tierno.informe.Markdown;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Salida registrar = new Salida();
        String[] comandos = {"ps", "df -h", "free -h"};

        Map<String, String> resultados = registrar.registrarComandos(comandos);

        Markdown informe = new CreadorInforme();
        informe.generarInforme(resultados);
    }
}
