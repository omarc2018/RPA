package capa.negocio;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;





public class ProgramaION {
    static final String ASISTENTE = "Setup Assistant";
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
    static final String ARCHIVO = "File";
    
        
    static void EjecutarION() throws MalformedURLException, InterruptedException{
        
        Fecha mes = new Fecha();
        int dias = mes.fechaAtcual();
        String cantidad = Integer.toString(dias) ;
        if(Red.pingLocal()== true){
        Red.pingLocal();
        Thread.sleep(50);
        
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files (x86)\\Schneider Electric\\ION Setup\\ionsetup.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(1000);
        
        driver.findElement(By.name("Password:")).click();       
        driver.findElement(By.name("Password:")).sendKeys("0");
        driver.findElement(By.name(BTNOK)).click();
        driver.findElement(By.name("DESKTOP-3TGV4KL")).click();
        driver.findElement(By.name("DESKTOP-3TGV4KL")).submit();
        driver.findElement(By.name("SESOC")).click();
        driver.findElement(By.name("SESOC")).submit();
        //generar ciclo
        driver.findElement(By.name("CL-1024")).click();
        driver.findElement(By.name(ASISTENTE)).click();
        driver.findElement(By.name(ASISTENTE)).submit();
        driver.findElement(By.name(REPORTE)).click();
        driver.findElement(By.name(REGISTROS)).click();
        driver.findElement(By.name(MOSTRAR)).click();
        driver.findElement(By.name(ULTIMO)).click();
        driver.findElement(By.name(NDIAS)).sendKeys(cantidad);
        driver.findElement(By.name(OPCIONES)).click();
        driver.findElement(By.name(DIAS)).click();
        driver.findElement(By.name(BTNOK)).click();
        Thread.sleep(40000);
        driver.findElement(By.name(GUARDARCOMO)).click();
        driver.findElement(By.name(NOMBRE)).click();
        driver.findElement(By.name(NOMBRE)).sendKeys("SESOC__L-1024__138.csv");
        driver.findElement(By.name(GUARDAR)).click();
        driver.findElement(By.name(CERRAR)).click();
        driver.findElement(By.name(SALIR)).click();
        driver.findElement(By.name(ARCHIVO)).click();
        driver.findElement(By.name(SALIR)).click();
        driver.findElement(By.name(BTNOK)).click();      
        }else{
            System.exit(0);
        }
        
    }

    
}