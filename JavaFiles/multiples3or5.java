public class multiples3or5{	
	public static void main(String[] args) {
		int sum = 0;
		/* ***** My Solution *********
		for(int i = 1; i < 1000; i++) {
		if(i % 3 == 0 || i % 5 == 0)
			sum += i;
		}
		*/
		/* ************************************Better Solution ********************************
		** using arithmatic progression
		*/
		// Remember: A || B = A + B - (A && B)
		//number of values before 1000 divisible by 3 is 333
		//number of values before 1000 divisible by 5 is 199
		//number of values before 1000 divisile by 15 is 67
		/* Arithmetic Breakdown
			let a be the 1st term in the sequence, f be the
			final term, n be the total number of terms and 
			d be the common difference
			In general: a + (n - 1) / d = x, gives n = int((x - a) /( d  + 1 )
			Since a = d in our problem case (the first terms in the 3 and 5
			progressions are 3 and 5 respectively) the equation can be turned 
			into: n = int(x - d) / d + 1) = int(x / d)
			To find the last term f, f = a + (n - 1) * d = d + d(n - 1)
			subbing the other equaion in, f = d + d(int(x  / d) - 1)
			Sum of the n numbers in an arithmetic progression is: S = (n/2) * (a + f )
			Using the same sum equation for us, S = int(x / d) / 2 * (d + d * int(x / d))
			Therefore S = d * int(x / d) * (1 + int(x / d) / 2)
			This equation can be used to find the numbers divisible by 3 and 5, however
			if you note the equation above, 3 || 5 = 3 + 5 - 3 && 5 as the numbers 
			divisible by 15 are counted twice. Therefore, need to do the Sum equation 3 times
			where S3 + S5 - S15.
			Total = ( 3 * int(999 / 3) * (1 + int (999 / 3) / 2) ) + ( 5 * (999 / 5) * (1 + int(999 / 5) / 2) ) 
					- (15 * int(999 / 15) * (1 + int (999 / 15) / 2) ).
		*/
		sum = (3 * 333 * (1 + 333 / 2)) + (5 * 199 * (1 + 199) / 2) - (15 * 66 * (1 + 66) / 2);   
		
		System.out.print(sum);
	}
}