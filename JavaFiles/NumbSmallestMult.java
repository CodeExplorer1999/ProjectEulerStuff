public class NumbSmallestMult {
	public static void main(String[] args){
		double curr = 40.0;//Tracks currrent numb
		//iterate to look for smallest multiple using prime factors
		while(curr % 11 != 0 || curr % 12 != 0 || curr % 13 != 0 || curr % 14 != 0 || curr % 15 != 0 
		|| curr % 16 != 0 || curr % 17 != 0 || curr % 18 != 0 || curr % 19 != 0 || curr % 20 != 0){
			curr += 20;
		}
		System.out.println(curr);
	}
}