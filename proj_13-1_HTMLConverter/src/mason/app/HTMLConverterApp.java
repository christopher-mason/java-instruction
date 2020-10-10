package mason.app;

public class HTMLConverterApp {

	public static void main(String[] args) {
		System.out.println("HTML Converter");
		System.out.println();
		
		String html = "<h1>Grocery List</h1>\n" + "<ul>\n" +	"    <li>Eggs</li>\n" + "    <li>Milk</li>\n" +
				"    <li>Butter</li>\n" + "</ul>";
		
		System.out.println("INPUT\n" + html);
		
		// Remove spaces before tags
		while (html.indexOf(" <") != -1) {
			html = html.replace(" <",  "<");
		}
		
		// replace list items with asterisks
		html = html.replace("<li>",  "* ");
		
		StringBuilder htmlBldr = new StringBuilder(html);
		
		int beginTagIndex = 0;
		while (beginTagIndex != -1) {
			beginTagIndex = htmlBldr.indexOf("<");
			if (beginTagIndex != -1) {
				int endTagIndex = htmlBldr.indexOf(">", beginTagIndex + 1);
				htmlBldr.delete(beginTagIndex, endTagIndex + 1);
//				String beforeTag = html.substring(0, beginTagIndex);
//				String afterTag = html.substring(endTagIndex + 1);
//				html = beforeTag + afterTag;
			}
		}
		
		html = htmlBldr.toString();
		
		html = html.replace("\n\n", "\n");
		
		System.out.println("\nOUTPUT\n" + html);
		
		
		
//		String html = "<h1>Grocery List</h1>\n" +
//					"<u1\n" +
//					"	<li>Eggs</li>\n" +
//					"	<li>Milk</li>\n" +
//					"	<li>Butter</li>\n" +
//					"</ul>";
//		
//		System.out.println("INPUT");
//		System.out.println(html);
//		System.out.println();
//		
//		String html1 = "<h1>Grocery List<h1>\n";
//		String html2 = "<ul>\n" + "<li>Eggs</li>\n" + "<li>Milk</li>\n" + "<li>Butter</li>\n" + "</ul>";
//
//		System.out.println("OUTPUT");
//
//		html1 = html1.replace("<h1>", "");
//		html2 = html2.replace("<ul>", "");
//		html2 = html2.replace("<li>", "* ");
//		html2 = html2.replace("</li>", "");
//		html2 = html2.replace("</ul>", "");
//		html2 = html2.trim();
//
//		System.out.println(html1 + html2);
		
		
	}

}
