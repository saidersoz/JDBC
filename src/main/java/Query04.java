import java.sql.*;

public class Query04 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "Elif3461");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from ogrenciler");

        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println("Sütun Sayısı : " + rsmd.getColumnCount());
        System.out.println("1.Sütun ismi : " + rsmd.getColumnName(1));
        System.out.println("2.Sütun ismi : " + rsmd.getColumnName(2));
        System.out.println("3.Sütun ismi : " + rsmd.getColumnName(3));
        System.out.println("4.Sütun ismi : " + rsmd.getColumnName(4));

        System.out.println("Tablo İsmi : "+rsmd.getTableName(1));

        System.out.println(rsmd.getColumnType(1));
        System.out.println(rsmd.getColumnType(2));

    }

}



