package com.zet.gui;

import javax.swing.*;
import java.awt.*;


public class Login extends  JFrame{
    private JPanel LoginPage;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel HalamanLogin;
    private JFrame frame;

    public Login(){
        frame = new JFrame("Halaman Login");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250,200));
        frame.setResizable(false);

        frame.add(LoginPage);

        frame.pack();
        frame.setLocation(null);
        frame.setVisible(true);
    }

}

