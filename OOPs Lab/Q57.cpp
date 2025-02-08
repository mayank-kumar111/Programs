// Write a program to perform read and write operations on a file sequentially (using get and put functions) input given by the user. using open function.

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
    while(file.get(ch)){
        cout << ch;
    }
    file.close();
    return 0;
}