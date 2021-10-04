#include<bits/stdc++.h>
using namespace std;

int main(){
    int n = 100;
    int a = 0x0F;  // 0F is hexadecimal 0000 1111
    int b = 0xF0;
    int x = n&a; // geting last 4 bits of n   0000 xxxx
    x = x<<4;    // setting these bits as first 4 bits
    int y = n&b; // getting first 4 bits of n   yyyy 0000
    y = y>>4;    // setting these bits as last 4 bits

    int res = x|y;  //getting result
    cout<<res;

    return 0;

}
