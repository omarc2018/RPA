package capa.negocio;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.NotDirectoryException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;





public class ProgramaION {
    /*static final String ASISTENTE = "Setup Assistant";
    static final String REPORTE = "Reports";
    static final String REGISTROS = "Revenue Log";
    static final String MOSTRAR = "Display";
    static final String ULTIMO = "Last";
    static final String NDIAS = "48";
    static final String OPCIONES = "Botón desplegable";
    static final String DIAS = "days";
    static final String BTNOK = "OK";
    static final String GUARDARCOMO = "Save As...";
    static final String NOMBRE = "Nombre:";
    static final String GUARDAR = "Guardar";
    static final String CERRAR = "Close";
    static final String SALIR = "Exit";
    static final String ARCHIVO = "File";*/
    //String barra = File.separator;
    //String directorio = System.getProperty("user.dir")+barra+"src"+barra+"capa"+barra+"datos"+barra+"propiedades"+barra;
    
    public void ejecutarION() throws IOException{
        
        Properties constantes = new Properties();
        constantes.load(new FileReader("D:\\Documents\\NetBeansProjects\\RPALecturaMedidores\\src\\main\\java\\capa\\datos\\propiedades\\constantesION.properties"));
        Properties variables = new Properties();
        variables.load(new FileReader("D:\\Documents\\NetBeansProjects\\RPALecturaMedidores\\src\\main\\java\\capa\\datos\\propiedades\\variablesION.properties"));
        
        Fecha dias = new Fecha();
        String cantidad = Integer.toString(dias.numeroDias()) ;
        System.out.println("el número de días es: "+ cantidad);
/*
        if(Red.pingLocal()== true){
        Red.pingLocal();
        Thread.sleep(50);
        
        DesktopOptions ionsetup = new DesktopOptions();
        ionsetup.setApplicationPath("C:\\Program Files (x86)\\Schneider Electric\\ION Setup\\ionsetup.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), ionsetup);
        Thread.sleep(1000);
        
        driver.findElement(By.name(constantes.getProperty("PASSWORD"))).click();       
        driver.findElement(By.name(constantes.getProperty("PASSWORD"))).sendKeys("0");
        driver.findElement(By.name(constantes.getProperty("BTNOK"))).click();
        driver.findElement(By.name(variables.getProperty("ORDENADOR"))).click();
        driver.findElement(By.name(variables.getProperty("ORDENADOR"))).submit();
        driver.findElement(By.name(variables.getProperty("SUBESTACION"))).click();
        driver.findElement(By.name(variables.getProperty("SUBESTACION"))).submit();
        //generar ciclo
        driver.findElement(By.name(variables.getProperty("CELDA"))).click();
        driver.findElement(By.name(constantes.getProperty("ASISTENTE"))).click();
        driver.findElement(By.name(constantes.getProperty("ASISTENTE"))).submit();
        driver.findElement(By.name(constantes.getProperty("REPORTE"))).click();
        driver.findElement(By.name(constantes.getProperty("REGISTROS"))).click();
        driver.findElement(By.name(constantes.getProperty("MOSTRAR"))).click();
        driver.findElement(By.name(constantes.getProperty("ULTIMO"))).click();
        driver.findElement(By.name(constantes.getProperty("NDIAS"))).sendKeys(cantidad);
        driver.findElement(By.name(constantes.getProperty("OPCIONES"))).click();
        driver.findElement(By.name(constantes.getProperty("DIAS"))).click();
        driver.findElement(By.name(constantes.getProperty("BTNOK"))).click();
        Thread.sleep(40000);
        driver.findElement(By.name(constantes.getProperty("GUARDARCOMO"))).click();
        driver.findElement(By.name(constantes.getProperty("NOMBRE"))).click();
        driver.findElement(By.name(constantes.getProperty("NOMBRE"))).sendKeys(variables.getProperty("NOMBREARCHIVO"));
        driver.findElement(By.name(constantes.getProperty("GUARDAR"))).click();
        driver.findElement(By.name(constantes.getProperty("CERRAR"))).click();
        driver.findElement(By.name(constantes.getProperty("SALIR"))).click();
        driver.findElement(By.name(constantes.getProperty("ARCHIVO"))).click();
        //retornar ciclo
        driver.findElement(By.name(constantes.getProperty("SALIR"))).click();
        driver.findElement(By.name(constantes.getProperty("BTNOK"))).click();      
        }else{
            System.exit(0);
        }
        */
    }

    
}