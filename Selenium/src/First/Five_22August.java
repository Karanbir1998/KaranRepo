package First;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Five_22August {
public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter 1 for FB and 2 For Youtube");
		int i=sc.nextInt();
		if(i==1) {driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		for(int a=0;a<3;a++) {
		ac.sendKeys(Keys.TAB);
		}
		}
		else {
		Actions ac=new Actions(driver);
		driver.manage().window().maximize();
		WebElement video=driver.findElement(By.id("video-title"));
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();

		}
    sc.close();
}
}
