package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimSoNhoNhat extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnTim;
    private JLabel lblKetQua;

    public TimSoNhoNhat() {
        setTitle("Tìm Số Nhỏ Nhất");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Canh giữa màn hình

        // Khởi tạo thành phần
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        btnTim = new JButton("Tìm số nhỏ nhất");
        lblKetQua = new JLabel("Kết quả: ");

        // Sắp xếp giao diện
        setLayout(new GridLayout(4, 2, 5, 5));
        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(new JLabel(""));
        add(btnTim);
        add(lblKetQua);

        // Xử lý sự kiện khi nhấn nút
        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());

                    double min = Math.min(so1, so2);
                    lblKetQua.setText("Kết quả: " + min);
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TimSoNhoNhat().setVisible(true));
    }
}

