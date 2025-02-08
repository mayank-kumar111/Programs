/*Define a class in C++ to represent bank account. The data to be stored is account number, name, balance in account. Assume maximum of 10 customers in bank
a) write member function to print name and account number of the customer with balance below RS.100
b) write member functions for withdrawal and deposit*/

#include <iostream>
#include <cstring>
using namespace std;

class Bank {
    int Acc_No[10];
    char name[10][20];
    float balance[10];
    int n;

public:
    void getdata();
    void display();
    void displayLowBalance();
    void withdraw();
    void deposit();
};

void Bank::getdata() {
    cout << "Enter the number of customers: ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        cout << "Enter the account number: ";
        cin >> Acc_No[i];
        cout << "Enter the name: ";
        cin.ignore();
        cin.getline(name[i], 20);
        cout << "Enter the balance: ";
        cin >> balance[i];
    }
}

void Bank::display() {
    for (int i = 0; i < n; i++) {
        cout << "Name: " << name[i] << endl;
        cout << "Account number: " << Acc_No[i] << endl;
        cout << "Balance: " << balance[i] << endl;
    }
}

void Bank::displayLowBalance() {
    for (int i = 0; i < n; i++) {
        if (balance[i] < 100) {
            cout << "Name: " << name[i] << endl;
            cout << "Account number: " << Acc_No[i] << endl;
            cout << "Balance: " << balance[i] << endl;
        }
    }
}

void Bank::withdraw() {
    int acc_no;
    float amount;
    cout << "Enter the account number: ";
    cin >> acc_no;
    cout << "Enter the amount to be withdrawn: ";
    cin >> amount;
    bool found = false;

    for (int i = 0; i < n; i++) {
        if (Acc_No[i] == acc_no) {
            found = true;
            if (balance[i] >= amount) {
                balance[i] -= amount;
                cout << "Amount withdrawn successfully. New balance: " << balance[i] << endl;
            } else {
                cout << "Insufficient balance." << endl;
            }
            break;
        }
    }
    if (!found) {
        cout << "Account not found." << endl;
    }
}

void Bank::deposit() {
    int acc_no;
    float amount;
    cout << "Enter the account number: ";
    cin >> acc_no;
    cout << "Enter the amount to be deposited: ";
    cin >> amount;
    bool found = false;

    for (int i = 0; i < n; i++) {
        if (Acc_No[i] == acc_no) {
            found = true;
            balance[i] += amount;
            cout << "Amount deposited successfully. New balance: " << balance[i] << endl;
            break;
        }
    }
    if (!found) {
        cout << "Account not found." << endl;
    }
}

int main() {
    Bank b;
    b.getdata();
    b.displayLowBalance();
    b.withdraw();
    b.deposit();
    b.display(); // To verify all conditions and cases
    return 0;
}
