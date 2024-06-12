/*
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10 */

import java.util.*;

public class Main
{
    
    public static int kthLargest(int[] arr, int K){
        Arrays.sort(arr);
        
        return arr[K-1];
    }
	public static void main(String[] args) {
		int arr[] = {12,3,5,7,19};
		int K = 2;
		
		System.out.println("Kth smallest Element is " + kthLargest(arr,K));
	}
}
