// Write a program to read student data from a file and display on console.

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    ifstream fin("student.txt");
    if (!fin)
    {
        cout << "File not found" << endl;
        return 0;
    }
    string name;
    int roll;
    double marks;
    while (fin >> name >> roll >> marks)
    {
        cout << "Name: " << name << " Roll: " << roll << " Marks: " << marks << endl;
    }
    fin.close();
    return 0;
}