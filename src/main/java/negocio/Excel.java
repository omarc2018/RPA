
package negocio;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Excel{
    public static void ejecutarExcel() throws MalformedURLException, InterruptedException{    
    DesktopOptions option = new DesktopOptions();
    option.setApplicationPath("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Excel.exe");
    WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
    Thread.sleep(3000);
        
               
    driver.findElement(By.name("Abrir")).click();
    Thread.sleep(2500);
      
    driver.findElement(By.name("Pegar")).click();
    driver.findElement(By.name("Network")).click();
    driver.findElement(By.name("Network")).sendKeys(Keys.TAB);
    driver.findElement(By.name("Pasword")).sendKeys(Keys.TAB);
    
    }        

}