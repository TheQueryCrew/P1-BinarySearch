#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[],int val,int l ,int e){
    int m = (l+e)/2;
    while(l<=e){
        if(val == arr[m]){
            return m;
        }else if(val > arr[m]){
            return binarySearch(arr,val,m+1,e);
        }else if(val < arr[m]){
            return binarySearch(arr,val,l,m-1);
        }
    }return -1;
}
int main(){
    int arr[] = {1, 2, 3, 4, 5, 6};
    int val= 5;
    cout<<binarySearch(arr,val,0,6);
    return 0;
}