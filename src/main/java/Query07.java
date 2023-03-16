import pojos.Urun;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query07 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Elif3461"
        );

        Statement st = con.createStatement();


        //SORU: Urunler adında bir tablo olusturalım (id int, isim varchar(10), fiyat int)
        //String sql01 = "Create Table urunler(id int, isim varchar(10), fiyat int)";
        //st.executeQuery(sql01);

        List<Urun> kayitlar = new ArrayList<>();
        kayitlar.add(new Urun(100, "Laptop", 35.000));
        kayitlar.add(new Urun(101, "iPad", 25.000));
        kayitlar.add(new Urun(102, "MacBook", 55.000));
        kayitlar.add(new Urun(103, "AnaKart", 15.000));
        kayitlar.add(new Urun(104, "iMac", 15.000));
        kayitlar.add(new Urun(105, "iPhone", 45.000));

        //Çok mikarda data eklemek için PreparedStatment kullanmalıyız
        PreparedStatement tablo = con.prepareStatement("Insert into urunler Values(?, ?, ?)");

        for (Urun each : kayitlar) {
            tablo.setInt(1, each.getId());          //id alacak ::100
            tablo.setString(2, each.getIsim());     // isim alacak :: laptop
            tablo.setDouble(3, each.getFiyat());    //fiyat alacak ::35.000
            tablo.addBatch(); //bütün dataları birleştiriyor
        }
        tablo.executeBatch(); //tek seferde tüm dataları database'e gönderiyor


        //ResultSet rs = st.executeQuery(sql01); ==> Data almak için kullanırız o yüzden ResultSet kullanırız


    }

}
