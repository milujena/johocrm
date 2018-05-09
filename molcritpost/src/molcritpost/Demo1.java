package molcritpost;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[.='Log In']")).click();
		Set<String> set=driver.getWindowHandles();
		System.out.println(set.size());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9438502338");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("9438502338");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		/*WebDriver driver;
		public static String excelReader(int row,int colomn) throws IOException
		{
			FileInputStream fis=new FileInputStream(new File("./data/flipkart.xlsx"));
		Workbook wb=new Wor
			Sheet st=wb.getSheetAt(0);
			return st.getRow(row).getCell(colomn).getStringCellValue();
		}
		@DataProvider(name="data",parallel=false)
		public Object [][] data() throws IOException{
		String [][]arr=new String[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=Demo.excelReader(i, j);
			}
		}
		return arr;
		}
		@Test(dataProvider="data")
		public void testFeature(String x, String y) 
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//a[.='Log In']")).click();
			driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(x);
			driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(y);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
			Assert.assertEquals(driver.getTitle(), "Shopping Cart | Flipkart.com","Title is not maching");
			driver.quit();*/
			
			
		
	}

}
