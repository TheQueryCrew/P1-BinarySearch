#include<stdio.h>
int main()
{
	int arr[]={2,3,4,10,40};
    int ValueToFind=10;


    int ans=-1;
        //we will create two pointer/variable  start and end  pointing to first and last index of given array

     
    int length=sizeof(arr)/sizeof(int);
    int start=0;
    int end=length-1;

    while(start<=end)
    {
            
		    int mid=start+(end-start)/2; //as given array is sorted so will find middle index

            if(arr[mid]==ValueToFind)  //if element at middle index is equal to value of find then we will store middle index in ans variable and break the loop
            {
                ans=mid;
                break;
            }
            else if(arr[mid]>ValueToFind) //if element at middle index is grater than ValueToFind = 10 , then valuetofind is present on left side of array ,so we will make our end =mid-1
            {
                end=mid-1;
            }
            else // valuetofind is present on right side of array , search in right side
            {
                start=mid+1;
            }
        }
        if (ans==-1)
        {
             printf("element not found\n");
        }
        else
        {
             printf("index = %d",ans);
        }

      return 0;
    }
