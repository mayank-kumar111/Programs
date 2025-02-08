#include <iostream>
using namespace std;
class claculator
{
private:
    int n1, n2;

public:
    void getdata();
    void display();
    void add();
    void sub();
    void mul();
    void div();
};
int main()
{
    claculator s;
    bool num = 1;
    while (num)
    {
        int n;
        cout << "Enter 1. For Getdata\n"
             << "Enter 2. For Display\n"
             << "Enter 3. For Add\n"
             << "Enter 4. For sub\n"
             << "Enter 5. For mul\n"
             << "Enter 6. For div\n"
             << "Enter 7. For Exit" << endl;
        cin >> n;
        switch (n)
        {
        case 1:
            s.getdata();
            break;
        case 2:
            s.display();
            break;
        case 3:
            s.add();
            break;
        case 4:
            s.sub();
            break;
        case 5:
            s.mul();
            break;
        case 6:
            s.div();
            break;
        case 7:
            num = 0;
            cout << "Exit" << endl;
            break;
        default:
            cout << "Invalid Input" << endl;
            break;
        }
    }
    return 0;
}
void claculator ::getdata()
{
    cout << "Enter two number :" << endl;
    cin >> n1 >> n2;
}
void claculator ::display()
{
    cout << "You enter a number is : " << n1 << " and " << n2 << endl;
}
void claculator ::add()
{
    cout << n1 << "+" << n2 << "=" << n1 + n2 << endl;
}
void claculator ::sub()
{
    cout << n1 << "-" << n2 << "=" << n1 - n2 << endl;
}
void claculator ::mul()
{
    cout << n1 << "*" << n2 << "=" << n1 * n2 << endl;
}
void claculator ::div()
{
    cout << n1 << "/" << n2 << "=" << n1 / n2 << endl;
}