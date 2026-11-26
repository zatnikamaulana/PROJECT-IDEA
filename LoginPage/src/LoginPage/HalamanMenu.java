package LoginPage;

import javax.swing.*;
import java.awt.*;


public class HalamanMenu {
    private JButton btnMenu;
    private JButton btnTransaksi;
    private JPanel HalamanMenu;
    private JFrame frame;

    public HalamanMenu(){
        frame = new JFrame("Halaman Menu");
        frame.setPreferredSize(new Dimension(470,475));
        frame.setResizable(true);
        frame.add(HalamanMenu);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

