package commerce.test.Flipframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fliptesting {
	@Test
	public void Flip1() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		 driver.get("https://secure2.premierinn.com/gb/en/account/register.html");
		 System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		 Thread.sleep(6000);
		  
		WebElement drop = driver.findElement(By.name("titleName"));
		Select sel = new Select(drop);
		List<WebElement> li = sel.getOptions();
		System.out.println(li.size());
		for (int i = 0 ; i<=12; i++ )
		{
			//System.out.println(li.get(i).getText());
			System.out.println(li.get(2).getText());
	}

}
}