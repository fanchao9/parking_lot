import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ParkingLotDB";
        String user = "root";
        String password = "H7c654gh";
        return DriverManager.getConnection(url, user, password);
    }
}
