import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void firstTest01(){
        Assert.assertTrue(5<6);
    }

    @Test
    public void firstTest02(){
        Assert.assertTrue("Test Fail",5>4);
        //Test kaldığında mesaj belirttiğimiz mesajı alırız.
    }

    @Test
    public void firstTest03(){
        Assert.assertEquals("Sayılar Eşit değil","3","3");
    }
}
