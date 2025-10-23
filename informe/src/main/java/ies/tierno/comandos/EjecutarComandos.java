package ies.tierno.comandos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjecutarComandos {
    public static String ejecutorComandos(String comando) throws IOException, InterruptedException { 
        StringBuilder salida = new StringBuilder();
            Process proceso = Runtime.getRuntime().exec(comando);
           BufferedReader leer = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = leer.readLine()) != null) {
                salida.append(linea).append("\n");
            }
         
            proceso.waitFor();
            return salida.toString();
    }
}
