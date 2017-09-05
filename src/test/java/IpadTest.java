

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class IpadTest {
	WebDriver driver;
	
	@Given("^Firefox is open$")
	public void firefox_is_open() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "~/Downloads/geckodriver");
		

		 driver= new FirefoxDriver();
		 driver.manage().window().maximize();
			}

	@When("^I navigate to amazon$")
	public void i_navigate_to_amazon() throws Exception {
		
		
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://amazon.com");
		WebElement x = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(x);
		x.sendKeys("Ipad Case 9.7");
		WebElement y= driver.findElement(By.id("nav-search-submit-text"));
		y.click();
		List <WebElement> prices = driver.findElements(By.xpath("//*[@class='sx-price-whole']"));
		//List <WebElement> links = driver.findElements(By.xpath("//*[@class='a-size-base s-inline  s-access-title  a-text-normal']"));
	System.out.println(prices.size());
	//System.out.println("This will get the prices");
	List<Integer> ls= new ArrayList<Integer>();
		for(int i=0;i<prices.size();i++) 
		{
			
			String j= prices.get(i).getText();
			
			//System.out.println(j);
			if  (j.equals("12"))
			{
			System.out.println("The value of 12 is present at the below positions");
			System.out.println(i);
			ls.add(i);
							
		}
			
			
		}
		Random r = new Random();
		System.out.println(ls.get(r.nextInt(ls.size())));
		prices.get(ls.get(r.nextInt(ls.size()))).click();
	   
	   
	}
		//int input= new Scanner(System.in).nextInt();
		
		
		//System.out.println("The input from the user is: " + input);

		
		 //System.out.println(links.size());
		 //List <WebElement> containers = driver.findElements(By.xpath("//*[@class='s-item-container']"));
		 
		 //List <WebElement> prices = driver.findElements(By.xpath("//*[@class='s-item-container']/div[5]/div[1]/a/span/span/span"));

		 
		 //System.out.println(prices.size());
		// System.out.println(container/@class='sx-price-whole'.size());
		 

		
		//driver.quit();
	}





