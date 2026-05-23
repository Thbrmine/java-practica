import java.awt.*;
import javax.swing.*;


public class converMoneda extends JFrame {

    // tasas respecto al dolar
    double tasaCOP = 4150;
    double tasaEUR = 0.92;

    JTextField txtMonto = new JTextField("1000", 10);
    JComboBox<String> cmbOrigen  = new JComboBox<>(new String[]{"COP","USD","EUR"});
    JComboBox<String> cmbDestino = new JComboBox<>(new String[]{"COP","USD","EUR"});
    JLabel lblResultado = new JLabel("Resultado: ");

    public converMoneda() {
        setTitle("Conversor de Moneda");
        setSize(380, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        cmbDestino.setSelectedIndex(1);

        add(new JLabel("Monto:"));
        add(txtMonto);
        add(new JLabel("De:"));
        add(cmbOrigen);
        add(new JLabel("A:"));
        add(cmbDestino);

        JButton btnConvertir = new JButton("Convertir");
        add(btnConvertir);
        add(lblResultado);

        btnConvertir.addActionListener(e -> convertir());

        setVisible(true);
    }

    void convertir() {
        double monto;
        try {
            monto = Double.parseDouble(txtMonto.getText());
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingresa un número válido");
            return;
        }

        String origen  = (String) cmbOrigen.getSelectedItem();
        String destino = (String) cmbDestino.getSelectedItem();

        // primero pasar a USD
        double enUSD;
        enUSD = switch (origen) {
            case "COP" -> monto / tasaCOP;
            case "EUR" -> monto / tasaEUR;
            default -> monto;
        };

        // luego de USD a destino
        double resultado;
        resultado = switch (destino) {
            case "COP" -> enUSD * tasaCOP;
            case "EUR" -> enUSD * tasaEUR;
            default -> enUSD;
        };

        String formato = "COP".equals(destino) ?
            String.format("%.0f", resultado) :
            String.format("%.2f", resultado);

        lblResultado.setText(destino + " " + formato);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            converMoneda calc = new converMoneda();
            calc.setVisible(true);
        });
    }
}