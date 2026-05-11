import javax.swing.JOptionPane;
public class varios {
    public int leerEntero (String msg){
        int n = 0;
        while (true){
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog(msg));
                break;
            } catch (NumberFormatException e) {
                Mensaje("Debe ser entero");
            }       
        }
        return n;
    }
public void Mensaje(String msg){
    JOptionPane.showMessageDialog(null, msg);
}
    public double leerDecimal( String msg ){
        double n = 0;
        while( true ){
            try{
                n = Double.parseDouble( JOptionPane.showInputDialog( msg ) );
                break;
            }catch( NumberFormatException e ){
                Mensaje( "Debe ser Decimal ");
            }
        }
        return n;
    }

    public String leerCadena( String msg ){
        String n = "";
        while( true ){
            n = JOptionPane.showInputDialog( msg );
            if (n == null || n.trim().isEmpty()) {
            Mensaje("No debe ser vacío");
            } else {
            break;
            }
        }
        return n;
    }
}
    
