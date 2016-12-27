package by.htp.driver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Exercise 1. Google.
//		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
//		
//		WebElement findElementGoogle = driver.findElement(By.id("lst-ib"));
//		findElementGoogle.sendKeys("Java");
//		findElementGoogle.submit();
//		
//		Thread.sleep(5000);
//		System.out.println(driver.getTitle());
		
		//Exercise 4. tut.by
//		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.tut.by");
//		WebElement nameArticle = driver.findElement(By.className("_title"));
//		System.out.println(nameArticle.getText());
//		nameArticle.click();
//		List<WebElement> generalNews = driver.findElements(By.tagName("p"));
//		System.out.println(generalNews.size());
		
		//Exercise 3. Registration quizful.net
//		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://quizful.net");
//		WebElement regestration = driver.findElement(By.cssSelector("#user-panel:last-child"));
//		regestration.click();
//		Thread.sleep(5000);
//		WebElement input = driver.findElement(By.id("login"));
//		input.sendKeys("vsk1983");
//		
//		WebElement password = driver.findElement(By.name("registrationForm.password"));
//		password.sendKeys("1234");
//	
//		WebElement repassword = driver.findElement(By.name("registrationForm.repassword"));
//		repassword.sendKeys("1234");
//		
//		WebElement email = driver.findElement(By.name("registrationForm.email"));
//		email.sendKeys("kut83@tut.by");
//		WebElement check = driver.findElement(By.id("corporate"));
//		check.click();
//		Thread.sleep(8000);
//		WebElement button = driver.findElement(By.name("ok"));
//		button.click();
		
//		//Exercise 6. Authorisation on quizful.net and edit personal information
//		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://quizful.net");
//		List<WebElement> autorisation = driver.findElements(By.tagName("a"));
//		for(WebElement element : autorisation)
//		{
//			if(element.getText().equals("войти"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		WebElement login = driver.findElement(By.id("login"));
//		login.sendKeys("vsk1983");
//		WebElement password = driver.findElement(By.name("loginForm.password"));
//		password.sendKeys("1234");
//		WebElement check = driver.findElement(By.name("loginForm.rememberMe"));
//		check.click();
//		WebElement submit = driver.findElement(By.name("ok"));
//		submit.click();
//		Thread.sleep(5000);
//		List<WebElement> profile = driver.findElements(By.tagName("a"));
//		for(WebElement element : profile)
//		{
//			if(element.getText().equals("Профиль"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		List<WebElement> edit = driver.findElements(By.tagName("a"));
//		for(WebElement element : edit)
//		{
//			if(element.getText().equals("редактировать"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		List<WebElement> personalData = driver.findElements(By.tagName("b"));
//		for(WebElement element : personalData)
//		{
//			if(element.getText().equals("Личные данные"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		WebElement name = driver.findElement(By.name("personalForm.name"));
//		name.clear();
//		name.sendKeys("Виталий");
//		WebElement surname = driver.findElement(By.name("personalForm.surname"));
//		surname.clear();
//		surname.click();
//		surname.sendKeys("Шерстук");
//		WebElement year = driver.findElement(By.name("personalForm.birthyear"));
//		year.clear();
//		year.sendKeys("1983");
//		WebElement site = driver.findElement(By.name("personalForm.site"));
//		site.clear();
//		site.sendKeys("Vasy.by");
//		WebElement company = driver.findElement(By.name("personalForm.company"));
//		company.clear();
//		company.sendKeys("TV");
//		WebElement country = driver.findElement(By.name("personalForm.countryId"));
//		country.click();
//		country.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		WebElement time = driver.findElement(By.name("personalForm.zone"));
//		time.click();
//		WebElement about = driver.findElement(By.xpath("//textarea[@name='personalForm.about']"));
//		//about.click();
//		about.clear();
//		about.sendKeys("+37589456123");
//		WebElement save = driver.findElement(By.name("personalForm.save"));
//		save.click();
//		Thread.sleep(3000);
//		List<WebElement> editButton = driver.findElements(By.tagName("a"));
//		for(WebElement element : editButton)
//		{
//			if(element.getText().equals("редактировать"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		List<WebElement> message = driver.findElements(By.tagName("b"));
//		for(WebElement element : message)
//		{
//			if(element.getText().equals("Уведомления"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		WebElement checkMessage = driver.findElement(By.name("notificationsForm.notificationsEnabled"));
//		String checkValue = checkMessage.getAttribute("checked");
//		if(checkValue!=null && checkValue.equals("true"))
//		{
//			checkMessage.click();	
//		}
//
//		
//		WebElement checkMessageDelivery = driver.findElement(By.name("notificationsForm.deliveryEnabled"));
//		String checkDeliveryValue = checkMessageDelivery.getAttribute("checked");
//		
//		if(checkDeliveryValue!=null && checkDeliveryValue.equals("true"))
//		{
//			checkMessageDelivery.click();
//		}
//		
//		WebElement saveButton = driver.findElement(By.name("notificationsForm.save"));
//		saveButton.click();
//		Thread.sleep(5000);
//		List<WebElement> buttonEdit = driver.findElements(By.tagName("a"));
//		for(WebElement element : buttonEdit)
//		{
//			if(element.getText().equals("редактировать"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		List<WebElement> confidance = driver.findElements(By.tagName("b"));
//		for(WebElement element : confidance)
//		{
//			if(element.getText().equals("Конфиденциальность"))
//			{
//				element.click();
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		WebElement only = driver.findElement(By.xpath("//input[@name='privacyForm.profileVisibility' and @value='closed']"));
//		only.click();
//		WebElement clickOk = driver.findElement(By.name("privacyForm.save"));
//		clickOk.click();
//		
//		driver.close();
		
		//Задание 2
//		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.it-academy.by");
		
//		WebElement departMenu = driver.findElement(By.className("expanded menu-depth-1 menu-item-633"));
//		System.out.println(departMenu.getText());
//		List<WebElement> list = departMenu.findElements(By.tagName("a"));
//		for(WebElement element : list)
//		{
//			System.out.println(element.getText());
//		}
//		System.out.println(departMenu.getLocation());
		
		
		//Belavia
		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.belavia.by");
		Thread.sleep(5000);
		WebElement fromCity = driver.findElement(By.id("OriginLocation_Combobox"));
		fromCity.click();
		fromCity.sendKeys("Минск");
		fromCity.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement toCity = driver.findElement(By.id("DestinationLocation_Combobox"));
		toCity.click();
		toCity.sendKeys("Сочи");
		toCity.sendKeys(Keys.ENTER);
		WebElement radioButton = driver.findElement(By.id("JourneySpan_Ow"));
		radioButton.click();
		

		SimpleDateFormat checkDate = new SimpleDateFormat("dd");
		
		List<WebElement> date = driver.findElements(By.tagName("a"));
		for(WebElement element : date)
		{
			if(element.getText().equals(checkDate.format(new Date()).toString()))
			{
				element.click();
				break;
			}
		}
		
		List<WebElement> button = driver.findElements(By.tagName("button"));
		for(WebElement element : button)
		{
			if(element.getText().equals("Найти"))
			{
				element.click();
				break;
			}
		}
		
			
	}

}
