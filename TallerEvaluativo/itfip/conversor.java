import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class conversor extends JFrame implements ActionListener{
	JLabel lblConversorDeGrados;
	JLabel lbl_texto;
	JLabel lbl_resul;
	JTextField txt_grados;
	JButton btn_celsius;
	JButton btn_fahrenheit;
	double grados, res;

	public static void main(String[] args) {
		conversor ventana = new conversor();
		ventana.setBounds( 700, 300, 500, 400 );  // tamaño a la ventana 
		ventana.setVisible( true );		
	}

	conversor(){
		setLayout( null ); // yo le doy la posicion	
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		lblConversorDeGrados = new JLabel("CONVERSOR DE GRADOS 1.0");
		lblConversorDeGrados.setBounds(123, 33, 189, 25);
		add( lblConversorDeGrados );

		lbl_texto = new JLabel("Grados :");
		lbl_texto.setBounds(47, 77, 64, 25);
		add( lbl_texto );

		txt_grados = new JTextField();
		txt_grados.setBounds(123, 78, 116, 22);
		add(txt_grados);
		txt_grados.setColumns(15);

		lbl_resul = new JLabel("Resultado");
		lbl_resul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_resul.setBounds(157, 211, 150, 25);
		add(lbl_resul);

		btn_celsius = new JButton("Celsius");
		btn_celsius.setBounds(84, 143, 97, 25);
		add(btn_celsius);		
		
		btn_fahrenheit = new JButton("Fahrenheit");
		btn_fahrenheit.setBounds(224, 143, 97, 25);
		add(btn_fahrenheit);
	
        initListeners();
	}
    private void initListeners() {
    btn_celsius.addActionListener(this);
    btn_fahrenheit.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btn_celsius ){
			try{
				grados = Double.parseDouble( txt_grados.getText() );
				res = ( grados - 32 ) * 5 / 9;
				lbl_resul.setText( "" + res );			
			}catch( NumberFormatException e1 ){
				lbl_resul.setText( "Debe ser decimal"  );
			}
		}
		if( e.getSource() == btn_fahrenheit ){
			try{
				grados = Double.parseDouble( txt_grados.getText() );
				res = grados * 1.8 + 32;
				lbl_resul.setText( "" + res );
			}catch( NumberFormatException e1 ){
				lbl_resul.setText( "Debe ser decimal "  );
			}
		}
	}
}