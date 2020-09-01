package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment1_22August {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Actions ac=new Actions(driver);
	WebElement Fromcity=driver.findElement(By.id("fromCity"));
	ac.click(Fromcity);
	Fromcity.sendKeys("Ludhiana");
	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	ac.sendKeys(Keys.ARROW_DOWN).build().perform();
	ac.sendKeys(Keys.ENTER).build().perform();
	WebElement Tocity=driver.findElement(By.id("toCity"));
	ac.click(Tocity);	
	Tocity.sendKeys("Chandigarh");
	ac.sendKeys(Keys.ARROW_DOWN).build().perform();
	ac.sendKeys(Keys.ENTER).build().perform();
}
}