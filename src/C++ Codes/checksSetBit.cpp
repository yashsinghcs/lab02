#include <bits/stdc++.h>
using namespace std;


int main(){
    int n=18;
    int k=4; // check if 4th bit is set or not
    int m = 1<<(k-1);
    if((n&m)==0){
        cout<<k<<"th Bit is "<<"Not Set"<<" in "<<n;
    }
    else{
        cout<<k<<"th Bit is "<<"Set"<<" in "<<n;
    }

    return 0;
}

