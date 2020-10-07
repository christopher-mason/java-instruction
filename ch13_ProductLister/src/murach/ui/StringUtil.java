package murach.ui;

public class StringUtil {
	
	public static String pad(String s, int length) {
		return pad(s, length, " ");
	}

    public static String pad(String s, int length, String padStr) {
        if (s.length() < length) {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < length) {
                sb.append(padStr);
            }
            return sb.toString();
        } else {
            return s.substring(0, length);
        }
    }
}