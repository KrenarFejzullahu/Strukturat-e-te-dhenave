import javax.swing.*;

public class BankAccount
{ 
private int balance; 
public BankAccount(int initial_amount)
{ 
if ( initial_amount >= 0 )
{ balance = initial_amount; }
else { balance = 0; }
}


public boolean deposit(int amount)
{
boolean result = false;
if ( amount >= 0 )
{ balance = balance + amount;
result = true;
}
else { JOptionPane.showMessageDialog(null,"BankAcccount error: bad deposit amount---ignored");}
return result;
}

public boolean withdraw(int amount)
{
boolean result = false;
if ( amount < 0 )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: bad withdrawal amount---ignored"); }
else if ( amount > balance )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: withdrawal amount exceeds balance");
}
else { balance = balance - amount;
result = true;
}
return result;
}

/* getBalance reports the current account balance
* @return the balance */
public int getBalance()
{ return balance; }
}