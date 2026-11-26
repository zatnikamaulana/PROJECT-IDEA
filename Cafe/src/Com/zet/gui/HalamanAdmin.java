package Com.zet.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanAdmin extends JFrame{
    private JButton LihatMenu;
    private JButton LihatTransaksi;
    private JPanel HalAdmin;
    private JButton kembaliButton;


    public HalamanAdmin(){
        setContentPane(HalAdmin);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,520);
        setLocationRelativeTo(null);
        setVisible(true);


        LihatMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageMenu manageMenu = new ManageMenu();
                manageMenu.setVisible(true);
                dispose();

            }
        });
        LihatTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"OKe MAri kita lihat Transaksi");
                DaftarTransaksi daftarTransaksi = new DaftarTransaksi();
                daftarTransaksi.setVisible(true);
                dispose();
            }
        });
        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();

            }
        });
    }
}
