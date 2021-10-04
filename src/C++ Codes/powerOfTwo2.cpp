#include<iostream>
using namespace std;


int main(){
    int n = 32;
    //int m = n-1;
    if(((n&(n-1))==0)&&(n!=0)){
        cout<<"Power of Two" ;
    }
    else{
        cout<<"Not a power of two";
    }
    return 0 ;
}
