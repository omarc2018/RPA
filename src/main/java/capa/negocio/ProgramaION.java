package capa.negocio;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.NotDirectoryException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;




public class ProgramaION {
    static final String ASISTENTE = "Setup Assistant";
    static final String REPORTE = "Reports";
    static final String REGISTROS = "Revenue Log";
    static final String MOSTRAR = "Display";
    static final String FECHAINICIO = "Since";
    static final String FECHAFIN = "Until";
    static final String BTNOK = "OK";
    static final String GUARDARCOMO = "Save As...";
    static final String NOMBRE = "Nombre:";
    static final String GUARDAR = "Guardar";
    static final String CERRAR = "Close";
    static final String SALIR = "Exit";
    static final String ARCHIVO = "File";
    
        
    public static void main(String[] args) throws MalformedURLException, InterruptedException{
        
        if(Red.pingLocal()== true){
        Red.pingLocal();
        Thread.sleep(50);
        
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files (x86)\\Schneider Electric\\ION Setup\\ionsetup.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(3000);
        
        driver.findElement(By.name("Password:")).click();       
        driver.findElement(By.name("Password:")).sendKeys("0");
       /* driver.findElement(By.name("Password:")).sendKeys(Keys.TAB);
        /* Thread.sleep(1000);
        driver.findElement(By.name("OK")).sendKeys(Keys.TAB);
         Thread.sleep(1000);
        driver.findElement(By.name("Exit")).sendKeys(Keys.TAB);
         Thread.sleep(500);
        driver.findElement(By.name("Help")).sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.findElement(By.name("Exit")).click();
         Thread.sleep(500);*
        */
        driver.findElement(By.name(BTNOK)).click();
        Thread.sleep(1000);
       
        driver.findElement(By.name("DESKTOP-3TGV4KL")).click();
        driver.findElement(By.name("DESKTOP-3TGV4KL")).submit();
        driver.findElement(By.name("SESOC")).click();
        driver.findElement(By.name("SESOC")).submit();
        driver.findElement(By.name("CL-1022")).click();
        Thread.sleep(500);
        driver.findElement(By.name(ASISTENTE)).click();
        Thread.sleep(500);
        driver.findElement(By.name(ASISTENTE)).submit();
        Thread.sleep(500);
        driver.findElement(By.name(REPORTE)).click();
        Thread.sleep(250);
        driver.findElement(By.name(REGISTROS)).click();
        Thread.sleep(1000);
        driver.findElement(By.name(MOSTRAR)).click();
        Thread.sleep(1000);
        driver.findElement(By.name(FECHAINICIO)).click();
        Thread.sleep(1000);
        driver.findElement(By.name(BTNOK)).click();
        Thread.sleep(10000);
        driver.findElement(By.name(GUARDARCOMO)).click();
        Thread.sleep(10000);
        driver.findElement(By.name(NOMBRE)).click();
        driver.findElement(By.name(NOMBRE)).sendKeys("SESOC__L-1022__138.csv");
        driver.findElement(By.name(GUARDAR)).click();
        Thread.sleep(250);
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