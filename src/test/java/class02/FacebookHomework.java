package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomework {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.facebook.com/");


        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Zara");
        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys("Isa");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("qwer1990@gamail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("qwer1990@gamail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Baby4!");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_month")).sendKeys("November");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_day")).sendKeys("30");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        Thread.sleep(3000);
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(9000);
        driver.quit();



}}
