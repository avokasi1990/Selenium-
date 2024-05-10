package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        WebElement email =driver.findElement(By.xpath("//input[@id=name 'email'])"));
        email.sendKeys("asessd@gmail.com");


    }
}
