import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon2 {

	public static void main(String[] args) {
		
		WebDriver drv;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sbrahmandlapally\\Desktop\\Desktop\\Deloitte docs\\chromedriver_win32\\chromedriver.exe");
		
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://amazon.com/");

		List<WebElement> lst  = drv.findElements(By.tagName("a"));
		System.out.println(lst.size());
		
		for (WebElement e: lst) {
			System.out.println(e.getText());
			System.out.println("122");

			
		}
		

	}

}
