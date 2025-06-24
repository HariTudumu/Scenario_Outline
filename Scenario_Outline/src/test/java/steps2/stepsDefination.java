package steps2;

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
	@Then("user enter url as {string}")
	public void user_enter_url_as(String applicationURL) 
	{
		driver.get(applicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	@Then("user enters username as {string} and password as {string} and clicks login btn")
	public void user_enters_username_as_and_password_as_and_clicks_login_btn(String USERNAME, String PASSWORD) 
	{
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	}
	@Then("user go to Job Page")
	public void user_go_to_job_page()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	}
	@Then("user enter the job title as {string} and job description as {string} and note as {string}")
	public void user_enter_the_job_title_as_and_job_description_as_and_note_as(String jobTitle, String jobDescription, String note) 
	{
		driver.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/child::div[2]/input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(jobTitle);

		driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys(jobDescription);

		driver.findElement(By.xpath("//textarea[@placeholder=\"Add note\"]")).sendKeys(note);
	}
	@Then("user save the Job Record")
	public void user_save_the_job_record()
	{
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	   
	}
	@Then("user logout from the application")
	public void user_logout_from_the_application() 
	{
	    
	}
	@Then("user close the browser")
	public void user_close_the_browser() 
	{
	    
		
	}
	
	
	
	

}
