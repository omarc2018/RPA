/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.negocio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar Castillo
 */
public class MedidaEficiencia {
    //String barra = File.separator;
    //String directorio = System.getProperty("user.dir")+barra+"src"+barra+"test"+barra+"java"+barra+"MedidaEficiencia"+barra;
    
    public void eficiencia() throws IOException, InterruptedException{
        final float MS_POR_SEGUNDO = 1000;
        long INICIO_MS = System.currentTimeMillis();
        ProgramaION ejecutar = new ProgramaION();
        ejecutar.ejecutarION();
        long DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        float DURACION_S = DURACION_MS/MS_POR_SEGUNDO;
        Date fecha = new Date();
        DateFormat formatoHoraFecha = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String historial = formatoHoraFecha.format(fecha);
        File archivo = new File("D:\\Documents\\NetBeansProjects\\RPALecturaMedidores\\src\\test\\java\\MedidaEficiencia\\eficiencia.txt");
        FileWriter escribir;
        PrintWriter imprimir;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                imprimir = new PrintWriter(escribir);
                imprimir.println(historial);
                imprimir.println("RPA Ejecutado en: " + DURACION_MS + " Milisegundos");
                imprimir.println("Lo que representa: " + DURACION_S + " Segundos");
                imprimir.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                escribir = new FileWriter(archivo, true);
                imprimir = new PrintWriter(escribir);
                imprimir.println(historial);
                imprimir.println("RPA Ejecutado en: " + DURACION_MS + " Milisegundos");
                imprimir.println("Lo que representa: " + DURACION_S + " Segundos");
                imprimir.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
