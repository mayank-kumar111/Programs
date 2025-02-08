// Write a program to count characters, words, and lines in a file. using open function.

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    fstream file;
    file.open("file.txt", ios::out);
    cout << "Enter the text: " << endl;
    string text;
    getline(cin, text);
    file << text;
    file.close();
    file.open("file.txt", ios::in);
    cout << "Detail are: " << endl;
    char ch;
    int charCount = 0, wordCount = 1, lineCount = 0;

    while (file.get(ch))
    {
        charCount++;
        if (ch == ' ' || ch == '\n' || ch == '\t')
        {
            wordCount++;
        }
        if (ch == '\n')
        {
            lineCount++;
        }
    }
    cout << "Number of characters: " << charCount << endl;
    cout << "Number of words: " << wordCount << endl;
    cout << "Number of lines: " << lineCount << endl;
    file.close();
    return 0;
}
