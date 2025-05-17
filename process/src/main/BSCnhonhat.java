package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BSCnhonhat extends JFrame {

    private JTextField txtA, txtB;
    private JLabel lblKetQua;

    public BSCnhonhat() {
        setTitle("Tính BSCNN");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        txtA = new JTextField();
        txtB = new JTextField();
        lblKetQua = new JLabel("Kết quả: ");

        JButton btnTinh = new JButton("Tính BSCNN");

        add(new JLabel("Số a:"));
        add(txtA);
        add(new JLabel("Số b:"));
        add(txtB);
        add(btnTinh);
        add(new JLabel()); // để trống
        add(lblKetQua);

        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());

                    int bscnn = BSCNN(a, b);
                    lblKetQua.setText("BSCNN là: " + bscnn);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private int BSCNN(int a, int b) {
        return a * b / UCLN(a, b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BSCnhonhat().setVisible(true));
    }
}
