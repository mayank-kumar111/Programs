// Write a program to count all vowels, consonants in a file. using open function.

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
    int vowelCount = 0, consonantCount = 0;
    while(file.get(ch)){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
    }
    cout << "Number of vowels: " << vowelCount << endl;
    cout << "Number of consonants: " << consonantCount << endl;
    file.close();
    return 0;
}