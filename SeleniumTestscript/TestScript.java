package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	//driver setup
	WebDriver driver;

    @BeforeTest
    public void setup() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

        // initializing chromeDriver
       driver = new ChromeDriver();
    }

    @Test(priority=1)
    public void registerTest() throws InterruptedException {
    	
        // Navigate to the local address
        driver.get("http://localhost:3000/"); 
        Thread.sleep(2000);
        
        // Fill login form with the same email and password
        WebElement loginEmailInput = driver.findElement(By.name("email"));
        loginEmailInput.sendKeys("richard@example.com");

        WebElement loginPasswordInput = driver.findElement(By.name("password"));
        loginPasswordInput.sendKeys("password123");

        // Click on the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/button"));
        loginButton.click();

        Thread.sleep(2000);
        
        // Click on "Don't have an account" link
        WebElement dontHaveAccountLink = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/p"));
        dontHaveAccountLink.click();
        
        Thread.sleep(2000);

        // Fill registration form
        WebElement firstNameInput = driver.findElement(By.name("firstName"));
        firstNameInput.sendKeys("richardfake");

        WebElement lastNameInput = driver.findElement(By.name("lastName"));
        lastNameInput.sendKeys("branson");

        WebElement locationInput = driver.findElement(By.name("location"));
        locationInput.sendKeys("Patiala Pujab");

        WebElement occupationInput = driver.findElement(By.name("occupation"));
        occupationInput.sendKeys("Developer");

        // Upload a picture
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/div[5]/div/input"));
        fileInput.sendKeys("D:\\puria\\sem 6\\tietconnect1\\photos\\richard-branson1.jpg");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("richard@example.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("password123");

        // Click on the "Register" button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/button"));
        registerButton.click();

        // After registration, go to the login page
        Thread.sleep(2000);
    }
    
    @Test(priority=2)
    public void loginTest() throws InterruptedException {

        // Fill login form with the same email and password
        WebElement loginEmailInput = driver.findElement(By.name("email"));
        loginEmailInput.sendKeys("richard@example.com");

        WebElement loginPasswordInput = driver.findElement(By.name("password"));
        loginPasswordInput.sendKeys("password123");

        // Click on the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/button"));
        loginButton.click();

        Thread.sleep(2000);
        
        // Identify and click the button/widget to change the theme to dark mode
        WebElement darkModeButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button"));
        darkModeButton.click();
        
        // Close the browser
        
        Thread.sleep(2000);
        
        // Click on the profile button
        WebElement profileButton1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/h4"));
        profileButton1.click();
        
        Thread.sleep(2000);
        
        // Click on the profile button
        WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/p"));
        home.click();
        
        Thread.sleep(3000);
    }
 
    @Test(priority=3)
    public void scrollAndLogoutTest1() throws InterruptedException {
        // Scroll down gradually
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
        long currentScroll = 0;
        long scrollIncrement = 100; // Adjust the scroll increment as needed

        while (currentScroll < scrollHeight) {
            js.executeScript("window.scrollTo(0, " + currentScroll + ")");
            Thread.sleep(50); // Adjust the sleep time for faster scrolling
            currentScroll += scrollIncrement;
        }

        // Scroll up gradually
        while (currentScroll > 0) {
            js.executeScript("window.scrollTo(0, " + currentScroll + ")");
            Thread.sleep(50); // Adjust the sleep time for faster scrolling
            currentScroll -= scrollIncrement;
        }
        
        Thread.sleep(2000);
    }
    
    @Test(priority=4)
    public void postUploadTest() throws InterruptedException {
    	
        // image click
        WebElement imageclick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/p"));
        imageclick.click();
        
        Thread.sleep(2000);
        
        // Upload an image
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/input"));
        fileInput.sendKeys("D:\\puria\\sem 6\\tietconnect1\\photos\\richard-branson23.jpg");
        
        Thread.sleep(2000);
        
        // Click on the "What's on your mind?" input field
        WebElement postInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/input"));
        postInput.sendKeys("My First Post");
        
        Thread.sleep(2000);

        // Click on the "Post" button
        WebElement postButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
        postButton.click();

        Thread.sleep(2000);
    }
    
    @Test(priority=5)
    public void scrollAndLogoutTest() throws InterruptedException {
        // Scroll down gradually
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
        long currentScroll = 0;
        long scrollIncrement = 100; // Adjust the scroll increment as needed

        while (currentScroll < scrollHeight) {
            js.executeScript("window.scrollTo(0, " + currentScroll + ")");
            Thread.sleep(50); // Adjust the sleep time for faster scrolling
            currentScroll += scrollIncrement;
        }

        // Scroll up gradually
        while (currentScroll > 0) {
            js.executeScript("window.scrollTo(0, " + currentScroll + ")");
            Thread.sleep(50); // Adjust the sleep time for faster scrolling
            currentScroll -= scrollIncrement;
        }
        
        Thread.sleep(2000);
        
        // Click on the profile button
        WebElement profileButton1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/h4"));
        profileButton1.click();
        
        Thread.sleep(2000);
        
        // Click on the profile button
        WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/p"));
        home.click();
        
        Thread.sleep(3000);
        
        //threedot
        WebElement threedot = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div"));
        threedot.click();
        
        Thread.sleep(2000);
        
        // Click on the logout button
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
        logoutButton.click();

        Thread.sleep(2000);
    }
    
    @Test(priority=6)
    public void loginWithWrongPasswordTest() throws InterruptedException {

        // Fill login form with the same email and wrong password
        WebElement loginEmailInput = driver.findElement(By.name("email"));
        loginEmailInput.sendKeys("puriaarush@gmail.com");

        WebElement loginPasswordInput = driver.findElement(By.name("password"));
        loginPasswordInput.sendKeys("wrongpassword");

        // Click on the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/button"));
        loginButton.click();

        Thread.sleep(2000);
    }

    @Test(priority=7)
    public void loginWithCorrectPasswordTest() throws InterruptedException {
    	
        // Fill login form with the same email and correct password
        WebElement loginEmailInput = driver.findElement(By.name("email"));
        loginEmailInput.sendKeys("puriaarush@gmail.com");

        WebElement loginPasswordInput = driver.findElement(By.name("password"));
        loginPasswordInput.sendKeys("aarush@123");

        // Click on the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/button"));
        loginButton.click();

        Thread.sleep(2000);
        
        // Identify and click the button/widget to change the theme to light mode
        WebElement lightModeButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button"));
        lightModeButton.click();
        
        Thread.sleep(2000);
        
        // Click on the profile button
        WebElement profileButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/h4"));
        profileButton.click();
        
        Thread.sleep(2000);

   	 //threedot
        WebElement threedot = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div"));
        threedot.click();
        
        Thread.sleep(2000);
        
        // Click on the logout button
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
        logoutButton.click();

        Thread.sleep(2000);
    }
    
    @Test(priority=8)
    public void deliberatelyFailingTest() throws InterruptedException {

        // Fill login form with the same email and password
        WebElement loginEmailInput = driver.findElement(By.name("email"));
        loginEmailInput.sendKeys("richard@example.com");

        WebElement loginPasswordInput = driver.findElement(By.name("password"));
        loginPasswordInput.sendKeys("password123");

        // Click on the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/button"));
        loginButton.click();

        // Throw an exception to deliberately fail the test case
        throw new AssertionError("Deliberately failing test case");
    }

    
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
