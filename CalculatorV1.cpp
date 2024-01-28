#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int restart = 1; //stores user's choice to restart calculator (1) or not(0)
    
    // do while loop to keep calculaotr running if user chooses
    do {
        char operation; //operation
        double a;       // 1st operand
        double b;       // 2nd operand
        double c;       // result
    
        cout << "Enter your expression with 2 numbers seperated by spaces (for operation, use + , - , * , or /): " << endl;
        
    //checking if dividing by 0 and prinitng error message if so
        do {
            cin >> a >> operation >> b; // take input for a, b, and operation
            
            if ((operation == '/') && (b == 0)) {
                cout << "Error! You can't divide by 0. Try again." << endl;
            }
        } while ((operation == '/') && (b == 0));
    
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
