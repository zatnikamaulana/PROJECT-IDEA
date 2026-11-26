package Com.zet.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarTransaksi extends JFrame{
    private JTable table1;
    private JPanel GuiTransaksi;
    private JButton kembaliButton;


    public DaftarTransaksi(){
        this.setContentPane(GuiTransaksi);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HalamanAdmin();
                dispose();
            }
        });
    }
}
