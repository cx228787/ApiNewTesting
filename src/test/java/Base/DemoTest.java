package Base;

import org.testng.annotations.Test;

public class DemoTest extends TestBase {

    @Test
    public void testwebsite(){
        driver.get("http://google.com");
    }
}
