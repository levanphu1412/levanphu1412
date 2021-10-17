package vn.techmaster.company.repository;

import vn.techmaster.company.model.Employee;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public abstract class Dao<T> {
    protected List<T> collections = new ArrayList<>();

    public abstract void readCSV(String csvFile);

    public abstract List<T> getAll();

    public abstract Optional<T> get(int id);

    public abstract void add(T t);

    public abstract void update(T t);

    public abstract void deleteById(int id);

    public abstract void delete(T t);

    public abstract List<Employee> searchByKeyword(String keyword);
}
