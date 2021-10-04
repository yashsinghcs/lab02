#include<bits/stdc++.h>
using namespace std;

int main(){

    int A = 12;
    int m = 1, ans;
    while(1){
        if((A&m)==0){
            ans = A^m;
            break;
        }
        m = m<<1;
    }
    cout<<ans;
    return 0;
}
