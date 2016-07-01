import javax.swing.*;
public class Viti_i_Brishte_12_03_2016
{
  public static void main(String[] args)
  {
    int viti = new Integer(JOptionPane.showInputDialog("Viti: ")).intValue();
    
    if(viti%4==0 && (viti%100)!=0 && viti>0 || viti%400==0 )
    {JOptionPane.showMessageDialog(null,"Viti "+viti+ " eshte vit i brishte");}
    
    else{JOptionPane.showMessageDialog(null,"Viti "+viti+ " nuk eshte vit i brishte");}
  }
}