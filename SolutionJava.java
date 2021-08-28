
import java.io.*;

class Main {
	public static void main (String[] args) {
		int[] array={2,3,4,10,40};
		int ValueToFind=10;
		
		// Here we'll create two pointers 
		//start and end which will point to 1st and last element's indexes respectively 
		
		int start=0;
		int end=array.length-1; //5
		
		while(start<=end){
		    
		    //Here we'll select the mid element from the given range of start and end
		    int mid=start+(end-start)/2;
		    
		    //if our mid index element is target element we'll print mid
		    if(array[mid]==ValueToFind){
		        System.out.print("Index = "+mid);
		        break;
		        //here we don't need to check further so we break from loop
		    }
		    
		    //if our mid index element is greater than target then it’s sure that our target would be before mid element
		    //so we set end as mid-1
		    else if(array[mid]>ValueToFind){
		        end=mid-1;
		    }
		    
		    //else our mid index element is smaller than target then it's sure that our target would be after mid element 
		    //so we set start as mid+1
		    else{
		        start=mid+1;
		    }
		}
	}
}
