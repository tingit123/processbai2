package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KiemTraDoiXung extends JFrame {
    private JTextField txtSo, txtKetQua;
    private JButton btnKiemTra;

    public KiemTraDoiXung() {
        setTitle("Kiểm tra số đối xứng");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa màn hình

        // Các thành phần
        JLabel lblSo = new JLabel("Nhập số:");
        JLabel lblKetQua = new JLabel("Kết quả:");

        txtSo = new JTextField(10);
        txtKetQua = new JTextField(20);
        txtKetQua.setEditable(false);

        btnKiemTra = new JButton("Kiểm tra");

        // Gắn sự kiện
        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String so = txtSo.getText().trim();
                    if (!so.matches("\\d+")) {
                        txtKetQua.setText("Vui lòng nhập số nguyên dương");
                        return;
                    }

                    String daoNguoc = new StringBuilder(so).reverse().toString();
                    if (so.equals(daoNguoc)) {
                        txtKetQua.setText("Là số đối xứng");
                    } else {
                        txtKetQua.setText("Không phải số đối xứng");
                    }
                } catch (Exception ex) {
                    txtKetQua.setText("Lỗi kiểm tra");
                }
            }
        });

        // Bố cục giao diện
        setLayout(new GridLayout(3, 2, 10, 10));
        add(lblSo); add(txtSo);
        add(lblKetQua); add(txtKetQua);
        add(new JLabel()); add(btnKiemTra);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KiemTraDoiXung();
    }
}
