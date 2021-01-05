import java.util.*;
import java.lang.*;
import java.io.*;

/*
Input
2
10
100 56 5 6 102 58 101 57 7 103 
3
10 100 105

Output
3
3

Explanation
Test Case 1 -
{5, 6, 7}, { 56, 57, 58}, {100, 101, 102, 103} are 3 subset in which numbers are consecutive.

Test Case 2 -
{10}, {100} and {105} are 3 subset in which numbers are consecutive.
*/
class NumOfSubset {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());// taking size of array
		    int arr[] = new int[n]; // declaring array of size n
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    System.out.println(numofsubset(arr, n));
		}
		
	}
	
	public static int numofsubset(int arr[], int n){
	    
	    
	    int numofsubset = 1;
	    if(n == 1){
	        return 1;
	    } else if(n == 0){
	        return 0;
	    }
	    
	    Arrays.sort(arr);
	    
	    for(int i=0; i<n-1; i++){
	        
	        if(arr[i+1] != arr[i]+1){
	           ++numofsubset;   
	        }
	        
	    }
	    
	    return numofsubset;
	}
}