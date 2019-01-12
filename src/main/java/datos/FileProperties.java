/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Omar Castillo
 */
public class FileProperties {
    public void LeerArchivo() throws IOException{
        Properties oPropiedades = new Properties();
        
        InputStream isArchivo;
        
        try {
            isArchivo = new FileInputStream("D:\\Documents\\NetBeansProjects\\ManagerRPA\\src\\Capa\\Datos\\Configuracion.properties");
            oPropiedades.load(isArchivo);
        } catch (IOException e) {
            System.out.print(e.toString());
        }
        
        System.out.println("Propiedades");
    }
}

