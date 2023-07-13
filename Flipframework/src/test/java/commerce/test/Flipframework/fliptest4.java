package commerce.test.Flipframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fliptest4 {
	@Test
	public void flipz4() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("Jam1212");
		driver.findElement(By.name("submit")).click();
		//input[@type='submit']
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		System.out.println(alrt.getText());
		Thread.sleep(4000);
		
		alrt.accept();
		driver.findElement(By.name("cusid")).sendKeys("Jam1212");
		driver.findElement(By.name("submit")).click();
		
		System.out.println(alrt.getText());
		alrt.dismiss();
        driver.findElement(By.name("res")).click();
        System.out.println(driver.getTitle());
		
	}

}
