#include <iostream>
using namespace std;

int main() {
    string name;
    int age;

    // Input section
    cout << "Enter your name: ";
    getline(cin, name);

    cout << "Enter your age: ";
    cin >> age;

    // Conditional statement
    if (age >= 18) {
        cout << "Hello " << name << ", you are eligible to vote." << endl;
    } else {
        cout << "Hello " << name << ", you are not eligible to vote yet." << endl;
    }

    // Loop to print numbers from 1 to 5
    cout << "Now printing numbers from 1 to 5:" << endl;
    for (int i = 1; i <= 5; ++i) {
        cout << i << endl;
    }

    return 0;
}
