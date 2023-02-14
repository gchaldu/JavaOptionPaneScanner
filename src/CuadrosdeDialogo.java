import javax.swing.*;

public class CuadrosdeDialogo {

        private Integer numero;
        public void EjemploDialogosSwing()
        {
            String numStr = JOptionPane.showInputDialog(null, "Ingrese un numero");
            try{
                this.numero = Integer.parseInt(numStr);
                this.MostrarNumeroSwing();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR, Debe ingresar un numero");
                //llamada recursiva
                this.EjemploDialogosSwing();
                System.exit(0);
            }


        }
        private void MostrarNumeroSwing()
        {
            JOptionPane.showMessageDialog(null, "El numero es: " + this.numero);
        }
}
