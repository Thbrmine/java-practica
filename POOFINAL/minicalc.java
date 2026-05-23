import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class minicalc {

	private JFrame frame;
	private JTextField txt_A, txt_B, txtRes;
	private JLabel lblA, lblB, lblRes;
	private JButton btnSuma, btnResta, btnMulti, btnDivi;
	private double a = 0, b = 0, r = 0;

        @SuppressWarnings("Convert2Lambda")
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
            @SuppressWarnings("CallToPrintStackTrace")
			public void run() {
				try {
					minicalc window = new minicalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application.
	public minicalc() {
		initialize();
	}

	//Initialize the contents of the frame.
        @SuppressWarnings("Convert2Lambda")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblRes = new JLabel("Resultado : ");
		lblRes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRes.setBounds(30, 180, 100, 25);
		frame.getContentPane().add(lblRes);

		lblA = new JLabel("A:");
		lblA.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblA.setBounds(30, 85, 50, 15);
		frame.getContentPane().add(lblA);

		lblB = new JLabel("B:");
		lblB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblB.setBounds(30, 135, 50, 15);
		frame.getContentPane().add(lblB);

		btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operaciones("sumar");
			}
		});
		btnSuma.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSuma.setBounds(30, 250, 105, 25);
		frame.getContentPane().add(btnSuma);

		btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operaciones("restar");
			}
		});
		btnResta.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnResta.setBounds(30, 310, 105, 25);
		frame.getContentPane().add(btnResta);

		btnMulti = new JButton("Multiplicar");
		btnMulti.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operaciones("multiplicar");
			}
		});
		btnMulti.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnMulti.setBounds(240, 250, 105, 25);
		frame.getContentPane().add(btnMulti);

		btnDivi = new JButton("Dividir");
		btnDivi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operaciones("dividir");
			}
		});
		btnDivi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDivi.setBounds(240, 310, 105, 25);
		frame.getContentPane().add(btnDivi);

		txt_A = new JTextField();
		txt_A.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txt_A.setBounds(240, 80, 105, 25);
		frame.getContentPane().add(txt_A);
		txt_A.setColumns(10);

		txt_B = new JTextField();
		txt_B.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txt_B.setBounds(240, 130, 105, 25);
		frame.getContentPane().add(txt_B);
		txt_B.setColumns(10);

		txtRes = new JTextField();
		txtRes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRes.setBounds(240, 180, 105, 25);
		frame.getContentPane().add(txtRes);
		txtRes.setColumns(10);
	}
	private void Operaciones (String tipo){
		try {
			a = Double.parseDouble(txt_A.getText());
			b = Double.parseDouble (txt_B.getText());
			switch (tipo) {
			case "sumar" -> {
                            r = a + b;
                            txtRes.setText("" + r);
                        }
			case "restar" -> {
                            r = a - b;
                            txtRes.setText("" + r);
                        }
			case "multiplicar" -> {
                            r = a * b;
                            txtRes.setText("" + r);
                        }
			case "dividir" -> {
                            r = a / b;
                            txtRes.setText("" + r);
                        }
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite un numero :)"  );
			txtRes.setText("");
		}
	}
}