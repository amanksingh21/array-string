/**

Input: str = “abba” 
Output: Yes

Input: str = “geeks”
Output: No 

*/

public class Main
{
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        
        while(i < j) {
            
            if(str.charAt(i) != str.charAt(j))
            return false;
        j++;
        j--;
        
        }
        return true;
    }
    
	public static void main(String[] args) {
		String str = "aman";
		
		str = str.toLowerCase();
		
		if(isPalindrome(str))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
