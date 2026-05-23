import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;

import java.text.NumberFormat;
import java.util.Locale;

public class converMoneda {

	private JFrame frame;
	private JTextField textDolar,textEuro,txt_M, txtRes;
	private JLabel lblDolar, lblEuro, lblMoneda, lblResultado;
	private JButton btnCopUsd, btnUsdCop, btnCopEu, btnEuCop, btnUsdEu, btnEuUsd;
	private final double TASA_USD= 3675.18, TASA_EUR = 4264.78;

        @SuppressWarnings("Convert2Lambda")
   public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        @Override
        @SuppressWarnings("CallToPrintStackTrace")
        public void run() {
            try {
                converMoneda window = new converMoneda();
                window.frame.setVisible(true);
                window.txt_M.requestFocusInWindow(); // agregar solo esta línea
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}

	//Create the application.
	public converMoneda() {
		initialize();
	}

	//Initialize the contents of the frame.

        @SuppressWarnings("Convert2Lambda")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblDolar = new JLabel("Valor Dolar");
		lblDolar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDolar.setBounds(50, 50, 80, 50);
		frame.getContentPane().add(lblDolar);

		lblEuro = new JLabel("Valor Euro");
		lblEuro.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEuro.setBounds(334, 50, 80, 50);
		frame.getContentPane().add(lblEuro);

		lblMoneda = new JLabel("Valor Moneda Origen");
		lblMoneda.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMoneda.setBounds(50, 150, 150, 50);
		frame.getContentPane().add(lblMoneda);

		btnCopUsd = new JButton("COP a USD");
		btnCopUsd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCopUsd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				convertir("COP_USD");
			}
		});
		btnCopUsd.setBounds(50, 265, 120, 25);
		frame.getContentPane().add(btnCopUsd);


		btnCopEu = new JButton("COP a EU");
		btnCopEu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCopEu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				convertir("COP_EUR");
			}
		});
		btnCopEu.setBounds(235, 265, 120, 25);
		frame.getContentPane().add(btnCopEu);

		btnUsdEu = new JButton("USD a EU");
		btnUsdEu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnUsdEu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				convertir("USD_EUR");
			}
		});
		btnUsdEu.setBounds(425, 265, 120, 25);
		frame.getContentPane().add(btnUsdEu);

		btnUsdCop = new JButton("USD a COP");
		btnUsdCop.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnUsdCop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				convertir("USD_COP");
			}
		});
		btnUsdCop.setBounds(50, 345, 120, 25);
		frame.getContentPane().add(btnUsdCop);

		btnEuCop= new JButton("EU a COP");
		btnEuCop.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEuCop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				convertir("EUR_COP");
			}
		});
		btnEuCop.setBounds(235, 345, 120, 25);
		frame.getContentPane().add(btnEuCop);

		btnEuUsd = new JButton("EU  a USD");
		btnEuUsd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEuUsd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				convertir("EUR_USD");
			}
		});
		btnEuUsd.setBounds(425, 345, 120, 25);
		frame.getContentPane().add(btnEuUsd);
		
		txt_M = new JTextField();
		txt_M.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txt_M.setBackground(new Color(255, 255, 255));
		txt_M.setBounds(210, 165, 105, 25);
		frame.getContentPane().add(txt_M);
		txt_M.setColumns(10);
		
		textDolar = new JTextField();
		textDolar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textDolar.setText(String.valueOf(TASA_USD));
		textDolar.setEditable(false);
		textDolar.setBackground(new Color(183, 255, 183));
		textDolar.setBounds(150, 65, 105, 25);
		frame.getContentPane().add(textDolar);
		textDolar.setColumns(10);
		
		textEuro = new JTextField();
		textEuro.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textEuro.setText(String.valueOf(TASA_EUR));
		textEuro.setEditable(false);
		textEuro.setBackground(new Color(183, 255, 183));
		textEuro.setBounds(440, 64, 105, 25);
		frame.getContentPane().add(textEuro);
		textEuro.setColumns(10);
		
		lblResultado = new JLabel("Resultado: ");
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblResultado.setBounds(334, 163, 80, 25);
		frame.getContentPane().add(lblResultado);
		
		txtRes = new JTextField();
		txtRes.setBackground(new Color(174, 255, 174));
		txtRes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRes.setBounds(440, 165, 105, 25);
		frame.getContentPane().add(txtRes);
		txtRes.setColumns(10);
		
	}
	private void convertir (String tipo) {
		double valor = Double.parseDouble(txt_M.getText());
		double res = 0;
		switch (tipo) {
		case "COP_USD" -> res = valor / TASA_USD;
		case "USD_COP" -> res = valor * TASA_USD;
		case "COP_EUR" -> res = valor / TASA_EUR;
		case "EUR_COP" -> res = valor * TASA_EUR;
		case "USD_EUR" -> res = (valor * TASA_USD) / TASA_EUR;
		case "EUR_USD" -> res = (valor * TASA_EUR) / TASA_USD;
		}
		NumberFormat formato = NumberFormat.getNumberInstance(Locale.of("es", "CO")); //Miles y decimales
		formato.setMinimumFractionDigits(2);
		formato.setMaximumFractionDigits(2);
		txtRes.setText(formato.format(res));
	}

}