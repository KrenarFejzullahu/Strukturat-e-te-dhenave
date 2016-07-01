
public class AccountController1
{ private BankReader reader; 

private BankAccount a_account;
private BankWriter a_writer;

private BankAccount b_account;
private BankWriter b_writer;

private BankAccount account;
private BankWriter writer;

public AccountController1(BankReader r, BankAccount a1, BankWriter w1,BankAccount a2, BankWriter w2 )
{ reader = r;
a_account = a1;
a_writer = w1;
b_account = a2;
b_writer = w2;

account = a_account;
writer = a_writer;
}

private void resetAccount(BankAccount new_account, BankWriter new_writer)
{ writer.showTransaction("Inactive"); 
account = new_account; 
writer = new_writer;
writer.showTransaction("Active");
}
public void processTransactions()
{ char command = reader.readCommand("Command (Personi A,Personi B, D,W,Q):");
if ( command == 'Q' ) 
{}
else { if ( command == 'D' ) 
{ int amount = reader.readAmount();
account.deposit(amount);
writer.showTransaction("Deposit of $", amount);
}
else if ( command == 'W' ) 
{ int amount = reader.readAmount();
boolean ok = account.withdraw(amount);
if ( ok )
{ writer.showTransaction("Withdrawal of $", amount); }
else { writer.showTransaction("Withdrawal invalid", amount); }
}
else if ( command == 'A' ) 
{ resetAccount(a_account, a_writer); }
else if ( command == 'B' ) 
{ resetAccount(b_account, b_writer); }
else { writer.showTransaction("Illegal command"); }
this.processTransactions(); 
}
}
}