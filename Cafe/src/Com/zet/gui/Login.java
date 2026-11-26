package Com.zet.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends JFrame {
    private static final String URL  = "jdbc:mysql://localhost:3306/restoran/restoran" ;
    private static final String USER = "root";
    private static final String PASSWORD  = "";
    private JTextField tfName;
    private JTextField tfPassword;
    private JButton btnLogin;
    private JButton btnCustomer;
    private JPanel MainPanel;
    private  JPanel HalAdmin;


    public Login(){
        setContentPane(MainPanel);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(474,400);
        setLocationRelativeTo(null);
        setVisible(true);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfName.getText();
                String password = tfPassword.getText();
                if(tfName.getText().equals(username) && tfPassword.getText().equals(password)){
                    JOptionPane.showMessageDialog(null,"login berhasil");
                    HalamanAdmin halamanAdmin = new HalamanAdmin();
                    halamanAdmin.setVisible(true);
                    dispose();
                }else {
                    JOptionPane.showMessageDialog(null,"UserName dan Password Anda salah!! Kasihan deh loo awwkwkwkwkw");
                }

            }
        });

        btnCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Mari Kita lihat Menu Cafe");
                HalamanCustomer halamanCustomer = new HalamanCustomer();
                halamanCustomer.setVisible(true);
                dispose();
            }
        });
    }
    private static void executeSql(String sql) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement =  connection.createStatement();

            statement.executeUpdate(sql);

        } catch (Exception e) {

        }
    }
    private static ResultSet executeQuery(String query) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement =  connection.createStatement();

            return statement.executeQuery(query);


        } catch (Exception e) {
            return null;
        }
    }


    public static void main(String[]args){
        new Login();
    }
}
