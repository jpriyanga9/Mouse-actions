package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.cucumber.java.Before;


public class Mouseactions {
	
	@Before
	
	public void b() {
		
	}
	
	@Test	
	public void purchase() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\91948\\eclipse-workspace\\Mouse\\src\\test\\resources\\Drivers\\chromedriver.exe" );
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://automationpractice.com/index.php");
		
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//actions
				Actions action = new Actions(chromedriver);
		//Identify Element
		
		WebElement search = chromedriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		search.sendKeys("Faded");
		//WebElement sclick = 
		chromedriver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		//action.click(sclick);
		//action.clickAndHold(sclick).build().perform();
		//action.release(sclick).build().perform();
		//WebElement compare = 
		chromedriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[3]/div[2]/a")).click();
		//action.contextClick(compare);
		//action.clickAndHold(compare).build().perform();
		//action.release(compare).build().perform();
		
		//Could not reuse webelement
		WebElement searchs = chromedriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		searchs.clear();
		searchs.sendKeys("printed");
		
		//WebElement sclicks = 
		chromedriver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		//action.clickAndHold(sclicks).build().perform();
		//action.release(sclicks).build().perform();
		
		//WebElement compares = 
		chromedriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]")).click();
		//action.clickAndHold(compares).build().perform();
		//action.release(compares).build().perform();
		//action.contextClick(compares);
		
		//WebElement ccopm = 
		chromedriver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/div/form/button")).click();
		//action.click(ccopm);
		//action.clickAndHold(ccopm).build().perform();
		//action.release(ccopm).build().perform();
		//action.contextClick(ccopm);
		
		//WebElement mcart = 
		chromedriver.findElement(By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[5]/div/div/a[1]/span")).click();
		//action.click(mcart);
		
		//WebElement cart= chromedriver.findElement(null)
		
		chromedriver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		chromedriver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		
		
	}

}
