/*
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
*/
class ConvertToWave2
{

	public void convertToWave(int arr[], int n){
    
		// Your code here
		for (int i = 0; i < n - 1; i += 2) 
            swap(arr, i, i + 1); 
	}
	
	public void swap(int arr[], int a, int b) 
    { 
        int temp = arr[a]; 
        arr[a] = arr[b]; 
        arr[b] = temp; 
    }
}
