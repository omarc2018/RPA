package capa.negocio;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.NotDirectoryException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import sun.swing.SwingUtilities2;




public class ProgramaION {
    static final String ASISTENTE = "Setup Assistant";
    static final String REPORTE = "Reports";
    static final String REGISTROS = "Revenue Log";
    static final String MOSTRAR = "Display";
    static final String INICIO = "Since";
    static final String PANELINICIO = "1501";
    static final String PANELFIN = "17 diciembre 2018";
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
        Thread.sleep(2500);
        
        driver.findElement(By.name("Password:")).click();       
        driver.findElement(By.name("Password:")).sendKeys("0");
       /* driver.findElement(By.name("Password:")).sendKeys(Keys.TAB);
        /* Thread.sleep(1000);
        
        driver.findElement(By.name("Exit")).sendKeys(Keys.TAB);
         Thread.sleep(500);
        driver.findElement(By.name("Help")).sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.findElement(By.name("Exit")).sendKeys(Keys.SPACE);*/
        
        driver.findElement(By.name(BTNOK)).click();
        Thread.sleep(250);
       
        driver.findElement(By.name("DESKTOP-3TGV4KL")).click();
        driver.findElement(By.name("DESKTOP-3TGV4KL")).submit();
        driver.findElement(By.name("SESOC")).click();
        driver.findElement(By.name("SESOC")).submit();
        driver.findElement(By.name("CL-1022")).click();
        driver.findElement(By.name(ASISTENTE)).click();
        driver.findElement(By.name(ASISTENTE)).submit();
        driver.findElement(By.name(REPORTE)).click();
        driver.findElement(By.name(REGISTROS)).click();
        driver.findElement(By.name(MOSTRAR)).click();
        Thread.sleep(250);
        driver.findElement(By.name(INICIO)).click();
        driver.findElement(By.id(PANELINICIO)).click();
        driver.findElement(By.id(PANELINICIO)).sendKeys(Keys.SPACE, Keys.SPACE, "01");
        /*driver.findElement(By.id(PANELINICIO)).sendKeys(Keys.LEFT);
        driver.findElement(By.id(PANELINICIO)).sendKeys("diciembre");
        driver.findElement(By.id(PANELINICIO)).sendKeys(Keys.LEFT);
        driver.findElement(By.id(PANELINICIO)).sendKeys("01");*/
        Thread.sleep(500);
        driver.findElement(By.name(PANELFIN)).click();
        driver.findElement(By.name(PANELFIN)).sendKeys(Keys.SPACE, Keys.SPACE, "16");
        /*driver.findElement(By.name(PANELFIN)).sendKeys(Keys.LEFT);
        driver.findElement(By.name(PANELFIN)).sendKeys("diciembre");
        driver.findElement(By.name(PANELFIN)).sendKeys(Keys.LEFT);
        driver.findElement(By.name(PANELFIN)).sendKeys("16");*/
        driver.findElement(By.name(BTNOK)).click();
        Thread.sleep(10000);
        driver.findElement(By.name(GUARDARCOMO)).click();
        //Thread.sleep(250);
        driver.findElement(By.name(NOMBRE)).click();
        driver.findElement(By.name(NOMBRE)).sendKeys("SESOC__L-1022__138.csv");
        driver.findElement(By.name(GUARDAR)).click();
        //Thread.sleep(250);
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