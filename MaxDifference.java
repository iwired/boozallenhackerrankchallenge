package boozallen;

public class MaxDifference {

	public MaxDifference() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 
	 * Complete the function below.
	 */

	static int maxDifference(int arr[]) {

	int min_element=arr[0]; int diff=arr[1]-arr[0]; 
	for(int i=1;i<arr.length;i++) 
	       { 
		  if(arr[i]-min_element>diff)
             diff=arr[i]-min_element; 
             diff=arr[i]-min_element; 
             if(arr[i]<min_element) 
            	       min_element=arr[i];

	            } return diff;
       }
}
