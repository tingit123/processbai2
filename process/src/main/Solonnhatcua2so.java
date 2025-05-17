package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solonnhatcua2so extends JFrame {

    private JTextField txtSo1, txtSo2;
    private JLabel lblKetQua;

    public Solonnhatcua2so() {
        setTitle("Tìm số lớn nhất");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        txtSo1 = new JTextField();
        txtSo2 = new JTextField();
        lblKetQua = new JLabel("Kết quả: ");

        JButton btnSoSanh = new JButton("So sánh");

        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(btnSoSanh);
        add(lblKetQua);

        btnSoSanh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double max = Math.max(so1, so2);
                    lblKetQua.setText("Số lớn nhất: " + max);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Solonnhatcua2so().setVisible(true));
    }
}
