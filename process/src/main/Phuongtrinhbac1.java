package main;

import javax.swing.*;
import java.awt.event.*;

public class Phuongtrinhbac1 extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnSolve, btnClear;

    public Phuongtrinhbac1() {
        setTitle("Giải phương trình bậc nhất: ax + b = 0");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Hệ số a:");
        lblA.setBounds(30, 30, 100, 25);
        add(lblA);

        txtA = new JTextField();
        txtA.setBounds(130, 30, 200, 25);
        add(txtA);

        JLabel lblB = new JLabel("Hệ số b:");
        lblB.setBounds(30, 70, 100, 25);
        add(lblB);

        txtB = new JTextField();
        txtB.setBounds(130, 70, 200, 25);
        add(txtB);

        btnSolve = new JButton("Giải");
        btnSolve.setBounds(50, 110, 120, 30);
        add(btnSolve);

        btnClear = new JButton("Xóa");
        btnClear.setBounds(200, 110, 120, 30);
        add(btnClear);

        JLabel lblResult = new JLabel("Kết quả:");
        lblResult.setBounds(30, 160, 100, 25);
        add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(130, 160, 200, 25);
        txtResult.setEditable(false);
        add(txtResult);

        // Sự kiện nút "Giải"
        btnSolve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    
                    if (a == 0) {
                        if (b == 0) {
                            txtResult.setText("Phương trình vô số nghiệm");
                        } else {
                            txtResult.setText("Phương trình vô nghiệm");
                        }
                    } else {
                        double x = -b / a;
                        txtResult.setText("Nghiệm x = " + String.format("%.2f", x));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        // Sự kiện nút "Xóa"
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtResult.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Phuongtrinhbac1().setVisible(true);
    }
}
