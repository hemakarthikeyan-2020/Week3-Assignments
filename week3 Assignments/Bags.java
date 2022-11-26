package week3Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bags {

	public static void main(String[] args) {
		//setup the chromedriver
		WebDriverManager.chromedriver().setup();
		//Launch the Chromedriver
		ChromeDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("https://www.ajio.com");
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Searchbox
		driver.findElement(By.xpath("//input[@class = 'react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bags",Keys.ENTER);
		//Click 'Men' checkbox
		driver.findElement(By.xpath("(//div[@class = 'facet-linkhead'])[2]")).click();
		//Click 'Fashion Bags'checkbox
		WebElement fashion = driver.findElement(By.xpath("(//div[@class = 'facet-linkhead'])[7]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", fashion);
		//Get the number of total items
		String totalItems = driver.findElement(By.xpath("//div[@class = 'length']")).getText();
		System.out.println("Total Number of Items: " +totalItems);
		//List of Brand Names of bag
		
		List<String> list = new ArrayList<String>();
		System.out.println("List of Brands");
		List<WebElement> allBrand = driver.findElements(By.className("brand"));
		System.out.println("Size: " +allBrand.size());
		
	    for (WebElement eachBrand :allBrand) {
	    
	    	String text = eachBrand.getText();
	    	list.add(text);
	
	}
	    System.out.println(list);
	    
	    //List the Names of bag
	    System.out.println("Bag Names are ");
	    List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
	    System.out.println("Size: " +bagNames.size());
	    List<String> list2 = new ArrayList<String>();
	    for (WebElement eachBagName : bagNames) {
	    	String bName = eachBagName.getText();
	    	list2.add(bName);
			 
		}
	    
	    System.out.println(list2);
		
	}

}