import java.sql.*;

public class Query03 {

    //"workers" adında bir table oluşturup "worker_id, worker_name, worker_salary" sütunlarını ekleyin.

    //Table'a worker_address sütunu ekleyin.

    // workers table'ını silin.

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1) Driver Tanımla
        Class.forName("org.postgresql.Driver");


        //2)Database'e Bağlan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Elif3461");


        //Statment
        Statement st = con.createStatement();

        //"workers" adında bir table oluşturup "worker_id, worker_name, worker_salary" sütunlarını ekleyin.
       //String sql01 = "Create Table workers (worker_id Varchar(10), worker_name Varchar(20), worker_salary Int)";
       //st.execute(sql01);

        //Table'a worker_address sütunu ekleyin.
        //String sql02 = "Alter Table workers add worker_address varchar(50)";
        //st.execute(sql02);

        // workers table'ını silin.
        String sql03 = "Drop Table workers";
        st.execute(sql03);


        //execute() ==> Create, Drop, Alter table (DDL) için kullanılır.


    }

}
