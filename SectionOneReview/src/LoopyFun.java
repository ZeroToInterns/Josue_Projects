import java.util.*;
public class LoopyFun
{
   public int getPermuationCount(int n)
   {
      int count = 1;
      for(int i = 1; i <= n ; i++)
      {
         count = count*i;
      }
      return count;
   }
   public String removeDuplicates(String word)
   {
	  if(word == " ")
	  {
		 return "Exception"; 
	  }
	  else {
		  Set<Character> set = new HashSet<>();
		  StringBuffer sf = new StringBuffer();
		  
		  for(int i= 0; i<word. length();i++)
		  {
			  Character c= word.charAt(i);
			  if(!set.contains(c)) 
			  {
				  set.add(c);
				  sf.append(c);
			  }
		  }
		  return sf.toString();
	  }
   }
   public double sumSeries(int n)
   {
	   double result = 0;
	   for(int i = 0; i < n; i++)
	   {
		   result = result + 2/Math.pow(2,i);
	   }
	   return result;
   }
   
   public int product(int n)
   {
	   int product =1;
	   
		   if( n == 0) {
			   
			   return 0;
		   }
		   else if (n < 0)
		   {
			   return -1;
		   }
		   else 
		   {
		      for(int i = 1;  i <= n; i++)
	   {  
			   Scanner in = new Scanner(System.in);
			   System.out.print("Enter integer "+i+": " );
			   int prod= in.nextInt();
			   product = product * prod;
		   }
	   	}
	   return product;
   }
   
   public int largestPowerLessThan(int value)
   {
	   //while loop will continue to run while its greater than 1
	   int newPower = 0;
	   while (value == value)
	   {
		   int x = (int)(Math.log(value)/Math.log(2));
		   newPower = x-1;
		  
	   }
	   return newPower;
	 
   }
}
