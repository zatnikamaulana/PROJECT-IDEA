package com.zet.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerMenu extends JFrame {

    private JTable tableCustomerMenu;
    private DefaultTableModel menuTableModel;
    private JButton orderButton;
    private JButton totalHargaButton;
    private JPanel panelCustomer;
    private DefaultTableModel orderTableModel;
    private Label totalHargaLabel;

    public CustomerMenu() {
        setContentPane(panelCustomer);
        setTitle("Customer Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,520);
        setLocationRelativeTo(null);
        setVisible(true);

        menuTableModel = new DefaultTableModel(new Object[]{"Nama Customer", "Makanan"}, 0);
        totalHargaLabel = new Label("Total: Rp 0");

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tableCustomerMenu.getSelectedRow();

                if (selectedRow != -1) {
                    String namaCustomer = (String) menuTableModel.getValueAt(selectedRow, 0);
                    String makanan = (String) menuTableModel.getValueAt(selectedRow, 1);
                    String harga = getHargaMakanan(makanan);

                    orderTableModel.addRow(new Object[]{namaCustomer, makanan, harga});
                }
            }
        });
        totalHargaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungTotalHarga();
            }
        });
    }

    private  String getHargaMakanan(String NamaMakanan) {
        
        return null;
    }

    private void hitungTotalHarga() {
        double total = 0;
        for (int i = 0; i < orderTableModel.getRowCount(); i++) {
            total += Double.parseDouble((String) orderTableModel.getValueAt(i, 2));
        }
        totalHargaLabel.setText("Total: Rp" + total);
    }

}
