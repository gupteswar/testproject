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

public class brokenlink1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://2.0.talentrecruit.in/");
		List<WebElement> hreflink= driver.findElements(By.tagName("a"));
		int Total_Links=hreflink.size();
		for(int i=0;i<Total_Links;i++)
		{
			String LinkName=hreflink.get(i).getAttribute("href");
			System.out.println(LinkName);
		verifybrokenlink(LinkName);

	}
	}
	
	public static void verifybrokenlink(String LinkUrl) throws Exception
	{
		try {
			URL url=new URL(LinkUrl);
			HttpURLConnection Urlconn=(HttpURLConnection)url.openConnection();
			Urlconn.setConnectTimeout(2000);
			Urlconn.connect();
			if(Urlconn.getResponseCode()==200)
			{
				System.out.println(" "+Urlconn.getResponseMessage());
			}
			else if(Urlconn.getResponseCode()==500)
			{
				System.out.println(" "+Urlconn.getResponseMessage());
			}
			else
			{
				System.out.println(" "+Urlconn.getResponseMessage());
			}
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
