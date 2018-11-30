
package CapaNegocio;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;



public class ProgramaNexus {
    public static void main(String[] args) throws MalformedURLException, InterruptedException{
        
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files (x86)\\Schneider Electric\\ION Setup\\ionsetup.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(3000);
        
               
        driver.findElement(By.name("Password:")).sendKeys("0");
        driver.findElement(By.name("OK")).click();
        Thread.sleep(2500);
       
        driver.findElement(By.name("DESKTOP-3TGV4KL")).click();
        driver.findElement(By.name("DESKTOP-3TGV4KL")).submit();
        driver.findElement(By.name("SESOC")).click();
        driver.findElement(By.name("SESOC")).submit();
        driver.findElement(By.name("CL-1022")).click();
        Thread.sleep(500);
        driver.findElement(By.name("Setup Assistant")).click();
        driver.findElement(By.name("Setup Assistant")).submit();
        Thread.sleep(500);
        driver.findElement(By.name("Reports")).click();
        Thread.sleep(250);
        driver.findElement(By.name("Revenue Log")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Display")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Since")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("OK")).click();
        Thread.sleep(10000);
        driver.findElement(By.name("Save As...")).click();
        Thread.sleep(10000);
        driver.findElement(By.name("Nombre:")).click();
        driver.findElement(By.name("Nombre:")).sendKeys("SESOC__L-1022__138.csv");
        driver.findElement(By.name("Guardar")).click();
        Thread.sleep(250);
        driver.findElement(By.name("Close")).click();
        driver.findElement(By.name("Exit")).click();
        driver.findElement(By.name("File")).click();
        driver.findElement(By.name("Exit")).click();
        driver.findElement(By.name("OK")).click();

    }

    
}