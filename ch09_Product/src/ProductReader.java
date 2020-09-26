public interface ProductReader {
    Product get(String code); // takes String, return String
    String getAll(); // takes any parameters
}