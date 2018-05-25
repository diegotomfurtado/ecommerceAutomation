package setUp;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void take(WebDriver navegador, String arquivo){
		File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		
		try{
			org.apache.commons.io.FileUtils.copyFile(screenshot, new File(arquivo));
		}catch (Exception e){
			System.out.println("Houveram problemas ao copiar os arquivos para a pasta: " + e.getMessage());
		}
	}
}
