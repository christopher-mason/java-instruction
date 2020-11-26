package mason.business;

public class MakeChocolate {
	
	public static int makeChocolate(int small, int big, int goal) {
		int result = goal % 5;
		
		if (small + big * 5 < goal) {
			return -1;
		} else if (small + big * 5 == goal) {
			return small;
		} 
		 return result;
	}
	
	

}
