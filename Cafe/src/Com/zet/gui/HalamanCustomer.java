package Com.zet.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanCustomer extends JFrame {
    private JPanel HalCstmr;
    private JButton kembaliButton;
    private JTextField tfNameCustomer;
    private JButton orderButton;
    private JButton hargaTotalButton;
    private JTable tableCustomer;


    public HalamanCustomer(){
        setContentPane(HalCstmr);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,520);
        setLocationRelativeTo(null);
        setVisible(true);

        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfNameCustomer.getText();
                JOptionPane.showMessageDialog(null,"Terima Kasih " + nama + "");

            }
        });
    }

}
