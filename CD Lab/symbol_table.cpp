#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

struct Symbol
{
    string name;
    string type;
    int size;
    int address;
};

vector<Symbol> symbolTable;

void insertSymbol()
{
    Symbol newSymbol;
    cout << "Enter symbol name: ";
    cin >> newSymbol.name;

    for (const auto &symbol : symbolTable)
    {
        if (symbol.name == newSymbol.name)
        {
            cout << "Symbol '" << newSymbol.name << "' already exists!\n";
            return;
        }
    }

    cout << "Enter symbol type: ";
    cin >> newSymbol.type;
    cout << "Enter symbol size: ";
    cin >> newSymbol.size;

    newSymbol.address = symbolTable.empty() ? 1000 : symbolTable.back().address + symbolTable.back().size;
    symbolTable.push_back(newSymbol);

    cout << "Symbol inserted successfully at address " << newSymbol.address << "\n";
}

void deleteSymbol()
{
    if (symbolTable.empty())
    {
        cout << "Symbol table is empty!\n";
        return;
    }

    string name;
    cout << "Enter symbol name to delete: ";
    cin >> name;

    for (auto it = symbolTable.begin(); it != symbolTable.end(); ++it)
    {
        if (it->name == name)
        {
            symbolTable.erase(it);
            cout << "Symbol '" << name << "' deleted successfully!\n";
            return;
        }
    }

    cout << "Symbol '" << name << "' not found!\n";
}

void displaySymbols()
{
    if (symbolTable.empty())
    {
        cout << "Symbol table is empty!\n";
        return;
    }

    cout << "\nSymbol Table:\n";
    cout << "--------------------------------------------------\n";
    cout << left << setw(15) << "Name"
         << setw(10) << "Type"
         << setw(10) << "Size"
         << setw(10) << "Address" << "\n";
    cout << "--------------------------------------------------\n";

    for (const auto &symbol : symbolTable)
    {
        cout << left << setw(15) << symbol.name
             << setw(10) << symbol.type
             << setw(10) << symbol.size
             << setw(10) << symbol.address << "\n";
    }
    cout << "--------------------------------------------------\n";
}

int main()
{
    int choice;
    while (true)
    {
        cout << "\nSymbol Table Operations:\n";
        cout << "1. Insert Symbol\n";
        cout << "2. Delete Symbol\n";
        cout << "3. Display Symbols\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            insertSymbol();
            break;
        case 2:
            deleteSymbol();
            break;
        case 3:
            displaySymbols();
            break;
        case 4:
            return 0;
        default:
            cout << "Invalid choice! Please try again.\n";
        }
    }
}