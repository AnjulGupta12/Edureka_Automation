package com.edureka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EdurekaTest {
	public static WebDriver driver;
	FileInputStream fis;
	Properties prop;
	
//	Login to the Edureka
//	Navigate to ‘My Profile’
//	Update professional and personal details
//	Explore the blogs and navigate to the Main page
//	Logout of the portal
	
	
	@Test
	public void EdurekaProfile() throws InterruptedException{
		
		String fileName = ".\\src\\main\\resources\\config\\config.properties";		
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}											
		prop = new Properties();			
		try {
			prop.load(fis);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}							
		System.out.println("checkpost 1");	
	if (prop.getProperty("Browser").equalsIgnoreCase("chrome")) {						
	System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
		}
	System.out.println("checkpost 2");
	driver.manage().window().maximize();
	Thread.sleep(5000);

	driver.get(prop.getProperty("URL"));

	System.out.println("checkpost 3");
	
					try {
						Thread.sleep(5000);
						} catch (InterruptedException e) {
						e.printStackTrace();
						}
					System.out.println("checkpost 4");
	driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span")).click();
	
					try {
						Thread.sleep(1000);
						} catch (InterruptedException e) {
						e.printStackTrace();
						}
					System.out.println("checkpost 5");
	Actions actions = new Actions(driver);
	
	actions.moveToElement(driver.findElement(By.id("si_popup_email")));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	actions.click();
	actions.sendKeys("emailid@gmail.com");
	System.out.println("checkpost 6");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	actions.build().perform();
	System.out.println("checkpost 7");
	actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 8");
	actions.click();
	actions.sendKeys("password");
	System.out.println("checkpost 9");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	actions.build().perform();
	System.out.println("checkpost 10");
	actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 11");
	actions.click();
	actions.build().perform();
	System.out.println("checkpost 12");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 13");
	
	driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]/a")).click();//click on my profile
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 14");
	WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(5));
	waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/div/div/div[1]/app-profile-leftnav-pro/div/ul/li[1]/a")));
	System.out.println("checkpost 15");
	driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/div/div/div[1]/app-profile-leftnav-pro/div/ul/li[1]/ul/li[1]/a")).click(); //click at personalize
	String Pagetitle = driver.getTitle();
	System.out.println("checkpost 16");
	System.out.println(Pagetitle);
	driver.findElement(By.xpath("//*[@id=\"other_details\"]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 17");
	driver.findElement(By.xpath("//*[@id=\"fullName\"]")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Edureka");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 18");
	driver.navigate().to("https://learning.edureka.co/my-profile");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 19");
	driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
	System.out.println("checkpost 20");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
	System.out.println("checkpost 21");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	dropdownCurrentJob.selectByVisibleText("Software Testing");
	System.out.println("checkpost 22");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Select dropdownEmployementType = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
	System.out.println("checkpost 23");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	dropdownEmployementType.selectByVisibleText("Both");
	System.out.println("checkpost 24");
	
//	Select dropdownCity = new Select(	//since it is a button
			driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[3]/div/div/button")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}

	
	System.out.println("checkpost 25");
	
	actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[3]/div/div/ul/perfect-scrollbar/div/div[1]/li[93]/a")));
	try {
				Thread.sleep(2000);
	
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("checkpost 26");
	actions.click();
	actions.build().perform();
	
	
	
	
//	Select dropdownCity = new Select(driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[3]/div/div/ul/perfect-scrollbar")));
//	System.out.println("checkpost 23c2");
//	dropdownCity.selectByVisibleText("India");
	System.out.println("checkpost 27");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[3]/div/input")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[3]/div/input")).sendKeys("Haridwar");
	System.out.println("checkpost 28");
	Select dropdownCTC = new Select(driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[4]/select")));
	System.out.println("checkpost 29");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	dropdownCTC.selectByVisibleText("40+ LPA");
	driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[5]/div/label[1]/span")).click();
	System.out.println("checkpost 30");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.findElement(By.name("preferredCity")).clear();
	Thread.sleep(1000);
	driver.findElement(By.name("preferredCity")).sendKeys("Mumbai");
	System.out.println("checkpost 31");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("checkpost 32");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.navigate().to("https://learning.edureka.co/");
	System.out.println("checkpost 33");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.findElement(By.xpath("//span[@class='user_name']")).click();
	System.out.println("checkpost 34");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	System.out.println("checkpost 35");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {Thread.sleep(2000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	System.out.println("checkpost 36");
	
	driver.close();
	
	System.out.println("----------------------FINISH----------------------");
	}
		
}


