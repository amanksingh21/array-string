/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=15;
		System.out.print(n1+" "+n2);//printing 0 and 1  
		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
   {  
      n3=n1+n2;  
      System.out.print(" "+n3);  
      n1=n2;  
      n2=n3;  
   }  
	}
}
