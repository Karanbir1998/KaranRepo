package Dropdown;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class YoutubeAssignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");//FindElements Assignment 2
	driver.manage().window().maximize();
	Thread.sleep(2000);
	List<WebElement> ListVideos=driver.findElements(By.id("video-title"));
	System.out.print("Number of Videos: "+ListVideos.size());
	System.out.println();
	System.out.print("Enter video number you want to watch in between 1 and "+ListVideos.size()+"  :");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>0 && a<=ListVideos.size()) {
	ListVideos.get(a-1).click();
	System.out.println("Congrats Video play successfully!!");	
	}
	else {
		System.out.println("Please re-run the program and enter valid number");
	}	
	sc.close();
	}
	}
