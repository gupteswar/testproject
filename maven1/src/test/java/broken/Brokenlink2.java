package broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlink2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://2.0.talentrecruit.in");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int sizeoflink=links.size();
		for(int i=0;i<sizeoflink;i++)
		{
			String UrlName=links.get(i).getAttribute("href");
			VerifyUrl(UrlName);
		}
	}
	public static void VerifyUrl(String UrlName) throws Exception
	{
		try {
			URL url=new URL(UrlName);
			HttpURLConnection connect=(HttpURLConnection)url.openConnection();
			connect.connect();
			if(connect.getResponseCode()==200)
			{
				System.out.println(" "+connect.getResponseMessage());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
