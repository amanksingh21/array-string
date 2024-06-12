/*
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
             
*/

public class Main
{
    public static int getMin(int arr[], int n){
        int res = arr[0];
        for(int i = 1; i < n; i++)
        res = Math.min(res,arr[i]);
        return res;
    }
    
    public static int getMax(int arr[], int n){
        int res = arr[0];
        for(int i = 1; i < n; i++)
        res = Math.max(res,arr[i]);
        return res;
    }
	public static void main(String[] args) {
		int arr[] = {12,224, 45, 67, 1};
		int n = arr.length;
		System.out.println("Min Element is " + getMin(arr,n));
		System.out.println("Max Element is " + getMax(arr,n));
	}
}
