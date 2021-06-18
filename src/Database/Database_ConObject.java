package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database_ConObject {

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger("Error : " + Database_ConObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Database_ConObject() {

    }

    public Database_ConObject(Connection connection) {
        connection = getConnection();
    }
}
