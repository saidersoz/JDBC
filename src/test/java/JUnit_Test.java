import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.Assert;
import org.junit.Test;

import static Utilities.DataBaseUtility.*;

public class JUnit_Test {

    @Test
    public void test01(){
        createConnection();
        String sql01 = "Select * From ogrenciler";
        System.out.println(getColumnData(sql01, "ogrenci_ismi"));
        Assert.assertTrue("Database'de kayıt bulunamadı !",
                getColumnData(sql01,"ogrenci_ismi").contains("Derya Soylu"));


        Assert.assertTrue("Database'de Kayıt Bulunamadı",
                getColumnData(sql01,"ogreci_ismi").contains("Ahmet Aslan"));
        closeConnection();
    }


    @Test
    public void test02(){
        createConnection();
        Assert.assertTrue("Database'de Kayıt Bulunamadı",
                getColumnData("Select * From ogrenciler","okul_no").contains(118));

        closeConnection();
    }
}
