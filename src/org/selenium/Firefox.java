package org.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox  {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\Kaushik\\eclipse-workspace\\JAN04SeleTASK1\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.google.com/");
		//driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
		
}
//
//	@Override
//	public void close() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public WebElement findElement(By by) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<WebElement> findElements(By by) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void get(String url) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String getCurrentUrl() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPageSource() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getTitle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getWindowHandle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Set<String> getWindowHandles() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Options manage() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Navigation navigate() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void quit() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public TargetLocator switchTo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
