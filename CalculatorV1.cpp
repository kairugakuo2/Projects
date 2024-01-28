#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int restart = 1;
    
    // do while loop to keep calculaotr running if user chooses
    do {
        char operation; //operation
        double a;       // 1st operand
        double b;       // 2nd operand
        double c;       // result
    
        cout << "Enter your expression with 2 numbers seperated by spaces (for operation, use + , - , * , or /): " << endl;
        cin >> a >> operation >> b;
    
        // switch block to determine which operation to do based on entered char value
        switch (operation) 
        {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;
        }
        cout << "Your answer is " << c << endl;
        cout << "Do you want to restart? (1 for Yes | 0 for No): ";
        cin >> restart;
    } while (restart == 1);
    return 0;
}
