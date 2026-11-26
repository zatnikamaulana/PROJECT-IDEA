package com.manajemen.sistem;

import Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dao.UserDao;

public class Sigup extends javax.swing.JFrame {

    public Sigup(){
        btnSimpan.setEnabled(false);

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                user.setName(textFieldName.getText());
                user.setSandi(textFieldKatasandi.getText());
                UserDao.save(user);
            }
        });
    }
    private JTextField textFieldName;
    private JPanel panel1;
    private JTextField textFieldKatasandi;
    private JButton btnSimpan;
    private JButton btnLogin;
    private JLabel name;
    private JLabel sandi;
    private JButton customerButton;

}
