package main;

import javax.swing.*;
import java.awt.event.*;

public class Giamdan extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnSapXep, btnXoa;

    public Giamdan() {
        setTitle("Sắp xếp 2 số theo thứ tự giảm dần");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(140, 30, 200, 25);
        add(txtSo1);

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(140, 70, 200, 25);
        add(txtSo2);

        btnSapXep = new JButton("Sắp xếp");
        btnSapXep.setBounds(50, 110, 120, 30);
        add(btnSapXep);

        btnXoa = new JButton("Xóa");
        btnXoa.setBounds(200, 110, 120, 30);
        add(btnXoa);

        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 100, 25);
        add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(140, 160, 200, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);

        // Xử lý nút "Sắp xếp"
        btnSapXep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int so1 = Integer.parseInt(txtSo1.getText());
                    int so2 = Integer.parseInt(txtSo2.getText());

                    if (so1 >= so2) {
                        txtKetQua.setText(so1 + " , " + so2);
                    } else {
                        txtKetQua.setText(so2 + " , " + so1);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        // Xử lý nút "Xóa"
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtSo1.setText("");
                txtSo2.setText("");
                txtKetQua.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Giamdan().setVisible(true);
    }
}
