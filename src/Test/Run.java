package Test;

import Database.Database_CreateTable;
import Model.Model_Login;
import Model.Model_User;

public class Run {

    public static void main(String args[]) {
        
        
        Database_CreateTable createTable = new Database_CreateTable();
        createTable.CreateTable("user", new Model_User());
        createTable.CreateTable("login", new Model_Login());
        
        new View.View_Login().setVisible(true);
    }

}
