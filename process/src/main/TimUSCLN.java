package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimUSCLN extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnTim;
    private JLabel lblKetQua;

    public TimUSCLN() {
        setTitle("Tìm USCLN của 2 số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Canh giữa màn hình

        // Tạo các thành phần
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        btnTim = new JButton("Tìm USCLN");
        lblKetQua = new JLabel("Kết quả: ");

        // Bố cục giao diện
        setLayout(new GridLayout(4, 2, 5, 5));
        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(new JLabel(""));
        add(btnTim);
        add(lblKetQua);

        // Xử lý sự kiện
        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtSo1.getText());
                    int b = Integer.parseInt(txtSo2.getText());

                    int uscln = timUSCLN(a, b);
                    lblKetQua.setText("Kết quả: " + uscln);
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số nguyên hợp lệ");
                }
            }
        });
    }

    // Hàm tính USCLN (Ước số chung lớn nhất) sử dụng thuật toán Euclid
    private int timUSCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TimUSCLN().setVisible(true));
    }
}

