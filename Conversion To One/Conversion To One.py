"""  COPYRIGHT BY @SUMIT GOLE
You are given a number N. You need to convert it to 1 in minimum number of operations.

The operations allowed are as follows:

If N is even then divide the number by 2.
If N is odd then you can either add 1 to it or subtract 1 from it.
Using the above operations, find the minimum number of operations require to convert N to 1.

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 1 line of input containing N.

Output:
For each testcase, in a new line, print the minimum number of steps required.

Constraints:
1 <= T <= 100
1 <= N <= 107

Examples:
Input:
4
1
2
3
4
Output:
0
1
2
2

Explanation:
Testcase1: 1 can be converted into 1 in 0 steps.
Testcase2: 2 can be converted into 1 in 1 step: 2-1   """

############################################################################################################################################################################

#code
def stepCount(n):
	count = 0
	while n > 1:
		if n % 2 == 0:           
			n = n // 2
		elif n == 3 or n % 4 == 1: 
			n = n - 1
		else:
			n = n + 1              
		count += 1
	return count

m = int(input())
for n in range(1,m+1):
	print (stepCount(n))
