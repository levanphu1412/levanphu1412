package Generic;

import java.util.ArrayList;
import java.util.List;

public class PersonController<T> {
    List<T> list = new ArrayList<>();
    public void add(T obj) {
        list.add(obj);
    }

    public void display() {
        for(T obj : list) {
            System.out.println(obj);
        }
    }

}
