#include <bits/stdc++.h>
using namespace std;


int SetBits(int n)
{
    int count = 0;
    while (n) {
        count = count + (n & 1);
        n = n >> 1;
    }
    return count;
}

int main()
{
    int i = 9;
    cout << SetBits(i);
    return 0;
}
