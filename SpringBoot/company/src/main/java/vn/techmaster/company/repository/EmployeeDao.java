package vn.techmaster.company.repository;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.util.ResourceUtils;
import vn.techmaster.company.model.Employee;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class EmployeeDao extends Dao<Employee> {
    public EmployeeDao (String csvFile) {
        this.readCSV(csvFile);
    }

    @Override
    public void readCSV(String csvFile) {
      try {
          File file = ResourceUtils.getFile("classpath:static/" + csvFile);
          CsvMapper mapper = new CsvMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
          CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnSeparator('|'); // Dòng đầu tiên sử dụng làm Header
          ObjectReader oReader = mapper.readerFor(Employee.class).with(schema); // Cấu hình bộ đọc CSV phù hợp với kiểu
          Reader reader = new FileReader(file);
          MappingIterator<Employee> mi = oReader.readValues(reader); // Iterator đọc từng dòng trong file
          while (mi.hasNext()) {
              Employee employee = mi.next();
              this.add(employee);
          }
      }catch (IOException e) {
          System.out.println(e);
      }
    }

    @Override
    public List<Employee> getAll() {
        return collections;
    }

    @Override
    public Optional<Employee> get(int id) {
        return collections.stream().filter(u->u.getId() == id).findFirst();
    }

    @Override
    public void add(Employee employee) {
        int id;
        if (collections.isEmpty()) {
            id = 1;
        } else {
            Employee lastEmployee = collections.get(collections.size() - 1);
            id = lastEmployee.getId() + 1;
        }
        employee.setId(id);
        collections.add(employee);
    }

    @Override
    public void update(Employee employee) {
        get(employee.getId()).ifPresent(existemployee -> {
            existemployee.setFirstName(employee.getFirstName());
            existemployee.setLastName(employee.getLastName());
            existemployee.setEmail(employee.getEmail());
            existemployee.setPassportNumber(employee.getPassportNumber());
        });
    }

    @Override
    public void deleteById(int id) {
        get(id).ifPresent(existemployee -> collections.remove(existemployee));
    }

    @Override
    public void delete(Employee employee) {
        deleteById(employee.getId());
    }

    @Override
    public List<Employee> searchByKeyword(String keyword) {
        return collections
                .stream()
                .filter(employee -> employee.matchWithKeyword(keyword))
                .collect(Collectors.toList());
    }
}
