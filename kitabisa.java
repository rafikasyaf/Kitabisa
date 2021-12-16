import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitabisa{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kitabisa.com/");
        driver.findElement(By.xpath("//input[@class='style__LargeListContent-sc-__sc-kwu31b-3 hLfuPe']")).click();
        driver.findElement(By.id("campaign-detail_button_donasi-sekarang")).click();
        driver.findElement(By.id("contribute_inputfield_amount-donation")).sendKeys("10000");
        driver.findElement(By.id("contribute_button_lanjutkan-pembayaran")).click();
        driver.findElement(By.id("contribute_button_pilih-metode-pembayaran")).click();
        driver.FindElement(By.xpath("//div[@class='style__InfoWrapper-sc-tuwc7v-17 fImXkK']/[contains(text()='Transfer BCA')]")).click();
        driver.findElement(By.name("fullname")).sendKeys("rafika");
        driver.findElement(By.name("username")).sendKeys("rafikasyafaatus@gmail.com");
        driver.findElement(By.id("contribute_button_lanjutkan-pembayaran")).click();
        driver.findElement(By.xpath("//input[@class='bg-white border border-cerulean50 rounded text-cerulean50 font-bold w-full p-2']")).click();
        driver.quit();
    }
}
