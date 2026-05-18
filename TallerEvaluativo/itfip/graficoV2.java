import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class graficoV2 extends JFrame {
    JLabel etiqueta;
    JTextField campotexto;
    JButton boton, salir, salir2;
    public  static void main(String[] args) {
        System.out.println("Prueba grafico");
        graficoV2 g = new graficoV2();
        g.setBounds(200, 200, 300, 400); //Tamaño ventana
        g.setVisible(true);
    }
    graficoV2(){

        setLayout( null ); // yo le doy la posicion	
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        etiqueta = new JLabel("Pon titulo de la ventana");
        etiqueta.setBounds(30, 10, 150, 20); //Posicion y dimension de la etiqueta
        add(etiqueta);
        
        campotexto = new JTextField();
		campotexto.setBounds(30, 50, 150, 20);
		add(campotexto);

        boton = new JButton("Cambiar titulo");
        boton.setBounds(30, 90, 150, 20);
        add(boton);
       

        salir = new JButton("Salir");
        salir.setBounds(30, 130, 150, 20);
        add(salir);
        

        salir2 = new JButton("Salir de otra forma");
        salir2.setBounds(30, 170, 150, 20);
        add(salir2);

        initListeners();
        repaint();
    }
    private void initListeners() {
        boton.addActionListener(e -> setTitle(campotexto.getText()));
        salir.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Adios");
            System.exit(0);
        });
        salir2.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Adios2");
            System.exit(0);
        });
    }
}