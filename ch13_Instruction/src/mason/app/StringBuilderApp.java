package mason.app;

public class StringBuilderApp {

	public static void main(String[] args) {
		
		StringBuilder ccNumber = new StringBuilder();
		ccNumber.append("4012");
		ccNumber.append("8888");
		
		System.out.println(ccNumber);
		System.out.println(ccNumber.length());
		
		ccNumber.insert(4,  "abcd");
		ccNumber.replace(4,  8,  "NNNN");
		
		System.out.println(ccNumber);
		
		StringBuilder ssn = new StringBuilder("123-45-6789");
		ssn.replace(0,  6,  "xxx-xx");
		
		System.out.println(ssn);
		
		ssn.deleteCharAt(3);
		
		System.out.println(ssn);
		
		ssn.insert(3,  "-");
		
		System.out.println(ssn);

	}

}
