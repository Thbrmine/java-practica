import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class arrMenuWB {

	private JFrame frame;
	private JTextField text_n;
	private final int TAM = 10;
	private int POS = 0;
	private final int a [] = new int [TAM];
	private JTextArea Area;
	private JLabel lbl_N, lbl_aviso;
	private JButton btnAdicionar, btnEliminar, btnConsultar, btnOrdenar, btnAleatorio, btnLimpiar, btnMemoria, btnSalir; 


	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        arrMenuWB window = new arrMenuWB();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        System.err.println("Error initializing application: " + e.getMessage());
                    }
                });
	}

	//Create the application.
	public arrMenuWB() {
		for (int i = 0; i < TAM; i++) //Inicia en 0 el arreglo
			a [i]=0;
		initialize();
	}

	//Initialize the contents of the frame.
        @SuppressWarnings("Convert2Lambda")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frame.setBounds(100, 100, 616, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lbl_N = new JLabel("N=");
		lbl_N.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_N.setBounds(132, 21, 34, 37);
		frame.getContentPane().add(lbl_N);

		text_n = new JTextField();
		text_n.setForeground(new Color(0, 0, 0));
		text_n.setBackground(new Color(171, 193, 254));
		text_n.setBounds(160, 28, 112, 26);
		frame.getContentPane().add(text_n);
		text_n.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBackground(new Color(255, 255, 255));
		btnAdicionar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAdicionar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Adicionar();
			}
		});
		btnAdicionar.setBounds(20, 60, 105, 25);
		frame.getContentPane().add(btnAdicionar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEliminar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Eliminar();
			}
		});
		btnEliminar.setBounds(20, 100, 105, 25);
		frame.getContentPane().add(btnEliminar);

		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(255, 255, 255));
		btnConsultar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnConsultar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Consultar();
			}
		});
		btnConsultar.setBounds(20, 140, 105, 25);
		frame.getContentPane().add(btnConsultar);

		btnOrdenar = new JButton("Ordenar");
		btnOrdenar.setBackground(new Color(255, 255, 255));
		btnOrdenar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnOrdenar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Ordenar();
			}
		});
		btnOrdenar.setBounds(20, 180, 105, 25);
		frame.getContentPane().add(btnOrdenar);

		btnAleatorio = new JButton("Aleatorio");
		btnAleatorio.setBackground(new Color(255, 255, 255));
		btnAleatorio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAleatorio.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Aleatorio();
			}
		});
		btnAleatorio.setBounds(20, 220, 105, 25);
		frame.getContentPane().add(btnAleatorio);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(new Color(255, 255, 255));
		btnLimpiar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLimpiar.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Limpiar();
			}
		});
		btnLimpiar.setBounds(20, 260, 105, 25);
		frame.getContentPane().add(btnLimpiar);

		btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(255, 0, 0));
		btnSalir.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSalir.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Salir();
			}
		});
		btnSalir.setBounds(487, 337, 105, 25);
		frame.getContentPane().add(btnSalir);

		Area = new JTextArea();
		Area.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		Area.setBounds(279, 59, 200, 265);
		frame.getContentPane().add(Area);

		lbl_aviso = new JLabel("");
		lbl_aviso.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_aviso.setBounds(317, 34, 200, 26);
		frame.getContentPane().add(lbl_aviso);

		btnMemoria = new JButton("Memoria");
		btnMemoria.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnMemoria.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				Memoria();
			}
		});
		btnMemoria.setBounds(20, 300, 105, 25);
		frame.getContentPane().add(btnMemoria);
	}

	private void listar(){
		String cad = "";
		for (int i=0; i< POS; i++) {
			cad = cad + "a[" + i + "] =" + a[i] + "\n";
		}	
		Area.setText(cad);
	}

	private void Adicionar(){
		if (POS < TAM) {
			a[POS++] = Integer.parseInt( text_n.getText());
			text_n.setText("");
			listar();
		} else {
			lbl_aviso.setText("Arreglo lleno");
			JOptionPane.showMessageDialog(null, "El arreglo esta lleno");
		}
	}

	private void Eliminar() {
		int n;
		X x = new X (text_n.getText());
		if (x.evalua()==false) {
			JOptionPane.showMessageDialog(null, "Digite un numero :)"  );
		} else {
			n = x.retorna();
			if (POS == 0 ) {
				JOptionPane.showMessageDialog(null, "No hay elementos a eliminar ");
			} else {
				boolean encontrado = false;
				int i, j;
				for (i = 0; i < POS; i++) {
					if (a[i] == n) {
						encontrado = true;
						break;
					}
				}
				if (encontrado) {
					for ( j = i; j < POS-1; j++ ) {
						a[j] = a[j+1];
					}
					a[j]=0;
					POS--;
					listar();
					JOptionPane.showMessageDialog(null, "Se elimino elemento "+ i);
				} else {
					JOptionPane.showMessageDialog(null, "El número " + n + " no se encuentra en el arreglo" );
				}
			}}
	}
	private void Consultar(){
		int n;
		X x = new X (text_n.getText());
		if (x.evalua()==false) {
			JOptionPane.showMessageDialog(null, "Digite un numero :)"  );
		} else {
			n = x.retorna();
			if (POS == 0 ) {
				JOptionPane.showMessageDialog(null, "No hay elementos a consultar ");
			} else {
				boolean encontrado = false;
				int i;
				for (i = 0; i < POS; i++) {
					if (a[i] == n) {
						encontrado = true;
						break;
					}
				}
				if (encontrado) {
					JOptionPane.showMessageDialog(null, "El número se encuentra en la posicion "+ i);
				} else {
					JOptionPane.showMessageDialog(null, "El número " + n + " no se encuentra en el arreglo" );
				}
			}}
	}
	private void Ordenar() {
		if (POS==0) {
			JOptionPane.showMessageDialog(null, "El arreglo está vacío");
		} else {
			int i,j, aux;
			for (i = 0; i < POS -1; i++) {
				for (j=i+1; j<POS; j++) {
					if(a[i] > a[j]) {
						aux= a [i];
						a[i] = a[j];
						a[j] = aux;
					}
				}
			}
			listar();
			JOptionPane.showMessageDialog(null, "El arreglo está ordenado");
		}
	}

	private void Aleatorio() {
		int n;
		X x = new X (text_n.getText());
		if (x.evalua()==false) {
			JOptionPane.showMessageDialog(null, "Digite un numero :)"  );
		} else {
			n = x.retorna();
			if (n > TAM) {
				JOptionPane.showMessageDialog(null, "Exceso capacidad" );
			} else {
				for(int i = 0; i < n; i++) {
					a[i]= (int) ( Math.random() * 20 + 1 );
				}
				POS = n;
				listar();
			}
			text_n.setText("");
		}
	}
	private void Limpiar() {
		POS = 0;
		for(int i=0; i < TAM; i++)
			a[i]=0;
		listar();
	}

	private void Memoria() {
		String cad = "";
		for (int i=0; i< TAM; i++) {
			if (i== POS) 
				cad = (cad + "-----memoria-----" + "\n");
			cad = cad + "a[" + i + "] =" + a[i] + "\n";
		}	
		Area.setText(cad);
	}
	private void Salir() {
		JOptionPane.showMessageDialog(null, "Saliendo...");
		System.exit(0);
	}

	class X{
		boolean resultado = false;
		int n = 0;
		X(String cad){
			try {
				n = Integer.parseInt (cad);
				resultado = true;
			} catch (NumberFormatException e) {
			}
		}
		int retorna() {
			return n;
		}
		boolean evalua() {
			return resultado;
		}
	}

}



