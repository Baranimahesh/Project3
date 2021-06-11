package org.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10 {
	
		public void getDrive() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\TestFrameWork\\Excel1\\WorkBook.xlsx");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		public void launchUrl(WebDriver element,String url) {
			element.get(url);
		}
		public void sendKeys(WebElement element,String data) {
			element.sendKeys(data);
			
		}
		public void btnClick(WebElement element) {
			element.click();
		}
		public void dropDown(WebElement elementRef,String data) {
			Select s=new Select(elementRef);
			s.selectByValue(data);

		}
		
		
		
}
