import java.sql.*;

public class Query_Deneme02 {

// Uyruğu türk olan futbolcuları istele

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
        //Result
        ResultSet veri = statement.executeQuery("Select * From gs_kadro Where uyruk = 'Türkiye'");
        //Data alma
        while (veri.next()){
            System.out.println(veri.getString(1));
            System.out.println(veri.getString(2));
            System.out.println(veri.getString(3));
            System.out.println(veri.getInt(4));
        }


    }

}
