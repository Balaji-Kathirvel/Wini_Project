package com.homepage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class FunctionaTest extends BaseClass {
	Actions ac;
	Robot r;

	@Test
	public void Test_A() throws InterruptedException, AWTException {
		getDriver("firefox");
		getUrl("http://wini-dev.winrecall.com/");
		System.out.println("FireFox Browser ");
		ac = new Actions(driver);
		r = new Robot();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//		//Win Logo
//		Thread.sleep(3000);
//		WebElement winLogo = driver.findElement(By.xpath("(//img[@alt='WIN home inspection'])[2]"));
//      ac.moveToElement(winLogo).click().perform();
//		Thread.sleep(3000);
//		
//		//Who We Serve
		WebElement whoWeServe = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[1]"));
		ac.moveToElement(whoWeServe).perform();
		String cssValueForWhoWeServe = whoWeServe.getCssValue("font-family");
		System.out.println("Font Family For WhoWeServe : " + cssValueForWhoWeServe);
		Thread.sleep(3000);
//		
		// Services
		Thread.sleep(2000);
		WebElement services = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[2]"));
		ac.contextClick(services).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueForServices = services.getCssValue("font-family");
		System.out.println("Font Family For Services : " + cssValueForServices);
		WebElement winLogo = driver.findElement(By.xpath("(//img[@alt='WIN home inspection'])[2]"));
		ac.moveToElement(winLogo).click().perform();
		Thread.sleep(10000);

//		//Reviews
		WebElement reviews = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[3]"));
//		ac.moveToElement(reviews).perform();
		String cssValueForReviews = reviews.getCssValue("font-family");
		System.out.println("Font Family For Reviews : " + cssValueForReviews);
		Thread.sleep(3000);

		// Resource Center
		WebElement resourceCenter = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[4]"));
		ac.contextClick(resourceCenter).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueForResourceCenter = resourceCenter.getCssValue("font-family");
		System.out.println("Font Family For ResourceCenter : " + cssValueForResourceCenter);

		// Win Franchising
		WebElement winFranchising = driver.findElement(By.xpath("(//a[text()='WIN Franchising'])[1]"));
		ac.contextClick(winFranchising).perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("Win Franchising Function Working");

//		
//		//Contact Us
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact us']"));
		contactUs.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("ContactUs Function Working");

		// Content validation in Header
		WebElement header = driver.findElement(By.xpath("//h1[@class='banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header content : " + cssValueHeader);

		// Sub heading
		WebElement subHeader = driver.findElement(By.xpath("//p[@class='banner_subtext']"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for SubHeader content : " + cssValueSubHeader);

		// Book An Inspection in Header
		WebElement bookAnInspection = driver.findElement(By.xpath("//button[@class='booking-button']"));
		bookAnInspection.click();
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("//div[@class='close-btn']"));
		close.click();

	}

	@Test
	public void Test_B() throws InterruptedException, AWTException {
		getDriver("edge");
		getUrl("http://wini-dev.winrecall.com/");
		System.out.println("Edge Browser ");
		ac = new Actions(driver);
		r = new Robot();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//		//Win Logo
//		Thread.sleep(3000);
//		WebElement winLogo = driver.findElement(By.xpath("(//img[@alt='WIN home inspection'])[2]"));
//      ac.moveToElement(winLogo).click().perform();
//		Thread.sleep(3000);
//		
//		//Who We Serve
		WebElement whoWeServe = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[1]"));
		ac.moveToElement(whoWeServe).perform();
		String cssValueForWhoWeServe = whoWeServe.getCssValue("font-family");
		System.out.println("Font Family For WhoWeServe : " + cssValueForWhoWeServe);
		Thread.sleep(3000);
//		
		// Services
		Thread.sleep(2000);
		WebElement services = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[2]"));
		ac.contextClick(services).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueForServices = services.getCssValue("font-family");
		System.out.println("Font Family For Services : " + cssValueForServices);
		WebElement winLogo = driver.findElement(By.xpath("(//img[@alt='WIN home inspection'])[2]"));
		ac.moveToElement(winLogo).click().perform();
		Thread.sleep(10000);

//		//Reviews
		WebElement reviews = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[3]"));
//		ac.moveToElement(reviews).perform();
		String cssValueForReviews = reviews.getCssValue("font-family");
		System.out.println("Font Family For Reviews : " + cssValueForReviews);
		Thread.sleep(3000);

		// Resource Center
		WebElement resourceCenter = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[4]"));
		ac.contextClick(resourceCenter).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueForResourceCenter = resourceCenter.getCssValue("font-family");
		System.out.println("Font Family For ResourceCenter : " + cssValueForResourceCenter);

		// Win Franchising
		WebElement winFranchising = driver.findElement(By.xpath("(//a[text()='WIN Franchising'])[1]"));
		ac.contextClick(winFranchising).perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("Win Franchising Function Working");

//		
//		//Contact Us
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact us']"));
		contactUs.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("ContactUs Function Working");

		// Content validation in Header
		WebElement header = driver.findElement(By.xpath("//h1[@class='banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header content : " + cssValueHeader);

		// Sub heading
		WebElement subHeader = driver.findElement(By.xpath("//p[@class='banner_subtext']"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for SubHeader content : " + cssValueSubHeader);

		// Book An Inspection in Header
		WebElement bookAnInspection = driver.findElement(By.xpath("//button[@class='booking-button']"));
		bookAnInspection.click();
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("//div[@class='close-btn']"));
		close.click();

	}

	@Test
	public void Test_C() throws InterruptedException, AWTException {
		getDriver("chrome");
		getUrl("http://wini-dev.winrecall.com/");
		System.out.println("Chrome Browser ");
		ac = new Actions(driver);
		r = new Robot();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//		//Win Logo
//		Thread.sleep(3000);
//		WebElement winLogo = driver.findElement(By.xpath("(//img[@alt='WIN home inspection'])[2]"));
//      ac.moveToElement(winLogo).click().perform();
//		Thread.sleep(3000);
//		
//		//Who We Serve
		WebElement whoWeServe = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[1]"));
		ac.moveToElement(whoWeServe).perform();
		String cssValueForWhoWeServe = whoWeServe.getCssValue("font-family");
		System.out.println("Font Family For WhoWeServe : " + cssValueForWhoWeServe);
		Thread.sleep(3000);
//		
		// Services
		Thread.sleep(2000);
		WebElement services = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[2]"));
		ac.contextClick(services).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueForServices = services.getCssValue("font-family");
		System.out.println("Font Family For Services : " + cssValueForServices);
		WebElement winLogo = driver.findElement(By.xpath("(//img[@alt='WIN home inspection'])[2]"));
		ac.moveToElement(winLogo).click().perform();
		Thread.sleep(10000);

//		//Reviews
		WebElement reviews = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[3]"));
//		ac.moveToElement(reviews).perform();
		String cssValueForReviews = reviews.getCssValue("font-family");
		System.out.println("Font Family For Reviews : " + cssValueForReviews);
		Thread.sleep(3000);

		// Resource Center
		WebElement resourceCenter = driver
				.findElement(By.xpath("(//li[@class='menu_item_has_children parent_reference'])[4]"));
		ac.contextClick(resourceCenter).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String cssValueForResourceCenter = resourceCenter.getCssValue("font-family");
		System.out.println("Font Family For ResourceCenter : " + cssValueForResourceCenter);

		// Win Franchising
		WebElement winFranchising = driver.findElement(By.xpath("(//a[text()='WIN Franchising'])[1]"));
		ac.contextClick(winFranchising).perform();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("Win Franchising Function Working");

//		
//		//Contact Us
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact us']"));
		contactUs.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("ContactUs Function Working");

		// Content validation in Header
		WebElement header = driver.findElement(By.xpath("//h1[@class='banner_heading']"));
		String cssValueHeader = header.getCssValue("font-family");
		System.out.println("Font Family for Header content : " + cssValueHeader);

		// Sub heading
		WebElement subHeader = driver.findElement(By.xpath("//p[@class='banner_subtext']"));
		String cssValueSubHeader = subHeader.getCssValue("font-family");
		System.out.println("Font Family for SubHeader content : " + cssValueSubHeader);

		// Book An Inspection in Header
		WebElement bookAnInspection = driver.findElement(By.xpath("//button[@class='booking-button']"));
		bookAnInspection.click();
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("//div[@class='close-btn']"));
		close.click();

		// Learn More
		WebElement learnMore1 = driver.findElement(By.xpath("(//a[text()='Learn More'])[1]"));
		learnMore1.click();
		driver.navigate().back();

		// Component 1

		WebElement c1Text = driver.findElement(By.xpath("(//h2[@class='default_size'])[1]"));
		String cssValueC1Text = c1Text.getCssValue("font-family");
		System.out.println("C1 Header : " + cssValueC1Text);

	}

}
