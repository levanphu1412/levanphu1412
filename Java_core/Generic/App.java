package Generic;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PersonController<Student> list1 = new PersonController<>();
        Student student1 = new Student(1, "Ronaldo", 36, 7.5);
        Student student2 = new Student(2,"Messi", 34, 9 );
        Student student3 = new Student(3, "Ibrahimovic", 40, 8);
        Student student4 = new Student(4, "Van Persie", 38, 9 );

        list1.add(student1);
        list1.add(student2);
        list1.display();

        System.out.println("--------------------------------------------------------");
        PersonController<Teacher> list2 = new PersonController<>();
        Teacher teacher1 = new Teacher(1, "Wenger",  9999999999L);
        Teacher teacher2 = new Teacher(2, "Mourinho", 88888888L);

        list2.add(teacher1);
        list2.add(teacher2);
        list2.display();
    }
}
