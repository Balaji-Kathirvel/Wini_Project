package com.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition extends BaseClass {

	@Given("User launch the browser")
	public void user_launch_the_browser() {
		getDriver("Chrome");
		getUrl("https://website.winidev.com/");
	}

	@Then("User validate the text")
	public void user_validate_the_text() {
		

		String actual = "For 30 years, WIN Home Inspection has been offering essential inspection services to home buyers, owners and sellers nationwide. Clients love how we utilize a wide variety of inspection services and state-of-the-art equipment to bring peace of mind, address health and safety concerns and help them save money. It’s no wonder we’ve been rated #1!";

		String expected = driver.findElement(By.xpath("(//p[@class='default_size'])[1]")).getText();
		System.out.println(expected);

		// To validate the Font color
		String cssValue = driver.findElement(By.xpath("(//p[@class='default_size'])[1]")).getCssValue("color");
		System.out.println("Font Color: " + cssValue);

		// To Validate the Font Size
		String cssValue1 = driver.findElement(By.xpath("(//p[@class='default_size'])[1]")).getCssValue("font-size");
		System.out.println("Font size: " + cssValue1);

		// To Validate the Font Texture
		String cssValue2 = driver.findElement(By.xpath("(//p[@class='default_size'])[1]")).getCssValue("font-family");
		System.out.println("Font family: " + cssValue2);

		// To Validate the content
		Assert.assertEquals(actual, expected);
	}

}
