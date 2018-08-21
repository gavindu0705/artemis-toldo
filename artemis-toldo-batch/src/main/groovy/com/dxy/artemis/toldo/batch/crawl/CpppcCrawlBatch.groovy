package com.dxy.artemis.toldo.batch.crawl

import com.dxy.artemis.toldo.batch.http.Https
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

class CpppcCrawlBatch {

    static Https HTTPS = new Https();

    public static void main(String[] args) {
        WebDriver webDriver = getChromeDriver();
        webDriver.get("http://www.cpppc.org/");
//        webDriver.findElement()
    }

    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
        //创建一个　ChromeDriver 接口
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("D://chromedriver.exe")).usingAnyFreePort().build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
    }




}
