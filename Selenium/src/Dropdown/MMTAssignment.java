package Dropdown;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MMTAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the from City option");
		String fromCity=sc.next();
		Actions ac=new Actions(driver);
		WebElement From=driver.findElement(By.cssSelector("input[id='fromCity']"));
		From.click();	
		WebElement fromtextbox=driver.findElement(By.cssSelector("input[placeholder='From']"));
		fromtextbox.click();
		ac.sendKeys(fromCity).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		System.out.println("Enter the To City option");
		String toCity=sc.next();
		WebElement Totextbox=driver.findElement(By.cssSelector("input[placeholder='To']"));
		Totextbox.click();
		ac.sendKeys(toCity).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();	
		sc.close();
	}
	
}
