package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{
    private static final String URL  = "jdbc:mysql://localhost:3306/loginpage" ;
    private static final String USER = "root";
    private static final String PASSWORD  = "";
    private JPanel DeskponePane;
    private JTextField tfName;
    private JTextField tfPassword;
    private JButton btnLogin;
    private JButton btnCustomer;
    //private JFrame frame;

    public LoginPage(){
        setTitle("Halaman Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(470,475));
        setLocationRelativeTo(null);
        setVisible(true);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = "Admin";
                String Password = "admin";
                if(tfName.getText().equals(userName) && tfPassword.getText().equals(Password)){
                    JOptionPane.showMessageDialog(LoginPage.this,"login berhasil");


                }else {
                    JOptionPane.showMessageDialog(null,"Username and password salah");
                }
            }
        });
    }
//    private static void executeSql(String sql) {
//        try {
//            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//
//            Statement statement =  connection.createStatement();
//
//            statement.executeUpdate(sql);
//
//        } catch (Exception e) {
//
//        }
//    }
//    private static ResultSet executeQuery(String query) {
//        try {
//            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//
//            Statement statement =  connection.createStatement();
//
//            return statement.executeQuery(query);
//
//
//        } catch (Exception e) {
//            return null;
//        }
//    }

}
