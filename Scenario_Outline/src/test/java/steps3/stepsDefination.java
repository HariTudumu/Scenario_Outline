package steps3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepsDefination
{
	WebDriver driver;


	@Given("user launch the browser")
	public void user_launch_the_browser() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Then("user enter the URL as {string}")
	public void user_enter_the_url_as(String applicationURL) 
	{
		driver.get(applicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Then("user enter the username as {string} and password as {string} and click on login button")
	public void user_enter_the_username_as_and_password_as_and_click_on_login_button(String USERNAME, String PASSWORD)
	{
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();	
	}
	@Then("user go to Nationalities page")
	public void user_go_to_nationalities_page() 
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();

	}
	@Then("user add Nationalities as {string} and click on save button")
	public void user_add_nationalities_as_and_click_on_save_button(String nationality) 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(nationality);

		driver.findElement(By.xpath("//button[text()=' Save ']")).click();	

	}
	@Then("user logout from the application")
	public void user_logout_from_the_application() {

	}
	@Then("user close the browser")
	public void user_close_the_browser() {

	}






}
