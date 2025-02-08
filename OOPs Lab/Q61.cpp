// Write a program to copy content of one file to another file in the following manner:
// 1. Copy uppercase alphabets in lowercase and vice versa.
// 2. Copy rest of the content as it is.

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
    fstream file2;
    file2.open("file2.txt",ios::out);
    char ch;
    while(file.get(ch)){
        if(ch >= 'a' && ch <= 'z'){
            ch = ch - 32;
        }else if(ch >= 'A' && ch <= 'Z'){
            ch = ch + 32;
        }
        file2 << ch;
    }
    file.close();
    file2.close();
    file2.open("file2.txt",ios::in);
    cout << "Detail are: " << endl;
    while(file2.get(ch)){
        cout << ch;
    }
    file2.close();
    return 0;
}