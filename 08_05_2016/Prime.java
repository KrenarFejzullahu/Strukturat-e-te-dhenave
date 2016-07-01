import javax.swing.*;
public class Prime
{
 public static void gjejePrime(int kufiri) {
      int rrenja_e_kufirit = (int) Math.sqrt(kufiri);
      boolean[] iPerbere = new boolean[kufiri + 1];
      for (int m = 2; m <= rrenja_e_kufirit; m++) {
            if (!iPerbere[m]) {
                  System.out.print(m + " ");
                  for (int k = m * m; k <= kufiri; k += m)
                        iPerbere[k] = true;
            }
      }
      for (int m = rrenja_e_kufirit; m <= kufiri; m++)
            if (!iPerbere[m])
                  System.out.print(m + " ");
}

public static void main(String[] args)
{
 int a = new Integer(JOptionPane.showInputDialog("Deri te cili numer deshironi ti shfaqn numrat e thjeshte: ")).intValue();
 gjejePrime(a);
}
}