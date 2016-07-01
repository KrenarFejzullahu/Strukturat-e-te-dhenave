public class AccountController
{ 
private BankReader reader; 
private BankAccount a_account;
private BankWriter a_writer;
private BankAccount b_account;
private BankWriter b_writer;
private BankAccount account;
private BankWriter writer;

public AccountController(BankReader r, BankAccount a, BankWriter w)
{ 
reader = r;
a_account = a;
a_writer = w;
b_account = a;
b_writer = w;

account = a_account;
writer = a_writer;

}

public void processTransactions()
{ 

char command = reader.readCommand("Command ( D,W,Q):");
if ( command == 'Q' ) 
{ }
else { if ( command == 'D' ) 
{ int amount = reader.readAmount();
boolean ok = account.deposit(amount);
writer.showTransaction("Deposit of $", amount);
}
else if ( command == 'W' ) 
{ int amount = reader.readAmount();
boolean ok = account.withdraw(amount);
if ( ok )
{ writer.showTransaction("Withdrawal of $", amount); }
else { writer.showTransaction("Withdrawal invalid", amount); }
}
this.processTransactions();
}
}
}