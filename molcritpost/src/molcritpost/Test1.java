package molcritpost;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	@Test(dataProvider="xxx")
	public void test(String x) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("gsfi")).sendKeys(x);
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@DataProvider(name="xxx",parallel=true)
	public Object[][] data(){
		Object[][] arr = {{"HI"},{"Hello"},{"How are you"}};
		return arr;
	}
	
	

}
