package sismed;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Step {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_chromedriver_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\pdevi100\\Desktop\\selenim\\jars\\chromedriver.exe");					
       ChromeDriver driver = new ChromeDriver();				
       driver.manage().window().maximize();			
       driver.get("https://smsismedwebcad-test.amil.com.br/Login.aspx");
       driver.manage().window().maximize();
   	System.out.println("SisMedWebCad application is opened");
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	WebElement username = driver.findElement(By.name("ctl00$cphBodyBranco$edtUsuario"));
    	username.sendKeys("treinascm01@medial.intranet");
    	WebElement password = driver.findElement(By.id("ctl00_cphBodyBranco_edtSenha"));
    	password.sendKeys("Amil2014**");						
    	WebElement Entrar=driver.findElement(By.name("ctl00$cphBodyBranco$btnLogin"));
    	Entrar.click();
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS );
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
    	System.out.println("iframe");
    	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
    		//Thread.sleep(5000);
    	System.out.println("frame located");
    	WebElement prosseguir = driver.findElement(By.xpath("//*[@id=\"ctl00_cphBodyBranco_btnProsseguir\"]"));
    	 prosseguir.click();
    	 driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);				
    }		
}		
