public class Palin3Drome{
	public static void main(String[] args) {
		/** MY SOLUTION 
		@author Harshwardhan Goswami
		@version JAVA 8
		This program attempts to find the largest possible palindrome
		divisible by two 3-digit numbers
		*/
		//Starting off with the maximum possible palindrome 
		int current = 989989;
		//Iterate through 10 sets of palindromes
		/* NOTE: it is 10 sets as each 10-thousandth has 10 possible palindromes
			and there are 10 existing sets of 10-thousandths in a 100-thousandth
			making the it check for 10 sets but 100 palindromes in general*/
		for(int i = 0; i < 100; i++){
			//cycle through 3-digit number possibilities
			for(int j = 999; j > 900; j--) {
				//Check if current numb is divisible by two 3-digit numbers
				if(current % j == 0 && (current / j) < 1000){
					System.out.println(j + " " + current / j);	
				}
			}
			//iterate to next set of palindromes
			if((current/100) % 10 == 0){
				current -= 110;	
			}
			//iterate to next palindrome in current set
			else{
				current -= 1100;	
			}
		}
	}
}
