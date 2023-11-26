import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
//https://www.youtube.com/watch?v=IGaAZWmqZEE&t=664s&ab_channel=OlehPendrak//

abstract public class Cat {
    public void SetUp(){
        WebDriverManager.chromedriver().setup();//Подготовка всех настроек для браузера//
        Configuration.browser="chrome";
        Configuration.driverManagerEnabled=true;//Доказать что у нас есть библиотека Вебдрайвер//
        Configuration.browserSize="1920*1080";
        Configuration.headless=false;//будем ли мы видеть сам бразуер при выполнении теста//
    }

    @BeforeAll// методы, которые выполняются перед тестами, обозначаются аннотацией бефоре с собакой//

    public void init() {
        SetUp();

    }

}
