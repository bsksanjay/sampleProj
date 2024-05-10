import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver drv;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sbrahmandlapally\\Desktop\\Desktop\\Deloitte docs\\Automation\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		
		drv = new FirefoxDriver();
		drv.manage().window().maximize();
		
		WebDriver drv1;									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbrahmandlapally\\Desktop\\Desktop\\Deloitte docs\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		drv.findElement(By.xpath("//input[@type='search']")).sendKeys("Tom");
		Thread.sleep(2000);
		String count = "3";
		String s1 = drv.findElement(By.xpath("//input[@type='number']")).getText();
		String s2 = drv.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
		
		System.out.println("attribut value "+s1);
		
		int icount = Integer.parseInt(count);
		int is1 = Integer.parseInt(s1);
		 for (int j=is1;j<icount;j++) {
			 drv.findElement(By.xpath("//a[@class='increment']")).click();
		 }
		 System.out.println("final value "+ drv.findElement(By.xpath("//input[@type='number']")).getAttribute("value"));
		 
		
		
		
	}

}
