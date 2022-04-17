import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Onlineshopping {

	public static final int wait = 500;
	WebDriver driver;

	public void invokeBrowser() {
		try {

			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void createAccount(String name, String password) {
		try {
			
			// click signin button
			driver.findElement(By.className("login")).sendKeys(Keys.ENTER);
			Thread.sleep(wait);

			
			driver.findElement(By.id("email_create")).sendKeys(name);
			Thread.sleep(wait);

			driver.findElement(By.id("SubmitCreate")).click();
			Thread.sleep(wait);

			driver.findElement(By.id("id_gender2")).click();
			Thread.sleep(wait);

			driver.findElement(By.id("customer_firstname")).sendKeys("LAILA");
			Thread.sleep(wait);

			driver.findElement(By.id("customer_lastname")).sendKeys("ALAM");
			Thread.sleep(wait);

			driver.findElement(By.id("passwd")).sendKeys(password);

			Select dropdown = new Select(driver.findElement(By.id("days")));
			dropdown.selectByValue("10");
			Thread.sleep(wait);

			dropdown = new Select(driver.findElement(By.id("months")));
			dropdown.selectByValue("10");
			Thread.sleep(wait);


			dropdown = new Select(driver.findElement(By.id("years")));
			dropdown.selectByValue("2000");
			Thread.sleep(wait);

			driver.findElement(By.id("uniform-newsletter")).click();
			Thread.sleep(wait);

			driver.findElement(By.id("uniform-optin")).click();
			Thread.sleep(wait);

			driver.findElement(By.id("address1")).sendKeys("3/3,Dallas");
			Thread.sleep(wait);

			driver.findElement(By.id("city")).sendKeys("Dallas");
			Thread.sleep(wait);

			driver.findElement(By.id("id_state")).sendKeys("Texas");
			Thread.sleep(wait);

			driver.findElement(By.id("postcode")).sendKeys("75237");
			Thread.sleep(wait);

			driver.findElement(By.id("id_country")).click();
			Thread.sleep(wait);

			driver.findElement(By.id("phone_mobile")).sendKeys("766654367");
			Thread.sleep(wait);

			driver.findElement(By.id("alias")).sendKeys("6/7,Dallas");
			Thread.sleep(wait);
           
			// submit signup form
			driver.findElement(By.id("submitAccount")).click();
			Thread.sleep(wait);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void logIn(String name, String password) {
		try {
            
			// click signin button
			driver.findElement(By.className("login")).sendKeys(Keys.ENTER);
			Thread.sleep(wait);

			driver.findElement(By.id("email")).sendKeys(name);
			Thread.sleep(wait);
			driver.findElement(By.id("passwd")).sendKeys(password);
			Thread.sleep(wait);
			
			//submit login form
			driver.findElement(By.id("SubmitLogin")).sendKeys(Keys.ENTER);
			Thread.sleep(wait);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void casualDress() {
		try {
             
			Thread.sleep(1000);
			// hover on women
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.className("sf-with-ul"))).build().perform();
			Thread.sleep(1000);
            
			//select casual dress
			driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[1]")).click();
			Thread.sleep(wait);
			
            //hover on a dress card
			Actions b = new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li"))).build()
					.perform();
			Thread.sleep(wait);
			
            //click add to cart
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"))
					.click();
			Thread.sleep(wait);

			//click cross pop up
			driver.findElement(By.className("cross")).click();
			Thread.sleep(wait);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void tShirt() {
		try {

			//click t-shirt menu
			Thread.sleep(wait);
			driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]")).click();
			Thread.sleep(wait);

			//filter by blue
			driver.findElement(By.id("layered_id_attribute_group_14")).click();
			Thread.sleep(wait);

			//hover on dress card
			Actions b = new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li"))).build()
					.perform();
			Thread.sleep(wait);

			//click blue color
			driver.findElement(By.id("color_2")).click();
			Thread.sleep(wait);

			//add to cart
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(wait);
			
           //proceed to pay
			driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"))
					.click();
			Thread.sleep(wait);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkOut() {
		try {
			
			Thread.sleep(wait);
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")).click();
			Thread.sleep(wait);

			driver.findElement(By.name("processAddress")).click();
			Thread.sleep(wait);

			driver.findElement(By.id("cgv")).click();
			Thread.sleep(wait);

			driver.findElement(By.name("processCarrier")).click();
			Thread.sleep(wait);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void payMent() {
		try {
             
			//select pay by check
			Thread.sleep(wait);
			driver.findElement(By.className("cheque")).click();
			Thread.sleep(wait);
            
			//proceed pay
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
			Thread.sleep(wait);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void signOut() {
		try {
			//click sign out
			Thread.sleep(wait);
			driver.findElement(By.className("logout")).click();
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ArrayList<User> userList = new ArrayList<>();
        User user1 = new User("aaaaaol6654567890@gmail.com", "abdhgghahahprantoprovatiprapti@2");
        User user2 = new User("xxxxxxahaha@gmail.com", "lol6654567890santopraptiprovati");

        userList.add(user1);
        userList.add(user2);
        
        Onlineshopping buy = new Onlineshopping();
		buy.invokeBrowser();
		buy.createAccount(user1.email,user1.password);
		buy.signOut();
		buy.createAccount(user2.email,user2.password);
		buy.signOut();
		
        for(User user: userList){
            
        	buy.logIn(user.email,user.password);
    		buy.casualDress();
    		buy.tShirt();
    		buy.checkOut();
    		buy.payMent();
    		buy.signOut();
        }

	}
}

class User{
    public String email;
    public String password;
    
    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
}






