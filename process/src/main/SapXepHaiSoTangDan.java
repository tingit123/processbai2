package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SapXepHaiSoTangDan extends JFrame {
    private JTextField txtA, txtB, txtKetQua;
    private JButton btnSapXep;

    public SapXepHaiSoTangDan() {
        setTitle("Sắp xếp hai số theo thứ tự tăng dần");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        // Tạo các thành phần giao diện
        JLabel lblA = new JLabel("Nhập số a:");
        JLabel lblB = new JLabel("Nhập số b:");
        JLabel lblKetQua = new JLabel("Kết quả:");

        txtA = new JTextField(10);
        txtB = new JTextField(10);
        txtKetQua = new JTextField(20);
        txtKetQua.setEditable(false);

        btnSapXep = new JButton("Sắp xếp");

        // Gắn sự kiện cho nút
        btnSapXep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());

                    if (a <= b) {
                        txtKetQua.setText(a + ", " + b);
                    } else {
                        txtKetQua.setText(b + ", " + a);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Bố trí giao diện
        setLayout(new GridLayout(4, 2, 10, 10));
        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(lblKetQua); add(txtKetQua);
        add(new JLabel()); add(btnSapXep);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SapXepHaiSoTangDan();
    }
}
