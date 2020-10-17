import java.io.IOException;

public class CustomTesterApp {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        try {
        	method3();
        } catch (TestException e) {
        	System.out.println("Caught a TestException. Msg: " + e.getMessage());
        }
    }

    public static void method3() throws TestException {
    	try {
    		throw new IOException("Test IOException");
    	} catch (IOException e) {
    		throw new TestException(e);
    	}
    	// throw new TestException("TestException in method3()");
    }
}