import javax.swing.*;
public class AccountManager
{ public static void main(String[] args)
{ BankReader reader = new BankReader();



char personi = reader.readCommand("Personi A, Personi B, Bankieri(M ose N) ");


if(personi == 'A')
{
BankAccount a_account = new BankAccount(0);
BankWriter a_writer = new BankWriter("Llogaria e personit A", a_account);

a_writer.showTransaction("Llogaria e personit A");
AccountController controller = new AccountController(reader,a_account, a_writer);
controller.processTransactions();
 }
else if(personi == 'B')
{
BankAccount b_account = new BankAccount(0);
BankWriter b_writer = new BankWriter("Llogaria e personit B", b_account);
b_writer.showTransaction("Llogaria e personit B");
AccountController controller = new AccountController(reader, b_account, b_writer);
controller.processTransactions(); 
}
else if(personi == 'M')
{BankAccount a_account = new BankAccount(0);
BankWriter a_writer = new BankWriter("Llogaria e personit A", a_account);
BankAccount b_account = new BankAccount(0);
BankWriter b_writer = new BankWriter("Llogaria e personit B", b_account);

char llogaria = reader.readCommand("A apo B");
if(llogaria == 'A')
{
 a_writer.showTransaction("Llogaria e personit A");
AccountController controller = new AccountController(reader,a_account, a_writer);
controller.processTransactions();
}
else if(llogaria == 'B')
{
b_writer.showTransaction("Llogaria e personit B");
AccountController controller = new AccountController(reader, b_account, b_writer);
controller.processTransactions();
}
}
else if(personi == 'N')
{
 BankAccount a_account = new BankAccount(0);
BankWriter a_writer = new BankWriter("Llogaria e personit A", a_account);

BankAccount b_account = new BankAccount(0);
BankWriter b_writer = new BankWriter("Llogaria e personit B", b_account);

AccountController1 controller = new AccountController1(reader,a_account, a_writer, b_account, b_writer);
controller. processTransactions();

}

}
}