package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class daonguoc2so extends JFrame {

    private JTextField txtSo1, txtSo2;
    private JLabel lblKetQua1, lblKetQua2;

    public daonguoc2so() {
        setTitle("Đảo ngược 2 số");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        txtSo1 = new JTextField();
        txtSo2 = new JTextField();
        lblKetQua1 = new JLabel("Số 1 sau khi đảo: ");
        lblKetQua2 = new JLabel("Số 2 sau khi đảo: ");

        JButton btnDaoNguoc = new JButton("Đảo ngược");

        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(btnDaoNguoc);
        add(new JLabel()); // ô trống
        add(lblKetQua1);
        add(lblKetQua2);

        btnDaoNguoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int so1 = Integer.parseInt(txtSo1.getText());
                    int so2 = Integer.parseInt(txtSo2.getText());

                    int so1Dao = daoNguoc(so1);
                    int so2Dao = daoNguoc(so2);

                    lblKetQua1.setText("Số 1 sau khi đảo: " + so1Dao);
                    lblKetQua2.setText("Số 2 sau khi đảo: " + so2Dao);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private int daoNguoc(int n) {
        int dao = 0;
        while (n != 0) {
            dao = dao * 10 + n % 10;
            n /= 10;
        }
        return dao;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new daonguoc2so().setVisible(true));
    }
}
