package Latihan;

import javax.swing.*;
import java.awt.event.*;

public class guiSederhana {
    public static void main(String[] args) {
        
        // Membuat frame (jendela)
        JFrame frame = new JFrame("Aplikasi Sederhana");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label
        JLabel label = new JLabel("Masukkan Nama:");
        label.setBounds(20, 20, 120, 25);
        frame.add(label);

        // Text field
        JTextField textField = new JTextField();
        textField.setBounds(140, 20, 120, 25);
        frame.add(textField);

        // Button
        JButton button = new JButton("Submit");
        button.setBounds(90, 60, 100, 30);
        frame.add(button);

        // Label hasil
        JLabel hasil = new JLabel("");
        hasil.setBounds(20, 100, 250, 25);
        frame.add(hasil);

        // Event saat tombol diklik
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                hasil.setText("Halo, " + nama + "!");
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}