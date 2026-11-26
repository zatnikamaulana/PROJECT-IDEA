package dao;

import javax.swing.JOptionPane;
import java.sql.*;

public class DbOperations {
    public static void setDataDelete (String Query, String msg ){
        try{
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null,msg);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e,"message",JOptionPane.ERROR_MESSAGE);
        }
    }
}
