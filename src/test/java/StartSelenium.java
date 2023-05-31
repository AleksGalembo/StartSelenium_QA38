import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSelenium {

    WebDriver wd;
    @BeforeTest
    public void precondition (){

        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }
}
