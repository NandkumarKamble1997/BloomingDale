package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void takeScreenShot(String Name , WebDriver driver) throws IOException {
		
		File source  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\nandkumar kamble\\eclipse-workspace\\SwagLab\\ScreenShot\\" +Name+".png"); 
		FileHandler.copy(source, destination);
		
		
	}

}
