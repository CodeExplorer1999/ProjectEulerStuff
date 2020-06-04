public class arranged_probability{
	public static void main(String[] args) {
		//since problem states we can only assume the first case, use the 
		//given values for blue and total from the first case
		long blue = 15;
		long total = 21;
		long target = 1000000000000L;//NOTE: You can use the L with long for super big numbers
		//iterate while current total is less than target
		while(total < target) {
			long temp = blue;
			blue = (3 * blue) + (2 * total) - 2;
			total = (4 * temp) + (3 * total) - 3;
		}
		System.out.println(blue);
	}
}