import javax.swing.*;

public class CalculoInteres {
    public static void main  (String[] args)  {

        double acumulado= 0;
        double interes=0;
        double valorinicial=0;
        int numeroInt=0;
        double[][] matriz = new double[4][5];
        for (int i = 0; i < 2; i++) {

            //JOptionPane.showMessageDialog(frame, "Hola, introduce valor inicial.");
            valorinicial= Integer.parseInt(JOptionPane.showInputDialog("Introduce valor inicial "));
            interes= Integer.parseInt(JOptionPane.showInputDialog("Introduce interes "));

            acumulado= acumulado+(valorinicial*interes)/100;
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = acumulado ;
            }


        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

}
