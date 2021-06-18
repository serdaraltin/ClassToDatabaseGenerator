package Controller;

import Interface.Interface_Controller;
import Model.Model_Login;
import javax.swing.JTable;
import Database.Database_Execute;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Controller_Login implements Interface_Controller<Model_Login> {

    String tableName = "login";
    Database_Execute DbExecute = new Database_Execute();

    @Override
    public boolean Control(Model_Login data) {
        try {
            String sql = "Select * From tbl_login Where userName='" + data.getUserName() + "' and password='" + new Controller_HashGenerator().generateMD5(data.getPassword()) + "'";
            ResultSet resultSet = DbExecute.Query(sql);
            if (resultSet.next()) {
                DbExecute.Close();
                return true;
            }
            DbExecute.Close();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean Add(Model_Login data) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean Update(Model_Login data) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean Delete(Model_Login data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Model_Login Get(Model_Login data) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void List(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int GetId(Model_Login data) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void GetList(JTable table) {
        try {
            String sql = "Select * From tbl_" + tableName;
            ResultSet resultSet = DbExecute.Query(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            defaultTableModel.setRowCount(0);

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                defaultTableModel.addColumn(metaData.getColumnName(i));
            }
            table.setModel(defaultTableModel);
            while (resultSet.next()) {
                ArrayList<Object> rowElement = new ArrayList<Object>();
                Object[] element = new Object[metaData.getColumnCount()];
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    element[i - 1] = resultSet.getString(i);
                }

                defaultTableModel.addRow(element);
            }
            resultSet.close();
            DbExecute.Close();

        } catch (SQLException ex) {
            Logger.getLogger(Controller_Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<String[]> GetArrayList() {
        try {
            String sql = "Select * From tbl_" + tableName;
            ResultSet resultSet = DbExecute.Query(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();
            ArrayList<String[]> data = new ArrayList<String[]>();
            while (resultSet.next()) {
                int columnCount = metaData.getColumnCount();
                String[] row = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    for (int j = 0; j <= columnCount; j++) {
                        row[i - 1] = resultSet.getString(i);
                    }
                }
                data.add(row);
            }
            DbExecute.Close();
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void Check(Model_Login data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   

}
