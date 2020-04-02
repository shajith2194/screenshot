package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Screenshot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\BrowserLaunch\\drivers\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiAwKfQ4snoAhWzwTgGHcQcB3IQPAgH");
	driver.manage().window().maximize();
	TakesScreenshot tk= (TakesScreenshot)driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);

	File destn = new File("C:\\Users\\Admin\\eclipse-workspace\\Takescreenshot\\scsh.google.png");
	
	FileUtils.copyFile(src, destn);
	System.out.println("done");
	




}


}