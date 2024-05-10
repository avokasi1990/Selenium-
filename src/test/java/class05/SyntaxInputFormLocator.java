package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxInputFormLocator {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver =new ChromeDriver();

            driver.get("https://syntaxprojects.com/input-form-locator.php");


            driver.manage().window().maximize();

            driver.findElement(By.name("first_name")).sendKeys("Zara");
            Thread.sleep(3000);
            driver.findElement(By.name("last_name")).sendKeys("Isa");
            Thread.sleep(3000);
            driver.findElement(By.name("email")).sendKeys("qwer1990@gamail.com");
            Thread.sleep(3000);
            driver.findElement(By.id("submit_button")).click();
            Thread.sleep(9000);
            driver.quit();



        }}

