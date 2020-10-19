import java.io.IOException;
import java.util.List;

public interface DAO<T> {
    T get(String code) throws IOException, NoSuchCustomerException;
    List<T> getAll() throws IOException;
    boolean add(T t) throws IOException;
    boolean update(T t) throws IOException;
    boolean delete(T t) throws IOException;
}