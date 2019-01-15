package handlemultiplewindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class handlewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		String Pwindow = driver.getWindowHandle();
		System.out.println(" "+Pwindow);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
	Set<String> CWindow=driver.getWindowHandles();
		Iterator<String>itr=CWindow.iterator();
	while(itr.hasNext())
	{
			String CW=itr.next();
		if(CW.equals(Pwindow))
			{
				String pagetitle = driver.switchTo().window(CW).getTitle();
			System.out.println("pagetitle is "+pagetitle);
		}
		
	}
		
		}

}
