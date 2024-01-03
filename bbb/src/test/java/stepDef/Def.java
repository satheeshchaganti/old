package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def {
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");  
	}
	@When("user entered mobile company")
	public void user_entered_mobile_company() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("vivo");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		 
	}
	@When("user selected particular mobile")
	public void user_selected_particular_mobile() {
		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();  
	}
	@Then("user verified cost details")
	public void user_verified_cost_details() throws Exception {
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id='submit.add-to-cart']")));
		driver.findElement(By.xpath("//*[@id='submit.add-to-cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='a-button-input'])[34]")).click();
	    
	}

	
}
