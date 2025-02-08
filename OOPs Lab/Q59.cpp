// Write a program to count alphabets, digits, and special characters in a file. using open function.

#include <iostream>
#include <fstream>
using namespace std;

int main(){
    fstream file;
    file.open("file.txt",ios::out);
    cout << "Enter the text: " << endl;
    string text;
    getline(cin,text);
    file << text;
    file.close();
    file.open("file.txt",ios::in);
    cout << "Detail are: " << endl;
    char ch;
    int alphaCount = 0, digitCount = 0, specialCount = 0;
    while(file.get(ch)){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            alphaCount++;
        }else if(ch >= '0' && ch <= '9'){
            digitCount++;
        }else{
            specialCount++;
        }
    }
    cout << "Number of alphabets: " << alphaCount << endl;
    cout << "Number of digits: " << digitCount << endl;
    cout << "Number of special characters: " << specialCount << endl;
    file.close();
    return 0;
}