package Database;

import Interface.Interface_CreaTable;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database_CreateTable implements Interface_CreaTable {

    @Override
    public boolean CreateTable(String tableName, Object data) {

        try {
            String sql = "Create Table tbl_" + tableName + "(";

            String lastField = "";
            for (Field field : data.getClass().getDeclaredFields()) {
                lastField = field.getName();
            }

            for (Field field : data.getClass().getDeclaredFields()) {
                String inc = "INTEGER PRIMARY KEY AUTOINCREMENT";
                String type = "TEXT";

                if (field.getName().equals("Id")) {
                    sql += field.getName() + " " + inc + ",";
                    continue;
                }

                if (field.getType().toString().equals("int")) {
                    type = "INTEGER";
                }
                sql += field.getName() + " " + type + ",";

                if (field.getName().equals(lastField)) {
                    sql = sql.substring(0, sql.length() - 1);
                    sql += ")";
                }

            }
            System.out.println(sql);
            Connection connection = new Database_ConObject().getConnection();
            Statement statement = connection.createStatement();
            //gecici olarak bastırıldı
            //  ResultSet resultSet = statement.executeQuery("Select name From sqlite_master Where name='"+tableName+"'");

            statement.executeQuery(sql);

            statement.close();
            connection.close();

            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(Db_CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

}
