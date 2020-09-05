package Dropdown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAllVideos {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");// Play all Youtube Videos
	driver.manage().window().maximize();
	List<WebElement> ListVideos=driver.findElements(By.id("video-title"));
	System.out.println("Number of Videos: "+ListVideos.size());
	System.out.println("Each video Play only for 22 Seconds");
	System.out.println();
	for(int i=0;i<ListVideos.size();i++) {
		System.out.print("Serial number of Video which is currently playing: "+(i+1));
		ListVideos.get(i).click();
		Thread.sleep(25000);
		driver.navigate().back();
		System.out.println();
		}	
	}
}
