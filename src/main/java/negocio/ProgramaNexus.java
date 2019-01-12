
package negocio;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;



public class ProgramaNexus {
    static void ejecutarNexus() throws MalformedURLException, InterruptedException{
        
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files (x86)\\ElectroIndustries\\Communicator_Ext\\CommExt.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(3000);
        
               
        driver.findElement(By.name("Conexión")).click();
        Thread.sleep(2500);
       
        driver.findElement(By.name("Conexión Rápida")).click();
        driver.findElement(By.name("Network")).click();
        driver.findElement(By.name("Network")).sendKeys(Keys.TAB);
        driver.findElement(By.name("172.16.1.6")).submit();
        driver.findElement(By.name("Conectar")).click();
        driver.findElement(By.name("OK")).click();
        driver.findElement(By.name("Logs")).click();
        driver.findElement(By.name("Adquirir Log(s) del Disp.")).click();
        Thread.sleep(500);
        driver.findElement(By.name("Iniciar")).click();
        Thread.sleep(500);
        driver.findElement(By.name("Select.Datos")).click();
        driver.findElement(By.name("Medidor1")).click();
        driver.findElement(By.name("LOGS")).click();
        driver.findElement(By.name("LOGS")).submit();
        Thread.sleep(500);
        driver.findElement(By.name("INTERVAL_1")).click();
        driver.findElement(By.name("INTERVAL_1")).submit();
        Thread.sleep(1000);
        driver.findElement(By.name("INTERVAL_1.DB")).click();
        driver.findElement(By.name("INTERVAL_1.DB")).submit();
        Thread.sleep(10000);
        driver.findElement(By.name("Select.Datos")).click();
        driver.findElement(By.name("Rango Tiempo")).click();
        driver.findElement(By.name("30/08/2018")).click();
        driver.findElement(By.name("OK")).click();
        Thread.sleep(10000);
        driver.findElement(By.name("Select.Datos")).click();
        driver.findElement(By.name("Puntos Datos")).click();
        driver.findElement(By.name("OK")).click();
        Thread.sleep(20000);
        driver.findElement(By.name("pane")).click();
        driver.findElement(By.name("Copy to Clipboard with header")).click();
        driver.findElement(By.name("File")).click();
        driver.findElement(By.name("Exit")).click();
        driver.findElement(By.name("OK")).click();

    }

    
}