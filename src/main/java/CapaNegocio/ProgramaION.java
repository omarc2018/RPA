
package CapaNegocio;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;




public class ProgramaION {
    static final String asistente = "Setup Assitant", reporte = "Reports", registros = "Revenue Log", mostrar = "Display", fechaInicio = "Since",
                fechaFin = "Until", btnOk = "OK", btnGuardarComo = "Save As...", txtNombre = "Nombre:", btnGuardar = "Guardar",
                btnClose = "Close", btnExit = "Exit", btnFile = "File";
    public static void main(String[] args) throws MalformedURLException, InterruptedException{
        
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files (x86)\\Schneider Electric\\ION Setup\\ionsetup.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(3000);
        
               
        driver.findElement(By.name("Password:")).sendKeys("0");
        driver.findElement(By.name(btnOk)).click();
        Thread.sleep(2500);
       
        driver.findElement(By.name("DESKTOP-3TGV4KL")).click();
        driver.findElement(By.name("DESKTOP-3TGV4KL")).submit();
        driver.findElement(By.name("SESOC")).click();
        driver.findElement(By.name("SESOC")).submit();
        driver.findElement(By.name("CL-1022")).click();
        Thread.sleep(500);
        driver.findElement(By.name(asistente)).click();
        driver.findElement(By.name(asistente)).submit();
        Thread.sleep(500);
        driver.findElement(By.name(reporte)).click();
        Thread.sleep(250);
        driver.findElement(By.name(registros)).click();
        Thread.sleep(1000);
        driver.findElement(By.name(mostrar)).click();
        Thread.sleep(1000);
        driver.findElement(By.name(fechaInicio)).click();
        Thread.sleep(1000);
        driver.findElement(By.name(btnOk)).click();
        Thread.sleep(10000);
        driver.findElement(By.name(btnGuardarComo)).click();
        Thread.sleep(10000);
        driver.findElement(By.name(txtNombre)).click();
        driver.findElement(By.name(txtNombre)).sendKeys("SESOC__L-1022__138.csv");
        driver.findElement(By.name(btnGuardar)).click();
        Thread.sleep(250);
        driver.findElement(By.name(btnClose)).click();
        driver.findElement(By.name(btnExit)).click();
        driver.findElement(By.name(btnFile)).click();
        driver.findElement(By.name(btnExit)).click();
        driver.findElement(By.name(btnOk)).click();

    }

    
}