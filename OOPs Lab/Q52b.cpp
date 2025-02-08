// Write a program to crreate a file, read student data from user and write into it and display the data from the file. for n students. using open function.

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    ofstream fout;
    fout.open("student.txt");
    string name;
    int roll;
    double marks;
    int n;
    cout << "Enter the number of students: ";
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        fflush(stdin);
        cout << "Enter the name of the student: ";
        getline(cin, name);
        cout << "Enter the roll number of the student: ";
        cin >> roll;
        cout << "Enter the marks of the student: ";
        cin >> marks;
        fout << name << endl
             << roll << endl
             << marks << endl;
    }
    fout.close();
    ifstream fin;
    fin.open("student.txt",ios::in);
    if (!fin)
    {
        cout << "File not found" << endl;
        return 0;
    }
    for (int i = 0; i < n; i++)
    {
        fin >> name;
        fin >> roll;
        fin >> marks;
        cout << "Name: " << name << " Roll: " << roll << " Marks: " << marks << endl;
    }
    fin.close();
    return 0;
}
