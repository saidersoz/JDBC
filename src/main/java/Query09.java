import static Utilities.DataBaseUtility.*;

public class Query09 {

    public static void main(String[] args) {

        /*
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Elif3461"
        );
         */

        createConnection();

        String sql01= "Select * From ogrenciler";
        System.out.println("sütun isimleri : "+getColumnNames(sql01));
        System.out.println("Ogrenci isimleri : "+getColumnData(sql01, "ogrenci_ismi"));
        System.out.println("okul_no : "+getColumnData(sql01, "okul_no"));
        System.out.println("sinif : "+getColumnData(sql01, "sinif"));
        System.out.println("cinsiyet : "+getColumnData(sql01, "cinsiyet"));

        closeConnection();

    }

}
