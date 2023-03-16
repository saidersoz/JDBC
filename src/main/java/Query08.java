import pojos.Doctor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query08 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Elif3461"
        );
        Statement st = con.createStatement();


        //Doktors tablosunu oluşturun
        /// String sql01 = "Create Table doctors (id int, isim varchar(30), bolum varchar(20), ucret int)";
        /// st.executeQuery(sql01);

        //Pojo Class kullanarak tabloya data ekleyiniz
        List<Doctor> kayitlar = new ArrayList<>();

            kayitlar.add(new Doctor(20,"Ali Can","kafa",500));
            kayitlar.add(new Doctor(21,"Ali Can","Beyin",800));
            kayitlar.add(new Doctor(22,"Ali Can","Ayak",400));
            kayitlar.add(new Doctor(23,"Ali Can","Röntgen",600));
            kayitlar.add(new Doctor(24,"Ali Can","xxxx",500));
            kayitlar.add(new Doctor(25,"Ali Can","Cocuk",700));
            kayitlar.add(new Doctor(26,"Ali Can","Kalp",800));
            kayitlar.add(new Doctor(27,"Ali Can","Psikoloji",600));
            kayitlar.add(new Doctor(28,"Ali Can","KBB",700));
            kayitlar.add(new Doctor(29,"Ali Can","Cildiye",300));

            PreparedStatement data = con.prepareStatement("Insert into doctors Values (?, ?, ?, ?)");

        for (Doctor each : kayitlar) {
            data.setInt(1,each.getId());
            data.setString(2,each.getIsim());
            data.setString(3, each.getBolum());
            data.setDouble(4,each.getUcret());
            data.addBatch();
        }
        data.executeBatch();
        con.close();
        data.close();

    }
}
