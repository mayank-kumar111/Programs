// Write a program to implement hierarchical inheritance. for banking system.

#include <iostream>
using namespace std;

class Account
{
protected:
    string name;
    static int acc_no; // use static variable to generate unique account number
    string type;
    float balance = 1000; // set minimum balance as 1000.
    static int id;

public:
    void input();
    void display();
};

int Account::acc_no = 5000;
int Account::id = 1000;

void Account::input()
{
    cout << "Enter the name of the account holder: ";
    cin >> name;
    cout << "Enter the type of account: ";
    cin >> type;
    cout << "Enter the initial balance: ";
    cin >> balance;
    acc_no++;
    id++;
}

void Account::display()
{
    cout << "Account number: " << acc_no << endl;
    cout << "Account holder name: " << name << endl;
    cout << "Account type: " << type << endl;
    cout << "Account balance: " << balance << endl;
}

class Savings : public Account
{
    float interest_rate = 0.05; // in percentage.
    int time_period = 3;       // in months.

public:
    void calculate_interest();
    void display();
};

void Savings::calculate_interest()
{
    float interest = balance * interest_rate * time_period / 12;
    balance += interest;
}

void Savings::display()
{
    Account::display();
    cout << "Interest rate: " << interest_rate << endl;
    cout << "Time period: " << time_period << " months" << endl;
}

class Current : public Account
{
    float min_balance = 1000; // minimum balance required for current account.
    float penalty = 100;      // penalty for not maintaining minimum balance.
    float service_charge = 50; // service charge for current account.
    float chequeBook_charge = 50; // charge for cheque book.
    // cheque book facility in static series.
    // cheque book number in array of 20.
    static int chequeBook[20];
    static int chequeBook_no;

public:
    void display();
    void withdraw();
    void deposit();
    void chequeBook_request();
    void chequeBook_validity();
    void chequeBook_display();
    void balance_check();
    void chequeBook_return();
};

int Current::chequeBook[20];
int Current::chequeBook_no = 2000;

void Current::display()
{
    Account::display();
    cout << "Minimum balance: " << min_balance << endl;
    cout << "Penalty for not maintaining minimum balance: " << penalty << endl;
    cout << "Service charge: " << service_charge << endl;
    cout << "Cheque book charge: " << chequeBook_charge << endl;
}

void Current::withdraw()
{
    float amount;
    cout << "Enter the amount to be withdrawn: ";
    cin >> amount;
    if (balance - amount < min_balance)
    {
        cout << "Insufficient balance. Penalty of " << penalty << " will be charged." << endl;
        balance -= penalty;
    }
    else
    {
        balance -= amount;
    }
}

void Current::deposit()
{
    float amount;
    cout << "Enter the amount to be deposited: ";
    cin >> amount;
    balance += amount;
}

void Current::chequeBook_request()
{
    chequeBook_no++;
    chequeBook[chequeBook_no] = chequeBook_no;
    cout << "Cheque book requested successfully. Cheque book number: " << chequeBook_no << endl;
}

void Current::chequeBook_validity()
{
    int cheque_no;
    cout << "Enter the cheque number: ";
    cin >> cheque_no;
    if (cheque_no >= 2000 && cheque_no <= chequeBook_no)
    {
        cout << "Cheque is valid." << endl;
    }
    else
    {
        cout << "Cheque is invalid." << endl;
    }
}

void Current::chequeBook_display()
{
    cout << "Cheque book numbers: ";
    for (int i = 2000; i <= chequeBook_no; i++)
    {
        cout << chequeBook[i] << " ";
    }
    cout << endl;
}

void Current::balance_check()
{
    cout << "Account balance: " << balance << endl;
}

void Current::chequeBook_return()
{
    int cheque_no;
    cout << "Enter the cheque number to be returned: ";
    cin >> cheque_no;
    if (cheque_no >= 2000 && cheque_no <= chequeBook_no)
    {
        cout << "Cheque number " << cheque_no << " returned successfully." << endl;
    }
    else
    {
        cout << "Invalid cheque number." << endl;
    }
}

// enter -1 for exit from the program.

int main()
{
    int choice;
    Savings s;
    Current c;
    do
    {
        cout << "1. Open a savings account" << endl;
        cout << "2. Open a current account" << endl;
        cout << "3. Display details of savings account" << endl;
        cout << "4. Display details of current account" << endl;
        cout << "5. Calculate interest for savings account" << endl;
        cout << "6. Withdraw from current account" << endl;
        cout << "7. Deposit in current account" << endl;
        cout << "8. Request cheque book for current account" << endl;
        cout << "9. Check validity of cheque" << endl;
        cout << "10. Display cheque book numbers" << endl;
        cout << "11. Check account balance" << endl;
        cout << "12. Return cheque" << endl;
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            s.input();
            break;
        case 2:
            c.input();
            break;
        case 3:
            s.display();
            break;
        case 4:
            c.display();
            break;
        case 5:
            s.calculate_interest();
            break;
        case 6:
            c.withdraw();
            break;
        case 7:
            c.deposit();
            break;
        case 8:
            c.chequeBook_request();
            break;
        case 9:
            c.chequeBook_validity();
            break;
        case 10:
            c.chequeBook_display();
            break;
        case 11:
            c.balance_check();
            break;
        case 12:
            c.chequeBook_return();
            break;
        default:
            cout << "Invalid choice." << endl;
        }
    } while (choice != -1);
    return 0;
}