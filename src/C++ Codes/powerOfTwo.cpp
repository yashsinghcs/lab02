#include<iostream>
using namespace std;


int main(){
    int n = 32;
    if(n==0){
        cout<<"Not a power of two";
    }
    while(n!=1){

        if(n%2!=0){
            cout<<"Not a power of two";
            break;
        }
        n=n/2;
    }
    return 0 ;
}

