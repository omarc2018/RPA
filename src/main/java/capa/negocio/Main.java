package capa.negocio;

import static capa.negocio.ProgramaION.EjecutarION;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        final double MS_POR_SEGUNDO = 1000;
        //final double  NS_POR_SEGUNDO = 1000000000;

        long INICIO_MS = System.currentTimeMillis();
        EjecutarION();
        long DURACION_MS = System.currentTimeMillis() - INICIO_MS;

        //long INICIO_NS = System.currentTimeMillis();
        //EjecutarION();
        //long DURACION_NS = System.currentTimeMillis() - INICIO_NS;
        double DURACION_S1 = DURACION_MS / MS_POR_SEGUNDO;
        //double DURACION_S2 = DURACION_NS/NS_POR_SEGUNDO;

        File archivo = new File("src\\test\\java\\MedidaEficiencia\\Eficiencia.txt");
        FileWriter escribir;
        PrintWriter imprimir;

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                imprimir = new PrintWriter(escribir);

                imprimir.println("RPA Ejecutado en: " + DURACION_MS + " Milisegundos");
                imprimir.println("Lo que representa: " + DURACION_S1 + " Segundos");
                imprimir.close();

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                escribir = new FileWriter(archivo, true);
                imprimir = new PrintWriter(escribir);

                imprimir.println("RPA Ejecutado en: " + DURACION_MS + " Milisegundos");
                imprimir.println("Lo que representa: " + DURACION_S1 + " Segundos");
                imprimir.close();

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
