import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
	}

}
