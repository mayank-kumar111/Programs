#include <iostream>
#include <map>
#include <fstream>
using namespace std;
int main(int argc, char *argv[])
{
    ifstream file;
    file.open(argv[1]);
    map<char, int> char_count;
    char ch;
    while (file.get(ch))
    {
        char_count[ch]++;
    }

    cout << "Character Count is:-" << endl;
    for (const auto &pair : char_count)
    {
        cout << ("Key is:") << pair.first << " " << ("Frequency is:") << pair.second << endl;
    }
    return 0;
}