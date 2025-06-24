package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;

	@Given("user launch browser")
	public void user_launch_browser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Then("User enters URL as {string}")
	public void user_enters_url_as(String TestURL) 
	{

		driver.get(TestURL);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("user enters username as {string} and password as {string} and clicks login btn")
	public void user_enters_username_as_and_password_as_and_clicks_login_btn(String USERNAME, String PASSWORD) 
	{
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();


	}

	@When("go to skills page")
	public void go_to_skills_page() throws InterruptedException 
	{
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Skills']")).click();

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();	


	}

	@Then("enters skillname as {string}  and skill description as {string} and click save btn")
	public void enters_skillname_as_and_skill_description_as_and_click_save_btn(String AutomationTesting, String AutomationDescription) 
	{

		driver.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/child::div[2]/input")).sendKeys(AutomationTesting);

		driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys(AutomationDescription);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Then("logout")
	public void logout() {

	}

	@Then("close the browser")
	public void close_the_browser() {

	}

}
