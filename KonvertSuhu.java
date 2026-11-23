import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KonvertSuhu extends JFrame implements ActionListener {

    JLabel labelCelsius;
    JLabel labelHasil;
    JTextField fieldCelsius;
    JButton tombolKonversi;

    public KonvertSuhu() {
        setTitle("Konverter Suhu");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel panelInput = new JPanel();
        panelInput.setLayout(new FlowLayout()); 

        labelCelsius = new JLabel("Celsius:");
        fieldCelsius = new JTextField(8);
        tombolKonversi = new JButton("Konversi ke Fahrenheit");
        labelHasil = new JLabel("Hasil akan tampil di sini", JLabel.CENTER);

        panelInput.add(labelCelsius);
        panelInput.add(fieldCelsius);
        panelInput.add(tombolKonversi);

        add(panelInput, BorderLayout.NORTH);
        add(labelHasil, BorderLayout.CENTER);

        tombolKonversi.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double celsius = Double.parseDouble(fieldCelsius.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            labelHasil.setText(celsius + " °C = " + fahrenheit + " °F");
        } catch (NumberFormatException ex) {
            labelHasil.setText("Masukkan angka yang valid!");
        }
    }

    public static void main(String[] args) {
        KonvertSuhu form = new KonvertSuhu();
        form.setVisible(true);
    }
}
