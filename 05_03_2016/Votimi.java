import javax.swing.*;
public class Votimi
{
 public static void main(String[] args)
 {
 boolean run = true;
  int count1 = 0;
  int count2 = 0;
 while (run)
 {
  
  String emri = JOptionPane.showInputDialog("Jepeni emrin: ");
  String mbiemri = JOptionPane.showInputDialog("Jepeni mbiemrin: ");
  int mosha = new Integer(JOptionPane.showInputDialog("Jepeni moshen: ")).intValue();
  
  
  
   
  if(mosha>=18)
  {
  String konkuruesit = JOptionPane.showInputDialog("Kandidati 1: Filan Fisteku\n Kandidati 2: Krenar Fejzullahu \n Shtypni OK per te vazhduar");
  int kandidati = new Integer(JOptionPane.showInputDialog("Shtypni 1 per te votuar Kandidatin 1\n Shtypni 2 per te votuar Kandidatin 2 ")).intValue();
  String kandidatet;
   switch(kandidati)
   {
    case 1 : kandidatet = "Filan Fisteku";
      JOptionPane.showMessageDialog(null,"Keni votuar per " + kandidatet);
      break;
      
    case 2 : kandidatet = "Krenar Fejzullahu";
      JOptionPane.showMessageDialog(null,"Keni votuar per " + kandidatet);
       break;
       
    default: JOptionPane.showMessageDialog(null,"Keni shtypur gabim");
     break;
   }
   
   
   if(kandidati == 1) 
   { count1++; JOptionPane.showMessageDialog(null,"Filan Fisteku ka "+count1+" vota");}
   else if(kandidati == 2) 
   {count2++; JOptionPane.showMessageDialog(null,"Krenar Fejzullahu ka "+count2+" vota");}
     }
  else {JOptionPane.showMessageDialog(null,"Nuk mund te votoni");}
  
  break;
  }
 }
 
}