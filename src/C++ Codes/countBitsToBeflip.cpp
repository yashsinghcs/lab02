// count number of bits to flip to convert A to B
// A = 10 (01010), B = 20 (10100)

#include<bits/stdc++.h>
using namespace std;

int main(){
    int A = 10, B=20;
    int n = A^B;
    int c = 0;
    for (int i = 31; i >= 0; i--) {
        int k = n >> i;
        if (k & 1)
            c += 1;
 /*           cout << "1";
        else
            cout << "0"; */
    }
    cout<<c;
    return 0;

}
