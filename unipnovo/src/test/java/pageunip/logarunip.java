package pageunip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logarunip {
	
	static WebDriver driver;
 
     
	public logarunip(WebDriver driver) {
      logarunip.driver= driver;
      
	}
	
public void preenchercampos() {
  WebElement RA =	driver.findElement(By.id("matricula1"));
	RA.sendKeys("ra");
	
	WebElement senha = driver.findElement(By.id("senha1"));
	senha.sendKeys("senha");
	
	
	
	
}

	

}
