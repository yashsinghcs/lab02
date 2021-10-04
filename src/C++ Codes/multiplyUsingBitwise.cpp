#include<bits/stdc++.h>
using namespace std;

int main(){
    int n = 5;
    // we want to multiply n by 7
    int m = 5<<3; // it means 5 * (2^3) ==> 5*8
    m = m - n; // 5*8 - 5 ==> 5*7
    cout<<m;
}
