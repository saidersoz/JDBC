import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.DataBaseUtility.*;

public class TestNG_Test {

    @Test
    public void test01(){
        createConnection();

        String sql01 = "Select * From ogrenciler";
        Assert.assertTrue(getColumnData(sql01,"ogrenci_ismi").contains("Derya Soylu"),
                "Database'de kayıt bulunamadı");

    }//Test01 son satırı


    @Test
    public void test02(){

        Assert.assertTrue(getColumnData("Select * From ogrenciler","okul_no").contains(120),
                "Database'de kayıt bulunamadı");

        closeConnection();
    }
}
