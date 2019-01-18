package newpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newtestng {
	public String baseUrl = "http://demosite.center/wordpress/wp-login.php";
    String driverPath = "C:\\Users\\suhan.manna\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  System.out.println(driver.getTitle());
	  driver.close();
  }
  
}
