import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class miniCalculadora extends JFrame implements ActionListener {

        JTextField pantalla = new JTextField("0");
        double num1 = 0;
        String operador = "";
        boolean nuevaEntrada = false;

        public miniCalculadora() {
            setTitle("Calculadora");
            setSize(300, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            pantalla.setFont(new Font("Arial", Font.PLAIN, 28));
            pantalla.setEditable(false);
            pantalla.setHorizontalAlignment(JTextField.RIGHT);
            add(pantalla, BorderLayout.NORTH);

            JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
            String[] botones = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "C","0","=","+"
            };

            ActionListener listener = this;
            for (String b : botones) {
                JButton btn = new JButton(b);
                btn.setFont(new Font("Arial", Font.PLAIN, 20));
                btn.addActionListener(listener);
                panel.add(btn);
            }

            add(panel, BorderLayout.CENTER);
            setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if (cmd.equals("C")) {
                pantalla.setText("0");
                num1 = 0;
                operador = "";
                nuevaEntrada = false;
                return;
            }

            if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
                num1 = Double.parseDouble(pantalla.getText());
                operador = cmd;
                nuevaEntrada = true;
                return;
            }

            if (cmd.equals("=")) {
                double num2 = Double.parseDouble(pantalla.getText());
                double resultado = 0;
                if (operador.equals("+")) resultado = num1 + num2;
                if (operador.equals("-")) resultado = num1 - num2;
                if (operador.equals("*")) resultado = num1 * num2;
                if (operador.equals("/")) {
                    if (num2 == 0) {
                        pantalla.setText("Error");
                        return;
                    }
                    resultado = num1 / num2;
                }
                // mostrar sin decimales si es numero entero
                if (resultado == (int) resultado)
                    pantalla.setText(String.valueOf((int) resultado));
                else
                    pantalla.setText(String.valueOf(resultado));
                nuevaEntrada = true;
                return;
            }

            // es un numero
            if (nuevaEntrada) {
                pantalla.setText(cmd);
                nuevaEntrada = false;
            } else {
                if (pantalla.getText().equals("0"))
                    pantalla.setText(cmd);
                else
                    pantalla.setText(pantalla.getText() + cmd);
            }
        }
        public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            miniCalculadora calc = new miniCalculadora();
            calc.setVisible(true);
        });
    }
}
