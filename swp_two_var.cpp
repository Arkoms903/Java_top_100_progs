// Using Three variables
#include <bits/stdc++.h>
using namespace std;
// int main()
// {
//     int a, b;
//     cin >> a >> b;
//     int temp = a;
//     a = b;
//     b = temp;
//     cout << a << " " << b << endl;
//     return 0;
// }

// Using two variables

// int main()
// {
//     int a, b;
//     cin >> a >> b;
//     a = a + b;
//     b = a - b;
//     a = a - b;
//     cout << a << " " << b << endl;
//     return 0;
// }

// Using XOR operator

int main()
{
    long long a, b;
    cin >> a >> b;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    cout << a << " " << b << endl;
    return 0;
}