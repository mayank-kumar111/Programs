// Write a program to create a file numbers.txt, read n numbers from user and write into the file next, read the numbers from the file and write into a file even.txt if the number is even and odd.txt if the number is odd. using open function.

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream fout("numbers.txt");
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int num;
        cout << "Enter the number: ";
        cin >> num;
        fout << num << endl;
    }
    fout.close();
    ifstream fin("numbers.txt");
    ofstream foutEven("even.txt");
    ofstream foutOdd("odd.txt");
    int num;
    while (fin >> num)
    {
        if (num % 2 == 0)
        {
            foutEven << num << endl;
        }
        else
        {
            foutOdd << num << endl;
        }
    }
    fin.close();
    foutEven.close();
    foutOdd.close();
    return 0;
}