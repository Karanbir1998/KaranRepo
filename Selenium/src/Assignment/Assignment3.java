package Assignment;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment3 {
		
		public void DropdownbyIndex(int index,WebElement day) {
			Select s=new Select(day);
			s.selectByIndex(index);
		}
	public static void main(String[] args) throws InterruptedException {
		    Scanner sc=new Scanner(System.in);
		    Assignment2 obj=new Assignment2();
		    
			System.setProperty("webdriver.chrome.driver", "../Selenium/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement Createbutton=driver.findElement(By.id("u_0_2"));
			Createbutton.click();
			Thread.sleep(3000);
			WebElement firstname=driver.findElement(By.name("firstname"));    
			System.out.print("Enter the first name: ");
			String name=sc.nextLine();
			firstname.sendKeys(name);
			System.out.println();
			
			WebElement lastname=driver.findElement(By.cssSelector("input#u_1_d"));   
			System.out.print("Enter the Surname: ");
			String last=sc.nextLine();
			lastname.sendKeys(last);
			System.out.println();
			
			WebElement email=driver.findElement(By.cssSelector("input[id='u_1_g']"));
			System.out.print("Enter a email: ");
			String mail=sc.nextLine();
			email.sendKeys(mail);
			System.out.println();
			
			WebElement reenter=driver.findElement(By.cssSelector("input[id='u_1_j']"));
			System.out.print("Re-enter email: ");
			String email2=sc.nextLine();
			reenter.sendKeys(email2);
			System.out.println();

			WebElement newpass=driver.findElement(By.id("password_step_input"));
			System.out.print("Enter new password: ");
			String pass=sc.nextLine();
			newpass.sendKeys(pass);
			System.out.println();
			
			WebElement day=driver.findElement(By.id("day"));
			System.out.print("Enter DOB date: ");
			int date=sc.nextInt();
			obj.DropdownbyIndex(date, day);
		    System.out.println();
			
			WebElement month=driver.findElement(By.id("month"));
			System.out.print("Enter DOB-month in numeric format: ");
			int date2=sc.nextInt();
			Select s=new Select(month);
			s.selectByIndex(date2);
			System.out.println();
			
			WebElement year=driver.findElement(By.id("year"));
			year.click();

			System.out.print("Enter DOB : ");
			String date3=sc.next();
			Select s2=new Select(year);
			s2.selectByVisibleText(date3);
			System.out.println();
			
			System.out.print("Select gender Male/Female   Enter 1 for Male and 2 for Female: ");
			int sex=sc.nextInt();
			if(sex==1) {
				WebElement male=driver.findElement(By.id("u_1_5"));
				male.click();
			}
			else {
				WebElement female=driver.findElement(By.id("u_1_4"));
				female.click();
			}
			WebElement signupbutton=driver.findElement(By.name("websubmit"));
			signupbutton.click();
			
			System.out.println();
			System.out.println("Congratulations your program run successfully!!");
	sc.close();	
	}
}

