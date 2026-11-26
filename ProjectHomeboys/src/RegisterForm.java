import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegisterForm extends JDialog{
    private JTextField tfNama;
    private JTextField tfEmail;
    private JTextField tfAdress;
    private JTextField tfPhone;
    private JTextField pfPassword;
    private JTextField pfConfirmPassword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel registerPanel;

    public RegisterForm(JFrame parent){
        super(parent);
        setTitle("Create a new account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private void registerUser() {
        String nama = tfNama.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAdress.getText();
        String password = String.valueOf(pfPassword.getPasword());
        String confirmPassword = String.valueOf(pfPassword.getPassword());

        if(nama.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;

        }
        user = addUserToDatabase (nama,email,phone,address,password);
        if(user != null){
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "Failed to register new user",
                    "try again",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public User user;
    private User addUserToDatabase (String nama, String email, String phone , String address, String Password){
        User user = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/homeboys";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL , USERNAME , PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users (nama , email, phone , address, password)"+
                    "VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            PreparedStatement.setString(1,nama);
            PreparedStatement. setString(2,email);
            PreparedStatement.setString(3,phone);
            PreparedStatement.setString(4,address);
            PreparedStatement.setString(5,Password);

            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0){
                user = new User();
                user.nama = nama;
                user.email = email;
                user.phone = phone;
                user.address = address;
                user.password = Password;
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static void main(String[]args){
        RegisterForm myForm = new RegisterForm(null);
        User user = myForm.user;
        if(user != null){
            System.out.println("suskes"+user.nama);
        }
        else{
            System.out.printf("Registrasi canceled");
        }
    }


}
