#include <iostream>
using namespace std;

class Account
{
protected:
    string name;
    int acc_no;             // Instance variable for each account
    static int next_acc_no; // Static variable to generate unique account numbers
    string type;
    float balance = 1000; // set minimum balance as 1000
public:
    Account()
    {
        acc_no = ++next_acc_no; // Assign unique account number
    }
    void input();
    void display();
};

int Account::next_acc_no = 5000; // Initialize the static variable outside the class

void Account::input()
{
    cout << "Enter the name of the account holder: ";
    cin >> name;
    cout << "Enter the type of account: ";
    cin >> type;
    cout << "Enter the initial balance: ";
    cin >> balance;
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
    float interest_rate = 0.05; // in percentage
    int time_period = 3;        // in months
public:
    void calculate_interest();
    void display();
};

void Savings::calculate_interest()
{
    float interest = balance * interest_rate * time_period / 12;
    balance += interest;
    cout << "Interest is " << interest << endl;
}

void Savings::display()
{
    Account::display();
    cout << "Interest rate: " << interest_rate << endl;
    cout << "Time period: " << time_period << " months" << endl;
}

class Current : public Account
{
    float min_balance = 1000;
    static int chequeBook[20];
    static int chequeBook_no;

public:
    void display();
    void withdraw();
    void deposit();
    void chequeBook_request();
    void chequeBook_validity();
    void balance_check();
};

int Current::chequeBook[20];
int Current::chequeBook_no = 2000;

void Current::display()
{
    Account::display();
    cout << "Minimum balance: " << min_balance << endl;
}

void Current::withdraw()
{
    float amount;
    cout << "Enter the amount to be withdrawn: ";
    cin >> amount;
    if (balance - amount < min_balance)
    {
        cout << "Insufficient balance." << endl;
    }
    else
    {
        balance -= amount;
        cout << "Withdrawal successful. New balance: " << balance << endl;
    }
}

void Current::deposit()
{
    float amount;
    cout << "Enter the amount to be deposited: ";
    cin >> amount;
    balance += amount;
    cout << "Deposit successful. New balance: " << balance << endl;
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

void Current::balance_check()
{
    cout << "Account balance: " << balance << endl;
}

int main()
{
    int choice;
    Savings s;
    Current c;
    cout << "1. Open a savings account" << endl;
    cout << "2. Open a current account" << endl;
    cout << "3. Display details of savings account" << endl;
    cout << "4. Display details of current account" << endl;
    cout << "5. Calculate interest for savings account" << endl;
    cout << "6. Withdraw from current account" << endl;
    cout << "7. Deposit in current account" << endl;
    cout << "8. Request cheque book for current account" << endl;
    cout << "9. Check validity of cheque" << endl;
    cout << "10. Check account balance" << endl;
    cout << "Enter -1 to exit." << endl;
    cout << "---------------------------------" << endl;
    while (1)
    {
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
            c.balance_check();
            break;
        case -1:
            cout << "Exiting..." << endl;
            exit(0);
            break;
        default:
            cout << "Invalid choice." << endl;
        }
    }
    return 0;
}