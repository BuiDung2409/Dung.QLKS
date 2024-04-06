package sevices;

import java.util.List;

public interface Management<T> {

    T finById(long id);

    void printlist();

    void updateById(long id, T t);
    void add(T t);

    void delete(long id);
}
