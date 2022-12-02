package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000/");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/img"))
        .click();
		
		driver.findElement(By.id("postTitle")).sendKeys("New Post");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/form/select")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/form/select/option[2]")).click();
		driver.findElement(By.id("postBody")).sendKeys("This is a post body");
		driver.findElement(By.id("postImage")).sendKeys("https://www.infoescola.com/wp-content/uploads/2010/04/banana_600797891.jpg");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/form/button")).click();
	}
	
}
