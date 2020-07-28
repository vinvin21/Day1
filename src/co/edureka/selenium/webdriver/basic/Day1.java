package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

WebDriver driver;
public void invokebrowser() {
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chrome\\77\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		searchCourse();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
	public void  searchCourse(){
	driver.findElement(By.id("search-inp")).sendKeys("java");
	driver.findElement(By.id("search-button-top")).click();
	
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day1 myobj = new Day1();
myobj.invokebrowser();

	}

}
