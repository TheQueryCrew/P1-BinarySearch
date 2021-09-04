
import java.util.ArrayList;
import java.util.Arrays;
class SolutionJava{
	public static void main (String[] args) {
		ArrayList<Integer>arr = new ArrayList<Integer>() ;
		arr.add(2) ;
		arr.add(3) ;
		arr.add(4) ;
		arr.add(10) ;
		arr.add(10) ;
		
		// Here we'll create two pointers 
		//start and end which will point to 1st and last element's indexes respectively 
		int ValueToFind = 10 ;
		int start=0;
		int end=arr.size()-1; //5
		
		while(start<=end){
		    
		    //Here we'll select the mid element from the given range of start and end
		    int mid=start+(end-start)/2;
		    
		    //if our mid index element is target element we'll print mid
		    if(arr.get(mid)==ValueToFind){
		        System.out.print("Index = "+mid);
		        break;
		        //here we don't need to check further so we break from loop
		    }
		    
		    //if our mid index element is greater than target then it’s sure that our target would be before mid element
		    //so we set end as mid-1
		    else if(arr.get(mid)>ValueToFind){
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
