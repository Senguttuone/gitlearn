package Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class flightbooking {
	WebDriver driver;
	
	SoftAssert softAssert = new SoftAssert();
	@Before
	public void launch() {
	System.setProperty("webdriver.chrome.driver","D:\\JAVA\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/datepicker/");
	int a=1;
	softAssert.assertEquals(1, a,"Not matching");
	
	System.out.println("line 1");
	
	softAssert.assertEquals(1, a,"Not Matching");
	
	System.out.println("Line 2");
	}
	@Given("User is selecting a country by entering key word {string}")
	public void user_is_selecting_a_country_by_entering_key_word(String string) {
//		driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys(string);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-1"))));
//		List<WebElement> city=driver.findElements(By.tagName("a"));
//		System.out.println(city.size());
//		Iterator<WebElement> iterate=city.iterator();
//		int i=0;
//		while(iterate.hasNext())
//			{
//			
//			System.out.println(city.get(i).getText());
//			if(city.get(i).getText().equalsIgnoreCase("India"))
//			{
//			city.get(i).click();
//		 	break;
//			}
//			i++;
//			}
		
	}

	@Given("Selecting departure city by entering key word {string}")
	public void selecting_departure_city_by_entering_key_word(String string) {
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		List<WebElement> departurecity=driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a"));
//
//		for(WebElement from:departurecity) {
//			
//			
//			if(from.getText().contains(string)) {
//				from.click();
//			}
//		}

	}

	@When("Selecting arrival city by entering key word {string}")
	public void selecting_arrival_city_by_entering_key_word(String string) {

//	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		List<WebElement> returncity=driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a"));
//		for(WebElement to:returncity)
//		{
//			if(to.getText().contains(string))
//			{
//				to.click();
//			}
//		}
//
	}

	@When("Select depart date as {string} month {string}")
	public void select_depart_date_as_month(String string, String int1) {
//		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
//		List<WebElement> fromdate= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a"));
//
//		for(WebElement date1: fromdate)
//		{
//			System.out.println(date1.getText());
//		if(date1.getText().equals())
//		{
//			
//			date1.click();
//		}
//		}
//
	}
	@When("Select return date as {string} month {string}")
	public void select_return_date_as_month(String string, String int1) {
//		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
//		List<WebElement> todate=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a"));
//		for(WebElement tod:todate)
//		{
//			System.out.println(tod.getText());
//			if(tod.getText().equals(int1))
//			{
//				tod.click();
//				driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
//			}
//
//			} driver.close();
//List<WebElement> divi=driver.findElements(By.tagName("a"));
	}
	

	@Then("Enter passenger details as {int} adults {int} child")
	public void enter_passenger_details_as_adults_child(String int1, String int2) {
		

	}

	@Then("select currency as {string}")
	public void select_currency_as(String string) {

	}

	@Then("select option as {string}")
	public void select_option_as(String string) {

	}

}
