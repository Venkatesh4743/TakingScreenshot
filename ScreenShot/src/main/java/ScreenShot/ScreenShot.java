package ScreenShot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ScreenShot {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		//FILE
	  File	sourceFile =driver.getScreenshotAs(OutputType.FILE);
	  File destfile= new File("./ScreenShots/img1.jpg");
	  FileUtils.copyFile(sourceFile, destfile);
	  System.out.println("Screen shot saved successfully");
	  driver.quit();
	}
}
//
//1. `File sourceFile = driver.getScreenshotAs(OutputType.FILE);`
//
//   - This line captures a screenshot using the `getScreenshotAs` method of the `driver` object. The `OutputType.FILE` parameter specifies that the screenshot should be returned as a file object.
//   - The captured screenshot is then assigned to the `sourceFile` variable, which is of type `File`.
//
//2. `File destfile = new File("./ScreenShots/img1.jpg");`
//
//   - Here, a new `File` object named `destfile` is created. This file represents the destination where the screenshot will be saved.
//   - The screenshot will be saved as `img1.jpg` inside a directory named `ScreenShots`, which is relative to the current working directory (`./` represents the current directory).
//
//3. `FileUtils.copyFile(sourceFile, destfile);`
//
//   - This line uses the `copyFile` method from the `FileUtils` class to copy the screenshot from `sourceFile` to `destfile`.
//   - `sourceFile` contains the screenshot captured earlier, and `destfile` is the destination where the screenshot will be saved.
//
//4. `System.out.println("Screen shot saved successfully");`
//
//   - This line prints a message to the console indicating that the screenshot was saved successfully.
//
//5. `driver.quit();`
//
//   - Finally, this line instructs the WebDriver (`driver`) to quit, closing the browser and ending the WebDriver session.