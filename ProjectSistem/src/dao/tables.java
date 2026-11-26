package dao;

import javax.swing.*;

public class tables {
    public static void main(String[]args){
        try{
            String userTables = "create table user (id int AUTO_INCREMENT primary key, name varchar (255),sandi varchar(255))";
            DbOperations.setDataDelete(userTables,"User Table Created SUCCESSFULLY");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
