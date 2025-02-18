import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Repository<T> {
    private List<T> repository;

    public Repository(List<T> repository) {
        this.repository = repository;
    }

    public Repository() {
        this.repository = new ArrayList<T>();
    }

    public void addElement(T t) {
        repository.add(t);
    }

    public List<T> getAllElements() {
        return new ArrayList<>(repository);
    }

    public T getElement(int index) {
        if (index >= 0 && index < repository.size()) {
            return repository.get(index);
        }
        return null;
    }

    public boolean updateElement(int index, T t) {
        if (index >= 0 && index < repository.size()) {
            repository.set(index, t);
            return true;
        }
        return false;
    }

    public void remove(T t) {
        repository.remove(t);
    }
}
