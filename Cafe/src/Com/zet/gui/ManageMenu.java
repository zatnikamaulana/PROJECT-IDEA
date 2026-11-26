package Com.zet.gui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ManageMenu extends JFrame{
    private static final String URL  = "jdbc:mysql://localhost:3306/restoran" ;
    private static final String USER = "root";
    private static final String PASSWORD  = "";
    private JButton tambahButton;
    private JTable jTableMenu;
    private JPanel DaftarMenu;
    private JButton hapusButton;
    private JButton editButton;
    private JTextField textFieldNama;
    private JTextField textFieldHarga;
    private JButton kembaliButton;
    private JTextField textFieldCustomer;
    private JScrollPane scrollpane;
    private String selectedNama = "";
    private DefaultTableModel defaultTableModel = new DefaultTableModel();

    public ManageMenu(){
        this.setContentPane(DaftarMenu);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        refreshTable(
                getMENU()
        );

        this.jTableMenu.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        int row = jTableMenu.getSelectedRow();

                        if (row < 0)
                            return;

                        String nama = jTableMenu.getValueAt(row,0).toString();

                        if (selectedNama.equals(nama))
                            return;

                        selectedNama = nama;

                        String harga = jTableMenu.getValueAt(row,1).toString();

                        textFieldNama.setText(nama);
                        textFieldHarga.setText(harga);
                    }
                }
        );
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String harga = textFieldHarga.getText();

                Menu menu = new Menu();
                menu.setNama(nama);
                menu.setHarga(Integer.valueOf(harga));

                insertMENU(menu);
                refreshTable(getMENU());
            }

        });

        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                deleteMENU(nama);
                refreshTable(getMENU());
            }
        });
    }

    public void refreshTable(List<Menu> arrayListMenu){
        Object [][] Data = new Object[arrayListMenu.size()][2];

        for (int i = 0; i < arrayListMenu.size(); i++){
            Data [i] = new Object[]{
                    arrayListMenu.get(i).getNama(),
                    arrayListMenu.get(i).getHarga()
            };
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(
                Data,
                new String[]{"Nama Menu", "Harga"}
        );
        jTableMenu.setModel(defaultTableModel);
    }
    private static void executeSql(String sql) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement =  connection.createStatement();

            statement.executeUpdate(sql);

        } catch (Exception e) {

        }
    }

    private static ResultSet executeQuery() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement =  connection.createStatement();

            return statement.executeQuery("SELECT * FROM menu");


        } catch (Exception e) {
            return null;
        }
    }


    private static List<Menu> getMENU() {
        List<Menu> arrayListMenu = new ArrayList<>();

        ResultSet resultSet = executeQuery();

        try {
            while (resultSet.next()) {
                String nama = resultSet.getString("nama");
                String harga = resultSet.getString("harga");


                System.out.print(nama);
                System.out.print(harga);
                System.out.println();

                Menu menu = new Menu();
                menu.setNama(nama);
                menu.setHarga(Integer.valueOf(harga));

                arrayListMenu.add(menu);

            }
        }catch (Exception e) {
            return null;
        }

        return arrayListMenu;
    }
    private static void insertMENU(Menu menu) {
//        String s = STR."INSERT INTO `menu` ( nama, harga)";
        String sql = "insert into mahasiswa values (" +
                "'" + menu.getNama() + "', " +
                "'" + menu.getHarga() + "')";


        executeSql(sql);
    }
    private static void deleteMENU(String nama) {
        String sql = STR."delete from menu Where nama = '\{nama}'";

        executeSql(sql);
    }
}
