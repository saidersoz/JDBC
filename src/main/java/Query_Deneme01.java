import java.sql.*;

public class Query_Deneme01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1) Driver Tanımla
        Class.forName("org.postgresql.Driver");


        //2)Database'e Bağlan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "Elif3461");


        //Statment
        Statement st = con.createStatement();

        //ResutSet
        ResultSet veri = st.executeQuery("select * from gs_kadro");

        //Dataları Al
        while (veri.next()){
            System.out.println(veri.getString(1)+ " | "+
                    veri.getString(2) + " | " +
                    veri.getString(3)+ " | "+
                    veri.getInt(4));
        }

        //Bağlantıları Kapatma
        con.close();
        st.close();
        veri.close();
    }

}
