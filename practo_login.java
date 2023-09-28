package abitha;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class practo_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jceve\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.practo.com/login?next=%2Fcheckid_request&intent=fabric");
		driver.findElement(By.name("username")).sendKeys("abi#34");
		driver.findElement(By.id("username")).sendKeys("4321");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.close();

	}

}
