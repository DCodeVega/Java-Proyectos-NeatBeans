package ejemplosDeEstructuras;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Vega
 */
public class Matriz {

    public int[][] leeMatInt(int fil, int col) {
        int m[][], i, j;
        m = new int[fil][col];
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Dato M[" + i + "][" + j + "]=", ""));
            }
        }
        return (m);
    }

    public double[][] leeMatDouble(int fil, int col) {
        double m[][];
        int i, j;
        m = new double[fil][col];
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Dato M[" + i + "][" + j + "]=", ""));
            }
        }
        return (m);
    }

    public String mostrarMatInt(int m[][]) {
        String s = "";
        int i, j;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[0].length; j++) {
                s = s + "\t" + m[i][j];
            }
            s = s + "\n";
        }
        return s;
    }

    public String mostrarMatDouble(double m[][]) {
        DecimalFormat df = new DecimalFormat("#.00");
        String s = "";
        int i, j;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[0].length; j++) {
                s = s + df.format(m[i][j]) + "\t";
            }
            s = s + "\n";
        }
        return s;
    }
}
