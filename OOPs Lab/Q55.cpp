// Write a program to count all prime numbers in a file numbers.txt. using open function.

#include <iostream>
#include <fstream>
#include <cmath>
using namespace std;

bool isPrime(int num)
{
    if (num <= 1)
    {
        return false;
    }
    for (int i = 2; i <= sqrt(num); i++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    ifstream fin("numbers.txt");
    int num;
    int count = 0;
    while (fin >> num)
    {
        if (isPrime(num))
        {
            count++;
        }
    }
    cout << "The number of prime numbers in the file is: " << count << endl;
    fin.close();
    return 0;
}