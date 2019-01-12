
package datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ArchivoPropiedadesION {
    String barra = File.separator;
    String directorio = System.getProperty("user.dir")+barra+"src"+barra+"capa"+barra+"datos"+barra+"propiedades"+barra;
    
    public void crearArchivo(){
        Properties propiedades = new Properties();
        OutputStream salida = null;
        try {
            salida = new FileOutputStream(directorio+"constantesION.properties");
            propiedades.store(salida, null);
        } catch (IOException io) {
            io.printStackTrace();
        }
        finally{
            if (salida != null) {
                try {
                    salida.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void leerArchivo() throws IOException{
        Properties oPropiedades = new Properties();
        InputStream isArchivo;
        try {
            isArchivo = new FileInputStream(directorio+"constantesION.properties");
            oPropiedades.load(isArchivo);
        } catch (IOException e) {
            System.out.print(e.toString());
        }
        
        System.out.println("Propiedades");
        
        
    }
}
