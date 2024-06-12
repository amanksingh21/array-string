/*
Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.

Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”
*/
import java.util.*;

public class Main
{
    
    public static boolean anagramString(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;
        
        if(n1 != n2)
        return false;
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i = 0; i < n1 ; i++){
            if(str1[i] != str2[i]){
            return false;
            }
        }
        return true;
    }
        
	public static void main(String[] args) {
		char str1[] = {'g','r','a','m'};
		char str2[] = {'a','r','m'};
		
		if(anagramString(str1,str2))
		    System.out.println("Anagram");
		else
		    System.out.println("NOT Anagram");
	}
}