import java.sql.*;

public class Query_Deneme03 {

    //isim = Faruk Sezai Ersöz, uyruk = Türkiye, mevki = Orta saha, yaş = 16 oyuncu ekle


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Driver
        Class.forName("org.postgresql.Driver");
        //Database
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "Elif3461"
        );
        //Statment
        Statement statement = connection.createStatement();

        //RESULT
        ResultSet resultSet = statement.executeQuery("Insert Into gs_kadro Values('Faruk Sezai Ersöz'," +
                "'Türkiye','Orta Saha',16)");

        while (resultSet.next()){
            resultSet.getString(1);
            resultSet.getString(2);
            resultSet.getString(3);
            resultSet.getInt(4);
        }

    }



}
