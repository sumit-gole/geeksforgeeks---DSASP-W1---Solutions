/*   COPYRIGHT BY @SUMIT GOLE
You are given a number N. You need to find the perfect square that is nearest to it. If two perfect squares are at the same distance to N, then print the greater perfect square.

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing N.

Output:
For each testcase, in a new line, print the perfect square closest to N.

Constraints:
1 <= T <= 100
1 <= N <= 1014

Examples:
Input:
3
1
56
100
Output:
0
49
81

Explanation:
Testcase1: 0 and 4 are near to 1. 0 is nearest.
Testcase2: 49 and 64 are near to 56. 49 is nearest.
Testcase3: 81 and 121 are near to 100. 81 is nearest. 
*/
/**********************************************************************************************************************************************************************************/

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		
		while(testcases-->0)
		{
		    long n=sc.nextLong();
		    
		    long smaller;
		    long greater;
		    
		    if(Geeks.isPerfectSquare(n)==true)
		    {
		        smaller=(long)Math.sqrt(n)-1;
		        greater=(long)Math.sqrt(n)+1;
		    }
		    else
		    {
		        smaller=(long)Math.floor(Math.sqrt(n));
		        greater=(long)Math.ceil(Math.sqrt(n));
		    }
		    
		    if((long)Math.abs(smaller*smaller-n)<(long)Math.abs(greater*greater-n))
		    System.out.println(smaller*smaller);
		    else
		    System.out.println(greater*greater);
		}
	}
}

class Geeks
{
    public static boolean isPerfectSquare(long number)
    {
        long root=(long)Math.sqrt(number);
        return root*root==number;
    }
}
