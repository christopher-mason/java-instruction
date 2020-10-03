
public class TestApp {

	public static void main(String[] args) {
//		System.out.println("Success!");
//		System.out.println("Success!");
//		System.out.println("Success!");
		
		int number = 0;
		int [][] pyramid = new int[4][];
		for (int i = 0; i < pyramid.length;) {
			pyramid[i] = new int[i++];
			for (int j = 0; j < pyramid[i].length; j++)
				pyramid[i][j] =number++;
		}

	}

}
