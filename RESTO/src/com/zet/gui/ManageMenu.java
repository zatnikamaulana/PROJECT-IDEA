package com.zet.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageMenu extends JFrame{
    private JTextField textFieldNama;
    private JTextField textFieldHarga;
    private JButton addButton;
    private JButton updateButton;
    private JTable tableManageMenu;
    private JPanel panelManageMenu;
    private JButton kembaliButton;

    public ManageMenu() {
        setContentPane(panelManageMenu);
        setTitle("Manage Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,520);
        setLocationRelativeTo(null);
        setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
