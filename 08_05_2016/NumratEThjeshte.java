import javax.swing.*;
public class NumratEThjeshte
{
 public static void main(String[] args)
 {
  int n = new Integer(JOptionPane.showInputDialog("Deri te cili numer deshironi ti shfaqn numrat e thjeshte: ")).intValue();
  
  boolean[] iThjeshte = new boolean[n];
  iThjeshte[0] = false;
  
  for(int i=1; i<n; i++)
  {iThjeshte[i] = true;}
  
  for(int i=1; i<n; i++)
  {
   if(iThjeshte[i-1])
   {
    System.out.print(i+" ");
    
    for(int j=i*i; j<=n; j+=i)
    {
     iThjeshte[j-1] = false;
    }
   }
  }
  
  
 }
}