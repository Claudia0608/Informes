package ies.tierno.informe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class CreadorInforme implements Markdown {

    @Override
    public void generarInforme(Map<String, String> resultados) {
        String nombreArchivo = "informe.md";

        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(nombreArchivo))) {
            escribir.write("# Informe de Comandos\n\n");

            for (Map.Entry<String, String> entry : resultados.entrySet()) {
                escribir.write("## Comando: " + entry.getKey() + "\n");
                escribir.write("\n");
                escribir.write(entry.getValue());
                escribir.write("\n");
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
