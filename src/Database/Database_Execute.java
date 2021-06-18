package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database_Execute {

    Connection connection = new Database_ConObject().getConnection();
    Statement statement;

    public Database_Execute() {
    }

    public ResultSet Query(String sql) {
        try {
            System.out.println(sql);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(Database_Execute.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void Close() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database_Execute.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
