package com.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveTo {
	public static void main(String[] args) {
		//define achrome browser as default
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open baidu site with chrome brower
		driver.get("https://www.baidu.com");
		
		//Locate setting with chrome browser
		WebElement setting =driver.findElement(By.xpath(".//*[@id='ul']/a[8]"));
		
		//move mouse to setting labek
		Actions action =(Actions) new Actions(driver);
		action.moveToElement(setting).build().perform();
		
		//click searchSetting and open it
		WebElement searchSetting=driver.findElement(By.xpath(".//*[@id='']"));
		
		
		
	}

}
