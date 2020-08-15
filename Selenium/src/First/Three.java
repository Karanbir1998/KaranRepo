package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Three {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
//	driver.manage().window().maximize();
	WebElement createbutton=driver.findElementById("u_0_2");
	createbutton.click();
	Thread.sleep(3000);
	WebElement drop=driver.findElement(By.id("day"));
	Select s=new Select(drop);
	s.selectByVisibleText("21");
	WebElement month=driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByIndex(5);
	WebElement year=driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByValue("2017");
}
}
