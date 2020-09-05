package Dropdown;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MultipleTabWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");//Assignment 3 Multiple Tab/Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Video=driver.findElement(By.id("video-title"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(Video).keyUp(Keys.CONTROL).build().perform();
		String CurrentWIndow=driver.getWindowHandle();
		Set<String> AllVideos=driver.getWindowHandles();
		System.out.println("Total Tabs: "+AllVideos.size());
		for(String s: AllVideos)
		{
		driver.switchTo().window(s);
		}
		System.out.print("Current window Url is: "+driver.getCurrentUrl());
	}
	}
