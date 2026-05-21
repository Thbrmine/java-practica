import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class arrMenuWB extends JFrame implements ActionListener {
    static final int TAM = 10;
    static int pos = 0;
    static int a[] = new int[TAM];
    JButton btnAgregar, btnConsultar, btnMostrar, btnInvertir, btnEliminar, btnSalir;
    public static void main(String[] args) {
       arrMenuWB ventana = new arrMenuWB();
        ventana.setBounds(200, 200, 320, 320);
        ventana.setVisible(true);
    }
    arrMenuWB() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menú de Arreglos");

        btnAgregar = new JButton("1. Agregar número");
        btnAgregar.setBounds(60, 20, 180, 30);
        add(btnAgregar);

        btnConsultar = new JButton("2. Consultar elementos");
        btnConsultar.setBounds(60, 60, 180, 30);
        add(btnConsultar);

        btnMostrar = new JButton("3. Mostrar arreglo");
        btnMostrar.setBounds(60, 100, 180, 30);
        add(btnMostrar);

        btnInvertir = new JButton("4. Invertir arreglo");
        btnInvertir.setBounds(60, 140, 180, 30);
        add(btnInvertir);

        btnEliminar = new JButton("5. Eliminar número");
        btnEliminar.setBounds(60, 180, 180, 30);
        add(btnEliminar);

        btnSalir = new JButton("0. Salir");
        btnSalir.setBounds(60, 220, 180, 30);
        add(btnSalir);

        initListeners();
    }
    private void initListeners() {
        btnAgregar.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnMostrar.addActionListener(this);
        btnInvertir.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnSalir.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            adicionar();
        } else if (e.getSource() == btnConsultar) {
            consultar();
        } else if (e.getSource() == btnMostrar) {
            mostrar();
        } else if (e.getSource() == btnInvertir) {
            invertir();
        } else if (e.getSource() == btnEliminar) {
            eliminar();
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Saliendo...");
            System.exit(0);
        }
    }
        public static void adicionar(){
        if (pos == TAM) {
            JOptionPane.showMessageDialog(null, "El arreglo está lleno...");
        } else {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número:"));
            a[pos] = num;
            pos++;
        }

    }
    public static void consultar(){
        JOptionPane.showMessageDialog(null, "El número de elementos en el arreglo es: " + pos);
    }
    public static void mostrar(){
        String resultado = "Elementos en el arreglo:\n";
        for (int i = 0; i < pos; i++) {
            resultado += "Elemento " + (i + 1) + ": " + a[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    public static void invertir(){
        for (int i = 0; i < pos / 2; i++) {
            int temp = a[i];
            a[i] = a[pos - 1 - i];
            a[pos - 1 - i] = temp;
        }
    }
    public static void eliminar(){
        if (pos == 0) {
            JOptionPane.showMessageDialog(null, "El arreglo está vacío, no se pueden eliminar elementos.");
        } else {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número a eliminar del arreglo:"));
            boolean encontrado = false;
            for (int i = 0; i < pos; i++) {
                if (a[i] == num) {
                    encontrado = true;
                    for (int j = i; j < pos - 1; j++) {
                        a[j] = a[j + 1];
                    }
                    pos--;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo.");
            }
        }
    }

    public static int[] getA() {
        return a;
    }

    public static void setA(int[] a) {
        arrMenuWB.a = a;
    }
}