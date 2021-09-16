import java.util.Map;
import java.util.stream.Collectors;

public class Controller extends ReadFile {
// loc tuoi tu 20 -> 30
    public void filterAge() {
        listPerson.stream()
        .filter(person -> person.getAge() >= 20 && person.getAge() <= 30)
        .forEach(list -> System.out.println(list));
    }

// tính tuổi trung bình của tất cả mọi người
    public void averageAge() {
        int sum = 0;
        for (int i = 0; i < listPerson.size(); i++) {
            sum += listPerson.get(i).getAge();
        }
        System.out.println("tuổi trung bình của mọi người là: " + sum/listPerson.size());
    }

    public void averageAgeByNationality() {
        Map<String, Double> map = listPerson.stream()
        .collect(Collectors.groupingBy(Person::getNationality, Collectors.averagingDouble(Person::getAge)));
     
        System.out.println(map);
    }
}
