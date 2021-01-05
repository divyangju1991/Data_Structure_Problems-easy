/*
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
*/
class ConvertToWave
{

	public void convertToWave(int arr[], int n){
    
		// Your code here
		
		for(int i=1; i<n-1; i = i+2){
			int tmp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = tmp;
		}
		
		if(n%2 == 0){
			int tmp = arr[n-2];
			arr[n-2] = arr[n-1];
			arr[n-1] = tmp;
		}
	}
}
