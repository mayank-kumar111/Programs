#include <iostream>
#include <string>
using namespace std;
class student
{
private:
    int m1, m2, m3, totalMarkss, rollNum;
    string name;
    char totalGrades;

public:
    void getdata();
    void display();
    void totalMarks();
    void totalGrade();
};
int main()
{
    student s;
    bool num = 1;
    while (num)
    {
        int n;
        cout << "Enter 1. For Getdata\n"
             << "Enter 2. For Display\n"
             << "Enter 3. For Total Marks\n"
             << "Enter 4. For Total Grade\n"
             << "Enter 5. For Exit" << endl;
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
            s.totalMarks();
            break;
        case 4:
            s.totalGrade();
            break;

        case 5:
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
void student ::getdata()
{
    cout << "Enter Your name :\n";
    getline(cin >> ws, name);
    // cin >> name;
    cout << "Roll Number :\n";
    cin >> rollNum;
    cout << "Enter your marks in Three subject:" << endl;
    cin >> m1 >> m2 >> m3;
}
void student ::display()
{
    cout << " Your name is :\n"
         << name << "\nRoll number is :\n"
         << rollNum << "\nYour marks in Three subject:\n"
         << m1 << "\n"
         << m2 << "\n"
         << m3 << endl;
}
void student ::totalMarks()
{
    cout << "Total Marks is " << m1 << "+" << m2 << "+" << m3 << "=" << m1 + m2 + m3 << endl;
    totalMarkss = m1 + m2 + m3;
}
void student ::totalGrade()
{
    if (totalMarkss >= 240)
        cout << "Grade is A\n";
    else if (totalMarkss >= 210)
        cout << "Grade is B\n";
    else if (totalMarkss >= 180)
        cout << "Grade is C\n";
    else if (totalMarkss >= 150)
        cout << "Grade is D\n";
    else if (totalMarkss >= 120)
        cout << "Grade is E\n";
    else
        cout << "Grade is F\n";
}
