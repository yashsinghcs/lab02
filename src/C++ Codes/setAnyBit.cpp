#include <bits/stdc++.h>
using namespace std;

int main(){

    int k = 3; //bit to be set (to 1)
    int n = 21; // number
    int m = 1 << (k-1); // 0100

    cout<<(m|n);

    return 0;

}
